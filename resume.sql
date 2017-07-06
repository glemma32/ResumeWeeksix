create schema genet_woldeyes_resumeDB;

grant all on genet_woldeyes_resumeDB.* to 'springuser'@'localhost';

INSERT INTO role (role) VALUES ('Recruiters');
INSERT INTO role (role) VALUES ('Seekers');
INSERT INTO user ( username, password, enabled) VALUES ('Genet',  'password',TRUE);
INSERT INTO user ( username, password, enabled)VALUES ('Fi',  'password1234',TRUE);

INSERT INTO user_roles (user_id, role_id) VALUES ('1', '2');
INSERT INTO user_roles (user_id, role_id) VALUES ('2', '1');