package com.sparta.spring_auth;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import com.sparta.spring_auth.food.Food;

@SpringBootTest
public class BeanTest {
    
    // Test 1
    // @Autowired
    // Food pizza;

    // @Autowired
    // Food chicken;

    // @Test
    // @DisplayName("테스트")
    // void test1(){
    //     pizza.eat();
    //     chicken.eat();
    // }

    // Test2
    // @Autowired
    // Food food;

    // @Test
    // @DisplayName("테스트")
    // void Test1(){
    //     food.eat();
    // }

    // Test3
    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Primary 와 Qualifier 우선순위 확인")
    void test1() {
        // 현재 Chicken 은 Primary 가 적용된 상태
        // Pizza는 Qualifier 가 추가된 상태입니다.
        food.eat();
    }
}
