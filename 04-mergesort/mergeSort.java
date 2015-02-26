import java.io.*;
import java.util.*;

public class mergeSort {
    private ArrayList<Integer> a;
    private ArrayList<Integer> a1;
    private ArrayList<Integer> a2;
    
    public ArrayList<Integer> mergeSort (ArrayList<Integer> a) {
	a1 = new ArrayList<Integer>();
	a2 = new ArrayList<Integer>();
	for (int i=0;i<a.size();i++) {
	    if (i<a.size()/2) {
		a1.add(a.get(i));
	    } else {
		a2.add(a.get(i));
	    }
	}
	ArrayList<Integer> b1 = new ArrayList<Integer>();
	b1 = mergeSort(a1);
	ArrayList<Integer> b2 = new ArrayList<Integer>();
	b2 = mergeSort(a2);
	return merge(b1,b2);
    }
    
    public ArrayList<Integer> merge(ArrayList<Integer> a1, ArrayList<Integer> a2) {
	ArrayList<Integer> m = new ArrayList<Integer>();
	while(a1.size() > 0 || a2.size() > 0) {
	    if(a1.size() == 0) {
	        while (a2.size()>0) {
		    m.add(a2.remove(0));
		}
	    } else if(a1.size() == 0) {
		while (a1.size()>0) {
		    m.add(a1.remove(0));
		}
	    } else if(a1.get(0) < a2.get(0)) {
		m.add(a1.remove(0));
		System.out.println(a1 + "1");
		System.out.println(m);
	    } else {
		m.add(a2.remove(0));
		System.out.println(a2 + "2");
		System.out.println("m: "+m);
	    }
	}
	return m;
    }

    public static void main (String[] args) {
	mergeSort m = new mergeSort();
	ArrayList<Integer> q = new ArrayList<Integer>();
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.add(4);
	System.out.println(m.merge(q,q));
	//System.out.println(m.mergeSort(q));
    }
}
