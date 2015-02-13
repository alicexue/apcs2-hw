import java.io.*;
import java.util.*;

public class ktour {
    private char[][] board;
    private int maxX = 5;
    private int maxY = 5;
    private char knight = 'K';
    private char space = ' ';
    private char visited = '.';
    private boolean solved = false;

    public ktour() {
	board = new char[maxX+2][maxY+2];
	for (int i=0; i<maxX+2; i++) {
	    for (int j=0; j<maxY+2; j++) {
		if (i<2 || i>=maxX) {
		
    
