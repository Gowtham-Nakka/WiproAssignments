<<<<<<< HEAD
=======
<<<<<<< HEAD
package AssingnmentToday;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class LastThreeSearches {
    public static void main(String[] args) {
        Deque<String> searchHistory = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            if (searchHistory.size() == 3) {
                searchHistory.removeFirst();
            }
            searchHistory.addLast(input);
        }

        for (String search : searchHistory) {
            System.out.println(search);
        }

        scanner.close();
    }
=======
>>>>>>> my-feature-branch
package AssingnmentToday;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class LastThreeSearches {
    public static void main(String[] args) {
        Deque<String> searchHistory = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            if (searchHistory.size() == 3) {
                searchHistory.removeFirst();
            }
            searchHistory.addLast(input);
        }

        for (String search : searchHistory) {
            System.out.println(search);
        }

        scanner.close();
    }
<<<<<<< HEAD
=======
>>>>>>> af4bfed9 (added all the files)
>>>>>>> my-feature-branch
}