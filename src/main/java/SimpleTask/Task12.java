package SimpleTask;
//Given a string, return a new string where the first and last chars have been exchanged.

public class Task12 {
    public static void main(String[] args) {
        String hello_world = frontBack("Hello World");
        String hello_world2 = frontBack("a");
        System.out.println(hello_world);
        System.out.println(hello_world2);
    }

    public static String frontBack(String str) {
        String substring;
        char first;
        char last;
        if (str.length() == 1 || str.length() == 0)
            return str;
        else {
            first = str.charAt(0);
            last = str.charAt(str.length() - 1);
            substring = str.substring(1, str.length() - 1);
        }
        return last + substring + first;
    }
}
