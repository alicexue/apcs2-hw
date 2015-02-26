import java.io.*;
import java.util.*;

public class knightst {
    private int[][] board;
    private int maxX = 5;
    private int maxY = 5;
    private boolean solved = false;

    public knightst() {
	maxX+=4;
	maxY+=4;
	board = new int[maxX][maxY];
	for (int i=0; i<maxX; i++) {
	    for (int j=0; j<maxY; j++) {
		if (i<2 || i>=maxX-2 || j<2 || j>=maxX-2) {
		    board[i][j]=-1;
		} else {
		    board[i][j]=0;
		}
	    }
	}
    }
    
    public void print() {
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[0].length;j++) {
		if (board[i][j]!=-1) {
		    System.out.printf("|%2d",board[i][j]);
		}
	    }
	    System.out.printf("\n");
	}
    }
		

    public void solve(int x, int y, int step) {
	if (board[x][y]!=0 || solved) {
	    return;
	}
	board[x][y]=step;
	if (step==(maxX-4)*(maxY-4)) {
	    print();
	    solved = true;
	}
	solve(x+2,y+1,step+1);
	solve(x+2,y-1,step+1);
	solve(x+1,y+2,step+1);		
	solve(x+1,y-2,step+1);      
	solve(x-2,y+1,step+1);
	solve(x-2,y-1,step+1);
	solve(x-1,y+2,step+1);
	solve(x-1,y-2,step+1);
	if (!solved) {
	    board[x][y]=0;
	    step--;
	}
    }

    public static void main(String[] args) {
	knightst k = new knightst();
	k.solve(2,2,1);
    }
}