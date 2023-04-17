class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        String[] strArray = cipher.split("");
        for(int i = 1; i <= strArray.length; i++){
            if(i % code == 0){
                sb.append(strArray[i-1]);
            }
        }
        return sb.toString();
    }
}