import java.util.Random;
public class RandomNumbersGame {
    public static void main(String[] args){

        // create an object rand of the class Random
        Random rand = new Random();

        // generate 3 random numbers
        int num1 = rand.nextInt(100) +1;
        int num2 = rand.nextInt(100) + 1;
        int num3 = rand.nextInt(100) + 1;


        // display their sum
        System.out.println("FIRST NUMBER: " + num1);
        System.out.println("SECOND NUMBER: " + num2);
        System.out.println("THIRD NUMBER: " + num3);

        // their sum
        int total_sum = num1 + num2 + num3;
        System.out.println("TOTAL SUM: " + total_sum);

        // find and display the largest number using the max method
        //int big = Math.max(num1, num2, num3); lol, its isn't working



    }

}
