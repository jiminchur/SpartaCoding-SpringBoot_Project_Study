## My Select Shop
> Naver 상품검색 Api를 활용하여 키워드로 상품의 정보 검색과 관심상품등록등 여러가지 기능을 사용한 나만의 상품샵이다.
### 요구사항 파악
1. 키워드로 상품의 정보 검색
2. 관심 상품 등록하기
3. 관심 상품의 "희망 최저가" 설정하기
4. 관심 상품 조회하기

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