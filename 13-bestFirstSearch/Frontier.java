import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	l.add(n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }

    public void addPrio(Node n) {
	if (l.isEmpty()) {
	    l.add(n);
	} else {
	    int i = 0;
	    while (i < l.size()) {
		if (n.getPrio()<l.get(i).getPrio()) {
		    l.get(i).setPrev(n);
		} else {
		    l.add(n);
		}
	    }
	}
    }
	
}










