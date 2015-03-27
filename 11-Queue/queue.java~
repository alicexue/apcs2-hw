public class queue<E> {
    private Node<E> l;
    public queue() {
	l = new Node();
    }

    public Node<E> getLast(){
	Node<E> tmp = l;
	while (tmp!=null) {
	    if (tmp.getNext()==null) {
		return tmp;
	    }
	    tmp=tmp.getNext();
	}
    }

    public void enqueue(E data) {
	getLast().setNext(data);
    }

    public E front() {
	return l.getData();
    }

    public E dequeue() {
	E result = front();
	l = l.getNext();
	return result;
    }

    public boolean empty() {
	return l==null;
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

}
	

   
