class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        for(char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        List<Character> chara = new ArrayList(count.keySet());
        Collections.sort(chara, (a, b) -> (count.get(b) - count.get(a)));

        StringBuilder sb = new StringBuilder();
	    for (Object c : chara) {
		    for (int i = 0; i < count.get(c); i++) {
			sb.append(c);
		}
	    }
	    return sb.toString();
    }
}