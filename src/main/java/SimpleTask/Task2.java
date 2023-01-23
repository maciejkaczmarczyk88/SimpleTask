package SimpleTask;


/*Given an int n, return the absolute difference between n and 21,
        except return double the absolute difference if n is over 21.*/

public class Task2 {
    public static void main(String[] args) {
        int number = diff21(25);
        System.out.println(number);
    }
    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
}
