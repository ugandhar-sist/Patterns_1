import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int row = 1; row <= num; row++, System.out.println()) {
            for (int col = 1; col <= row; col++)
                System.out.print("*");
            for (int col = row; col < 2 * num - row; col++)
                System.out.print(" ");
            for (int col = 1; col <= row; col++)
                System.out.print("*");
        }
        for (int row = num; row >= 1; row--, System.out.println()) {
            for (int col = 1; col <= row; col++)
                System.out.print("*");
            for (int col = row; col < 2 * num - row; col++)
                System.out.print(" ");
            for (int col = 1; col <= row; col++)
                System.out.print("*");
        }
    }
}
