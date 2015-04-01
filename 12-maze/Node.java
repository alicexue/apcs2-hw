public class Node<E>{
    private E data;
    private Node<E> next;
    private int xcor,ycor;

    public Node(){
	data = null;
	next = null;
    }
    public Node(E s){
	data = s;
	next = null;
    }
    public Node(int x, int y) {
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
    public void setData(E s){
	data = s;
    }
    public E getData(){
	return data;
    }
    public void setNext(Node<E> n){
	next = n;
    }
    public Node<E> getNext(){
	return next;
    }
    public String toString(){
	return ""+data;
    }
}
