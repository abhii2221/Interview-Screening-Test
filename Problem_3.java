import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close();

        // if even, it reduce by 1
        if (a % 2 == 0) {
            a -= 1;
        }

        for (int i = 1; i <= a; i += 2) {
            System.out.print(i);
            if (i + 2 <= a) {
                System.out.print(", ");
            }
        }
    }
    
}

