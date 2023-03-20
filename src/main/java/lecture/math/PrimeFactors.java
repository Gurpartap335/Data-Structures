package lecture.math;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.print("23 : ");
        primeFactors(23);
        System.out.print("10 : ");
        primeFactors(10);
        System.out.print("36 : ");
        primeFactors(36);
    }


    public static void primeFactors ( int n){
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean isPrime ( int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) { // i <= Math.sqrt
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
