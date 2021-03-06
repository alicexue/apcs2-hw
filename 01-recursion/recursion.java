public class recursion {
    public static int factorial(int n) {
	if (n==0) {
	    return 1;
	} else {
	    return n*factorial(n-1);
	}
    }
    
    public static int fib(int n) {
	if (n <= 2) {
	    return 1;
	} else {
	    return fib(n-1) + fib(n-2);
	}
    }

    public static int len(String str) {
	if (str.equals("")) {
	    return 0;
	} else {
	    return len(str.substring(1))+1;
	}
    }

    public static int count(String str, char c) {
	if (str.equals("")) {
	    return 0;
	} else {
	    if (str.charAt(0)==(c)){
		return count(str.substring(1),c)+1;
	    } else {
		return count(str.substring(1),c);
	    }
	}
    }

    public static int bunnyEars2(int n){
	if (n==0){
	    return 0;
	} else {
	    if (n%2==0){
		return bunnyEars2(n-1)+3;
	    } else {
		return bunnyEars2(n-1)+2;
	    }
	}
    }
  
    public static int strCount(String str, String sub) {
	if (str.length() < sub.length()) {
	    return 0;
	} else {
	    if (str.substring(0, sub.length()).equals(sub)) {
		return 1 + strCount(str.substring(sub.length()), sub);
	    } else {
		return strCount(str.substring(1), sub);
	    }
	}
    }
  
  
    public static int sumDigits(int n) {
	if (n<10){
	    return n;
	} else {
	    int right = n%10;
	    int left = n/10;
	    return sumDigits(left)+right;
	}
    }
  
    public static String allStar(String str) {
	if (str.length()<=1) {
	    return str;
	} else {
	    return str.substring(0,1)+"*"+allStar(str.substring(1));
	}
    }
    public static void main(String[] args) {
	System.out.println("factorial(5): "+factorial(5));
	System.out.println("fib(6): " + fib(6));
	System.out.println("len(\"hello\"): "+len("hello"));
	System.out.println("count(\"hello\",\'l\'): "+count("hello",'l'));
	System.out.println("bunnyEars2(2): "+bunnyEars2(2));
	System.out.println("strCount(\"catcowcat\", \"cat\"): " + strCount("catcowcat", "cat"));
	System.out.println("sumDigits(126): "+sumDigits(126));
	System.out.println("allStar(\"hello\"): "+allStar("hello"));
    }
}