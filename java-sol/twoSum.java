    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> already_seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(already_seen.containsKey(target - nums[i])) {
                return new int []{already_seen.get(target - nums[i]), i};
            }
            else { already_seen.put(nums[i] , i); }
        }

        return null;
    }