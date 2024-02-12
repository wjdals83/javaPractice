package com.ohgiraffers.practice.chapter01_review.section03_constant;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 상수에 대해 이해하고 사용할 수 있다. */

        // 필기. 상수의 사용 목적 -> 변경되지 않는 고정된 값을 저장할 목적.
        // 필기. ex. 수학 공식에 사용되는 수치 등

        /* 중요
        *   사용방법
        *   1. 상수 선언. final 키워드를 사용
        *   2. 값 초기화.
        *   3. 필요한 위치에 상수를 호출해서 사용.
        * */

        // 목차. 1. 상수선언
        final int AGE;      // 중요. 상수 변수명은 대문자로 짓는다.

        // 목차. 2. 초기화
        AGE = 20;

        // 목차. 3. 필요한 위치에 상수 호출
        // 필기. 출력 구문
        System.out.println("AGE의 값은? = " + AGE);
        System.out.println("AGE의 2배는?" + (AGE * 2));

        //필기. 대입연산 시 활용
        int sum = AGE;
//        int AGE = AGE + 10;        필기. AGE가 상수라 값이 변할 수 없음. 대문자 변수명 = 상수


    }

}
