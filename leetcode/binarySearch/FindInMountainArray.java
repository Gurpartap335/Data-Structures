/*
https://leetcode.com/problems/find-in-mountain-array/
 */
package leetcode.binarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {

    }
}
/*
Intuition
if arr[mid] > t -> e = m - 1;
if arr[mid] < t -> s = m + 1
else arr[mid] == t return index which our ans.
 */

//class Dog implements Cat {
//   public void hello() {
//       System.out.println("Hello Cat");
//   }
//
//   Dog d1 = new Dog();
//
//    public void main(String[] args, int yo) {
//        d1.hello();
//    }
//
//    public static void main(String[] args) {
//        Dog d2 = new Dog();
//        d2.hello();
//    }
//}
//
//interface Cat{
//    public void hello();
//}
