import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int row = 1; row <= n; row++, System.out.println()) {
            for(int col = 1; col <= n; col++) {
                if((row+col)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
        }
    }
}