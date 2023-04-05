class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        String[] strArray = my_string.split("");
        for(String str : strArray){
            for(int i =0; i < n; i++){
                sb.append(str);
            }
        }
        return sb.toString();
    }
}