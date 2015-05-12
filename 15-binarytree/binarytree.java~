public class binarytree {

    private Node t;

    public int maxValue(Node t) {
	if (tmp.getRight!=null) {
	    return tmp.getData();
	} else {
	    return maxValue(tmp.getRight());
	}
    }

    // not complete
    public int height(Node t) {
	Node tmp = t;
	int h = 0;
	if (t==null) {
	    return 0;
	} else {
	    h++;
	    if (height(t.getLeft())>height(t.getRight())) {
		return height(t.getLeft());
	    } else {
		return height(t.getRight());
	    }
	}	
    }

    // not sure how to do
    public int longest(Node t) {
	
    }

    public void splitdupes(Node t) {
	if (t==null) {
	    return;
	} else {
	    Node tmp;
	    Node n = new Node(t.getData()-1);
	    if (t.getLeft()!=null && t.getLeft().getData()==t.getData()) {
		tmp = t.getLeft();
		t.setLeft(n);
		n.setLeft(tmp);
	    }
	    if (t.getRight!=null && t.getRight().getData()==t.getData()) {
		tmp = t.getRight();
		t.setRight(n);
		n.setRight(tmp);
	    }
	}
	splitDupes(t.getLeft());
	splitDupes(t.getRight());
    }

}
    
