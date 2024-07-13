import java.util.Scanner;

public class TenthQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int row = 1; row <= num; row++, System.out.println()) {
            for(int col = 1; col <= row; col++) {
                System.out.printf("%2d", col);
            }
        }
    }
}
