package AssingnmentToday;
import java.util.*;
public class AverageConfusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the array: ");
		int size = scan.nextInt();
		System.out.println("Enter the Elements: ");
		int a[] = new int[size];
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		double sum = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] < 10) {
				a[i] = a[i]*a[i];
				sum = sum + a[i];
			}

			
		}
		System.out.println("The average is : " + sum/a.length);
	}

}
