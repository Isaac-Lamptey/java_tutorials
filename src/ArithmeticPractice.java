public class ArithmeticPractice {
    public static void main(String[] args){
        //How java executes expressions

        /*
        🧠 Sticky Notes
- Expression = Combination of operands and operators producing a value.
- % = Returns remainder.
- += = Adds and assigns.
- ++ = Increments by one.
- -- = Decrements by one.
- ++x = Increment before using the value.
- x++ = Use the value before incrementing.
- Parentheses can override normal operator precedence.

        */
        int a = 15;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a++);  // post increment
        System.out.println(++b); // pre increment

    }
}
