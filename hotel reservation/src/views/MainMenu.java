package views;

import java.util.Scanner;

public class MainMenu {
    public void start() {
        boolean keepRunning = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (keepRunning) {
                try {
                    System.out.println("1. Find and reserve a room");
                    System.out.println("2. See my reservations");
                    System.out.println("3. Create an account");
                    System.out.println("4. Admin");
                    System.out.println("5. Exit");
                    int selection = Integer.parseInt(scanner.next());

                    if (selection == 1) {
                        System.out.println("1. Find and reserve a room");
                        keepRunning = false;
                    } else if (selection == 2) {
                        System.out.println("2. See my reservations");
                        keepRunning = false;
                    } else if (selection == 3) {
                        System.out.println("3. Create an account");
                        keepRunning = false;
                    } else if (selection == 4) {
                        System.out.println("4. Admin");
                        keepRunning = false;
                    } else if (selection == 5) {
                        System.out.println("5. Exit");
                        keepRunning = false;
                    } else {
                        System.out.println("Please select menu between 1 and 5");
                    }
                } catch ( Exception ex) {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
