import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private E last;
    
    public LLit(Node<E> n){
	t=n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	t=t.getNext();
	return retval;
    }

    public void remove() {
        Node tmp;
	Node prev = t;
	for (tmp = t.getNext(); tmp!=null; tmp=tmp.getNext()) {
	    t = t.getNext();
	    if (tmp.getData() = last) {
		
	    }
	}
    }
		
    }
}
