package lecture.sorting.cyclic;

public class MissingNumber {

}

/*
Intuition :

Given array nums containing n distinct numbers in the range [0,n]
when we get range like 1 to n we know we can apply cyclic sort.
Number of elements are [0,length of array]
Now we have range [0, n] return missing number.

Cases :

I know i can apply cyclic sort to sort the array.

First sort the array.
Each element should at should it own index.
arr[i] = i; arr[0] == 0; 0 == 0.

If any element is not at its index after sorting the array return that index.(missing number)

Case 2: when N is not there in array.
 */
