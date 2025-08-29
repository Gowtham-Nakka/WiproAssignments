<<<<<<< HEAD
=======
<<<<<<< HEAD
package AssingnmentToday;

import java.util.LinkedList;
import java.util.Scanner;

public class RecentAppMemory {
    public static void main(String[] args) {
        LinkedList<String> apps = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String app = scanner.nextLine();
            apps.remove(app);
            apps.addFirst(app);
        }

        for (String app : apps) {
            System.out.println(app);
        }

        scanner.close();
    }
=======
>>>>>>> my-feature-branch
package AssingnmentToday;

import java.util.LinkedList;
import java.util.Scanner;

public class RecentAppMemory {
    public static void main(String[] args) {
        LinkedList<String> apps = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String app = scanner.nextLine();
            apps.remove(app);
            apps.addFirst(app);
        }

        for (String app : apps) {
            System.out.println(app);
        }

        scanner.close();
    }
<<<<<<< HEAD
=======
>>>>>>> af4bfed9 (added all the files)
>>>>>>> my-feature-branch
}