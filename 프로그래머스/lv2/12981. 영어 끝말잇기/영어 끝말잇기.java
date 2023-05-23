import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        String lastWord = words[0].substring(0,1);
        Map<String, Boolean> wordMap = new HashMap<String, Boolean>();
        for(int i = 0; i < words.length; i++){
            if(wordMap.get(words[i]) != null || !lastWord.equals(words[i].substring(0,1))){
                answer[0] = (i%n) + 1;
				answer[1] = (i/n) + 1;
                break;
            } 
            wordMap.put(words[i], true);
            lastWord = words[i].substring(words[i].length()-1,words[i].length());
        }
        return answer;
    }
}