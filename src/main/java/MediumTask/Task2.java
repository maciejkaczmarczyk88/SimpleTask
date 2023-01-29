package MediumTask;

public class Task2 {


    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            String substring = str.substring(i, i + 2);
            boolean hi = substring.equals("hi");
            if (hi) {
                count++;
            }
        }
        return count;
    }

    //   Return true if the string "cat" and "dog" appear the same number of times in the given string.
    public boolean catDog(String str) {
        boolean cat = str.contains("cat");
        boolean dog = str.contains("dog");
        int countDog = 0;
        int countCat = 0;
        for (int i = 0; i < str.length()-2; i++) {
            String substring = str.substring(i, i + 3);
            boolean catTrue = substring.equals("cat");
            if (catTrue)
                countCat++;
        }
        for (int i = 0; i < str.length()-2; i++) {
            String substring = str.substring(i, i + 3);
            boolean dogTrue = substring.equals("dog");
            if (dogTrue)
                countDog++;
        }
        if (countCat != countDog){
            return false;
        }
        if (cat && dog) {
            return true;
        }
        return false;
    }
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public int bigDiff(int[] nums) {
        int length = nums.length;
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < length; i++) {
                if (nums[i] > max)
                    max = nums[i];
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        return max - min;
    }
//Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
// so it does not count and numbers that come immediately after a 13 also do not count.Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

    public int sum13(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= 13 ) {
                break;
            }
            else
               count += nums[i];
        }
        return count;
    }

}

