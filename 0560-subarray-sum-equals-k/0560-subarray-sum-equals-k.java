import java.util.HashMap;

class Solution {
    public int subarraySum(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Initially, prefix sum is 0 and it occurs once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {

            // Add current element to prefix sum
            prefixSum += num;

            // Check if there is a previous prefix sum
            // such that (prefixSum - previousPrefixSum = k)
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store/update the current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}