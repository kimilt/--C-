class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> pairs = new TreeMap<>();
        for (int ele : arr) {
            int freq = pairs.getOrDefault(ele, 0);
            pairs.put(ele, ++freq);
        }
        for (int key : pairs.keySet()) {
            if (key < 0) {
                if (key % 2 == 0) {
                    int keyhalf = key / 2;
                    if (pairs.containsKey(keyhalf)) {
                        int freq = Math.min(pairs.get(keyhalf), pairs.get(key));
                        pairs.put(keyhalf, pairs.get(keyhalf) - freq);
                        pairs.put(key, pairs.get(key) - freq);
                    }
                }
            } else if (key == 0) {
                if (pairs.get(key) % 2 != 0) {
                    return false;
                } else {
                    pairs.put(key, 0);
                }
            } else {
                int key2times = key * 2;
                if (pairs.containsKey(key2times)) {
                    int freq = Math.min(pairs.get(key2times), pairs.get(key));
                    pairs.put(key2times, pairs.get(key2times) - freq);
                    pairs.put(key, pairs.get(key) - freq);
                }
            }
        }
        for (int key : pairs.keySet()) {
            if (pairs.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}