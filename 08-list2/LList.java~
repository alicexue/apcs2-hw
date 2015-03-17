public class LList {
    private Node l=null;

    public Node find(int n) {
	Node tmp=l;
	while (n>0) {
	    tmp = tmp.getNext();
	    n--;
	}
	return tmp;
    }

    public void insert(int n, String s) {
	if (n==0) {
	    add(s);
	} else {
	    Node ns = new Node(s);
	    Node back = find(n);
	    ns.setNext(back);
	    find(n-1).setNext(ns);
	}
    }
	    

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
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
