package timepass;

//examples : sos--> it will result the same string when it is reversed
public class stringplaindrome {
    public static  boolean isPalindrome(String a){
        int length =a.length();
        for (int i = 0; i < length / 2; i++) {
            if (a.charAt(i) != a.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("tony"));
        System.out.println(isPalindrome("sos"));
        System.out.println(isPalindrome("non"));

    }
}
// here i use one more static method  for boolean class  it results either true or flase
// note : always the static method is used before the main method