public class Driver{
    public static void main(String[] args) {
	LList<String> l = new LList<String>();
	//ArrayList<String> l = new LList<String>();
	//LinkedList<String> l = new LinkedList<String>();
	l.add("Hello");
	l.add("world");
	l.add("abc");
	l.add("something");
	l.add("else");

	System.out.println(l);

	LList<Integer> l2 = new LList<Integer>();
	for (int i=0;i < 5; i++){
	    l2.add(i);
	}

	System.out.println(l2);
	System.out.println();

	Iterator<String> i = l.iterator();
	while (i.hasNext())
	    System.out.println(i.next());
				
	Iterator<Integer> i2 = l2.iterator();
	while (i2.hasNext())
	    System.out.println(i2.next());
				
	for (String s : l) {
	    System.out.println(s +", ");
	}
	System.out.println();
	for (int j : l2) {
	    Sysetm.out.println(j+", ");
	}
	System.out.println();
	      
    }
}
