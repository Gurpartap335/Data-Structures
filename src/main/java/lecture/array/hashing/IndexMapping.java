package lecture.array.hashing;

public class IndexMapping {

    final static int Max = 1000;

    static boolean[][] has = new boolean[Max + 1][2];

    static void insert(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                has[a[i]][0] = true;
            } else {
                int absI = Math.abs(a[i]);
                has[absI][1] = true;
            }
        }
    }


    public static void main(String[] args) {
        int a =  -23432;
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(-3232.432));
        System.out.println(Math.absExact((int) -3432.432123));
    }
}
