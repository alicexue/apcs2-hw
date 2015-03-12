public class LList {
    private Node l=null;

    public void add(String s) {
	//l=(new Node (s));
	//l.setNext(null);
	//does not work
	
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    public String toString() {
	String s = "";
	Node temp;
	for (temp=l; temp!=null; temp=temp.getNext()) {
	    s = s+ temp + "-->";
	}
	s = s+"null";
	return s;
    }
}
