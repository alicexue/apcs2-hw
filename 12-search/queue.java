public class queue {
    private Node l;
    private Node last;
    public queue() {
	l = new Node();
	last = new Node();
	l.setNext(last);
    }

    public void enqueue(Node n) {
	if (l==null) {
	    n.setNext(l);
	    l=n;
	} else {
	    last.setNext(n);
	}
	last=n;
    }

    public Node getHead() {
	return l;
    }
    public char head() {
	return l.getData();
    }

    public char dequeue() {
	char result = head();
	l = l.getNext();
	return result;
    }

    public boolean empty() {
	return l==null;
    }

    public int size() {
	int count = 0;
	Node tmp = l;
	while (tmp!=null) {
	    count++;
	    tmp = tmp.getNext();
	}
	return count;
    }
    
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp=l; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
}
	

   
