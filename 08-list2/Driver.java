import java.util.*;
import java.io.*;
import java.lang.System;

public class Driver{
    public static void main(String[] args) {
	LList q = new LList();
	for (int i=0;i<10;i++) {
	    q.add(i);
	}
	System.out.println(q);
	System.out.println(q.remove(3));
	System.out.println(q);
	
       	Random r = new Random();
	
	long start, elapsed;
	ArrayList<Integer> a = new ArrayList<Integer>();
	LList l = new LList();
	LinkedList l2 = new LinkedList();
	for (int i=0;i<10000;i++) {
	    a.add(r.nextInt(10));
	    l.add(r.nextInt(10));
	    l2.add(r.nextInt(10));
	}


	int sumA = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<a.size();i++){
	    sumA += a.get(i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("ArrayList:" + elapsed);

	int sumL = 0;
	start = System.currentTimeMillis();
	for(int i=0;i<l.size();i++){
	    sumL += l.get(i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("LList:" + elapsed);

	int sumL2 = 0;
	start = System.currentTimeMillis();
	for(int i=0;i<l2.size();i++){
	    sumL2 += (int)l2.get(i);
	}
	elapsed =System.currentTimeMillis()-start;
	System.out.println("LinkedList:" + elapsed);
    }
}
