<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8"/><title>(가칭) 건.강.해 - j프로젝트</title><style>
/* cspell:disable-file */
/* webkit printing magic: print all background colors */
html {
	-webkit-print-color-adjust: exact;
}
* {
	box-sizing: border-box;
	-webkit-print-color-adjust: exact;
}

html,
body {
	margin: 0;
	padding: 0;
}
@media only screen {
	body {
		margin: 2em auto;
		max-width: 900px;
		color: rgb(55, 53, 47);
	}
}

body {
	line-height: 1.5;
	white-space: pre-wrap;
}

a,
a.visited {
	color: inherit;
	text-decoration: underline;
}

.pdf-relative-link-path {
	font-size: 80%;
	color: #444;
}

h1,
h2,
h3 {
	letter-spacing: -0.01em;
	line-height: 1.2;
	font-weight: 600;
	margin-bottom: 0;
}

.page-title {
	font-size: 2.5rem;
	font-weight: 700;
	margin-top: 0;
	margin-bottom: 0.75em;
}

h1 {
	font-size: 1.875rem;
	margin-top: 1.875rem;
}

h2 {
	font-size: 1.5rem;
	margin-top: 1.5rem;
}

h3 {
	font-size: 1.25rem;
	margin-top: 1.25rem;
}

.source {
	border: 1px solid #ddd;
	border-radius: 3px;
	padding: 1.5em;
	word-break: break-all;
}

.callout {
	border-radius: 3px;
	padding: 1rem;
}

figure {
	margin: 1.25em 0;
	page-break-inside: avoid;
}

figcaption {
	opacity: 0.5;
	font-size: 85%;
	margin-top: 0.5em;
}

mark {
	background-color: transparent;
}

.indented {
	padding-left: 1.5em;
}

hr {
	background: transparent;
	display: block;
	width: 100%;
	height: 1px;
	visibility: visible;
	border: none;
	border-bottom: 1px solid rgba(55, 53, 47, 0.09);
}

img {
	max-width: 100%;
}

@media only print {
	img {
		max-height: 100vh;
		object-fit: contain;
	}
}

@page {
	margin: 1in;
}

.collection-content {
	font-size: 0.875rem;
}

.column-list {
	display: flex;
	justify-content: space-between;
}

.column {
	padding: 0 1em;
}

.column:first-child {
	padding-left: 0;
}

.column:last-child {
	padding-right: 0;
}

.table_of_contents-item {
	display: block;
	font-size: 0.875rem;
	line-height: 1.3;
	padding: 0.125rem;
}

.table_of_contents-indent-1 {
	margin-left: 1.5rem;
}

.table_of_contents-indent-2 {
	margin-left: 3rem;
}

.table_of_contents-indent-3 {
	margin-left: 4.5rem;
}

.table_of_contents-link {
	text-decoration: none;
	opacity: 0.7;
	border-bottom: 1px solid rgba(55, 53, 47, 0.18);
}

table,
th,
td {
	border: 1px solid rgba(55, 53, 47, 0.09);
	border-collapse: collapse;
}

table {
	border-left: none;
	border-right: none;
}

th,
td {
	font-weight: normal;
	padding: 0.25em 0.5em;
	line-height: 1.5;
	min-height: 1.5em;
	text-align: left;
}

th {
	color: rgba(55, 53, 47, 0.6);
}

ol,
ul {
	margin: 0;
	margin-block-start: 0.6em;
	margin-block-end: 0.6em;
}

li > ol:first-child,
li > ul:first-child {
	margin-block-start: 0.6em;
}

ul > li {
	list-style: disc;
}

ul.to-do-list {
	text-indent: -1.7em;
}

ul.to-do-list > li {
	list-style: none;
}

.to-do-children-checked {
	text-decoration: line-through;
	opacity: 0.375;
}

ul.toggle > li {
	list-style: none;
}

ul {
	padding-inline-start: 1.7em;
}

ul > li {
	padding-left: 0.1em;
}

ol {
	padding-inline-start: 1.6em;
}

