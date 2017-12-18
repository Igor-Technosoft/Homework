public class MathHomework {
    public static void main(String[] args) {
//      Exp allows to raise e, exponent which is a constant, to a power of x. like ex or e^x. Numbers should be Double Data Type
        double firstNumber = 450.45;
        double secondNumber = 5.35;
        System.out.println("Math exponent of the first number" + " " + firstNumber + " " + "=" + " " + Math.exp(firstNumber));
        System.out.println("Math exponent of the second number" + " " + secondNumber + " " +  "="  + " " + Math.exp(secondNumber));
//      Log returns the natural logarithm (base e) of a double value.
        System.out.println("Math natural logarythm of the first number" + " " + firstNumber + " " + "=" + " " + Math.log(firstNumber));
        System.out.println("Math natural logarythm of the second number" + " " + secondNumber + " " +  "="  + " " + Math.log(secondNumber));
//       POW returns the value of the first argument raised to the power of the second argument
        System.out.println("Math Power of the first number" + " " + firstNumber + " " + "=" + " " + Math.pow(firstNumber,secondNumber));
        System.out.println("Math Power of the second number" + " " + secondNumber + " " +  "="  + " " + Math.pow(secondNumber,firstNumber));
//      Floor returns the largest integer that is less than or equal to the argument
        System.out.println("Math Floor of the first number" + " " + firstNumber + " " + "=" + " " + Math.floor(firstNumber));
//       SQRT returns the correctly rounded positive square root of a double value
        System.out.println("Math SQRT of the first number" + " " + firstNumber + " " + "=" + " " + Math.sqrt(firstNumber));
//       Ceil returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
        System.out.println("Math Ceil of the first number" + " " + firstNumber + " " + "=" + " " + Math.ceil(firstNumber));
//       SINMath the trigonometric sine of an angle. First, have to convert to radius.
        firstNumber = Math.toRadians(firstNumber);
        secondNumber = Math.toRadians(secondNumber);
        System.out.println("Math SIN  of the first number" + " " + firstNumber + " " + "=" + " " + Math.sin(firstNumber));
        System.out.println("Math SIN  of the second number" + " " + secondNumber + " " + "=" + " " + Math.sin(secondNumber));
//      Cos trigonometric cosine of an angle
        System.out.println("Math COS  of the first number" + " " + firstNumber + " " + "=" + " " + Math.cos(firstNumber));
//      Math Tan trigonometric tangent of an angle
        System.out.println("Math TAN  of the first number" + " " + firstNumber + " " + "=" + " " + Math.tan(firstNumber));
    }
}
