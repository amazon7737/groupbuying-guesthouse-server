insert into User (username, password, activated,  uuid) values ('admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi',1 ,  "5e3a01e0-4c1d-42c1-be67-0d443128adf9");
insert into User (username, password, activated,  uuid) values ('user', '$2a$12$/aonqoeXJljr4k5xF5oagOFyfVy/C0lHtpkD60zxI2E9W6hrfbw2K',1,  "5edf7058-04e9-4ede-94f7-eef4512c06e4");

insert into authority (authorityName) values ('ROLE_USER');
insert into authority (authorityName) values ('ROLE_ADMIN');
insert into authority (authorityName) values ('ROLE_OWNER');

insert into userAuthority (uuid, authorityName) values ( "5edf7058-04e9-4ede-94f7-eef4512c06e4", 'ROLE_USER');
insert into userAuthority (uuid, authorityName) values ("5e3a01e0-4c1d-42c1-be67-0d443128adf9" , 'ROLE_ADMIN');
-- insert into user_authority (uuid, authority_name) values (2, 'ROLE_USER');