ol > li {
	padding-left: 0.2em;
}

.mono ol {
	padding-inline-start: 2em;
}

.mono ol > li {
	text-indent: -0.4em;
}

.toggle {
	padding-inline-start: 0em;
	list-style-type: none;
}

/* Indent toggle children */
.toggle > li > details {
	padding-left: 1.7em;
}

.toggle > li > details > summary {
	margin-left: -1.1em;
}

.selected-value {
	display: inline-block;
	padding: 0 0.5em;
	background: rgba(206, 205, 202, 0.5);
	border-radius: 3px;
	margin-right: 0.5em;
	margin-top: 0.3em;
	margin-bottom: 0.3em;
	white-space: nowrap;
}

.collection-title {
	display: inline-block;
	margin-right: 1em;
}

time {
	opacity: 0.5;
}

.icon {
	display: inline-block;
	max-width: 1.2em;
	max-height: 1.2em;
	text-decoration: none;
	vertical-align: text-bottom;
	margin-right: 0.5em;
}

img.icon {
	border-radius: 3px;
}

.user-icon {
	width: 1.5em;
	height: 1.5em;
	border-radius: 100%;
	margin-right: 0.5rem;
}

.user-icon-inner {
	font-size: 0.8em;
}

.text-icon {
	border: 1px solid #000;
	text-align: center;
}

.page-cover-image {
	display: block;
	object-fit: cover;
	width: 100%;
	height: 30vh;
}

.page-header-icon {
	font-size: 3rem;
	margin-bottom: 1rem;
}

.page-header-icon-with-cover {
	margin-top: -0.72em;
	margin-left: 0.07em;
}

.page-header-icon img {
	border-radius: 3px;
}

.link-to-page {
	margin: 1em 0;
	padding: 0;
	border: none;
	font-weight: 500;
}

p > .user {
	opacity: 0.5;
}

td > .user,
td > time {
	white-space: nowrap;
}

input[type="checkbox"] {
	transform: scale(1.5);
	margin-right: 0.6em;
	vertical-align: middle;
}

p {
	margin-top: 0.5em;
	margin-bottom: 0.5em;
}

.image {
	border: none;
	margin: 1.5em 0;
	padding: 0;
	border-radius: 0;
	text-align: center;
}

.code,
code {
	background: rgba(135, 131, 120, 0.15);
	border-radius: 3px;
	padding: 0.2em 0.4em;
	border-radius: 3px;
	font-size: 85%;
	tab-size: 2;
}

code {
	color: #eb5757;
}

.code {
	padding: 1.5em 1em;
}

.code-wrap {
	white-space: pre-wrap;
	word-break: break-all;
}

.code > code {
	background: none;
	padding: 0;
	font-size: 100%;
	color: inherit;
}

blockquote {
	font-size: 1.25em;
	margin: 1em 0;
	padding-left: 1em;
	border-left: 3px solid rgb(55, 53, 47);
}

.bookmark {
	text-decoration: none;
	max-height: 8em;
	padding: 0;
	display: flex;
	width: 100%;
	align-items: stretch;
}

.bookmark-title {
	font-size: 0.85em;
	overflow: hidden;
	text-overflow: ellipsis;
	height: 1.75em;
	white-space: nowrap;
}

.bookmark-text {
	display: flex;
	flex-direction: column;
}

.bookmark-info {
	flex: 4 1 180px;
	padding: 12px 14px 14px;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
}

.bookmark-image {
	width: 33%;
	flex: 1 1 180px;
	display: block;
	position: relative;
	object-fit: cover;
	border-radius: 1px;
}

.bookmark-description {
	color: rgba(55, 53, 47, 0.6);
	font-size: 0.75em;
	overflow: hidden;
	max-height: 4.5em;
	word-break: break-word;
}

.bookmark-href {
	font-size: 0.75em;
	margin-top: 0.25em;
}

