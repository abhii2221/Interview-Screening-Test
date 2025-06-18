import java.util.ArrayList;
import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        sc.close();

        // Count and print multiples from 1 to 9
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            System.out.println(i + ": " + count);
        }
    }
    
}
