import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        Arithmetic (+,-,*,/,%)
        Relational (>,<, >=, <=, ==, !=)
        Logical (&&, ||, !)
        Bitwise (will do later)
        Assignment (=,+=, -=, *=, /=, %=)
        Unary Inc/Dec (++, --)

         */
        /*

        1. Arithmetic Operators (+, -, , /, %)
        Question:
        Write a Java program to take two numbers as input and perform all arithmetic operations (+, -, *, /, %). Print the results.
        */
       /*
        2. Relational Operators (>, <, >=, <=, ==, !=)
        Question:
        Write a Java program that takes two numbers as input and checks whether:

        The first number is greater than the second.
        The first number is less than the second.
        The two numbers are equal.
                Print appropriate messages for each comparison.
       */

        /*
        3. Logical Operators (&&, ||, !)
        Question:
        Write a Java program that checks if a number is between 10 and 50 (inclusive) using logical operators.
        Also, check if the number is either less than 10 or greater than 50.

        */





        /*

                *4. Assignment Operators (=, +=, -=, =, /=, %=)
        Question:
        Write a Java program where:

        A variable x is initialized with 10.
        Modify x using all assignment operators (+=, -=, *=, /=, %=) and print the result after each operation.

        */

        int x = 10;

        System.out.println("Initial value of x: " + x);
        System.out.println("x += 5 " + (x += 5));
        System.out.println("x *= 5 " +  (x *=5));
        System.out.println("x /= 5 " + (x /= 5));
        System.out.println("x %= 5 " + (x %= 5));

        /*
        5. Unary Increment/Decrement Operators (++, --)
        Question:
        Write a Java program to demonstrate both pre-increment and post-increment (++, --) with an integer variable.
        Print values before and after using these operators.

        */
    }
}
