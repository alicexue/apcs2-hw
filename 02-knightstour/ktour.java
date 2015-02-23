import java.io.*;
import java.util.*;

public class ktour {
    private char[][] board;
    private int maxX = 5;
    private int maxY = 5;
    private int vsquares = 0;
    private char knight = 'K';
    private char space = ' ';
    private char visited = '.';
    private boolean solved = false;

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public ktour() {
	board = new char[maxX+2][maxY+2];
	for (int i=0; i<maxX+2; i++) {
	    for (int j=0; j<maxY+2; j++) {
		if (i<2 || i>=maxX || j<2 || j>=maxX) {
		    board[i][j]=visited;
		} else {
		    board[i][j]=space;
		}
	    }
	}
    }
    
    public void print() {
	System.out.println("[2J\n");
	for (int i=2;i<=maxX;i++) {
	    if (i==maxX) {
	   	System.out.printf("\n");
	    }
	    for (int j=2;j<maxY;j++) {
		if (i!=maxX) {
		    System.out.printf("|%c",board[i][j]);
		}
	    }
	}
    }
		

    public void solve(int x, int y) {
	if (board[x][y]==visited || board[x][y]==knight || solved) {
	    return;
	}
	if (vsquares==maxX*maxY) {
	    print();
	    solved = true;
	}
	delay(100);
	print();
	board[x][y]=knight;
	solve(x+2,y+1);
	solve(x+2,y-1);
	solve(x+1,y+2);		
	solve(x+1,y-2);      
	solve(x-2,y+1);
	solve(x-2,y-1);
	solve(x-1,y+2);
	solve(x-1,y-2);
	if (!solved) {
	    board[x][y]=visited;
	    vsquares++;
	}
    }

    public static void main(String[] args) {
	ktour k = new ktour();
	System.out.println(k);
	k.solve(2,2);
	System.out.println(k);
    }
}