public class Node {
    private int x,y;
    private Node prev, next;
    private double prio;
		
    public Node(int x, int y){
	this.x = x;
	this.y = y;
    }

    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public double getPrio(){
	return prio;
    }

    public void setPrio(double p) {
	prio = p;
    }
}










