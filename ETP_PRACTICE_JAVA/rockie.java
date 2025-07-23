import java.util.Random;
import java.util.Scanner;

public class rockie {
    static char[][] a = new char[3][5];
    static int count = 0;

    public static void main(String[] args) {
        initializeBoard();
        game();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j % 2 == 0) {
                    a[i][j] = ' ';
                } else {
                    a[i][j] = '|';
                }
            }
        }
    }

    static boolean player1(int n) {
        switch (n) {
            case 1: return markBoard(0, 0, 'O');
            case 2: return markBoard(0, 2, 'O');
            case 3: return markBoard(0, 4, 'O');
            case 4: return markBoard(1, 0, 'O');
            case 5: return markBoard(1, 2, 'O');
            case 6: return markBoard(1, 4, 'O');
            case 7: return markBoard(2, 0, 'O');
            case 8: return markBoard(2, 2, 'O');
            case 9: return markBoard(2, 4, 'O');
            default: return false;
        }
    }

    static boolean player2(int n) {
        switch (n) {
            case 1: return markBoard(0, 0, 'X');
            case 2: return markBoard(0, 2, 'X');
            case 3: return markBoard(0, 4, 'X');
            case 4: return markBoard(1, 0, 'X');
            case 5: return markBoard(1, 2, 'X');
            case 6: return markBoard(1, 4, 'X');
            case 7: return markBoard(2, 0, 'X');
            case 8: return markBoard(2, 2, 'X');
            case 9: return markBoard(2, 4, 'X');
            default: return false;
        }
    }

    static boolean markBoard(int row, int col, char mark) {
        if (a[row][col] == ' ') {
            a[row][col] = mark;
            return true;
        } else {
            System.out.println("Please choose another number!");
            return false;
        }
    }

    static boolean check() {
        if ((a[0][0] == 'O' && a[0][2] == 'O' && a[0][4] == 'O') ||
            (a[0][0] == 'O' && a[1][0] == 'O' && a[2][0] == 'O') ||
            (a[0][0] == 'O' && a[1][2] == 'O' && a[2][4] == 'O') ||
            (a[0][0] == 'X' && a[0][2] == 'X' && a[0][4] == 'X') ||
            (a[0][0] == 'X' && a[1][0] == 'X' && a[2][0] == 'X') ||
            (a[0][0] == 'X' && a[1][2] == 'X' && a[2][4] == 'X') ||
            (a[1][0] == 'O' && a[1][2] == 'O' && a[1][4] == 'O') ||
            (a[2][0] == 'O' && a[2][2] == 'O' && a[2][4] == 'O') ||
            (a[0][2] == 'O' && a[1][2] == 'O' && a[2][2] == 'O') ||
            (a[1][0] == 'X' && a[1][2] == 'X' && a[1][4] == 'X') ||
            (a[2][0] == 'X' && a[2][2] == 'X' && a[2][4] == 'X') ||
            (a[0][2] == 'X' && a[1][2] == 'X' && a[2][2] == 'X') ||
            (a[0][4] == 'O' && a[1][4] == 'O' && a[2][4] == 'O') ||
            (a[2][0] == 'O' && a[1][2] == 'O' && a[0][4] == 'O') ||
            (a[0][4] == 'X' && a[1][4] == 'X' && a[2][4] == 'X') ||
            (a[2][0] == 'X' && a[1][2] == 'X' && a[0][4] == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    static void game() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Please choose a number between 1 to 9:");

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.print("Number chosen by player1 is: ");
                int n = sc.nextInt();

                while (!player1(n)) {
                    System.out.println("Please do not choose an already taken number!");
                    n = sc.nextInt();
                }
            } else {
                int n = rand.nextInt(9) + 1;
                System.out.println("Number chosen by computer is: " + n);

                while (!player2(n)) {
                    System.out.println("Please do not choose an already taken number!");
                    n = rand.nextInt(9) + 1;
                }
            }

            displayBoard();

            if (check()) {
                count++;
                if (i % 2 == 0) {
                    System.out.println("Congratulations, Player1 wins!");
                } else {
                    System.out.println("Oops! You lose");
                }
                break;
            }
        }

        if (count == 0) {
            System.out.println("No one wins!");
        }

        System.out.println("If you want to play again choose 1 else choose 0");
        int k = sc.nextInt();
        if (k == 1) {
            initializeBoard();
            game();
        } else {
            System.out.println("Thanks for playing the game!");
        }
        sc.close();
    }

    static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
