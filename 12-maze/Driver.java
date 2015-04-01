public class Driver {
    public static void main(String[] args) {
	queue q = new queue();
	System.out.println(q.empty());
	q.enqueue(2);
	q.enqueue(3);
	System.out.println(q);
	System.out.println(q.head());
	q.dequeue();
	System.out.println(q);
    }
}