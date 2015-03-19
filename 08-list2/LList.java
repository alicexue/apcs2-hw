public class LList {
    private Node l;
    private int length;

    public LList() {
	l = null;
	length = 0;
    }

    public Node getL() {
	return l;
    }
    
    public int get(int n) {
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

    public void add(int n, int s) {
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
	    

    public boolean add(int s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	length++;
	return true;
    }

    //removes int at position n
    /*
    public int remove(int n) {
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
    */

    public boolean remove(int s) {
	Node tmp = l;
	for (int i=0;i<length;i++) {
	    if (tmp.getNext().getData()==s) {
		tmp.setNext(tmp.getNext().getNext());
		length--;
		return true;
	    }
	    tmp = tmp.getNext();
	}
	return false;
    }

    // piggybacking pointers - another solution
    /*  
    public boolean remove(int s) {
	Node tmp = l.getNext();
	Node tmp2 = l;
	while (tmp!=null) {
	    if (tmp.getData()==n) {
		tmp2.setNext(tmp.getNext());
		return true;
	    }
	    tmp2 = tmp;
	    tmp = tmp.getNext();
	}
	return false;
    }
    */	   
 	
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

    public LLit getLLit() {
	LLit llit = new LLit(l);
	return llit;
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
