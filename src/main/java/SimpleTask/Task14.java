package SimpleTask;

// Given a string, take the last char and return a new string with the last char added at the front and back,
// so "cat" yields "tcatt". The original string will be length 1 or more.
public class Task14 {

    public static void main(String[] args) {
        System.out.println(backAround("Germany"));
    }

    public static String backAround(String str) {
        char c = str.charAt(str.length()-1);
        String newWord = c + str + c;
        return newWord;
    }

}
