package SimpleTask;



/*Given an int n, return the absolute difference between n and 21,
        except return double the absolute difference if n is over 21.*/
public class Task5 {

    public static void main(String[] args) {
        System.out.println(diff21(17));
        System.out.println(diff21(50));
    }

    public static int diff21(int n) {
        int sum = 0;
        int result = 0;
        if (n < 21) {
            result = 21- n;
        }
        else {
            sum = n - 21;
            result = sum * 2;
        }
        return result;
    }
}
