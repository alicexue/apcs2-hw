public class selection {
    public int select(int[] A, int k, int l, int h) {
	int Li=l;
	int Hi=h;
	int pivot = A[0];
	int temp;
	while (Li<Hi) {
	    if (A[Li]<pivot) {
		Li++;
	    } else {
		temp = A[Li];
		A[Li]=A[Hi];
		A[Hi]=temp;
		Hi--;
	    }
	}
	temp=A[Li+1];
	A[Li+1]=pivot;
	A[h]=temp;
       
	System.out.println(toString(A));
	int min=A[0];
	for (int i=0;i<A.length;i++) {
	    if (A[i]<min) {
		min=A[i];
	    }
	}
	
	if (pivot==min) {
	    return A[k-1];
	} else if (k<Li) {
	    return select(A,k,l,Li-1);
	} else {
	    return select(A,k,Li-1,h);
	}
    }

    public String toString(int[] a) {
	String s = "";
	for (int i=0;i<a.length;i++){
	    s+=a[i];
	    s+=", ";
	}
	return s;
    }

    public static void main(String[] args) {
	selection s = new selection();
	int[] A = {8, 3, 5, 2, 9, 10, 1, 32, 43};
	System.out.println(s.toString(A));
	System.out.println(s.select(A,3,0,A.length-1));
	System.out.println(s.toString(A));
    }
}