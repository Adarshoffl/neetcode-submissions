public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int Sum = numbers[l] + numbers[r];

            if (Sum > target) {
                r--;
            } else if (Sum < target) {
                l++;
            }else{
                return new int[]{l+1,r+1};
            } 
        }
        return new int[]{l+1,r+1};
    }
}