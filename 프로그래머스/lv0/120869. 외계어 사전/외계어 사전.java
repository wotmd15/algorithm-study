class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String dicStr : dic){
            if(dicStr.length() != spell.length){
                continue;
            }
            for(String spellStr : spell){
                dicStr = dicStr.replaceFirst(spellStr, "");
            }
            if("".equals(dicStr)){
                answer=1;
                break;
            }
        }
        return answer;
    }
}