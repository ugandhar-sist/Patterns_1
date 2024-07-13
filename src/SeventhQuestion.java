import java.util.Scanner;

public class SeventhQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num%2==0)
            num--;
        for(int row = 1; row <= num; row++, System.out.println()) {
            for(int col = 1; col <= num; col++) {
                if (row==num/2+1||col==num/2+1)
                    System.out.print("0");

                else
                    System.out.print("1");
            }
        }
    }
}
