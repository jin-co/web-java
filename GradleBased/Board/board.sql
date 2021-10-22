  Create Table BOARD
  ( BOARD_NUM NUMBER PRIMARY KEY, 
	BOARD_NAME VARCHAR2(20 BYTE) NOT NULL, 
	BOARD_PASS VARCHAR2(15 BYTE) NOT NULL, 
	BOARD_SUBJECT VARCHAR2(50 BYTE) NOT NULL, 
	BOARD_CONTENT VARCHAR2(2000 BYTE) NOT NULL, 
	BOARD_FILE VARCHAR2(50 BYTE), 
	BOARD_RE_REF NUMBER NOT NULL, --답글일 경우 원글 번호, 새글일 때는 board_num과 같음
	BOARD_RE_LEV NUMBER NOT NULL, --들여쓰기 레벨, 새글과의 단계
	BOARD_RE_SEQ NUMBER NOT NULL, --같은 레벨에서의 글 순서, 새 답글이 앞에 오게
	BOARD_READCOUNT Number Default 0, 
	BOARD_DATE DATE);