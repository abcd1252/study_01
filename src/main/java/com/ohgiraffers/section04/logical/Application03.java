package com.ohgiraffers.section04.logical;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 논리연결연산자의 진리표에 대해 이해할 수 있다. */

        /* 필기.
            논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안함.
            논리식 || 논리식 : 앞의결과가 true 이면 뒤를 실행 안 함.
         */

        /* 필기. 조건식 두 개가 모두 만족해야 true 를 반환하지만, 앞에서 미리 false 가 마리 false 가 나오면
            뒤의 조건을 확인 할 필요가 없이 false 를 반환한다.
            따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false 가 나올 가능성이 높은 편을 작성하는 것이 좋다.
         */



        int num1 = 10;
        int result1 = (true && ++num1 > 0)? num1 : num1;
        System.out.println("&& 실행 확인 : " + result1);

        int num2 = 10;
        int result2 = (false || ++num2 > 0)? num2 : num2;

        System.out.println("result2 = " + result2);




    }

}
