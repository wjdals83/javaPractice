package com.ohgiraffers.practice.chapter01_review.section01_literal;

public class Application02 {

    public static void main(String[] args) {

        // 수업목표. 값을 직접 연산하여 출력할 수 있다.

        // 목차. 1. 숫자와 숫자의 연산

        System.out.println("===========정수와 정수의 연산============");
        System.out.println(123 + 56);
        System.out.println(32 - 453);
        System.out.println(123 % 69);     //mod 연산자
        System.out.println(123 / 10);       // 중요. 정수는 몫만 나온다.
        // 궁금. 뭐지 이거 헷갈린다. 자료형을 int로 정해준 것도 아닌데 정수계산에선
        //  몫만, 실수계산에선 소수점까지 나온다.

        System.out.println("===========실수와 실수의 연산============");
        System.out.println(123.2 / 10.0);      // 중요!!!! 정수는 몫만 나오지만 실수는 소수점까지 나옴. 헷갈리지 않기.
        System.out.println(123.2 % 10.0);       // 중요. 그럼 실수끼리 나눴을 때의 나머지는 이건데 /랑 % 헷갈린다

        System.out.println("===========정수와 실수의 연산============");
        System.out.println(123 / 10.0);     // 중요. 어쨌건 실수가 같이 '/, %' 로 연산되면 소수점으로 나온다.
        System.out.println(123 % 10.0);

        System.out.println("============문자와 문자의 연산============");
        System.out.println('a' + 'b');      // a = 97 , b = 98
        System.out.println('a' / 'b');      //출력값은 0
        System.out.println('a' % 'b');      //출력값은 97
        /* 궁금. 문자 'a' 를 넣으면 숫자가 나올 줄 알았는데
        *   연산에서는 숫자로 계산되고 쌩으로는 문자로 나온다.
        *   개념이 계속 헷갈리나 보다.
        *   문자는 문자지만 연산은 가능하다 라고 생각해야겠다. */
        System.out.println('a');        // 출력값은 a

        System.out.println("============연습=============");
        System.out.println('안' + '녕');

        System.out.println("===========문자와 실수의 연산============");
        System.out.println('a' + 2.3);      // 출력값 99.3 예상대로 정수 + 실수로 계산됨
        System.out.println('a' / 90);

        System.out.println("============문자열과 다른 형태의 값 연산===========");
        System.out.println("문자열" + 123);        //문자열은 다른 애들을 왼쪽부터 차례로 흡수함. 다 문자열화
        System.out.println("문자열 " + 123.2);      // 출력값 문자열 123.2
        System.out.println("문자열 " + 'a');
//        System.out.println("문자열 " + a);       오 짱신기해. a가 바로 변수 취급당해서 변수를 만들어 달라고 한다.
        System.out.println("문자열" + true);       // 출력값 문자열 true
//        System.out.println(true + true);      boolean끼리 연산 불가. 대소비교도 불가였던 듯

        System.out.println("==============논리와 문자열의 연산==============");
//        System.out.println(true + 'a');       //중요. 논리와 문자는 연산 불가
        System.out.println(true + "a");     //중요. 출력값 truea. 논리와 문자열은 더하기 연산만 가능
//        System.out.println(true - "a");       //중요. 불가
//        System.out.println(true / "a");       //중요. 당연히 불가




    }

}
