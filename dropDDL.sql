ALTER TABLE ACCOUNT DROP CONSTRAINT UNQ_ACCOUNT_0
DROP TABLE FRIEND
DROP TABLE ACCOUNT
DELETE FROM SEQUENCE WHERE SEQ_NAME = 'SEQ_GEN'
