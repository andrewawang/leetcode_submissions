//141ms runtime beat 74.12% of java submissions

class AllOne {
    
    HashMap<String, Integer> _map;

    /** Initialize your data structure here. */
    public AllOne() {
        _map = new HashMap<>();
    }
    
    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        if (_map.containsKey(key)) {
            _map.put(key, _map.get(key) + 1);
        } else {
            _map.put(key, 1);
        }
    }
    
    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        if (_map.containsKey(key)) {
            if (_map.get(key) == 1) {
                _map.remove(key);
            } else {
                _map.put(key, _map.get(key) - 1);
            }
        }
    }
    
    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        String max = "";
        int maxVal = 0;
        for (Map.Entry<String, Integer> entry : _map.entrySet()) {
            if (entry.getValue() > maxVal) {
                max = entry.getKey();
                maxVal = entry.getValue();
            }
        }
        return max;
    }
    
    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        String min = "";
        int minVal = Integer.MAX_VALUE;
        
        for (Map.Entry<String, Integer> entry : _map.entrySet()) {
            if (entry.getValue() < minVal) {
                min = entry.getKey();
                minVal = entry.getValue();
            }
        }
        return min;
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
