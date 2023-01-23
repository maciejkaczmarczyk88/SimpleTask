package SimpleTask;


/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble
        if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
*/

public class Task3 {
    public static void main(String[] args) {
        boolean test = monkeyTrouble(false, false);
        System.out.println(test);
        boolean test2 = monkeyTrouble(true, false);
        System.out.println(test2);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)){
            return true;
        }
        return false;
    }


}
