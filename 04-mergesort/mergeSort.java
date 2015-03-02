import java.io.*;
import java.util.*;

public class mergeSort {
    private ArrayList<Integer> a;
    private int[] A;
    
    public ArrayList<Integer> mergeSort (ArrayList<Integer> a) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	if (a.size()==1) {
	    return a;
	}
	for (int i=0;i<a.size();i++) {
	    if (i<a.size()/2) {
		a1.add(a.get(i));
	    } else {
		a2.add(a.get(i));
	    }
	}
	ArrayList<Integer> b1 = mergeSort(a1);
	ArrayList<Integer> b2 = mergeSort(a2);
	return merge(b1,b2);
    }
    
    public ArrayList<Integer> merge(ArrayList<Integer> a1, ArrayList<Integer> a2) {
	ArrayList<Integer> m = new ArrayList<Integer>();
	while(a1.size() > 0 && a2.size() > 0) {
	    if(a1.get(0) < a2.get(0)) {
		m.add(a1.remove(0));
	    } else {
		m.add(a2.remove(0));
	    }
	}
	if (a1.size()>0) {
	    for (int i=0; i<a1.size(); i++) {
		m.add(a1.get(i));
	    }
	}
	if (a2.size()>0) {
	    for (int i=0; i<a2.size(); i++) {
		m.add(a2.get(i));
	    }
	}
	return m;
    }

    public int[] mergeSortA(int[] A) {
	int[] A1 = new int [(A.length)/2];
	int[] A2 = new int [A.length-((A.length)/2)];
	if (A.length==1) {
	    return A;
	}
	int pos = 0;
	for (int i=0;i<A.length;i++) {
	    if (i<A.length/2) {
		A1[i]=A[i];
	    } else {
		A2[pos]=A[i];
		pos++;
	    }
	}
	int[] B1 = mergeSortA(A1);
	int[] B2 = mergeSortA(A2);
	return mergeA(B1,B2);
    }	

    public int[] mergeA(int[] A1, int[] A2) {
	int[] M = new int[A1.length + A2.length];
	int pos1 = 0;
	int pos2 = 0;
	for (int i=0;i<M.length;i++) {
	    if (pos1<A1.length && pos2<A2.length) {
		if (A1[pos1] < A2[pos2]) {
		    M[i] = A1[pos1];
		    pos1++;
		} else {
		    M[i] = A2[pos2];
		    pos2++;
		}
	    } else if (pos1<A1.length) {
		M[i] = A1[pos1];
		pos1++;
	    } else {
		M[i] = A2[pos2];
		pos2++;
	    }
	}
	return M;
    }
    public String toString(int[] a){
	String s = "";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }
    public static void main (String[] args) {
	mergeSort m = new mergeSort();
	ArrayList<Integer> q = new ArrayList<Integer>();
	q.add(1);
	q.add(2);
	q.add(6);
	q.add(14);
	q.add(2);
	System.out.println(m.mergeSort(q));
	int[] w = {6,23,2,52,3,6};
	int[] e = {4,6};
	System.out.println(m.toString(m.mergeSortA(w)));
    }
}
