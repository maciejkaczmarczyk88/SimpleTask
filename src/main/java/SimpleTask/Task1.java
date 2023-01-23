package SimpleTask;

public class Task1 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean test = sleepIn(true, false);
        System.out.println(test);
    }

}


/*    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.*/
