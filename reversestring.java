package timepass;
import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to reverse :");
        String a=sc.next();
        System.out.println("the origioanl string is :"+a);
        String b=new StringBuilder(a).reverse().toString();
        System.out.println("reverse string :"+ b);


    }
}
