class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String alphabetArr[] = {"a","b","c","d","e","f","g","h","i","j"};
        for(String num : String.valueOf(age).split("")){
            sb.append(alphabetArr[Integer.valueOf(num)]);
        }
        return sb.toString();
    }
}