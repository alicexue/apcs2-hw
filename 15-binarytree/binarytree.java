public class binarytree {

    private Node t;

    public int maxVal() {
	int m = t.getData();
	Node tmp = t;
	while (tmp.getRight!=null) {
	    m = tmp.getRight().getData();
	    tmp = tmp.getRight();
	}
	return m;
    }

    public int height(Node t) {
	Node tmp = t;
	int h = 0;
	if (t==null) {
	    return 0;
	} else {
	    h++;
	    //return tmp.getRight().getData();
	}
	
    }

    public int leaf2leaf() {
	
    }

    public void splitdupes() {
	
    }

}
    
