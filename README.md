## My Select Shop
> Naver 상품검색 Api를 활용하여 키워드로 상품의 정보 검색과 관심상품등록등 여러가지 기능을 사용한 나만의 상품샵이다.

### Version 
<details>
  <summary><h3>1.0.1</h3></summary>

### 요구사항 파악
1. 키워드로 상품의 정보 검색
2. 관심 상품 등록하기
3. 관심 상품의 "희망 최저가" 설정하기
4. 관심 상품 조회하기
5. 매일 새벽1시에 관심 상품 목록 제목으로 검색해서, 최저가 정보를 업데이트 하는 스케줄러 생성하기

### 상품검색 API
|기능|Method|URL|반환|
|-----|-----|-----|-----|
|키워드로 상품 검색|GET|/api/search?query=검색어|List<ItemDto>|

### API 설계하기
|기능|Method|URL|반환|
|-----|-----|-----|-----|
|관심 상품 등록하기|POST|/api/products|ProductResponseDto|
|관심 상품의 희망 최저가 업데이트|PUT|/api/products/{id}|ProductResponseDto|
|관심 상품 조회하기|GET|/api/products|List<ProductResponseDto>|

</details>
<details>
  <summary><h3>1.0.2</h3></summary>

### 요구사항 파악
1. 회원기능 구현

### API 설계
|Name|Method|URL|설명|
|-----|-----|-----|-----|
|로그인 페이지|GET|/api/user/login-page|회원가입 페이지 호출|
|회원가입 페이지|GET|/api/user/sign-up|회원가입 페이지 호출|
|회원가입 페이지|POST|/api/user/sign-up|회원가입|
|회원 정보 요청|GET|/api/user-info|회원 관련 정보 받기|

</details>