package HW_02_02_2023;

//    Find the smallest missing positive element in a sorted array of positive integers. O(log(n))
//    public static int smallestMissing(int[] arr) {
//    throw new UnsupportedOperationException();


public class Solution {

    public static void main(String[] args) {
        int num[] = {2, 3, 4, 6, 9, 11, 15};  // Example2
        int n3 = num.length;
        int z = smallestMissing(num, n3);
        System.out.println(z);
    }

    public static int smallestMissing(int[] num, int n2) {
        int n = num.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (num[mid] == mid + 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + 1;
    }

}
