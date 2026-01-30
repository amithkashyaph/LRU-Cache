import LRU.LRUCache;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        LRUCache<Integer, String> cache = new LRUCache<>(3);
        int choice  = 0;
        Scanner scanner = new Scanner(System.in);

        while(choice != -1) {

            System.out.println("1 - Add Key");
            System.out.println("2 - Get Key");
            System.out.println("3 - Print Cache");
            System.out.println("-1 - Exit");
            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();
            if(choice == 1) {
                System.out.println("Enter Key: ");
                Integer key = scanner.nextInt();
                System.out.println("Enter Value: ");
                String value = scanner.next();
                System.out.println("Value: " + value);
                cache.put(key, value);
            } else if (choice == 2) {
                System.out.println("Enter Key: ");
                Integer key = scanner.nextInt();
                String value = cache.get(key);
                System.out.println("Value : " + value);
            } else if (choice == 3) {
                cache.printCache();
            } else if (choice == -1) {
                System.out.println("Bye!");

            }
        }


    }
}