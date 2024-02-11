package com.ohgiraffers.practice.chapter01_review.section02_variable;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 변수의 사용 목적에 대해 이해할 수 있다. */

        /* 필기.
        *   변수의 사용 목적
        *   1. 값에 의미 부여 -> 의미 전달이 쉬워짐, 협업 및 유지보수에 유리
        *   2. 한 번 저장해둔 값을 재사용 -> 변경 시에도 보다 간편
        *   3. 시간에 따라 변하는 값을 저장하고 사용 -> 변하는 값을 저장하기 위한 '공간'
        * */

        /* 목차. 1. 값에 의미 부여 */
        // 필기. 봉급 100,000원, 보너스 20,000원
        int salary = 100000;
        int bonus = 20000;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");
        //중요. 괄호 꼭 해야지!!!

        // 목차. 2. 한 번 저장해둔 값을 재사용
        int point = 1000;
        System.out.println("1번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("2번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("3번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("4번 고객에게 " + point + "포인트를 지급하였습니다.");
        System.out.println("5번 고객에게 " + point + "포인트를 지급하였습니다.");
        // 변경 시에도 point 값만 바꿔주면 되니 간편

        // 목차. 3. 시간에 따라 변경되는 값을 저장하고 사용할 수 있다.
        System.out.println("================변수에 저장된 값을 변경하는 테스트=================");

        int sum = 0;
        System.out.println("처음의 sum : " + sum);         //0
        sum = sum + 10;
        System.out.println("두 번째 sum : " + sum);        //10
        sum = sum + 10;
        System.out.println("세 번째 sum : " + sum);        //20



    }
}
