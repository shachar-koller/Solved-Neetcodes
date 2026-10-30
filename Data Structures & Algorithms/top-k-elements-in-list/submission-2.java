class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //double loop hashmap
        //first loop, count the occurence of each int, so hashmap will be: (int num -> int numAppearances)
        //flip the hash map, meaning it'll be (int numAppearances, List<Integer> nums)
        //then just get the top n most frequent elemtns

        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, List<Integer>> reverseMap = new HashMap<>();

        for(int n: nums){
            if(countMap.get(n) != null) countMap.put(n, countMap.get(n)+1);
            else countMap.put(n, 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            reverseMap.putIfAbsent(entry.getValue(), new ArrayList<>());
            reverseMap.get(entry.getValue()).add(entry.getKey());
        }

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            int biggestKey = Collections.max(reverseMap.keySet());
            List<Integer> numbers = reverseMap.get(biggestKey);

            result[i] = numbers.remove(numbers.size() - 1);

            if (numbers.isEmpty()) {
                reverseMap.remove(biggestKey);
            }
        }

        return result;

    }
}
