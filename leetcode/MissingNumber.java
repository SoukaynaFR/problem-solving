//TODO : 268. Missing Number
//TODO: Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

import java.util.HashSet;

public class MissingNumber {
    public static int missingNumber(int[] nums){
        HashSet<Integer> myHashSet = new HashSet<>();
        int n = nums.length;
        // adding all the numbers to the hashset
        for (int num : nums){
            myHashSet.add(num);
        }

        //checking the missing number
        for (int i = 0 ; i <= n ; i++){
            if(!myHashSet.contains(i))
            return i;
        }

        return -1;
    }
    
}
