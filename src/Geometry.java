public class Geometry {
    public static void main(String[] args){

        double r =6.9; //radius

        //1. Calculate the area of a circle
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("Area: %.2f m²%n", area);

        // Circumference
        double c = 2 * Math.PI * r;
        System.out.println("Circumference of the circle is = "+ c + " metres");

        // Area square root
        double sqrt1 = Math.sqrt(area);
        System.out.println("Square root of its area is = "+ sqrt1);


    }
}
