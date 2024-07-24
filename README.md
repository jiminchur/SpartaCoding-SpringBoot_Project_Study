## Version 0.1.2
> 같은 타입의 Bean이 2개라면 어떻게 되는지 확인하고 Test해보기

### 새로운 파일 생성하기
* Food // folder
    * Food.java // interface
    ```
    package com.sparta.springauth.food;

    public interface Food {
        void eat();
    }
    ```
    * Chicken.java // class
    ```
    package com.sparta.springauth.food;

    i`mport org.springframework.stereotype.Component;

    @Component
    public class Chicken implements Food {
        @Override
        public void eat() {
            System.out.println("치킨을 먹습니다.");
        }
    }`
    ```
    * Pizza.java // class
    ```
    package com.sparta.springauth.food;

    import org.springframework.stereotype.Component;

    @Component
    public class Pizza implements Food {
        @Override
        public void eat() {
            System.out.println("피자를 먹습니다.");
        }
    }
    ```

### Test 파일 생성하기 BeanTest.java
```
@SpringBootTest
public class BeanTest {

    @Autowired
    Food food;
    
}
```
* 이때 @Autowired로 Bean 객체를 주입 시도하지만 할 수 없다는 오류가 발생
* 오류를 보자면 "Food 타입의 Bean 객체가 하나 이상있다."이다.
* Bean 객체가 하나 이상이 되면 어떤 Bean을 등록할지 몰라 오류가 발생함

### Bean 객체가 하나 이상일때 해결하는 방법
1. 등록된 Bean 이름 명시하기
```
# Test 1
@Autowired
Food pizza;

@Autowired
Food chicken;

@Test
@DisplayName("테스트")
void test1(){
    pizza.eat();
    chicken.eat();
}
```
2. @Primary 사용하기
```
# Test2
@Autowired
Food food;

@Test
@DisplayName("테스트")
void Test1(){
    food.eat();
}
```
3. @Qualifier 사용하기
```
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
```
### 같은 타입의 Bean들에 Qualifier와 Primary가 동시에 적용되어있다면 ??
* Qualifier의 우선순위가 더 높다.
    * 그렇지만 Qualifier는 적용하기위해 @Qualifier("pizza")와 같이 필드에 추가를 해줘야한다.
    * 즉, 범용적으로 사용되는 Bean 객체에는 Primary를 지엽적으로 사용되는 Bean 객체에는 Qualifier를 사용하는 것이 좋다.