.sans { font-family: ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol"; }
.code { font-family: "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace; }
.serif { font-family: Lyon-Text, Georgia, ui-serif, serif; }
.mono { font-family: iawriter-mono, Nitti, Menlo, Courier, monospace; }
.pdf .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK JP'; }
.pdf:lang(zh-CN) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK SC'; }
.pdf:lang(zh-TW) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK TC'; }
.pdf:lang(ko-KR) .sans { font-family: Inter, ui-sans-serif, -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, "Apple Color Emoji", Arial, sans-serif, "Segoe UI Emoji", "Segoe UI Symbol", 'Twemoji', 'Noto Color Emoji', 'Noto Sans CJK KR'; }
.pdf .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }
.pdf:lang(zh-CN) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }
.pdf:lang(zh-TW) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }
.pdf:lang(ko-KR) .code { font-family: Source Code Pro, "SFMono-Regular", Menlo, Consolas, "PT Mono", "Liberation Mono", Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }
.pdf .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK JP'; }
.pdf:lang(zh-CN) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK SC'; }
.pdf:lang(zh-TW) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK TC'; }
.pdf:lang(ko-KR) .serif { font-family: PT Serif, Lyon-Text, Georgia, ui-serif, serif, 'Twemoji', 'Noto Color Emoji', 'Noto Serif CJK KR'; }
.pdf .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK JP'; }
.pdf:lang(zh-CN) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK SC'; }
.pdf:lang(zh-TW) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK TC'; }
.pdf:lang(ko-KR) .mono { font-family: PT Mono, iawriter-mono, Nitti, Menlo, Courier, monospace, 'Twemoji', 'Noto Color Emoji', 'Noto Sans Mono CJK KR'; }
.highlight-default {
}
.highlight-gray {
	color: rgb(155,154,151);
}
.highlight-brown {
	color: rgb(100,71,58);
}
.highlight-orange {
	color: rgb(217,115,13);
}
.highlight-yellow {
	color: rgb(223,171,1);
}
.highlight-teal {
	color: rgb(15,123,108);
}
.highlight-blue {
	color: rgb(11,110,153);
}
.highlight-purple {
	color: rgb(105,64,165);
}
.highlight-pink {
	color: rgb(173,26,114);
}
.highlight-red {
	color: rgb(224,62,62);
}
.highlight-gray_background {
	background: rgb(235,236,237);
}
.highlight-brown_background {
	background: rgb(233,229,227);
}
.highlight-orange_background {
	background: rgb(250,235,221);
}
.highlight-yellow_background {
	background: rgb(251,243,219);
}
.highlight-teal_background {
	background: rgb(221,237,234);
}
.highlight-blue_background {
	background: rgb(221,235,241);
}
.highlight-purple_background {
	background: rgb(234,228,242);
}
.highlight-pink_background {
	background: rgb(244,223,235);
}
.highlight-red_background {
	background: rgb(251,228,228);
}
.block-color-default {
	color: inherit;
	fill: inherit;
}
.block-color-gray {
	color: rgba(55, 53, 47, 0.6);
	fill: rgba(55, 53, 47, 0.6);
}
.block-color-brown {
	color: rgb(100,71,58);
	fill: rgb(100,71,58);
}
.block-color-orange {
	color: rgb(217,115,13);
	fill: rgb(217,115,13);
}
.block-color-yellow {
	color: rgb(223,171,1);
	fill: rgb(223,171,1);
}
.block-color-teal {
	color: rgb(15,123,108);
	fill: rgb(15,123,108);
}
.block-color-blue {
	color: rgb(11,110,153);
	fill: rgb(11,110,153);
}
.block-color-purple {
	color: rgb(105,64,165);
	fill: rgb(105,64,165);
}
.block-color-pink {
	color: rgb(173,26,114);
	fill: rgb(173,26,114);
}
.block-color-red {
	color: rgb(224,62,62);
	fill: rgb(224,62,62);
}
.block-color-gray_background {
	background: rgb(235,236,237);
}
.block-color-brown_background {
	background: rgb(233,229,227);
}
.block-color-orange_background {
	background: rgb(250,235,221);
}
.block-color-yellow_background {
	background: rgb(251,243,219);
}
.block-color-teal_background {
	background: rgb(221,237,234);
}
.block-color-blue_background {
	background: rgb(221,235,241);
}
.block-color-purple_background {
	background: rgb(234,228,242);
}
.block-color-pink_background {
	background: rgb(244,223,235);
}
.block-color-red_background {
	background: rgb(251,228,228);
}
.select-value-color-default { background-color: rgba(206,205,202,0.5); }
.select-value-color-gray { background-color: rgba(155,154,151, 0.4); }
.select-value-color-brown { background-color: rgba(140,46,0,0.2); }
.select-value-color-orange { background-color: rgba(245,93,0,0.2); }
.select-value-color-yellow { background-color: rgba(233,168,0,0.2); }
.select-value-color-green { background-color: rgba(0,135,107,0.2); }
.select-value-color-blue { background-color: rgba(0,120,223,0.2); }
.select-value-color-purple { background-color: rgba(103,36,222,0.2); }
.select-value-color-pink { background-color: rgba(221,0,129,0.2); }
.select-value-color-red { background-color: rgba(255,0,26,0.2); }

