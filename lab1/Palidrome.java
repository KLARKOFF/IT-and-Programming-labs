public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalidrome(s)) {
                System.out.println(s + " is palidrome!");
            } else {
                System.out.println(s + " is not a palidrome.");
            }
        }
    }
    public static String reverseString(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        //System.out.println(res);
        return res;
    }
    public static boolean isPalidrome(String s) {
        String reverse = reverseString(s);
        return reverse.equals(s);
    }
}
