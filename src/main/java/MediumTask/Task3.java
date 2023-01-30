package MediumTask;

public class Task3 {

    //Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" ..
    // through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx)
    // will make the String form of most types. The syntax to make a new string array is: new String[desired_length]
    // (See also: FizzBuzz Code)

    public String[] fizzArray2(int[] n) {
        String[] list = new String[n.length];
        for (int i = 0; i < n.length; i++) {
            String newStringList = String.valueOf(i);
            list[i] = newStringList;
        }
        return list;
    }

    //Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's
    // separated by one element, such as with {7, 1, 7}.
    public boolean has77(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            try {
                if (nums[i] == 7 && nums[i + 1] == 7) {
                    result = true;
                    break;
                }
                if (nums[i] == 7 && nums[i + 2] == 7) {
                    result = true;
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
        }
        return result;
    }

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i+1]){
                return false;
            }
        }
        return true;
    }
}
