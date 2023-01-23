package SimpleTask;


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
