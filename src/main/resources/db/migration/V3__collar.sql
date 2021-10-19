CREATE TABLE collar
(
    id          BIGINT NOT NULL,
    description VARCHAR(255),
    pet_id      BIGINT,
    CONSTRAINT pk_collar PRIMARY KEY (id)
);

ALTER TABLE collar
    ADD CONSTRAINT FK_COLLAR_ON_PET FOREIGN KEY (pet_id) REFERENCES pet (id);

INSERT INTO collar (id, description, pet_id)
VALUES (1, 'Fido''s collar', 1);

INSERT INTO collar (id, description, pet_id)
VALUES (2, 'Mimi''s collar', 2);