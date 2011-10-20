CREATE TABLE FRIEND (NAME VARCHAR(255) NOT NULL, AGE INTEGER, PRIMARY KEY (NAME))
CREATE TABLE ACCOUNT (ID BIGINT NOT NULL, ACTIVE BOOLEAN NOT NULL, PASSWORD VARCHAR(255) NOT NULL, USERNAME VARCHAR(255) NOT NULL, PRIMARY KEY (ID))
ALTER TABLE ACCOUNT ADD CONSTRAINT UNQ_ACCOUNT_0 UNIQUE (username)
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)