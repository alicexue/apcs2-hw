import java.util.*;

public class Driver {
    public static void main (String[] args) {
	LList l = new LList();
	Random r = new Random();
	//l.add("hello");
	//l.add("world");
	for (int i=0;i<10;i++) {
	    l.add(""+r.nextInt(100));
	}
	System.out.println(l);
    }
}
