package onboarding;

import java.util.List;

/*
*   구현 기능
*   1. 페이지수를 각 자릿수별로 분할하는 기능
*   2. 각 자릿수를 더하는 기능
*   3. 각 자릿수를 곱하는 기능
*   4. 최대값 탐색 기능
*   5. 예외사항 탐색 기능
*/
class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    public static List<Integer> splitNum(Integer num) {
        int numOfFirst;
        int numOfSecond;
        int numOfThird;
        numOfFirst = num / 100;
        numOfSecond = (num % 100) / 10;
        numOfThird = num % 10;

        return List.of(numOfFirst, numOfSecond, numOfThird);
    }

    public static int getSum(List<Integer> numbers) {
        int result = 0;
        result += numbers.get(0) + numbers.get(1) + numbers.get(2);

        return result;
    }

    public static int getMulti(List<Integer> numbers) {
        int result = 1;
        if(numbers.get(0) == 0) {
            if(numbers.get(1) == 0){        // 백의자리 0 && 십의자리 0
                result = numbers.get(2);
            } else {                        // 백의자리만 0
                result *= numbers.get(1) * numbers.get(2);
            }
        }
        else if(numbers.get(1) == 0) {
            if(numbers.get(2) == 0){        // 십의자리 0 && 일의자리 0
                result = numbers.get(0);
            } else {                        // 십의자리만 0
                result *= numbers.get(0) * numbers.get(2);
            }
        }
        else {                              // 0 없음
            result *= numbers.get(0) * numbers.get(1) * numbers.get(2);
        }

        return result;
    }

    public static int getMax(List<Integer> numbers) {
        int max = 0;
        for(Integer num : numbers) {
            if (max < num) {
                max = num;
            }
        }

        return max;
    }

    public static boolean isNormal(List<Integer> list) {
        int diff = list.get(1) - list.get(0);
        return diff == 1 && list.get(0) % 2 == 1;
    }
}