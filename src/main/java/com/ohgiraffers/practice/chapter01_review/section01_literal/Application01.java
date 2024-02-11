package com.ohgiraffers.practice.chapter01_review.section01_literal;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표
        *   여러가지 형태의 값을 출력할 수 있다. */

        // 목차. 1. 숫자 형태의 값

        System.out.println(123);        // 숫자 그대로 그냥 나오는구나. 문자랑 헷갈렸다

        // 목차. 1-1. 실수 형태의 값 출력

        System.out.println(1.23);

        // 목차. 2. 문자 형태의 값

        System.out.println('a');        // 문자 홀따옴표로 감싸기
//        System.out.println('ab');     두 개 이상은 문자열이므로 에러
//        System.out.println('');       아무 문자도 기록 x 시 오류. 중요. 공백은 가능!
        System.out.println('1');        // 중요. 숫자를 홀따옴표로 감싸면 문자 '1'로 판단

        // 목차. 3. 문자열 형태의 값 출력
        System.out.println("안녕하세요 서정민입니다. ");       // 문자열은 쌍따옴표
        System.out.println("123");      // 정수이지만 쌍따옴표로 감싸져 있어 문자열로 보아야 함. 정수로 보려면 그냥 쌩으로 두기
        System.out.println("");     // 중요. 빈 공간도 쌍따옴표로 감싸면 문자열로 취급
        System.out.println("a");        // 중요. 한 개의 문자도 쌍따옴표로 감싸면 '문자열'. (문자 a와는 다르다)

        // 목차. 4. 논리 형태의 값 출력
        System.out.println(true);       // 중요!!!! 0 또는 1 의 값이 나오는게 아니고 true, false 가 출력됨
        System.out.println(false);




    }

}
