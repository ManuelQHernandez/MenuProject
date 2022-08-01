import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Scanner sn;


    public Menu() {
        sn = new Scanner(System.in);
    }


    public void run() {
        boolean exit = false;
        int option;
        System.out.println("\nWelcome to the game platform!");
        while (!exit) {
            showMenu();
            try {
                System.out.println("Choose an option: ");
                option = sn.nextInt();
                sn.nextLine();
                switch (option) {
                    case 1: new playGames().run(); break;
                    case 2: new CRUD().Crud(); break;
                    case 3: new Statistics().resume(); break;
                    case 4: exit = true; break;
                    default: System.out.println("Must be a number between 1 and 4"); break;
                }
            } catch (InputMismatchException e) {
                System.out.println("You have to enter a number.");
                sn.next();
            }
        }
        System.out.println("***************************\n");
        System.out.println("Thanks for playing!");
    }

    private void showMenu() {
        System.out.println("\n***************************");
        System.out.println("1. Play Games");
        System.out.println("2. CRUD");
        System.out.println("3. Statistics");
        System.out.println("4. Exit");
    }
}
