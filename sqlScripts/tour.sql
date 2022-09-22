CREATE SEQUENCE hp_tour_seq start with 10000;

CREATE TABLE tour (
  tour_id bigint NOT NULL DEFAULT nextval('hp_tour_seq'),
  tour_name varchar(50) DEFAULT NULL,
  tour_type varchar(10) DEFAULT NULL,
  PRIMARY KEY (tour_id)
);

ALTER SEQUENCE hp_tour_seq OWNED BY tour.tour_id;

INSERT INTO tour (tour_id, tour_name, tour_type)
VALUES
(100,'Baguio Tour','CITY'),
(101,'Jenolan Tour','RISKY'),
(102,'Pagudpud Tour','EXCITING'),
(103,'Manila Tour', 'CITY');
