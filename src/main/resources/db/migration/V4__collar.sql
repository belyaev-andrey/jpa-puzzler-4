ALTER TABLE pet
    ADD collar_id BIGINT;

update pet set collar_id = 1 where id = 1;
update pet set collar_id = 2 where id = 2;

ALTER TABLE pet
    ADD CONSTRAINT FK_PET_ON_COLLAR FOREIGN KEY (collar_id) REFERENCES collar (id);

ALTER TABLE collar
    DROP CONSTRAINT fk_collar_on_pet;

ALTER TABLE collar
    DROP COLUMN pet_id;