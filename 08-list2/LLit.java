public class LLit {
    private Node l;
    public LLit (Node n) {
	l = n.getNext();
    }

    public boolean hasNext() {
	return l==null;
    }

    // move to the next node and return the value in the node (before the move)
    public int next() {
	int s = l.getData();
	l = l.getNext();
	return s;
    }
}

