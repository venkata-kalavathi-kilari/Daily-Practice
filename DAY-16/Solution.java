class Solution {
    public boolean kSubstr(String s, int k) {
         int n = s.length();
        if (n % k!= 0)
            return false;
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i += k)
            mp.put(s.substring(i, i + k), mp.getOrDefault(s.substring(i, i + k), 0) + 1);
        if (mp.size() == 1)
            return true;
        if (mp.size()!= 2)
            return false;
        for (int val : mp.values()) {
            if (val == 1 || val == (n / k - 1))
                return true;
        }

        return false;
    }
}
