package SimpleTask;


/*Given a string, return a new string where "not " has been added to the front. However,
        if the string already begins with "not", return the string unchanged.
        Note: use .equals() to compare 2 strings.*/

public class Task10 {
    public static void main(String[] args) {
        String not_work = notString("not work");
        String work = notString("work");
        System.out.println(not_work);
        System.out.println(work);
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }
}
