package programmers.level0;

public class 암호해독 {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120892
     * Level 0
     * 암호 해독
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : attack , 결과값 : " + solution("dfjardstddetckdaccccdegk",4));
        System.out.println("기대값 : fallback , 결과값 : " + solution("pfqallllabwaoclk",2));
    }

    public static String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        String[] strArray = cipher.split("");
        for(int i = 1; i <= strArray.length; i++){
            if(i % code == 0){
                sb.append(strArray[i-1]);
            }
        }
        //        return IntStream.range(0, cipher.length())
        //                .filter(value -> value % code == code - 1)
        //                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
        //                .collect(Collectors.joining());
        return sb.toString();
    }
}
