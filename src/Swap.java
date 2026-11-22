public class Swap {
    public static void main( String[] args){
        // a swapping program
        int a = 45;
        int b = 90;
        System.out.println("ORIGINAL VALUES");
        System.out.println("a = "+a);
        System.out.println("b = " +b);
        int temp; // temporary variable
        temp = a;
        a= b;
        b = temp;

        System.out.println("NEW VALUES");

        System.out.println("a = "+ a);
        System.out.println("b = " + b);
    }
}
