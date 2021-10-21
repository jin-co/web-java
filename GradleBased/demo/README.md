# (가칭) 건.강.해 - j프로젝트

# 멘토링 결과

- 프로젝트의 범위를 잘 선정해야 함
    - 욕심 부리지말고 반드시 구현할 기능부터 구현 (기능을 독립적으로 구성)
- 기능 리스트업
    - **우선 순위 부여**
- WBS 구성 후 task 분배

---

# 슬로건 키워드

- **건**강 - 나와 우리의 건강
    - 현대인 주요 질환별 건강식단 정보 공유
    - 사용자간 추천 식단 공유
    - 사회적 비용 절감(건강증진 + 식문화 개선)
- **간**편한 서비스
    - 음성인식 기반
    - 사용자 건강정보 기반 영양식 추천
    - 정기 배송 서비스
- **해**달 - 함께 공유하며 즐기는 플랫폼

# 슬로건

> ***내 건강은 너에게 맡길께 - 건. 강. 해.***

- AI인공지능 기반 (건)강식단을 추천하고 함께 공유하는( 간)편 서비스 [(해)달](https://wordrow.kr/%EC%9D%98%EB%AF%B8/%ED%95%B4%EB%9D%BD/) 플랫폼

# 문제 - 시발점

- 코로나 사태 이후 배달음식, 간편식에 대한 수요가 높아지고 있는 반면
- 다양한 요리 프로그램이 반증하듯 건강하고 맛있는 음식에 대한 수요도 폭발적으로 증가
- 재택근무, 집합금지 등으로 비만, 당뇨, 고지혈 등 현대인 주요 질환 증가
- 건강식에 대한 관심은 있지만 찾아보고 요리를 완성하기까지의 과정이 상당히 복잡함
- 나의 건강상태에 적합한 식품이 무엇인지 바로바로 알려주는 서비스 부재

# 해결방안 - 솔류션

- 클로바 음성인식 API를 활용하여 음성으로 나에게 필요한 건강식단을 물어보면 답을 준다.
- 요리 데이터 베이스를 구축하고 추천 알고리즘을 기반으로 4~5개 식단을 구성하여 사용자가 선택할 수 있도록 추천해 준다.
- 사용자가 사용한 식단(요리사진)을 웹에 공유하여 여러사람이 볼 수 있도록하고 후기를 달 수 있도록하고 다른 사용자의 좋아요 🥰 추천을 받도록 한다.
- ~~음식을 깨끗하게 먹으면 사회적 비용 절감 포인트를 준다.~~
    - ~~깨끗하게 먹은 그릇 인증 (이미지 인식)~~

# 재미요소 - 넛지

- 매일 매일 출결 하여 연속 출결일수가 10, 50, 100 일이 될때마다 사용자 레벨을 올려준다.
    - [https://x86.co.kr/](https://x86.co.kr/)
- 자랑 - 요리 사진을 공유하고 좋아요 추천을 많이 받으면 레벨을 올려준다.
    - [https://www.instagram.com/](https://www.instagram.com/)
    - [https://tgd.kr/s/pjs9073/34921986?autoplay=false&clip=BashfulBelovedEagleGrammarKing&tt_content=embed&tt_medium=clips_embed"+width%3D"640"+height%3D"360"+frameborder%3D"0"+scrolling%3D"no"+allowfullscreen%3D"true"><%2Fiframe>](https://tgd.kr/s/pjs9073/34921986?autoplay=false&clip=BashfulBelovedEagleGrammarKing&tt_content=embed&tt_medium=clips_embed%22+width%3D%22640%22+height%3D%22360%22+frameborder%3D%220%22+scrolling%3D%22no%22+allowfullscreen%3D%22true%22%3E%3C%2Fiframe%3E)

# 벤치마킹

- 그리팅 몰
    - [https://www.greating.co.kr/planMeals/menuPreview?mealType=3](https://www.greating.co.kr/planMeals/menuPreview?mealType=3)
- 농진청 추천식단
    - [http://api.nongsaro.go.kr/sample/rest/recomendDiet/recomendDiet.jsp](http://api.nongsaro.go.kr/sample/rest/recomendDiet/recomendDiet.jsp)

# 서비스 구성 - 활용 기술요소

- AI음성인식 API - KT maker kit 활용
    - [https://www.ncloud.com/product/aiService/csr](https://www.ncloud.com/product/aiService/csr)
- 주요 질환별 추천 식단 및 피해야할 식단 데이터베이스
    - 추천 로직은 기존 서비스 이용, 알고리즘은 [https://tech.kakao.com/2021/03/11/kakao-ai/](https://tech.kakao.com/2021/03/11/kakao-ai/)
- 식단 공유 웹 서비스
    - 식단 을 공유하고 추천받는 서비스
        - [http://dable.io/ko/reco-widget-demo/](http://dable.io/ko/reco-widget-demo/)
    - 장바구니 구성시 자동으로 재료를 정기 주문해주는 서비스
        - [http://kong-kong.com/goods/goods_list.php?cateCd=042](http://kong-kong.com/goods/goods_list.php?cateCd=042)
- ~~이미지 분석 API~~
    - [~~https://vision-api.kakao.com/~~](https://vision-api.kakao.com/)

# 기대효과

- 건강식단 공유를 통한 사회적 건강 증진
- 음성 호출을 통해 간편한 서비스 호출로 사용자 편익 증대