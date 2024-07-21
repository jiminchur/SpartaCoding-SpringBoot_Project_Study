## Version 0.0.8
> Path Variable과 Request Param 실습하기

### 여러 가지 방식을 모두 학습할 수 있는 HTML파일
![스크린샷](./IMG/0.0.8/html_code.png)

### Request 요청 HTML 추가하기
![스크린샷](./IMG/0.0.8/controller.png)

### 적용된 web화면
![스크린샷](./IMG/0.0.8/html_web.png)

### Path Variable 방식
* 서버에 보내려는 데이터를 URL 경로에 추가할 수 있다.
* 예시 ) GET http://localhost:8080/hello/request/star/Robbie/age/95
![스크린샷](./IMG/0.0.8/get_1.png)
![스크린샷](./IMG/0.0.8/get_1_result.png.png)
```
@GetMapping("/star/{name}/age/{age}")
@ResponseBody
public String helloRequestPath(@PathVariable String name, @PathVariable int age)
{
    return String.format("Hello, @PathVariable.<br> name = %s, age = %d", name, age);
}
```

### Request Param 방식
* 서버에 보내려는 데이터를 URL 경로 마지막에 `?` 와 `&` 를 사용하여 추가할 수 있다.
* 예시 ) GET http://localhost:8080/hello/request/form/param?name=Robbie&age=95
![스크린샷](./IMG/0.0.8/get_2.png)
![스크린샷](./IMG/0.0.8/get_2_result.png.png)
```
@GetMapping("/form/param")
@ResponseBody
public String helloGetRequestParam(@RequestParam String name, @RequestParam int age) {
    return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);
}
```

### form 태그 POST
* HTML의 form 태그를 사용하여 POST 방식으로 HTTP 요청을 보낼 수 있다.
* HTML
```
<form method="POST" action="/hello/request/form/model">
  <div>
    이름: <input name="name" type="text">
  </div>
  <div>
    나이: <input name="age" type="text">
  </div>
  <button>전송</button>
</form>
```
* 이때 해당 데이터는 HTTP Body에 name=Robbie&age=95 형태로 담겨져서 서버로 전달된다.
```
@PostMapping("/form/param")
@ResponseBody
public String helloPostRequestParam(@RequestParam String name, @RequestParam int age) {
    return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);
}
```
* 다른 경우의 수
```
@GetMapping("/form/param")
@ResponseBody
public String helloGetRequestParam(@RequestParam(required = false) String name, int age) {
    return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);
}
```
* @RequestParam은 생략이 가능
* required 옵션을 false로 설정하면 빈칸으로 전달해도 오류가 발생하지 않음
* @PathVariable(required = false) 도 해당 옵션이 존재
* Client로 부터 값을 전달 받지 못한 해당 변수는 null로 초기화