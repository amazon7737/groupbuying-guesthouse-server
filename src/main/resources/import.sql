insert into User (username, password, activated,  uuid, profileImage, nickname) values ('admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi',1 ,  "5e3a01e0-4c1d-42c1-be67-0d443128adf9", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "aaa1234");
insert into User (username, password, activated,  uuid, profileImage, nickname) values ('user', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e4", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "kym123");
insert into User (username, password, activated,  uuid, profileImage, nickname) values ('user1234', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e5", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "kkk1234");
insert into User (username, password, activated,  uuid, profileImage, nickname) values ('user1235', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e9", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "id0987");
insert into User (username, password, activated,  uuid, profileImage, nickname) values ('user1236', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "https://img.freepik.com/premium-vector/user-profile-icon-flat-style-member-avatar-vector-illustration-isolated-background-human-permission-sign-business-concept_157943-15752.jpg?w=1380", "id09876");

insert into authority (authorityName) values ('ROLE_USER');
insert into authority (authorityName) values ('ROLE_ADMIN');
insert into authority (authorityName) values ('ROLE_OWNER');

insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e4", 'ROLE_USER');
insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e5", 'ROLE_USER');
insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e9", 'ROLE_USER');
insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e0", 'ROLE_USER');
insert into userAuthority (uuid, authorityName) values ("5e3a01e0-4c1d-42c1-be67-0d443128adf9" , 'ROLE_ADMIN');
-- insert into user_authority (uuid, authority_name) values (2, 'ROLE_USER');

-- 첫번째 집 --

-- insert into HouseInfo (houseName, houseDescription, price,  user_uuid, address) values("", "", 0,  "", "");
-- insert into HouseImage (url, house_id) values ("" ,1);
-- insert into HousePosition (latitude, longitude, houseid_id) values (, , 1);



insert into HouseInfo (houseName, houseDescription, price,  user_uuid, address) values ("우담: 서울 시내에서 궁궐 비밀정원을 내려다보는 전원주택 힐링!", "1, 2층의 공간 전체, 2~8명 사용가능, 침실 2 (퀸사이즈 베드 2), 넓은 거실 2 (퀸사이즈 소파베드 2), 화장실 2, 주방 1(조리도구 완비), 12인석 대형 호두나무 식탁(4m), 보드게임, 닌텐도 스위치 게임 보유 주방 - 전기밥솥, 전자레인지, 인덕션, 얼음 정수기, 커피머신 (에스프레소 머신), 조리도구 및 양념, 식기 도구, 와인잔, 냉장고 완비 서울 도심에서 궁궐을 배경으로 묵을 수 있는 가장 아름다운 숙소. 미공개된 창덕궁 후원 비밀 정원지역을 내려다보며 힐링을 즐길 수 있으며, 지하철역과 대중교통 모두 가까워 여행을 위한 편의도 충분. 관리자 10분 거리에 생활 중이라 언제든 필요한 대응 가능. **주차 자리는 따로 없으나, 공영주차장이 도보 5분 거리에 있습니다.밤 10시 이후 시끄럽게 하면 안됩니다. 압도적인 소음이 나는 파티 게스트는 환불 없이 떠나라는 요청을 받게 됩니다. (이웃의 소음으로 인한 민원으로 인해 경찰 방문)", 376200,  "5edf7058-04e9-4ede-94f7-eef4512c06e5", "Gahoe-dong, Jongno-gu");

insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-50106009/original/4761c272-92fb-4470-bb5e-d630d8f5c33f.jpeg?im_w=1200", 1);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/c4263430-ac53-4b29-99ca-34d84cdb1fa4.jpg?im_w=720", 1);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/ff7d8d49-4c8b-493b-a875-e42bb22b2e93.jpg?im_w=720" ,1);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/0aefd982-280f-4201-bb48-e18d7ba1202e.jpg?im_w=1200" ,1);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-50106009/original/18fed6f2-4caa-4370-8066-3407a46cde04.jpeg?im_w=720" ,1);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/25703d99-0753-4492-a3ed-0445ee9c9b1f.jpg?im_w=720" ,1);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/5a3bc4a7-f486-4893-b5b6-62112617037a.jpg?im_w=1200" ,1);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/13e50eb5-65a3-4234-8c97-034837d77680.jpg?im_w=720" ,1);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/31632202-fdee-42fa-bdd2-0d31f2bb0a03.jpg?im_w=720" ,1);