.checkbox {
	display: inline-flex;
	vertical-align: text-bottom;
	width: 16;
	height: 16;
	background-size: 16px;
	margin-left: 2px;
	margin-right: 5px;
}

	
</style></head><body><article id="50a1d7b5-f46a-4f45-9875-061794a85b6e" class="page sans"><header><img class="page-cover-image" src="./lib/images/logo.png" style="object-position:center 50%"/><h1 class="page-title">(가칭) 건.강.해 - j프로젝트</h1></header><div class="page-body"><h1 id="af497af9-cd43-4389-a41a-81d28cc54ab1" class="">멘토링 결과</h1><ul id="eb350151-e81d-41d9-b74d-0d43ee7251e2" class="bulleted-list"><li>프로젝트의 범위를 잘 선정해야 함<ul id="dd08c156-188a-486d-8ec0-676ae7e6785d" class="bulleted-list"><li>욕심 부리지말고 반드시 구현할 기능부터 구현 (기능을 독립적으로 구성)</li></ul></li></ul><ul id="febaad8b-b747-4875-8da5-a6b32f61ffc5" class="bulleted-list"><li>기능 리스트업 <ul id="eed3eb8e-e182-4dd5-9d82-82c96c5285d5" class="bulleted-list"><li><span style="border-bottom:0.05em solid"><strong>우선 순위 부여</strong></span></li></ul></li></ul><ul id="3c7ca54c-4057-4057-b43f-4a103c51142a" class="bulleted-list"><li>WBS 구성 후 task 분배</li></ul><p id="1ddabe8f-d5fc-41eb-ba7d-52fc4bcee539" class="">
</p><hr id="48c1e125-e098-41ce-8f80-5d4b1c852c5b"/><p id="14bb3053-76af-48c8-bc37-5358bc4e7a64" class="">
</p><h1 id="407b598f-5c53-4f86-a8ba-50209fb88674" class="">슬로건 키워드</h1><ul id="eadcda17-71e0-4fce-8519-457830202593" class="bulleted-list"><li><span style="border-bottom:0.05em solid"><mark class="highlight-yellow"><strong>건</strong></mark></span>강 - 나와 우리의 건강<ul id="5dcf03f3-0d87-4d19-8888-c47e4c16a2fc" class="bulleted-list"><li>현대인 주요 질환별 건강식단 정보 공유</li></ul><ul id="14309b29-3dda-46b1-9a3d-5fac2daade2a" class="bulleted-list"><li>사용자간 추천 식단 공유 </li></ul><ul id="3c83c80f-8218-468e-83f8-6699287ad44e" class="bulleted-list"><li>사회적 비용 절감(건강증진 + 식문화 개선)</li></ul></li></ul><ul id="b2ffe46d-7521-4391-99d5-9398834e1c79" class="bulleted-list"><li><mark class="highlight-yellow"><span style="border-bottom:0.05em solid"><strong>간</strong></span></mark>편한 서비스<ul id="6e7f7fa5-62a8-4290-8c37-4a6bd5665082" class="bulleted-list"><li>음성인식 기반</li></ul><ul id="c7331745-8dfe-4f5d-a74f-c18dffa5f2d2" class="bulleted-list"><li>사용자 건강정보 기반 영양식 추천</li></ul><ul id="869192bb-0e55-472c-a896-90d8619e9c20" class="bulleted-list"><li>정기 배송 서비스</li></ul></li></ul><ul id="0eb67b77-7ce5-4441-a07f-6b33da1a03fb" class="bulleted-list"><li><mark class="highlight-yellow"><span style="border-bottom:0.05em solid"><strong>해</strong></span></mark>달 - 함께 공유하며 즐기는 플랫폼</li></ul><p id="db19efc7-8a27-401f-983a-419614cbb8a6" class="">
</p><h1 id="42d95f8d-ac64-4ac6-9b4b-3b67aa89d5cf" class="">슬로건 </h1><blockquote id="e1a9f2d9-0f14-4ed6-b039-61f0496484dc" class=""><mark class="highlight-orange"><strong><em>내 건강은 너에게 맡길께 - 건. 강. 해.</em></strong></mark></blockquote><ul id="f9f3ad6b-08d1-4dd1-bc0e-b11ab2702113" class="bulleted-list"><li> AI인공지능 기반 (건)강식단을 추천하고 함께 공유하는( 간)편 서비스 <a href="https://wordrow.kr/%EC%9D%98%EB%AF%B8/%ED%95%B4%EB%9D%BD/">(해)달</a> 플랫폼 </li></ul><p id="71219ff6-fbeb-4177-b36d-510e793505c3" class="">
</p><h1 id="156bfa32-9379-4dcf-bb2a-5f7a1b2d89ff" class="">문제 - 시발점</h1><ul id="a25e5eef-9cc8-4727-8b0b-5dbe48c40f6b" class="bulleted-list"><li>코로나 사태 이후 배달음식, 간편식에 대한 수요가 높아지고 있는 반면</li></ul><ul id="6b40dd58-2d64-48f5-bd00-57f774984a81" class="bulleted-list"><li>다양한 요리 프로그램이 반증하듯 건강하고 맛있는 음식에 대한 수요도 폭발적으로 증가</li></ul><ul id="084ed16f-1b32-46b0-a591-0ca10b9591d1" class="bulleted-list"><li>재택근무, 집합금지 등으로 비만, 당뇨, 고지혈 등 현대인 주요 질환 증가</li></ul><ul id="023a3981-2f99-433e-ba9d-e80f540053d8" class="bulleted-list"><li>건강식에 대한 관심은 있지만 찾아보고 요리를 완성하기까지의 과정이 상당히 복잡함</li></ul><ul id="4cd1baa5-c918-4d17-b796-93c09dc63cee" class="bulleted-list"><li>나의 건강상태에 적합한 식품이 무엇인지 바로바로 알려주는 서비스 부재</li></ul><p id="6f97cf73-26bb-4896-9288-a898ace322ff" class="">
</p><p id="fb41b6e9-9e11-400d-9ba3-4f14c3a40ddb" class="">
</p><p id="81c2fcf7-4a21-4f19-a85f-c692f9cb2b2a" class="">
</p><h1 id="60cfcd5e-ab7c-435d-a55c-15fa9b29964d" class="">해결방안 - 솔류션</h1><ul id="445a5487-6667-4dad-8e1b-47dcccbeae71" class="bulleted-list"><li>클로바 음성인식 API를 활용하여 음성으로 나에게 필요한 건강식단을 물어보면 답을 준다.</li></ul><ul id="e8132bc5-704c-4129-919f-bdee9383179f" class="bulleted-list"><li>요리 데이터 베이스를 구축하고 추천 알고리즘을 기반으로 4~5개 식단을 구성하여 사용자가 선택할 수 있도록 추천해 준다. </li></ul><ul id="b356ac65-a3b5-4693-b787-21716e4aa7d1" class="bulleted-list"><li>사용자가 사용한 식단(요리사진)을 웹에 공유하여 여러사람이 볼 수 있도록하고 후기를 달 수 있도록하고 다른 사용자의 좋아요 🥰 추천을 받도록 한다.</li></ul><ul id="a2535211-ba8f-482b-bf34-df29385a1300" class="bulleted-list"><li><del>음식을 깨끗하게 먹으면 사회적 비용 절감 포인트를 준다.</del><ul id="444c29f3-fcf6-4f60-ae7c-aee030911c4a" class="bulleted-list"><li><del>깨끗하게 먹은 그릇 인증 (이미지 인식)</del></li></ul></li></ul><p id="1dfd2566-55b6-4e57-8a6e-afa41ba3aa65" class="">
</p><p id="2545a6be-a52c-47be-a714-842e29902615" class="">
</p><p id="03c20916-1dcb-487e-afaa-c9d2c946c1a6" class="">
</p><h1 id="21cf0766-3bb6-4951-b968-96e45bd9d0d7" class="">재미요소 - 넛지</h1><ul id="24cd2b4c-f05a-449c-88e8-41b4df7e465a" class="bulleted-list"><li>매일 매일 출결 하여 연속 출결일수가 10, 50, 100 일이 될때마다 사용자 레벨을 올려준다. <ul id="c4d0dfa7-e6be-4189-b078-2304f30447b9" class="bulleted-list"><li><a href="https://x86.co.kr/">https://x86.co.kr/</a></li></ul></li></ul><ul id="e71f2d69-aa5a-4508-9c63-e9fc03f04386" class="bulleted-list"><li>자랑 - 요리 사진을 공유하고 좋아요 추천을 많이 받으면 레벨을 올려준다.<ul id="ca0221e7-8e2d-4ef5-b980-f7ad92466cd9" class="bulleted-list"><li><a href="https://www.instagram.com/">https://www.instagram.com/</a></li></ul><ul id="a3ad5cb5-a68f-45fd-bfc1-9c87cc98142a" class="bulleted-list"><li><a href="https://tgd.kr/s/pjs9073/34921986?autoplay=false&amp;clip=BashfulBelovedEagleGrammarKing&amp;tt_content=embed&amp;tt_medium=clips_embed%22+width%3D%22640%22+height%3D%22360%22+frameborder%3D%220%22+scrolling%3D%22no%22+allowfullscreen%3D%22true%22%3E%3C%2Fiframe%3E">https://tgd.kr/s/pjs9073/34921986?autoplay=false&amp;clip=BashfulBelovedEagleGrammarKing&amp;tt_content=embed&amp;tt_medium=clips_embed&quot;+width%3D&quot;640&quot;+height%3D&quot;360&quot;+frameborder%3D&quot;0&quot;+scrolling%3D&quot;no&quot;+allowfullscreen%3D&quot;true&quot;&gt;&lt;%2Fiframe&gt;</a></li></ul></li></ul><p id="5f40ad3d-e802-4468-b0e8-d9c01a449c32" class="">
</p><p id="dca47585-1543-4fe8-bbf5-9f635370d7c9" class="">
</p><p id="465371eb-9a13-4c6c-ad58-e5cedd87dd05" class="">
</p><h1 id="2741f985-88b1-4ef6-be01-68453cd7f495" class="">벤치마킹</h1><ul id="484f85b5-187e-43a0-a002-832c2bd3af96" class="bulleted-list"><li> 그리팅 몰<ul id="eb414771-34a2-4668-9095-a33ced05e212" class="bulleted-list"><li><a href="https://www.greating.co.kr/planMeals/menuPreview?mealType=3">https://www.greating.co.kr/planMeals/menuPreview?mealType=3</a></li></ul></li></ul><ul id="c8ad002c-14b6-4640-8013-acc9c406815e" class="bulleted-list"><li>농진청 추천식단<ul id="2fdc95d1-0a31-4fd5-8240-7b4efca7a4cf" class="bulleted-list"><li><a href="http://api.nongsaro.go.kr/sample/rest/recomendDiet/recomendDiet.jsp">http://api.nongsaro.go.kr/sample/rest/recomendDiet/recomendDiet.jsp</a></li></ul></li></ul><p id="09501c1b-f423-494f-8cd6-ac681a04cc96" class="">
</p><p id="5852d1ba-4239-444f-84a9-6d46598de2e6" class="">
</p><p id="17e83cf6-b914-4f17-a568-8b5b1be2d32f" class="">
</p><h1 id="7ca89ffb-16c5-4838-abda-1e6bff9f10a9" class="">서비스 구성 - 활용 기술요소 </h1><ul id="9718842f-5a70-4b87-8293-385d06849e2e" class="bulleted-list"><li>AI음성인식 API - KT maker kit 활용<ul id="01631f21-d620-4373-b95b-6bd46d678753" class="bulleted-list"><li><a href="https://www.ncloud.com/product/aiService/csr">https://www.ncloud.com/product/aiService/csr</a></li></ul></li></ul><ul id="7ab36cc7-babe-45f2-8019-b22a9f67e624" class="bulleted-list"><li>주요 질환별 추천 식단 및 피해야할 식단 데이터베이스 <ul id="7c6cdba6-e099-43e0-b9d3-66dd2a4b0df3" class="bulleted-list"><li>추천 로직은 기존 서비스 이용, 알고리즘은 <a href="https://tech.kakao.com/2021/03/11/kakao-ai/">https://tech.kakao.com/2021/03/11/kakao-ai/</a></li></ul></li></ul><ul id="1a2e5000-5d73-4040-9d90-e8705068e35f" class="bulleted-list"><li>식단 공유 웹 서비스<ul id="ab04f56b-d4b5-4940-8688-4c5021b46eb7" class="bulleted-list"><li>식단 을 공유하고 추천받는 서비스<ul id="23bc60d9-96d2-4a4e-8853-da2841c28398" class="bulleted-list"><li><a href="http://dable.io/ko/reco-widget-demo/">http://dable.io/ko/reco-widget-demo/</a></li></ul></li></ul><ul id="b1b84124-133e-44bc-811c-b64556ca2f6d" class="bulleted-list"><li>장바구니 구성시 자동으로 재료를 정기 주문해주는 서비스<ul id="1053fc44-40e3-427f-b02b-6f5d11ab1e1c" class="bulleted-list"><li><a href="http://kong-kong.com/goods/goods_list.php?cateCd=042">http://kong-kong.com/goods/goods_list.php?cateCd=042</a></li></ul></li></ul></li></ul><ul id="c51cf9c9-9cb1-46b7-ac30-bc657ed4c2d3" class="bulleted-list"><li><del>이미지 분석 API</del><ul id="6525bca2-5ce0-43bb-8cd0-c7fd19c7e033" class="bulleted-list"><li><del><a href="https://vision-api.kakao.com/">https://vision-api.kakao.com/</a></del></li></ul></li></ul><p id="6b77492a-6742-4a3f-8b30-cc5e41b0944d" class="">
</p><p id="d4ea3b15-353f-4ed5-9d40-8f5ff5022bd8" class="">
</p><h1 id="43b9e874-61c5-4c0a-9885-98ac09c9e29b" class="">기대효과</h1><ul id="585c31bc-ea1d-489d-8013-9fbfdce232d2" class="bulleted-list"><li>건강식단 공유를 통한 사회적 건강 증진</li></ul><ul id="90b32aff-4451-46b6-84cf-daa397ede13e" class="bulleted-list"><li>음성 호출을 통해 간편한 서비스 호출로 사용자 편익 증대</li></ul><p id="c29a13ba-c38d-461c-80a9-083dc877cfd5" class="">
</p><p id="9a4eee76-3a34-4816-9c41-584ca7438141" class="">
</p></div></article></body></html>