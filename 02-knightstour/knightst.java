import java.io.*;
import java.util.*;

public class knightst {
    private int[][] board;
    private int maxX = 5;
    private int maxY = 5;
    private boolean solved = false;
    private int step = 1;

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public knightst() {
	board = new int[maxX+4][maxY+4];
	for (int i=0; i<maxX+2; i++) {
	    for (int j=0; j<maxY+2; j++) {
		if (i<2 || i>=maxX || j<2 || j>=maxX) {
		    board[i][j]=-1;
		} else {
		    board[i][j]=0;
		}
	    }
	}
    }
    
    public void print() {
	for (int i=0;i<=board.length;i++) {
	    for (int j=0;j<board[0].length;j++) {
		if (board[i][j]!=-1) {
		    System.out.printf("|%2d",board[i][j]);
		}
		if (i==board.length-2) {
		    System.out.printf("|");
		}
	    }
	    System.out.printf("\n");
	}
    }
		

    public void solve(int x, int y) {
	if (board[x][y]!=0 || board[x][y]==-1 || solved) {
	    return;
	}
	if (step==maxX*maxY) {
	    solved = true;
	}
	delay(100);
	solve(x+2,y+1);
	solve(x+2,y-1);
	solve(x+1,y+2);		
	solve(x+1,y-2);      
	solve(x-2,y+1);
	solve(x-2,y-1);
	solve(x-1,y+2);
	solve(x-1,y-2);
	if (!solved) {
	    board[x][y]=step;
	    step++;
	}
    }

    public static void main(String[] args) {
	knightst k = new knightst();
	System.out.println(k);
	k.solve(2,2);
	System.out.println(k);
    }
}