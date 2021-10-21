# 코로나 우울증 프로젝트



## 참고자료 목록

[의료기관 우울증 외래 진료서비스 질 평가](http://www.mohw.go.kr/react/al/sal0301vw.jsp?PAR_MENU_ID=04&MENU_ID=0403&CONT_SEQ=360080)

[2021년 1분기 「코로나19 국민 정신건강 실태조사」결과 발표](http://www.mohw.go.kr/react/al/sal0301vw.jsp?PAR_MENU_ID=04&MENU_ID=0403&page=1&CONT_SEQ=365582)

[정신건강 정책 목록](http://www.mohw.go.kr/react/policy/index.jsp?PAR_MENU_ID=06&MENU_ID=063304)

[심리상담센터/정신과 추천 지도](https://m.blog.naver.com/leeojsh/220852877049)

[전국 의료급여 정신과 평가내역](https://www.hira.or.kr/re/diag/getDiagEvlList.do?pgmid=HIRAA030004000100#none)


## Open API 목록
[보건복지부_정신건강관련 기관 현황](https://www.data.go.kr/data/15004315/fileData.do)

[한국언론진흥재단_어린이 미디어 이용 조사_미디어가 어린이의 신체적 정신적 건강에 미치는 영향력에 대한 인식](https://www.data.go.kr/data/15077844/fileData.do)

[건강보험심사평가원_의료급여 정신과 평가 정보 2019.10](https://www.data.go.kr/data/15052113/fileData.do)



## 프로젝트 설계 관련

[마인드 맵](https://gitmind.com/app/doc/5252910419)

[웹 데모](http://llallallall.site:8080/corona-blue/)



## 커밋 관련

### 1. feat: 새로운 기능 대한 커밋

```
feat: Drinks 상세보기 기능 구현
feat: 리뷰 삭제 기능 구현
feat: 리뷰 수정 기능 구현
feat: 기간별 랭킹 조회 기능 구현
feat: 랜덤 닉네임 및 자기소개에 대한 dummyAPI 구현
```

### 2. refactor : 코드 수정에 대한 커밋(코드 수정이나 리팩토링)

```
refactor: 검색 로직 변경 및 간결화
refactor: App 코드 간결화 및 리팩토링
refactor: 테스트 메소드에 주석 제거
refactor: 불필요한 css 코드 삭제
refactor: assertAll문 사용
refactor: lines 정리
refactor: 중복 코드 메소드로 대체
refactor: 날짜 입력창 레이아웃 변경
refactor: filter.RESET_END_DATE -> SET_END_DATE_TO_NOW
refactor: DATE_FORMAT 객체로 사용하지 않고 변수로 사용
refactor: 불필요한 상수 제거
```

### 3. docs :  문서 수정에 대한 커밋(코드 수정이 아님)

```
docs: feature 이슈, bug 이슈에 대한 템플릿 작성
docs: pull request에 대한 템플릿 작성
docs: 113번 브랜치 머지될 시 해야 할 TODO 추가
```

### 4. fix: 버그 수정에 대한 커밋

```
fix: 상세페이지에서 개행문자가 띄어쓰기로 표시되는 문제 해결
fix: 오버레이에 개행문자가 띄어쓰기로 표시되던 문제 해결
fix: 이모지가 짤리는 문제 해결
```

### 5. chore: 그 외 자잘한 수정에 대한 커밋

```
chore: generated 파일 .gitignore에 추가
chore: 환경설정 변경
chore: package-lock.json 파일 수정
chore: favicon 및 open graph 설정
chore: 포트 번호 3000으로 변경
chore: 프론트엔드 초기 환경 설정
chore: 백엔드 프로젝트 기본 세팅
chore: 불필요한 파일 제거
chore: gitmodules의 url을 ssh형식으로 변경
chore: gitmoudles 경로 수정
chore: Submodules 연결
chore: gitmodules 변경
```