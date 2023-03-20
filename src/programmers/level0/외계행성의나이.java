package programmers.level0;

public class 외계행성의나이 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120834
     * Level 0
     * 외계행성의 나이
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : cd , 결과값 : " + solution(23));
        System.out.println("기대값 : fb , 결과값 : " + solution(51));
        System.out.println("기대값 : baa , 결과값 : " + solution(100));
    }

    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String alphabetArr[] = {"a","b","c","d","e","f","g","h","i","j"};
        for(String num : String.valueOf(age).split("")){
            sb.append(alphabetArr[Integer.valueOf(num)]);
        }
        return sb.toString();
    }
}
