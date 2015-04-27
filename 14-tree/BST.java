public class BST {    
    private Node T;

    public Tree() {
	T = null;
    }

    public Node search (Node n, int i) {
	if (n==null || n.getData()==i) {
	    return n;
	} else if (i<n.getData()) {
	    return search(n.getLeft(),i);
	} else (i>n.getData()) {
	    return search(n.getRight(),i);
	}
    }

    public String search(int i) {
	Node n = search(T,i);
	if (n==null) {
	    return "NOT FOUND";
	} else {
	    return n.toString();
	}
    }
    
    public void insert(int a) {
	if (T==null)
	    T = new Node(a);
	else {
	    Node tmp = T;
	    while (T!=null) {
		tmp = T;
		if (T.getData()>a) 
		    T = T.getRight();
		else if (T.getData()<0) 
		    T = T.getLeft();
		else
		    return;	       
	    }
	    if (a<tmp.getData()) 
		tmp.setLeft(new Node(a));
	    else 
		tmp.setRight(new Node(a));
	}
    }

    public Node search(int i) {
	while (T!=null) {
	    int c = compareTo(i);
	    if (T.getData()>i) 
		T = T.getRight();
	    else if (T.getData()<i)
		T = T.getLeft();
	    else 
		return T;
	}
	return null;
    }

    public String traverse(Node T) {
	String s = "";
	if (T==null) {
	    return s;
	} else {
	    s = s + T.getData + " (" traverse(T.getLeft()) + ", " + traverse(T.getRight) + ")");
	}
    }

}