insert into HousePosition (latitude, longitude, houseid_id) values (37.5794834, 126.991175, 1);


--
-- 두번쨰 집

insert into HouseInfo (houseName, houseDescription, price,  user_uuid, address) values ("서울의 집" , "서울의 관광명소 경복궁과 청와대가 바로 인근에 위치한  프라이빗 독채 숙소 Beauty Palace를 소개합니다. \n 경복궁과 청와대의 좋은 기운을 만끽하면서 아름다운 서울을 경험을 해보고 싶은 여행객분들께 멋진 힐링을 선사할 수 있는 숙소입니다. \n Beauty Palace는 최대 8명까지 수용이 가능한 곳으로 대가족, 많은 친구들과 여행을 하면서 편안한 휴식이 필요한 분들께 적합한 곳입니다! \n 숙소 근처에는 청와대 산책길이 있어 도보로 여유롭게 산책하며 서울의 고즈넉함을 느낄 수 있습니다. 또한, 현지 맛집과 카페도 즐비해 다양한 미식 경험도 가능합니다. \n 1. 서울역, 광화문역, 시청역에서 버스로 이동이 가능합니다. \n 2. 지하철 3호선 안국역 또는 경복궁역에서 도보로 20분정도 걸리는 곳에 위치해 있습니다. 또는 역에서 택시를 타면, 5분안에 숙소로 도착할 수 있습니다. \n 자세한 위치와 오시는 방법은 예약 손님께 메시지로 다시 한번 안내해드립니다!:) \n 숙소 \n 1. 넓고 쾌적한 공간 \n 프라이빗 독채 숙소로, 가족이나 단체가 오기 적합하며, 연인끼리 조용한 휴양을 즐기기에도 완벽합니다. \n 넓은 거실에서 편안함과 프라이버시를 동시에 누리세요. \n 2. 한국 전통+모던 인테리어 \n 고즈넉함과 현대적인 편안함 \n 숙소는 한국 전통과 모던 컨셉이 조화롭게 어우러져 있어, 고즈넉한 분위기와 현대적인 편안함을 동시에 느낄 수 있습니다. 전통적인 한옥 스타일과 현대적인 인테리어가 결합된 특별한 분위기를 자아냅니다. \n 3. 넓은 거실", 260000 , "5edf7058-04e9-4ede-94f7-eef4512c06e9" ,"서울 한양성길");

insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-U3RheVN1cHBseUxpc3Rpbmc6MTE2MjY5NDgzNDYxNTA0ODUyOQ%3D%3D/original/0b7ac370-8e0c-4fa9-9b47-1ab5d17624f1.jpeg?im_w=1200" ,2);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-U3RheVN1cHBseUxpc3Rpbmc6MTE2MjY5NDgzNDYxNTA0ODUyOQ%3D%3D/original/f39fe079-6612-4029-aeb4-a5b755ac22a6.jpeg?im_w=720" ,2);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-U3RheVN1cHBseUxpc3Rpbmc6MTE2MjY5NDgzNDYxNTA0ODUyOQ%3D%3D/original/f85eddd0-7710-4f4c-a789-245d727c4353.jpeg?im_w=720" ,2);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-U3RheVN1cHBseUxpc3Rpbmc6MTE2MjY5NDgzNDYxNTA0ODUyOQ%3D%3D/original/49f5e7de-50e9-44ae-b6eb-49529f3ff8d6.jpeg?im_w=1200" ,2);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-U3RheVN1cHBseUxpc3Rpbmc6MTE2MjY5NDgzNDYxNTA0ODUyOQ%3D%3D/original/f7513937-6209-4f57-8f88-b2cc64ef7c38.jpeg?im_w=720" ,2);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-U3RheVN1cHBseUxpc3Rpbmc6MTE2MjY5NDgzNDYxNTA0ODUyOQ%3D%3D/original/4d506167-8868-459a-a667-1e6e60c32c0e.jpeg?im_w=720" ,2);

insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 2);

--
-- 세번째 집

insert into HouseInfo (houseName, houseDescription, price,  user_uuid, address) values("1 min to Coex & 5 Sec to MRT[18]", "★분위기가 최고예요★ ★롯데마트와 편의점이 바로 옆에 위치하고 있습니다 ★주차불가 숙소입니다. 단, 기계식 주차 시스템이 있어 일반 세단차량은 주차가 가능하며 20:00~08:00는 주차요원이 없어서 입출차가 불가합니다", 0,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 강남 어딘가");

insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1036727795063729127/original/b02e2020-be32-4f56-9ea6-58038767b1e7.jpeg?im_w=960" ,3);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1036727795063729127/original/6d0eb3c4-dbb4-4013-bd7e-a0819c6a73e3.jpeg?im_w=720" ,3);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1036727795063729127/original/3eb54d27-8b97-4d72-9830-b262da08e595.jpeg?im_w=720" ,3);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1036727795063729127/original/42c7cb48-6e60-45f8-aef5-8299c3df256b.jpeg?im_w=1200" ,3);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1036727795063729127/original/064ae6a8-ded1-43c1-a285-74de44fc8030.jpeg?im_w=720" ,3);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1036727795063729127/original/49f0606c-c9b0-4d1a-9a03-f00d7db9a2b9.jpeg?im_w=720" ,3);

insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 3);

--
-- 네번째 집

 insert into HouseInfo (houseName, houseDescription, price,  user_uuid, address) values("cozy clean house", "저희 숙소는 트랜디한 맛집들이 자리잡고 있는 연남동 골목에 위치한 깔끔한 신축 주택입니다.", 166000,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 연남동");

 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1212288111249170023/original/9a896681-5a12-4855-93d9-486e95241dfa.jpeg?im_w=720" ,4);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1212288111249170023/original/c9c3e7ee-78d7-4850-934f-1db15e8d7d48.jpeg?im_w=720" ,4);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1212288111249170023/original/1654acd0-47e1-41a2-9ccb-82cc7e441f35.jpeg?im_w=720" ,4);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-U3RheVN1cHBseUxpc3Rpbmc6MTIxMjI4ODExMTI0OTE3MDAyMw%3D%3D/original/12f067f3-9c2f-43cb-aca2-b27c41a08325.jpeg?im_w=1200" ,4);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-1212288111249170023/original/2c48de71-75e9-4fe3-9454-0aca14752221.jpeg?im_w=720" ,4);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-U3RheVN1cHBseUxpc3Rpbmc6MTIxMjI4ODExMTI0OTE3MDAyMw%3D%3D/original/ff43fd27-c360-4a1a-96fa-18a1a17d224a.jpeg?im_w=720" ,4);

 insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 4);

--
-- 다섯번째 집

-- 가격할인?
 insert into HouseInfo (houseName, houseDescription, price,  user_uuid, address) values("2nd Lab House", "넷플릭스, 영화, 스포츠경기, 와인모임에 좋습니다:)", 182204,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 신청중앙로");

 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-981671230348978184/original/5d651ed1-3a6b-407c-a2a0-67fdbc618d87.jpeg?im_w=1200" ,5);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-981671230348978184/original/883c94fd-fa8a-44e5-96bc-3d5eb27c88a7.jpeg?im_w=720" ,5);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-981671230348978184/original/e26b930d-dafa-46c9-b5c8-452058567249.jpeg?im_w=720" ,5);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-981671230348978184/original/09eb4992-ced0-47fd-8618-977fb4281287.jpeg?im_w=1200" ,5);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-981671230348978184/original/9c7c9f14-63a3-4213-b980-15ad54c2e9cf.jpeg?im_w=720" ,5);
 insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-981671230348978184/original/1ab1ceb2-43d4-4a46-a54d-a3c800a34ccd.jpeg?im_w=720" ,5);
 insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 5);

