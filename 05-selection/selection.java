import java.util.*;
import java.io.*;

public class selection {
    int[] L;

    public int[] partition (int[] L, int SI, int EI) {
	int pivot = L[SI];
	int[] D = new int[L.length];
	for (int i=EI;i<L.length;i++) {
	    D[i]=L[i];
	}
	for (int i=SI;i<EI;i++) {
	    if (L[i]<pivot) {
		D[SI] = L[i];
		SI++;
	    } else {
		D[EI] = L[i];
		EI--;
	    }
	}
	D[SI] = pivot;
	return D;
    }

    public String toString(int[] a) {
	String q = "";
	for (int i=0;i<a.length;i++) {
	    q+=a[i];
	    q+=", ";
	}
	return q;
    }
    

    public static void main(String[] args) {
	selection s = new selection();
	int[] a = {2, 5, 3, 1, 35, 4, 54, 6, 7, 15};
	int[] r = s.partition(a,2,7);
	System.out.println("pivot: "+a[2]); 
	System.out.println(s.toString(r));
    }
}