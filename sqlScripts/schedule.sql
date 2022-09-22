CREATE SEQUENCE hp_schedule_seq start with 10000;
CREATE SEQUENCE hp_scheduleitem_seq start with 10000;

CREATE TABLE schedule (
  schedule_id bigint NOT NULL DEFAULT nextval('hp_schedule_seq'),
  creation_date timestamp DEFAULT NULL,
  status varchar(50) DEFAULT NULL,
  guide_id bigint NOT NULL,
  tour_id bigint NOT NULL,
  PRIMARY KEY (schedule_id),
  FOREIGN KEY (guide_id) REFERENCES guide(guide_id),
  FOREIGN KEY (tour_id) REFERENCES tour(tour_id)
);

CREATE TABLE schedule_item (
  schedule_item_id bigint NOT NULL DEFAULT nextval('hp_scheduleitem_seq'),
  schedule_id bigint NOT NULL,
  product_id bigint NOT NULL,
  quantity int DEFAULT NULL,
  PRIMARY KEY (schedule_item_id),
  FOREIGN KEY (schedule_id) REFERENCES schedule(schedule_id),
  FOREIGN KEY (product_id) REFERENCES product(product_id)
);

ALTER SEQUENCE hp_schedule_seq OWNED BY schedule.schedule_id;
ALTER SEQUENCE hp_scheduleitem_seq OWnED BY schedule_item.schedule_item_id;

INSERT INTO schedule (schedule_id, creation_date, status, guide_id, tour_id)
VALUES
(1000,'2022-10-01 00:00:00','paid',100,101),
(1001,'2022-10-02 00:00:00','paid',101,102);

INSERT INTO schedule_item (schedule_item_id, schedule_id, product_id, quantity)
VALUES
(1000,1000,1,46),
(1001,1000,2,6);
