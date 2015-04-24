public class Node {
    private int data;
    private Node left, right;

    public Node(int a) {
	data = a;
	left = null;
	right = null;
    }
    
    public void setData(int a) {
	data = a;
    }

    public int getData() {
	return data;
    }

    public void setLeft(Node n) {
	left = n;
    }

    public Node getLeft() {
	return left;
    }

    public void setRight(Node n) {
	right = n;
    }

    public Node getRight() {
	return right;
    }
}
