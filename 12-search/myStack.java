public class myStack{
    private Node thing;
    public myStack(){
	thing = new Node();
    }

    public void push(Node n) {
	n.setNext(thing);
	thing = n; 
    }

    public char pop(){
        // remove and return the top item from the stack
	// make sure to check if the stack is empty - throw an error if so 
	char tmp = thing.getData();
	thing = thing.getNext();
	return tmp;
    }

    public boolean empty(){
	return thing==null;
    }

    public Node getTop() {
	return thing;
    }

    public char top() {
        // return the top item from the stack
	return thing.getData();
    }
   
 	
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp=thing; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s;
	return s;
    }

}