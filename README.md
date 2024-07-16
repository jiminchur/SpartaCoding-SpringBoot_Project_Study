## Version 0.0.3
> @getter @setter @AllArgsConstructor @NoArgsConstructor @RequiredArgsConstructor 다뤄보기 및 application.properties 파일에서 port 수정해보기

### Memo.java 생성 후 getter setter 적용하기
![스크린샷](./IMG/0.0.3/memo_java_gs.png)

### getter setter가 생성되는 memo.class 파일 체크하기
![스크린샷](./IMG/0.0.3/memo_class.png)
* setUsername()은 적용은 되나 class파일에서는 식별이 되질않음

### NoArgsConstructor
![스크린샷](./IMG/0.0.3/memo_java_no.png)

### AllArgsConstructor
![스크린샷](./IMG/0.0.3/memo_java_all.png)

### RequiredArgsConstructor
![스크린샷](./IMG/0.0.3/memo_java_re.png)

### application.properties에서 Port번호 수정해보고 확인하기
* application.properties에서 수정
![스크린샷](./IMG/0.0.3/port_file.png)

* 실행 후 port번호 확인
![스크린샷](./IMG/0.0.3/port_check.png)