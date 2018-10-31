CREATE TABLE CUSTOMER(
	ACCOUNT_NUMBER INT AUTO_INCREMENT,
	GAS_ID VARCHAR(255),
	ELEC_ID VARCHAR(255),
	ELEC_SMART_READ VARCHAR(255),
	GAS_SMART_READ VARCHAR(255)
);

Insert into customer(ACCOUNT_NUMBER, GAS_ID, ELEC_ID, ELEC_SMART_READ, GAS_SMART_READ) values (1, 'G869', 'E869', '2345', '123');
Insert into customer(ACCOUNT_NUMBER, GAS_ID, ELEC_ID, ELEC_SMART_READ, GAS_SMART_READ) values (2, 'G870', 'E870', '2346', '124');
Insert into customer(ACCOUNT_NUMBER, GAS_ID, ELEC_ID, ELEC_SMART_READ, GAS_SMART_READ) values (3, 'G871', 'E871', '2347', '125');
Insert into customer(ACCOUNT_NUMBER, GAS_ID, ELEC_ID, ELEC_SMART_READ, GAS_SMART_READ) values (4, 'G872', 'E872', '2348', '126');