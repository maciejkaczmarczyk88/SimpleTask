package MediumTask;

public class Task1 {

//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!"

    public void returnName(String name){
        System.out.println("Hello " + name);
    }
// Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

    public String makeAbba(String a, String b){

        return a + b + b + a;
    }

    public String deFront(String str) {
        char a = str.charAt(0);
        char b = str.charAt(0);
        int length = str.length();
        String moreThenTwo = str.substring(2, length);
        boolean starts = str.startsWith("a");
        String onlyB = str.substring(1, 1);
        if (str.length()<2){
            return null;
        }
        if (starts){
            return a + moreThenTwo;
        }
        if (onlyB.equals(b)){
            String replace = str.replace(b, '\0');
            String trim = replace.trim();
            return trim;
        }
        else {
            return moreThenTwo;
        }
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend || (cigars >= 40 || cigars <= 60)){
            return true;
        }
        else {
            return false;
        }
    }

    //Given a string, return a string where for every char in the original, there are two chars.
    public String doubleChar(String str) {
        String newWord = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            newWord += "" + c + c;
        }
        return newWord;
    }

}
