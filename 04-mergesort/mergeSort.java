public class mergeSort {
    private ArrayList<Integer> a;
    private ArrayList<Integer> b;

    public ArrayList<Integer> merge(ArrayList<Integer> a1, ArrayList<Integer> a2) {
	ArrayList<Integer> m = new ArrayList<Integer>();
	while(a1.size() > 0 || a2.size() > 0) {
	    if(a1.size() == 0) {
	        for (int i=0;i<a2.size();i++){
		    m.add(a2.remove(0));
		}
	    } else if(a1.size() == 0) {
		for (int i=0;i<a1.size();i++){
		    m.add(a1.remove(0));
		}
	    } else if(a1.get(0) > a2.get(0)) {
		m.add(a1.remove(0));
	    } else {
		m.add(a2.remove(0));
	    }
	}
	return m;
    }
}