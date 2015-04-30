public class BST {    
    private Node T;

    public Node search(Node n, int i) {
	if (n==null || n.getData()==i) {
	    return n;
	} else if (i<n.getData()) {
	    return search(n.getLeft(),i);
	} else {
	    return search(n.getRight(),i);
	}
    }

    public String search(int i) {
	Node n = search(T,i);
	if (n==null) {
	    return "NOT FOUND";
	} else {
	    return ""+n.getData();
	}
    }
    
    public void insert(int i) {
	Node n = new Node(i);
	Node t2=null;
	Node t = T;
	if (T==null){
	    T=n;
	    return;
	}
								
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}
				
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }

    /*
    public Node search(int i) {
	while (T!=null) {
	    if (T.getData()>i) 
		T = T.getRight();
	    else if (T.getData()<i)
		T = T.getLeft();
	    else 
		return T;
	}
	return null;
    }
    */
    
    public String traverse(Node T) {
	if (T==null) {
	    return "";
	} else {
	    return traverse(T.getLeft()) + " " + T.getData() + " "  + traverse(T.getRight()) + " ";
	}
    }

    public void remove(int i) {
	Node t = T;
	Node t2 = t;
	while (t.getData()!=i) {
	    t2 = t;
	    int a = t.getData();
	    if (i<a) 
		t = t.getLeft();
	    else
		t = t.getRight();
	}
	if (t.getLeft()==null && t.getRight()==null) {
	    if (t2.getLeft()==t)
		t2.setLeft(null);
	    else
		t2.setRight(null);
	}
	if (t.getLeft()==null || t.getRight()==null) {
	    if (t.getLeft() == null){
		if (t2.getLeft()== t)
		    t2.setLeft(t.getRight());
		else
		    t2.setRight(t.getRight());
	    }
	    else {
		if (t2.getLeft() == t)
		    t2.setLeft(t.getLeft());
		else
		    t2.setRight(t.getLeft());
	    }
	}
	if (t.getLeft()!=null && t.getRight()!=null) {
	    Node l = t.getLeft();
	    while (l.getRight()!=null) {
		l = l.getRight();
	    }
	    t = l;
	}
    }

     
}
