public class myStack<E>{
    //Alice and Rabia 
    // You decide how the node(s) are declared
    private Node<E>thing;
    public myStack(){
	thing = new Node();
    }
    // make whatever constructor(s) you need

    public void push(E data){
        // add something to the top
	Node n = new Node(data);
	n.setNext(thing);
	thing = n; 
    }

    public E pop(){
        // remove and return the top item from the stack
	E tmp = thing.getData();
	thing = thing.getNext();
	return tmp;
    }

    public boolean empty(){
	Node<E> tmp = thing;
	while (tmp.getData()!= null) {
            tmp = tmp.getNext();
	    return false;
	}
	return true;
    }

    public E top() {
        // return the top item from the stack
	return thing.getData();
    }
   
 	
    public String toString(){
	String s = "";
	Node<E> tmp;
	for (tmp=thing; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s;
	return s;
    }

public static void main (String[] args) {

	myStack<Integer> s = new myStack<Integer>(); 
	System.out.println(s.empty());
	s.push(10);
	System.out.println(s.empty());
	System.out.println(s);
	s.push(12);
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.top());


    }
}
