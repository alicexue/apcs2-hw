import java.io.*;
import java.util.*;
public class MazeStack
{
    private myStack q = new myStack();
    private char[][] board;
    private int maxX;
    private int maxY;
    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    public MazeStack()
    {
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
	catch (Exception e)
	    {
	    }
    }
    public String toString()
    {
	String s = "[2J\n";
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }
    /*
      solved - instance variable to indicate we're done
    */
    public void solve(int x, int y){
	if (board[x][y]==wall ||
	    board[x][y]==me ||
	    board[x][y]==visited ||
	    solved){
	    return;
	}
	if (board[x][y]==exit){
	    System.out.println(this);
	    solved = true;
	    return;
	}
	delay(100);
	System.out.println(this);
	board[x][y]=me;
	if (x+1<maxX && PathExit(x+1,y))
	    q.push(makeNode(x+1,y));
	if (x-1>=0 && PathExit(x-1,y))
	    q.push(makeNode(x-1,y));
	if (y+1<maxY && PathExit(x,y+1))
	    q.push(makeNode(x,y+1));
	if (y>=0 && PathExit(x,y-1))
	    q.push(makeNode(x,y-1));
	while (!q.empty()) {
	    if (q.top()==exit) {
		solved = true;
		return;
	    }
	    Node tmp = q.getTop();
	    int tmpx = tmp.getx();
	    int tmpy = tmp.gety();
	    solve(tmpx,tmpy);
	    if (q.getTop()!=null) 
		q.pop();
	}
    }
    public boolean PathExit(int x, int y) {
	if (board[x][y]==path || board[x][y]==exit) {
	    return true;
	}
	return false;
    }
    public Node makeNode(int x, int y) {	
	Node n = new Node(board[x][y],x,y);
	return n;
    }
    public static void main(String[] args){
	MazeStack m = new MazeStack();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}
