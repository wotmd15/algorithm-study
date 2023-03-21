package programmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 배열회전시키기 {

    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/120844
     * Level 0
     * 배열 회전시키기
     * */
    public static void main(String[] args) {
        System.out.println("기대값 : [3, 1, 2] , 결과값 : " + Arrays.toString(solution(new int[]{1, 2, 3}, "right")));
        System.out.println("기대값 : [455, 6, 4, -1, 45, 6, 4] , 결과값 : " + Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }

    public static int[] solution(int[] numbers, String direction) {
        int tempNum = "right".equals(direction) ? numbers[numbers.length-1] : numbers[0];
        if(direction.equals("right")){
            for(int i = numbers.length-1; i > 0; i--){
                numbers[i] = numbers[i-1];
            }
            numbers[0] = tempNum;
        } else {
            for(int i = 0; i < numbers.length-1; i++){
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length-1] = tempNum;
        }
        return numbers;

        /**
         * 스트림 사용하여 해결
         * */
        /*
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        if(direction.equals("right")){
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size()-1);
        } else {
            list.add(list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
        */
    }


}
