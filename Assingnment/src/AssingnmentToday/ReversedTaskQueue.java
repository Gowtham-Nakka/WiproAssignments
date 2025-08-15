package AssingnmentToday;
import java.util.LinkedList;
import java.util.*;

public class ReversedTaskQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scan = new Scanner(System.in);
		LinkedList<String> ts = new LinkedList<>();
		System.out.println("Enter 4 tasks: ");
		for(int i=1;i<=4;i++) {
			System.out.print("Task " + i + ": ");
			String task = scan.nextLine();
			
			if(task.endsWith("!")) {
				ts.addFirst(task);
			}
			else {
				ts.addLast(task);
			}
		}  
		
		System.out.println("\nTasks in Reverse order: ");
		
		ListIterator<String> iterator = ts.listIterator(ts.size());
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}
