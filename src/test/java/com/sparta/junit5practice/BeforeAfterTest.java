package com.sparta.junit5practice;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {


    @BeforeEach
    void setUp() {
        System.out.println("각각의 테스트 코드가 실행되기전에 수행");
    }


    @AfterEach
    void tearDown() {

        System.out.println("각각의 테스트 코드가 실행된후 수행");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("모든 테스트 코드가 실행되기전 최초 수행");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트 코드가 실행된후 마지막 수행");
    }

    @Test
    void test1() {

        System.out.println("1 = " + 1);

    }
    @Test
    void test2() {

        System.out.println("2 = " + 2);

    }
}
