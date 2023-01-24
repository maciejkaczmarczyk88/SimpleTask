package SimpleTask;

//Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
// the front is whatever is there. Return a new string which is 3 copies of the front.

public class Task13 {

    public static void main(String[] args) {
        String blanket = front3("Blanket");
        String blanket2 = front3("Orange");
        String blanket3 = front3("Am");
        System.out.println(blanket);
        System.out.println(blanket2);
        System.out.println(blanket3);
    }

    public static String front3(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }
        return front + front + front;
    }
}
