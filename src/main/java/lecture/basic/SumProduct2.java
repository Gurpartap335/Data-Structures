package lecture.basic;

import java.util.Scanner;

public class SumProduct2 {
    public static void main(String[] args) {
        sumOrProduct();
        sumOrProduct();
    }
    static void sumOrProduct() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();System.out.println("Enter 1 for sum and 2 for product : ");
        int c = s.nextInt();


        int sum = 0;
        int product = 1;
        if (c == 1){
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
        }

        else if(c == 2)
        {
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            System.out.println(product);
        }
        else
            System.out.println("-1");
    }
}
