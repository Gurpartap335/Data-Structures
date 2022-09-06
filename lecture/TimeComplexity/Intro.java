package lecture.TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // selection sort
        int[] arr = {4, 5, 3, 444, 13};
        System.out.println(Arrays.toString(arr));
        // select minimum element in each iteration place at first position.

    }
}
/*
What is an time complexity of an algorithm and why is it important?
The time complexity of an algorithm is the total amount of time required by
an algorithm to complete its execution.
The lesser the time complexity, the faster the execution.
https://medium.com/@abdurrafeymasood/understanding-time-complexity-and-its-importance-in-technology-8279f72d1c6a
https://www.freecodecamp.org/news/big-o-notation-why-it-matters-and-why-it-doesnt-1674cfa8a23c/
Running time depends upon :
1 Single vs multi processor machine
2. Read/write speed to memory
3. 32 bit vs 64 bit

4. Input (only matters)
rate of growth of time of an algorithm wrt the input.

 */