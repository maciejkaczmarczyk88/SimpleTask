package TaskCamp;

import java.util.*;

public class Lotto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 6 ){
            numbers.add(input.nextInt());
        }
        Random random = new Random();
        Set<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6) {
            lottoNumbers.add(random.nextInt(49) + 1);
        }
        int counter = 0;
        for (Integer numb : numbers) {
            if (lottoNumbers.contains(numb)) {
                counter++;
            }
        }

        System.out.println(counter);
        System.out.println(lottoNumbers);

    }
}
