import java.util.*;
import java.io.*;
import java.lang.System;

public class Driver{
    public static void main(String[] args) {
       	Random r = new Random();
	/*
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println(l.get(2));
	l.add(0,"14");
	System.out.println(l);
	l.add(3,"15");
	System.out.println(l);
	l.remove(5);
	System.out.println(l);
	System.out.println(l.size());
	//l.get(100);
	*/
	int rnd = r.nextInt();
	ArrayList<Integer> a = new ArrayList<Integer>();
	for (int i=0;i<10;i++) {
	    a.add(rnd);
	}
	long t = System.currentTimeMillis();
	System.out.println(t);
	long start, elapsed;
	start = System.currentTimeMillis();
	int sumA=0;
	for (int i=0;i<10;i++) {
	    sumA+=i;
	}
	elapsed = System.currentTimeMillis()-start;


	LList l2 = new LList();
	for (int i=0; i < 10; i++){
	    l2.add(rnd);
	}
	int sumL = 0;
	Node tmp;
	t = System.currentTimeMillis();
	System.out.println(t);
	start = System.currentTimeMillis();
	for (tmp = l2.getL(); tmp!= null; tmp=tmp.getNext()) {
	    sumL+=tmp.getData();
	}
	elapsed = System.currentTimeMillis()-start;
    }
}
