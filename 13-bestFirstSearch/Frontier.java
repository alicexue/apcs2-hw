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
	    for (Node tmp = l.getPrev(); tmp! = null; tmp.getPrev()) {
		if (n.getPrio()<tmp.getPrio()) {
		    tmp.setPrio(n);
		} else {
		    l.add(n);
		}
	    }
	}
    }
	
}










