public class Tree {    
    private Node T;

    public void insert(int a) {
	if (T==null)
	    T = new Node(a);
	else {
	    Node tmp = T;
	    while (T!=null) {
		int c = T.getData().compareTo(i);
		tmp = T;
		if (c>0) {
		    T = T.getRight();
		} else if (c<0) {
		    T = T.getLeft();
		} else {
		    break;
		}
	    }
	    if (a<T.getData) 
		tmp.setLeft(new Node(a));
	    else 
		tmp.setRight(new Node(a));
	}
    }

    public Node search(Node T, int i) {
	while (T!=null) {
	    int c = T.getData().compareTo(i);
	    if (c>0) 
		T = T.getRight();
	    else if (c<0)
		T = T.getLeft();
	    else 
		return T;
	}
	return null;
    }
}
