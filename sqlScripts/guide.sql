CREATE SEQUENCE hp_guide_seq start with 10000;


CREATE TABLE guide (
  guide_id bigint NOT NULL DEFAULT nextval('hp_guide_seq'),
  first_name varchar(50) DEFAULT NULL,
  last_name varchar(50) DEFAULT NULL,
  email varchar(50) DEFAULT NULL,
  phone varchar(50) DEFAULT NULL,
  address varchar(50) DEFAULT NULL,
  city varchar(50) DEFAULT NULL,
  state varchar(50) DEFAULT NULL,
  zipcode varchar(50) DEFAULT NULL,
  PRIMARY KEY (guide_id)
);

ALTER SEQUENCE hp_guide_seq OWNED BY guide.guide_id;

INSERT INTO guide (guide_id, first_name, last_name, email, phone, address, city, state, zipcode)
VALUES
(100,'Jack','Powell','jpowell0@hplussport.com','(434)951-5046','5 Jenifer Crossing','Lynchburg','Virginia','24515'),
(101,'Emily','Garcia','egarcia1@hplussport.com','(603)489-3196','97 Vidon Alley','Manchester','New Hampshire','3105'),
(102,'Teresa','Riley','triley1e@hplussport.com','(651)210-8670','9491 Jana Lane','Saint Paul','Minnesota','55146');
