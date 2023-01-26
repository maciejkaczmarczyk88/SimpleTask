package SimpleTask;
//Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
public class Task16 {
    public static void main(String[] args) {
        String banana = front22("banana");
        System.out.println(banana);
    }
    public static String front22(String str) {
        if (str.length()>2 || "" == ""){
            return str+str+str;
        }
        String substring1 = str.substring(0, 2);

        return substring1 + str + substring1;
    }

}
