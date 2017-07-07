create schema genet_woldeyes_resumeDB;


grant all on genet_woldeyes_resumeDB.* to 'springuser'@'localhost';

INSERT INTO role (role) VALUES ('Recruiters');
INSERT INTO role (role) VALUES ('Seekers');
INSERT INTO user ( username, password, enabled) VALUES ('Genet',  'password',TRUE);
INSERT INTO user ( username, password, enabled)VALUES ('Fi',  'password1234',TRUE);

INSERT INTO user_roles (user_id, role_id) VALUES ('1', '2');
INSERT INTO user_roles (user_id, role_id) VALUES ('2', '1');

UPDATE `genet_woldeyes_resumeDB`.`skill` SET `id`='1' WHERE `skill_id`='1';
UPDATE education SET id='1' WHERE edu_id='1';
UPDATE `genet_woldeyes_resumeDB`.`job` SET `id`='1' WHERE `job_id`='1';

select * from person;
select * from education;
select * from skill;
select * from job;
select * from user;
