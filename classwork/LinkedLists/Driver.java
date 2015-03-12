public class Driver {
    public static void main(String[] args) {
	Node n = new Node("hello");
	//System.out.println(n);
	Node n2 = new Node("world");
	//System.out.println(n2);

	n.setNext(n2);

	System.out.println(n.getNext().getData());
	System.out.println(n.getNext());

	n.getNext().setData("pickle");
	// n2 becomes pickle

	System.out.println(n2);

	n2.setData("watermelon");
	System.out.println(n.getNext().getData());

	n2.setNext(new Node("abc"));
	System.out.println(n.getNext().getNext().getData());

	n.getNext().getNext().setNext(new Node("yabba dabba doo"));

	// to put "start" at the beginning of the list, make a new node containing "start" and add the rest of the list to that node. set original list to tmp
	Node tmp = new Node("start");
	tmp.setNext(n);
	n = tmp;
	System.out.println(tmp);
	System.out.println(n);
	System.out.println(n.getNext());

	System.out.println();
	tmp = n;
	while (tmp!=null) {
	    System.out.println(tmp);
	    tmp = tmp.getNext();
	}
	System.out.println();
	for (tmp = n; tmp!=null; tmp=tmp.getNext()) {
	    System.out.println(tmp);
	}
    }
}
	 
