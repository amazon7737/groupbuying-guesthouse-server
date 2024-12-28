insert into User (username, password, activated,  uuid, profileImage, nickname) values ('admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi',1 ,  "5e3a01e0-4c1d-42c1-be67-0d443128adf9", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "aaa1234");
insert into User (username, password, activated,  uuid, profileImage, nickname) values ('user', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e4", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "kym123");
insert into User (username, password, activated,  uuid, profileImage, nickname) values ('user1234', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e5", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "kkk1234");
insert into User (username, password, activated,  uuid, profileImage, nickname) values ('user1235', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e9", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "id0987");
insert into User (username, password, activated,  uuid, profileImage, nickname) values ('user1236', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "id09876");
insert into User (username, password, activated,  uuid, profileImage, nickname) values ('onlySeoul123', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "Seoul");

insert into authority (authorityName) values ('ROLE_USER');
insert into authority (authorityName) values ('ROLE_ADMIN');
insert into authority (authorityName) values ('ROLE_OWNER');

insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e4", 'ROLE_USER');
insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e5", 'ROLE_USER');
insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e9", 'ROLE_USER');
insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e0", 'ROLE_USER');
insert into userAuthority (uuid, authorityName) values ("5e3a01e0-4c1d-42c1-be67-0d443128adf9" , 'ROLE_ADMIN');
insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e7", 'ROLE_USER');
-- insert into user_authority (uuid, authority_name) values (2, 'ROLE_USER');

-- 첫번째 집 --
insert into House (houseName, houseDescription, price,  user_uuid, address) values ("우담: 서울 시내에서 궁궐 비밀정원을 내려다보는 전원주택 힐링!", "1, 2층의 공간 전체, 2~8명 사용가능, 침실 2 (퀸사이즈 베드 2), 넓은 거실 2 (퀸사이즈 소파베드 2), 화장실 2, 주방 1(조리도구 완비), 12인석 대형 호두나무 식탁(4m), 보드게임, 닌텐도 스위치 게임 보유 주방 - 전기밥솥, 전자레인지, 인덕션, 얼음 정수기, 커피머신 (에스프레소 머신), 조리도구 및 양념, 식기 도구, 와인잔, 냉장고 완비 서울 도심에서 궁궐을 배경으로 묵을 수 있는 가장 아름다운 숙소. 미공개된 창덕궁 후원 비밀 정원지역을 내려다보며 힐링을 즐길 수 있으며, 지하철역과 대중교통 모두 가까워 여행을 위한 편의도 충분. 관리자 10분 거리에 생활 중이라 언제든 필요한 대응 가능. **주차 자리는 따로 없으나, 공영주차장이 도보 5분 거리에 있습니다.밤 10시 이후 시끄럽게 하면 안됩니다. 압도적인 소음이 나는 파티 게스트는 환불 없이 떠나라는 요청을 받게 됩니다. (이웃의 소음으로 인한 민원으로 인해 경찰 방문)", 376200,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "Gahoe-dong, Jongno-gu");
insert into HousePosition (latitude, longitude, houseid_id) values (37.5794834, 126.991175, 1);

-- 두번쨰 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values ("서울의 집" , "서울의 관광명소 경복궁과 청와대가 바로 인근에 위치한  프라이빗 독채 숙소 Beauty Palace를 소개합니다. \n 경복궁과 청와대의 좋은 기운을 만끽하면서 아름다운 서울을 경험을 해보고 싶은 여행객분들께 멋진 힐링을 선사할 수 있는 숙소입니다. \n Beauty Palace는 최대 8명까지 수용이 가능한 곳으로 대가족, 많은 친구들과 여행을 하면서 편안한 휴식이 필요한 분들께 적합한 곳입니다! \n 숙소 근처에는 청와대 산책길이 있어 도보로 여유롭게 산책하며 서울의 고즈넉함을 느낄 수 있습니다. 또한, 현지 맛집과 카페도 즐비해 다양한 미식 경험도 가능합니다. \n 1. 서울역, 광화문역, 시청역에서 버스로 이동이 가능합니다. \n 2. 지하철 3호선 안국역 또는 경복궁역에서 도보로 20분정도 걸리는 곳에 위치해 있습니다. 또는 역에서 택시를 타면, 5분안에 숙소로 도착할 수 있습니다. \n 자세한 위치와 오시는 방법은 예약 손님께 메시지로 다시 한번 안내해드립니다!:) \n 숙소 \n 1. 넓고 쾌적한 공간 \n 프라이빗 독채 숙소로, 가족이나 단체가 오기 적합하며, 연인끼리 조용한 휴양을 즐기기에도 완벽합니다. \n 넓은 거실에서 편안함과 프라이버시를 동시에 누리세요. \n 2. 한국 전통+모던 인테리어 \n 고즈넉함과 현대적인 편안함 \n 숙소는 한국 전통과 모던 컨셉이 조화롭게 어우러져 있어, 고즈넉한 분위기와 현대적인 편안함을 동시에 느낄 수 있습니다. 전통적인 한옥 스타일과 현대적인 인테리어가 결합된 특별한 분위기를 자아냅니다. \n 3. 넓은 거실", 260000 , "5edf7058-04e9-4ede-94f7-eef4512c06e9" ,"서울 한양성길");
insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 2);

-- 세번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("1 min to Coex & 5 Sec to MRT[18]", "★분위기가 최고예요★ ★롯데마트와 편의점이 바로 옆에 위치하고 있습니다 ★주차불가 숙소입니다. 단, 기계식 주차 시스템이 있어 일반 세단차량은 주차가 가능하며 20:00~08:00는 주차요원이 없어서 입출차가 불가합니다", 0,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 강남 어딘가");
insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 3);

-- 네번째 집
 insert into House (houseName, houseDescription, price,  user_uuid, address) values("cozy clean house", "저희 숙소는 트랜디한 맛집들이 자리잡고 있는 연남동 골목에 위치한 깔끔한 신축 주택입니다.", 166000,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 연남동");
 insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 4);

-- 다섯번째 집
-- 가격할인?
 insert into House (houseName, houseDescription, price,  user_uuid, address) values("2nd Lab House", "넷플릭스, 영화, 스포츠경기, 와인모임에 좋습니다:)", 182204,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 신청중앙로");
 insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 5);

--
-- 여섯번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("성수역 한강공원 30평 루프탑 독채 소호하우스", "성수역 10분거리에 위치한 30평대 단독 숙소입니다~ *숙소는 주택 2층에 위치해있으며 루프탑 3층까지 단독 사용가능합니다", 180000,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 성수동2가");
insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 6);

-- 일곱번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("[Akio's house][이그제큐티브 룸(LOFT)] 건대입구역 도보1분 스카이시티뷰", "안녕하세요 호스트AKIO(아키오)입니다. 고객님의 편안한 숙박체험을 위하여 최선을 다하고 있습니다", 212000,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 동일로 18길");
-- 이미지 링크에 param에 가로 길이를 입력하면 사진 비율이 다르게 나옴
insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 7);

--
-- 여덟번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("나비잠 한성대 입구역 1분 #혜화문 #창경궁 #워케이션 #파티", "#나비잠 -100년이상 된 전통한옥 -한성대입구역,혜화문 도보 1분 -창경궁,서울대병원 1정거장", 219000,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 혜화동");
insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 8);

-- 아홉번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("스테이 노들", "서울의 중심: 숙소 바로 앞에 한강대교만 건너면 용산 중심지(아모레 퍼시픽, 방탄소년단 소속사 하이브 등) 프라이빗한 공간: 겉모습은 한옥, 내부는 호텔식 인테리어로 깔끔하고 아늑합니다.",154000 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "서울, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.51356441808235, 126.94540741946348, 9);

-- 열번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("빈티지한 3룸 집 전체! 지하철 3분! 무료주차!", "지하철역 가까운 최고의 접근성!!! 탁트인 큰 창과 이국적인 인테리어로 여행과 특별한 날 모임을 한층 즐길 수 있는 최적은 장소입니다.", 83270 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "성북구, 서울, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.545259887142045, 127.12713859478175, 10);

-- 열한번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("dmyk_Hachure", "합리적인 가격에 호텔의 시설을 이용하실 수 있도록 설계하였습니다. 화장실을 포함한 전체공간은 단독사용합니다. (도어락을 통해 셀프 체크인)",36000 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "종로구, 서울, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.57895351025017, 127.00187360775696, 11);

-- 열두번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("서울, 노원/하계역 5분거리, 원룸독채, 홈플러스와 아울렛이 옆에", "주의사항 1. 금연 구역입니다. 2. pet동반 금지입니다. 3. 늦은시간 고성방가는 삼가해주세요.",49000 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "Nowon-gu 서울, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.64064332652736, 127.06688244589732, 12);

-- 열세번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("dmyk_Carre", "PRIVATE BATH(전용욕실 포함) 주차불가, 객실 전체 친환경 페인트 도장",50000 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "종로구, 서울, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.57609538068093, 127.02169000138838, 13);

-- 열네번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("NEW! 늦은 퇴실, 위치 좋은, 영화 다락방 YEON HOUSE", "호수공원, 라페스타, 웨스턴돔(맛집의 성지) 도보 이용 가능합니다.", 57000 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "Goyang-si, 경기도, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.66133282898755, 126.76934865208854, 14);

-- 열다섯번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("[포근하우스] 수유역도보7분이내 먹자골목 2인오락기 빔프로젝터 기념일 여행", "🏠아늑하게 쉬었다가는 포근하우스입니다💛 수유 먹자골목 끝 위치 / 비대면 셀프 체크인",64600 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "서울, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.63882462227305, 127.02120404079587, 15);


-- 열여섯번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("스타필드15분 롯데월드30분 섬스튜디오5분 방3개화장실2개30평 메이져아파트 무료주차1대", "30평 브랜드 아파트 게스트 단독 사용~ 넓은 거실, 넓은 주방, 쾌적한 화장실 2개와 방3개 이용 가능", 167598 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "Hanam-si, 경기도, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.56372003438092, 127.19012387843, 16);

-- 열일곱번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("작은 마당있는 단독주택! 3room! 지하철 5분! [송소담의 집01]", "역에서 도보로 가까운 접근성 좋은 작은 마당있는 단독 주택입니다 전체 화이트 톤의 인테리어로 정성을 담아 만들어낸 공간으로 여행과 특별한 날 모임을 한층 즐길 수 있도록 정성을 담은 최적의 공간입니다.", 97883 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "성북구, Seoul, Republic of Korea, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.609244086651955, 127.05331470646192, 17);

-- 열여덟번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("[오픈 특가] #청소비X #은평성모병원 #복층 #구파발 초역세권 #롯데몰", "👍🏻삼삼엠투에서 결제하시는 것이 훨-씬 저렴합니다! 구파발 초역세권 복층을 검색해 주세요!", 69000 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "서울, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.6354158308584, 126.91944759242402, 18);

-- 열아홉번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("[브라우니하우스] 사당역/ 이수역 도보 5분/ 아늑한 공간", "🚪브라우니 하우스(Brownie House) 브라운 컬러를 좋아하는 호스트의 취향이 반영된 편안한 느낌의 아늑한 공간입니다",75000 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "서울, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.480875920505625, 126.98224945553604, 19);

-- 스물번째 집
insert into House (houseName, houseDescription, price,  user_uuid, address) values("스튜디오-203/화장실/전용화장실/지하철 도보8분/버스정류장 1분/슈퍼 싱글침대/풀옵션", "청량리역 도보 5분 - 8분, 버스 정류장 1분 - 3분 (세탁 세제, 주방 세제, 쓰레기 봉투, 샴푸, 바디워시...)",35000 ,  "5edf7058-04e9-4ede-94f7-eef4512c06e7", "서울, 한국");
insert into HousePosition (latitude, longitude, houseid_id) values (37.547376756944, 127.15574364953609, 20);

