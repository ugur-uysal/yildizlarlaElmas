import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        int space = 1;
        int star = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space++;

            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            star -= 2;

            System.out.println();
        }
    }
}