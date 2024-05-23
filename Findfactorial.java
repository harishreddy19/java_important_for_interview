//program to  find the factorial of a given number
package timepass;
import java.util.*;
public class Findfactorial {
    public static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
            //System.out.println("The factorial of " + a + " is " + result);
        }
        return result; // Return the factorial result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        int result = factorial(a); // Calculate factorial
        System.out.println("The factorial of " + a + " is " + result);
    }
}
