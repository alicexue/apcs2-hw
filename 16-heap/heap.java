import java.io.*;
import java.util.*;

public class heap {

    private ArrayList<Integer> h;

    public heap() {
	h = new ArrayList<Integer>();
    }

    public void pushdown(int i) {
	int pos = i;
	while (pos < h.size()) {
	    if (h.get(pos*2-1)<h.get(pos-1)) {
		h.set(pos-1, h.get(pos*2-1));
		pos = pos*2-1;
	    } else {
		h.set(pos-1, h.get(pos*2));
		pos = pos*2;
	    }
	} 
    }

    public void removemin() {
	h.set(0, h.get(hlength-1));
	h.set(hlength-1,0);
	pushdown();
    }

    public int[] heapsort() {
	for (int i = h.size()-1; i>=0; i--) {
	    pushdown(h.get(i));
	}
    }

    public boolean insert(int i) {
	h.add(i);
	h.siftup(h.size()-1);
    }

    public void siftup(int i) {
	int pos = i;
	while (pos > 0) {
	    if (h.get(pos/2)>h.get(pos)) {
		int tmp = h.get(pos/2);
		h.set(pos/2, h.get(pos));
		h.set(pos, tmp);
	    }
	}
    }
}