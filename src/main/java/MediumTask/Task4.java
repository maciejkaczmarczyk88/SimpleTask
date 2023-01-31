package MediumTask;

public class Task4 {
    public boolean scores100(int[] scores) {
        if (scores.length < 2) {
            return false;
        }
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i] == 100 && scores[i+1] == 100){
                return true;
            }
        }
        return false;
    }
    //    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    public String stringTimes(String str, int n) {
        String newWord = "";
        for (int i = 0; i < n; i++) {
            newWord += str;
        }
        return newWord;
    }


}
