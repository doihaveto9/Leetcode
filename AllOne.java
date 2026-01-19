// Implement the AllOne class:

// AllOne() Initializes the object of the data structure.
// inc(String key) Increments the count of the string key by 1. If key does not exist in the data structure, insert it with count 1.
// dec(String key) Decrements the count of the string key by 1. If the count of key is 0 after the decrement, remove it from the data structure. It is guaranteed that key exists in the data structure before the decrement.
// getMaxKey() Returns one of the keys with the maximal count. If no element exists, return an empty string "".
// getMinKey() Returns one of the keys with the minimum count. If no element exists, return an empty string "".

class AllOne {
    // We're going to use a TreeSet to order our keys by the respective values, this will make it so
    // they are automatically ordered in such a way that we can pull the greatest and least valued keys
    // just by calling last() and first()
    // The Map is what's used to actually store them in a way they can all be effectively referenced
    // via inc and dec, the TreeSet is just to track the order so we can get the highest and lowest
    // values
    private Map<String, Integer> map;
    private TreeSet<Pair<Integer, String>> set;

    public AllOne() {
        map = new HashMap<>();
        // We're using a comparator to decide the order of the elements in the TreeSet,
        // This in particular orders them by the key, and uses Value in case two elements have the same key
        set = new TreeSet<>((a, b) -> a.getKey().equals(b.getKey()) ? a.getValue().compareTo(b.getValue()) : a.getKey() - b.getKey());
    }
    
    public void inc(String key) {
        // Obtains value tied to key (if exists), incremenets it, and reinserts to map
        int n = map.getOrDefault(key, 0);
        map.put(key, n + 1);

        // Removes the pair tied to the key (if exists), and readds it after incrementing
        set.remove(new Pair<>(n, key));
        set.add(new Pair<>(n + 1, key));
    }
    
    public void dec(String key) {
        // Obtains value and removes it from set
        int n = map.get(key);
        set.remove(new Pair<>(n, key));

        // If decrementing would reduce value to 0, remove key from map
        if(n == 1)
            map.remove(key);
        else {
            // Otherwise, decrement the key's value in the map, and readd to the set with n - 1
            map.put(key, n - 1);
            set.add(new Pair<>(n - 1, key));
        }
    }
    
    public String getMaxKey() {
        // Returns the last value in the treeSet, the comparator makes it so this is the greatest Value
        return set.isEmpty() ? "" : set.last().getValue();
    }
    
    public String getMinKey() {
        // Returns the first value in the treeSet, the comparator makes it so this is the least Value
        return set.isEmpty() ? "" : set.first().getValue();
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */