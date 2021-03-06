import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private boolean removed = false;
    private Node<E> last;
    
    public LLit(Node<E> n){
	t=n;
    }

    public boolean hasNext(){
	return t.getNext()!=null;
    }

    public E next(){
	E retval = t.getData();
	last = t;
	t = t.getNext();
	removed = true;
	return retval;
    }

    public void remove() {
	if (removed) {
	    // completed next already
	    last.setNext(t.getNext());
	    t = t.getNext();
	    removed = false;
	} else {
	    throw new IllegalStateException();
	}
    }

}
