public class queue<E> {
    private Node<E> l;
    private Node<E> last;
    public queue() {
	l = new Node();
	last = new Node<E>();
	l.setNext(last);
    }

    public void enqueue(E data) {
	Node<E> n = new Node<E>(data);
	if (l.getData()==null) {
	    n.setNext(l);
	    l=n;
	} else {
	    last.setNext(n);
	}
	last=n;
    }

    public E head() {
	return l.getData();
    }

    public E dequeue() {
	E result = head();
	l = l.getNext();
	return result;
    }

    public boolean empty() {
	return l.getData()==null;
    }

    public int size() {
	int count = 0;
	Node<E> tmp = l;
	while (tmp!=null) {
	    count++;
	    tmp = tmp.getNext();
	}
	return count;
    }

    public String toString(){
	String s = "";
	Node<E> tmp;
	for (tmp=l; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
}
	

   
