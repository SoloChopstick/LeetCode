class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        /*
        Time: O(paragraph + banned)
        Space: O(paragraph + banned)
        */
        
        //preprocessing
        paragraph = paragraph.toLowerCase().replaceAll("\\[W+]"," ");
        //paragraph = paragraph.replace("."," ").replace(","," ").replace("!"," ").replace("'"," ").replace(";"," ").replace("?"," ");
        //System.out.println(paragraph);
        
        //Generate set for all banned words
        Set <String> bannedWords = new HashSet<>();
        for (int i = 0; i < banned.length; i++) {
            bannedWords.add(banned[i]);
        }
        
        //Count word occurence using map
        HashMap <String, Integer> map = new HashMap <>();
        int i = 0;
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
        //Find most common word using max value in map
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