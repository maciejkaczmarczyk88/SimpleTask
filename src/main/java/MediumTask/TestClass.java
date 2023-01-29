package MediumTask;

public class TestClass {

    public static Task1 task1 = new Task1();
    public static Task2 task2 = new Task2();


    public static void main(String[] args) {
        // task1.returnName("Maciek");

     //   int hi_and_hi_or_hi = task2.countHi("hi and hi or hi");
     //   System.out.println(hi_and_hi_or_hi);

      //  boolean dogcat1 = task2.catDog("dogcat");
      //  boolean dogcat2 = task2.catDog("dogcaa");
      //  System.out.println(dogcat1);
      //  System.out.println(dogcat2);
        int table[] =  {2,0,6,5,1,7,3,9,0};
        int size = task2.countEvens(table);
        System.out.println(size);

        int difference = task2.bigDiff(table);
        System.out.println(difference);
    }
}
