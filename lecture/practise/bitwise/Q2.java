package lecture.practise.bitwise;

public class Q2 {
    public static void main(String[] args){
         // to find which number is appearing odd
        int[] arr = {2, 4, 8, 2, 9, 9, 8, 11, 11};
        System.out.println(ans(arr));


    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
