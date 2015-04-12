public class Node {
    private char data;    
    private Node next;
    private int xcor,ycor;

    public Node() {
	next = null;
    }
    public Node(char s){
	data = s;
	next = null;
    }
    public Node(char s, int x, int y) {
	data = s;
	xcor = x;
	ycor = y;
	next = null;
    }
    public int getx() {
	return xcor;
    }
    public int gety() {
	return ycor;
    }
    public void setData(char s){
	data = s;
    }
    public char getData(){
	return data;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return ""+data;
    }
}
