class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //preprocessing
        paragraph = paragraph.toLowerCase().replaceAll("\\[W+]"," ");
        //paragraph = paragraph.replace("."," ").replace(","," ").replace("!"," ").replace("'"," ").replace(";"," ").replace("?"," ");
        //System.out.println(paragraph);
		
		//Adding banned list into a set
        Set <String> bannedWords = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            bannedWords.add(banned[i]);
        }
            
        HashMap <String, Integer> map = new HashMap <>();
        int i = 0;
		//generating all Strings and keeping track of recurrence of non-banned words
        while (i < paragraph.length()) {
            StringBuilder bs = new StringBuilder();
            while (i < paragraph.length() && paragraph.charAt(i) != ' ') {
                bs.append(paragraph.charAt(i));
                i++;
            }
            String str = bs.toString();
            //if not in bannedList
            if (!bannedWords.contains(str)) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
            while (i < paragraph.length() && paragraph.charAt(i) == ' ') {
                i++;
            }
        }
        int max = 0;
        String answer = "";
		//loop to find most common word in map
        for (String str : map.keySet()) {
            int value = map.get(str);
            if (value > max) {
                max = value;
                answer = str;
            }
        }
        return answer;
    }
}