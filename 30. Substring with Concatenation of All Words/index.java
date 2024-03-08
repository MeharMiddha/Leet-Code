class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int n = words.length;
        int m = words[0].length();
        
        if (s.length() < m * n) {
            return ans;
        }

        for (int i = 0; i <= s.length() - (m * n); i++) {
            HashMap<String, Integer> map = new HashMap<>();
            
            for (int j = 0; j < n; j++) {
                map.put(words[j], map.getOrDefault(words[j], 0) + 1);
            }

            int t;
            for (t = 0; t < n; t++) {
                String str = s.substring(i + t * m, i + (t + 1) * m);
                
                if (map.containsKey(str) && map.get(str) > 0) {
                    int value = map.get(str);
                    map.put(str, value - 1);
                } else {
                    break;
                }
            }

            if (t == n) {
                ans.add(i);
            }
        }

        return ans;
    }
}
