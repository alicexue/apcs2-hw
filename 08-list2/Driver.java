import java.util.*;
public class Driver{
    public static void main(String[] args) {
	Random r = new Random();
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println(l.get(2));
	l.add(0,"new");
	System.out.println(l);
	l.add(3,"hi");
	System.out.println(l);
	l.remove(5);
	System.out.println(l);
	
    }
}
