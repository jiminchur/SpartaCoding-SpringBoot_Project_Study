## Version 0.1.3
> 쿠키와 세션 실습해보기

### 새로운 파일 생성하기
* auth // folder
    * AuthController.java // class
    
### 쿠키와 세션이란??
* 쿠키 (Cookie)
    * 클라이언트에 저장될 목적으로 생성한 작은 정보를 담은 파일
    * 예 ) 사이트 팝업의 "오늘 다시보지 않기" 정보 저장
* 세션 (Session)
    * 서버에서 일정시간 동안 클라이언트 상태를 유지하기 위해 사용
    * 예 ) 로그인 정보 저장

### 쿠키 다루기 실습해보기

### 세션 다루기 실습해보기

### 💡 "Robbie auth"처럼 띄워쓰기가 들어가 있으면 오류가 나는데??
* 해결책으로 아래 코드를 살펴보면 된다.
```
    public static void addCookie(String cookieValue, HttpServletResponse res) {
        try {
            cookieValue = URLEncoder.encode(cookieValue, "utf-8").replaceAll("\\+", "%20"); // Cookie Value 에는 공백이 불가능해서 encoding 진행

            Cookie cookie = new Cookie(AUTHORIZATION_HEADER, cookieValue); // Name-Value
            cookie.setPath("/");
            cookie.setMaxAge(30 * 60);

            // Response 객체에 Cookie 추가
            res.addCookie(cookie);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
```