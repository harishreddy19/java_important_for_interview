package timepass;
import java.util.*;

public class primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = sc.nextInt();
        boolean isPrime = true;

        if (a <= 1) {
            isPrime = false;
        }
        else
        {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
        {
            System.out.println(a + " is a prime number.");
        }
        else
        {
            System.out.println(a + " is not a prime number.");
        }

        sc.close();
    }
}
