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


<details>
  <summary><h3>1.0.3</h3></summary>

### 요구사항 파악
1. 회원별 상품 API 구현
2. 상품 등록 및 조회 구현
3. Repository에 회원별 상품을 조회하는 메서드 추가
4. Admin 계정 모든 상품 조회 기능 추가

</details>

<details>
  <summary><h3>1.0.4</h3></summary>

> 상품 페이징 및 정령

### 페이징
* page :  조회할 페이지 번호 (**1부터 시작**)
* size : 한 페이지에 보여줄 상품 개수 (**10개로 고정**!)

### 정렬
* sortBy (정렬 항목)
  * id : Product 테이블의 id
  * title : 상품명
  * lprice : 최저가
* isAsc (오름차순?)
  * true: 오름차순 (asc)
  * false : 내림차순 (desc)

### Server -> Client
- number : 조회된 페이지 번호 (**0부터 시작**)
- content : 조회된 상품 정보 (배열)
- size : 한 페이지에 보여줄 상품 개수
- numberOfElements : 실제 조회된 상품 개수
- totalElements : 전체 상품 개수 (회원이 등록한 모든 상품의 개수)
- totalPages : 전체 페이지 수

</details>

<details>
  <summary><h3>1.0.5</h3></summary>

> 폴더 생성 및 조회 구현

### 요구사항
* 회원별 폴더를 추가할 수 있습니다.
* 폴더를 추가할 때 1개~N개를 한번에 추가할 수 있습니다.
* 회원별 저장한 폴더들이 조회되어야 합니다.

</details>

<details>
  <summary><h3>1.0.6</h3></summary>

> 관심 상품에 폴더 추가 구현

### 요구사항
* 관심상품에 폴더를 0개 ~ N개 설정할 수 있습니다.
* 관심상품이 등록되는 시점에는 어느 폴더에도 저장되지 않습니다.
* 관심상품 별로 기 생성 했던 폴더를 선택하여 추가할 수 있습니다.

</details>

### 1.0.7
* 폴더 별 관심상품 조회 구현 완료
* 카카오 로그인 구현 (ISSUE)
  * 사용자가 로그인을 하면 DB에 담기지 않는 이슈가 있음