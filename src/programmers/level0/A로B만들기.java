package programmers.level0;

public class A로B만들기 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120886
     * Level 0
     * A로 B 만들기
     *
     * ###주의사항###
     * before의 순서를 변경하는 문제이지 before를 뒤집는 문제가 아니다.
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [1] , 결과값 : " + solution("olleh", "hello"));
        System.out.println("기대값 : [0] , 결과값 : " + solution("allpe","apple"));
        System.out.println("기대값 : [1] , 결과값 : " + solution("qweasdzxc","cxzdsaewq"));
        System.out.println("기대값 : [0] , 결과값 : " + solution("a","b"));
        System.out.println("기대값 : [1] , 결과값 : " + solution("a","a"));
        System.out.println("기대값 : [0] , 결과값 : " + solution("aaaaca","acbaaa"));
    }

    public static int solution(String before, String after) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < before.length(); i++) {
            sum1 += before.charAt(i);
            sum2 += after.charAt(i);
        }
        return (sum1 == sum2)? 1 : 0;

    }

    /*
    기존 풀이
    public static int solution(String before, String after) {
        String afterStr[] = after.split("");
        String beforeStr[] = before.split("");
        boolean isEquals = true;
        for(int i = 0; i < afterStr.length; i++){
            System.out.println(beforeStr[i].charAt(0));
            if(beforeStr[i].charAt(0) != afterStr[afterStr.length-(i+1)].charAt(0)){
            //if(!beforeStr[i].equals(afterStr[afterStr.length-(i+1)])){
                isEquals = false;
                break;
            }
        }
        return isEquals ? 1 : 0;
    }
     */

}
