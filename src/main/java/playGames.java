import java.util.InputMismatchException;
import java.util.Scanner;

public class playGames {

    private final Scanner sn;

    public playGames() {
        sn = new Scanner(System.in);
    }
    public void run() {
        boolean exit = false;
        int option;

        int[] arrGame = {1, 2};

        System.out.println("\nMenu GAME!");
        while (!exit) {
            showGames();
            try {
                System.out.println("What would you like to play? ");
                option = sn.nextInt();
                sn.nextLine();
                switch (option) {
                    case 1: selectGame(new int[]{arrGame[0]}); break;
                    case 2: selectGame(new int[]{arrGame[1]}); break;
                    case 3: exit = true; break;
                    default: System.out.println("Must be a number between 1 and 3"); break;
                }
            } catch (InputMismatchException e) {
                System.out.println("You have to enter a number.");
                sn.next();
            }
        }
        System.out.println("***************************\n");
        System.out.println("Thanks for playing!");
    }

    private void showGames() {
        System.out.println("\n***************************");
        System.out.println("1. Game1");
        System.out.println("2. Game2");
        System.out.println("3. Exit");
    }

    public void selectGame(int[] game){

        for (int i=0; i < game.length; i++) {
            if (game[i] ==1) {
                System.out.println("Hola bienvenido a juego 1\n" +
                        "Termino juego 1");
            } else if (game[i] ==2) {
                System.out.println("Hola bienvenido a juego 2\n" +
                        "Termino juego 2");
            }
        }
    }
}
