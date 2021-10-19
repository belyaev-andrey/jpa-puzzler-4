CREATE TABLE pet
(
    id       BIGINT NOT NULL,
    name     VARCHAR(255),
    owner_id BIGINT,
    CONSTRAINT pk_pet PRIMARY KEY (id)
);

ALTER TABLE pet
    ADD CONSTRAINT FK_PET_ON_OWNER FOREIGN KEY (owner_id) REFERENCES owner (id);


INSERT INTO pet (id, name, owner_id)
VALUES (1, 'Fido', 1);

INSERT INTO pet (id, name, owner_id)
VALUES (2, 'Mimi', 2);