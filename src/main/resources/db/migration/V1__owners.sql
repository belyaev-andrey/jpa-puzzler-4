CREATE TABLE owner
(
    id   BIGINT NOT NULL,
    name VARCHAR(255),
    CONSTRAINT pk_owner PRIMARY KEY (id)
);

INSERT INTO owner (id, name)
VALUES (1, 'Jane');
INSERT INTO owner (id, name)
VALUES (2, 'John');