--
-- 여섯번째 집


insert into HouseInfo (houseName, houseDescription, price,  user_uuid, address) values("성수역 한강공원 30평 루프탑 독채 소호하우스", "성수역 10분거리에 위치한 30평대 단독 숙소입니다~ *숙소는 주택 2층에 위치해있으며 루프탑 3층까지 단독 사용가능합니다", 180000,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 성수동2가");

insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-990386285068591266/original/c9ffbe11-3f91-4b16-91d2-77c1c3fc25e4.jpeg?im_w=1200" ,6);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-990386285068591266/original/45876355-dd6b-4c8b-9f86-72b168a4bfb9.jpeg?im_w=720" ,6);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-990386285068591266/original/8013d3de-844a-40f2-8b2b-97eb5a494638.jpeg?im_w=720" ,6);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-990386285068591266/original/91c4bdf9-8fc0-4b82-925a-8979d0e16db4.jpeg?im_w=1200" ,6);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-990386285068591266/original/e9439495-c7c2-432b-9f3a-42d902b9cbff.jpeg?im_w=720" ,6);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/hosting/Hosting-990386285068591266/original/10c9595b-18f2-43be-965d-f2bd7a31fabf.jpeg?im_w=1200" ,6);
insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 6);

-- 일곱번째 집
--



insert into HouseInfo (houseName, houseDescription, price,  user_uuid, address) values("[Akio's house][이그제큐티브 룸(LOFT)] 건대입구역 도보1분 스카이시티뷰", "안녕하세요 호스트AKIO(아키오)입니다. 고객님의 편안한 숙박체험을 위하여 최선을 다하고 있습니다", 212000,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 동일로 18길");

-- 이미지 링크에 param에 가로 길이를 입력하면 사진 비율이 다르게 나옴

insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/1bfa9b81-f39b-4c51-952d-3040f7960adb.jpg?im_w=720" ,7);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-951280235060417366/original/b075318a-a44a-4eb8-9f6d-a590f4e2e674.jpeg?im_w=720" ,7);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/2b83b098-2146-41af-aa59-f96f1920aafc.jpg?im_w=720" ,7);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-951280235060417366/original/373d7c10-e7b2-4679-9f30-858f5d7432a5.jpeg?im_w=720" ,7);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-951280235060417366/original/1d11421d-b77d-4268-9db9-208da0634636.jpeg?im_w=720" ,7);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/2e22612c-4aea-4266-8d56-4a975b3aa38a.jpg?im_w=720" ,7);

insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 7);

--
-- 여덟번째 집


insert into HouseInfo (houseName, houseDescription, price,  user_uuid, address) values("나비잠 한성대 입구역 1분 #혜화문 #창경궁 #워케이션 #파티", "#나비잠 -100년이상 된 전통한옥 -한성대입구역,혜화문 도보 1분 -창경궁,서울대병원 1정거장", 219000,  "5edf7058-04e9-4ede-94f7-eef4512c06e0", "서울 혜화동");

insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-959377017440011061/original/f1929366-36cc-47c3-aee1-55b008d23b95.jpeg?im_w=1200" ,8);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-959377017440011061/original/17a4e943-a6d4-4515-a395-863ba9cedba5.jpeg?im_w=720" ,8);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-959377017440011061/original/b132f0db-5b0d-49ef-9f4b-96e9cc318c3d.jpeg?im_w=720" ,8);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-959377017440011061/original/2ed1517c-292f-461e-a5cc-82cd1a2d7414.jpeg?im_w=720" ,8);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/3bafd796-1e7a-4ad5-84e6-658b86440a32.jpg?im_w=720" ,8);
insert into HouseImage (url, house_id) values ("https://a0.muscache.com/im/pictures/miso/Hosting-959377017440011061/original/f5538275-f79c-4d7f-bc84-ef246eb00d65.jpeg?im_w=720" ,8);

insert into HousePosition (latitude, longitude, houseid_id) values (0, 0, 8);

