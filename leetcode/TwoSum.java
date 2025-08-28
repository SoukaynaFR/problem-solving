//! Brute force

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0 ; i< nums.length ; i ++){
            for (int j = i+1 ; j< nums.length ; j++){
                if(nums[i] + nums[j] == target ){
                    return new int[]{i,j};

                }
            }

        }
  return new int[0];
   }
}

//! HashMap

class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indices = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            indices.put(nums[i] , i);
        }

        for (int i = 0 ; i < nums.length ; i++){
            int diff = target - nums[i];

            if(indices.containsKey(diff) && (indices.get(diff) != i))
                return new int[]{i,indices.get(diff)};
            
        }
        return new int[0];
    }
}