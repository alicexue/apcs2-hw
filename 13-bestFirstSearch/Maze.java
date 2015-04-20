import java.io.*;
import java.util.*;

public class Maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;

    private Frontier f;
		
    public void delay(int n){
    	try {
	    Thread.sleep(n);
    	} catch (Exception e) {}
    }
		
    public Maze() {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
					
	try {
							
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e){
	}
					
    }
		
    public String toString(){
	String s = "[2J\n";
					
	for (int y=0;y<maxY;y++){
	    for (int x=0;x<maxX;x++)
		s = s +board[x][y];
	    s=s+"\n";
	}
	return s;
    }

    
    public boolean pathexit(int x, int y) {
    	if (board[x][y]=='#' || board[x][y]=='$') {
	    return true;
    	} else {
	    return false;
    	}
    	
    }

    public void bestfs(int x, int y){
	//f = new Frontier();
	f = new StackFront();
	
	Node n = new Node(x,y);
	//n.setPrio(euclid(n));
	n.setPrio(manhattan(n));
	f.addPrio(new Node(x,y));
	
	int tx=0,ty=0;
	Node current = null;
	while (!f.isEmpty()){
	    current = f.remove();
	    int cx = current.getX();
	    int cy = current.getY();
	
	    if (board[cx][cy]=='$') {
		solved = true;
		break;
	    }				
			
	    board[cx][cy]='z';
		
	    if (pathexit(cx+1,cy)) {
		f.addPrio(new Node(cx+1,cy));
	    }
	    if (pathexit(cx,cy+1)) {
		f.addPrio(new Node(cx,cy+1));
	    }
	    if (pathexit(cx-1,cy)) {
		f.addPrio(new Node(cx-1,cy));
	    }
	    if (pathexit(cx,cy-1)) {
		f.addPrio(new Node(cx,cy-1));
	    }
	    delay(50);
	    System.out.println(this);
	}
	/*
	//	if (!solved) {	
	for (Node b = current.getPrev(); b!=null; b=b.getPrev()) {
	    board[b.getX()][b.getY()] = '#';
	    delay(50);
	    System.out.println(this);
	}
	
	//	}
	*/
    }
	
    public Node findexit(){
	Node result = new Node(0,0);
	int j=0;
	for (int i=0;i<maxX;i++){
	    if (board[i][j] == '$') 
		result = new Node(i,j);
	}
	j++;
	return result;
    }

    public double euclid(Node n) {
	Node exit = findexit();
	double x = (exit.getX()-n.getX())*(exit.getX()-n.getX());
	double y = (exit.getY()-n.getY())*(exit.getY()-n.getY());
	return Math.sqrt(x+y);
    }
	
    public int manhattan(Node n){
	Node exit = findexit();
	int x = Math.abs(exit.getX() - n.getX());
	int y = Math.abs(exit.getY() - n.getY());
	return x + y;
    }
	
    //public int 
	
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.bestfs(1,1);
	System.out.println(m);
    }
}