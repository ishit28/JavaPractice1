public class conditional {
    public static void main(String[] args) {

        /*

        Conditional Statements in Java
        Conditional statements in Java allow a program to execute different blocks of code based on specific conditions. These conditions are evaluated using expressions that return `true` or `false`.


        Types of Conditional Statements in Java

        1. If Statement**
        The `if` statement executes a block of code only if the specified condition is `true`.

        //Syntax:

        if (condition) {
            // Code to execute if the condition is true
        }
    Example:
        */


                int num = 10;
                if (num > 0) {
                    System.out.println("The number is positive.");
                }

        /*

    2. If-Else Statement
                The `if-else` statement executes one block of code if the condition is `true`, and another block if the condition is `false`.

    Syntax:

        if (condition) {
            // Code to execute if condition is true
        } else {
            // Code to execute if condition is false
        }
    Example

     */
                int numb = -5;
                if (numb > 0) {
                    System.out.println("The number is positive.");
                } else {
                    System.out.println("The number is negative.");
                }

/*



    3. If-Else If-Else Statement**
                The `if-else if-else` statement is used when there are multiple conditions to check.

    Syntax:

        if (condition1) {
            // Code to execute if condition1 is true
        } else if (condition2) {
            // Code to execute if condition2 is true
        } else {
            // Code to execute if none of the conditions are true
        }

    Example:
*/
                int numbe = 0;
                if (numbe > 0) {
                    System.out.println("The number is positive.");
                } else if (numbe < 0) {
                    System.out.println("The number is negative.");
                } else {
                    System.out.println("The number is zero.");
                }
            /*

    4. Nested If Statement
       A `nested if` statement is an `if` statement inside another `if` statement.

       Syntax:
        if (condition1) {
            if (condition2) {
                // Code to execute if both conditions are true
            }
        }

Example:

*/

                int number = 10;
                if (number > 0) {
                    if (number % 2 == 0) {
                        System.out.println("The number is positive and even.");
                    }
                }
                /*

    5. Switch Statement**
        The `switch` statement is used when multiple conditions depend on a single variable. It is a cleaner alternative to multiple `if-else` statements.

        Syntax:
        switch (expression) {
            case value1:
                // Code to execute if expression equals value1
                break;
            case value2:
                // Code to execute if expression equals value2
                break;
            default:
                // Code to execute if none of the cases match
        }

**Example:**
*/
                int day = 3;
                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    default:
                        System.out.println("Invalid day");
                }
            }
        /*
Conclusion
                Conditional statements in Java allow decision-making in programs. The `if`, `if-else`, `if-else if-else`, `nested if`, and `switch` statements help control the program flow based on conditions. Proper use of these statements makes the code efficient and readable.

                Would you like a real-world use case example? 🚀


         */
    }

