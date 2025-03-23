public class Loops {
    public static void main(String[] args) {

        /*
        In Java, loops are used to execute a block of code multiple times until a specific condition is met. There are four types of loops in Java:
1. for Loop**
                Used when the number of iterations is known beforehand.

 **Syntax:**


        for(initialization; condition; update) {
            // code to be executed
        }
```
### **Example:**
*/
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
/*
**Output:**
```
        Iteration: 1
        Iteration: 2
        Iteration: 3
        Iteration: 4
        Iteration: 5


 **2. while Loop**
                Used when the number of iterations is not known beforehand. The condition is checked before execution.

 **Syntax:**
        while(condition) {
            // code to be executed
        }

 **Example:**

 */
        int a = 1;
        while (a <= 5) {
            System.out.println("Iteration: " + a);
            a++;
        }
        /*

3. do-while Loop**
                Similar to `while`, but executes at least once before checking the condition.

 **Syntax:**


        do {
            // code to be executed
        } while(condition);

**Example:**
         */

        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);
/*

4. Enhanced for Loop (for-each)**
        Used for iterating over arrays and collections.

**Syntax:**

        for(datatype var : array/collection) {

            // code to be executed
        }
 */


        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

 /*
## **Break and Continue Statements**
        - `break` → Exits the loop immediately.
        - `continue` → Skips the current iteration and continues with the next one.

### **Example:**
*/
        for (int b = 1; b <= 5; b++) {
            if (i == 3) {
                continue;  // Skips iteration when i = 3
            }
            System.out.println("Iteration: " + b);
        }
/*
**Output:**
```
        Iteration: 1
        Iteration: 2
        Iteration: 4
        Iteration: 5

 */
    }
}

