public class LList {
    private Node l;
    private int length;

    public LList() {
	l = new Node("");
	length = 0;
    }

    public String get(int n) {
	if (n<0 || n>=length) {
	    throw new IndexOutOfBoundsException();
	} else {
	    Node tmp=l;
	    while (n>0) {
		tmp = tmp.getNext();
		n--;
	    }
	    return tmp.getData();
	}
    }

    public void add(int n, String s) {
	if (n<0 || n>length) {
	    throw new IndexOutOfBoundsException();
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

    public String remove(int n) {
	if (n<0 || n>length) {
	    throw new IndexOutOfBoundsException();
	} else {
	    Node tmp = find(n);
	    Node back = find(n+1);
	    find(n-1).setNext(back);
	    length--;
	    return tmp.getData();
	}
    }
	
    public int size() {
	return length;
    }

    public Node find(int n) {
	Node tmp=l;
	while (n>0) {
	    tmp = tmp.getNext();
	    n--;
	}
	return tmp;
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
