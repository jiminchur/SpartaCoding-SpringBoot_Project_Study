## Version 0.0.6
> 데이터를 Client에 반환하는 방법

### Json 데이터 반환하는 방법 (반환값 : String)
![스크린샷](./IMG/0.0.6/json.png)

#### Postman test - 결과값 text로 보기
![스크린샷](./IMG/0.0.6/json-test.png)

#### Postman test - 결과값 json로 보기
![스크린샷](./IMG/0.0.6/json-test-json.png)

### Json 데이터 반환하는 방법 (반환값 : String 외 자바 클래스)
![스크린샷](./IMG/0.0.6/class.png)

#### Star.java
![스크린샷](./IMG/0.0.6/star.png)

#### Postman test
![스크린샷](./IMG/0.0.6/class-test.png)

### @RestController로 수정해서 파일 생성
* RestController는 Controller + ResponseBody라고 생각하면 된다. 사용하게되면 해당 클래스의 모든 메서드에 @ResponseBody 애너테이션이 추가되는 효과를 부여할 수 있다.
![스크린샷](./IMG/0.0.6/restcontroller.png)