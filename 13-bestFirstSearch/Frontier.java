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
	} else if (l.get(l.size()-1).getPrio()<n.getPrio()) {
		l.add(n);
	} else {
	    int i = 0;
	    double prio = n.getPrio();
	    while (i<l.size()) {
	    	if (prio<l.get(i).getPrio()) {
	    		l.add(i,n);
	    		return;
	    	} 
	    	i++;
	    }
	}
    }
	
}










