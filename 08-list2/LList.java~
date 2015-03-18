public class LList {
    private Node l=null;
    private int length=0;

    public Node get(int n) {
	if (n<0 || n>=length) {
	    throw IndexOutOfBoundsException;
	} else {
	    Node tmp=l;
	    while (n>0) {
		tmp = tmp.getNext();
		n--;
	    }
	    return tmp;
	}
    }

    public void add(int n, String s) {
	if (n<0 || n>length) {
	    throw IndexOutOfBoundsException;
	} else 	if (n==0) {
	    add(s);
	} else {
	    Node ns = new Node(s);
	    Node back = find(n);
	    ns.setNext(back);
	    find(n-1).setNext(ns);
	}
	length++;
    }
	    

    public boolean add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	length++;
	return true;
    }

    public Node remove(int n) {
	// account for exceptions
	if (n<0 || n>length) {
	    throw IndexOutOfBoundsException;
	}
	Node back = find(n+1);
	find(n-1).setNext(back);
	length--;
    }
	
    
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
		
}
