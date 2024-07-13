import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int row = num; row >= 1; row--, System.out.println()) {
            for (int col = 1; col <= row; col++)
                System.out.print("*");
            for (int spc = 1; spc <= (num - row) * 2; spc++)
                System.out.print(" ");
            for (int col = 1; col <= row; col++)
                System.out.print("*");
        }
        for (int row = 1; row <= num; row++, System.out.println()) {
            for (int col = 1; col <= row; col++)
                System.out.print("*");
            for (int spc = 1; spc <= (num - row) * 2; spc++)
                System.out.print(" ");
            for (int col = 1; col <= row; col++)
                System.out.print("*");
        }
    }
}
