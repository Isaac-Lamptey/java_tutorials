import java.util.Scanner; // the input module

public class StudentInfo {
    public static void main(String[] args){
        System.out.println("WELCOME TO THE STUDENT INFO PORTAL");

        Scanner input = new Scanner(System.in); // create the scanner object

        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println("Enter tour age: ");
        int age = input.nextInt();
        input.nextLine();
        /*
        input.nextLine(); :This reads the newline character in front of int. Mostly used after taking integer input
        it consumes the remaining newline after nextInt(), allowing the next nextLine() to read the actual code that follows
         */

        System.out.print("What is your programme of study?: ");
        String programme = input.nextLine();

        System.out.print("What is your CGPA? ");
        float cgpa = input.nextFloat();


        //Lets display our result

        System.out.println("NAME: "+ name);
        System.out.println("AGE: "+ age);
        System.out.println("PROGRAMME OF STUDY: "+ programme);
        System.out.println("CGPA: "+ cgpa);


    }
}
