--##############################################################################
--# schema
--##############################################################################
--DROP TABLE IF EXISTS EmployeeTopic;
--
--CREATE TABLE EmployeeTopic (
--    EmployeeId int,
--    TopicId int,
--    PRIMARY KEY(EmployeeId, TopicId),
--    FOREIGN KEY(EmployeeId) REFERENCES Employee(Id) ON DELETE CASCADE,
--    FOREIGN KEY(TopicId) REFERENCES Topic(Id) ON DELETE CASCADE
--);

--##############################################################################
--# seed data
--##############################################################################
INSERT INTO EMPLOYEE (ID, MANAGER_ID, NAME, AGE_AT_HIRE, IS_ESKIMO) VALUES
(1, NULL, 'Alpha', 40, FALSE),
(2, 1, 'Bravo', 25, FALSE),
(3, 1, 'Charlie', 24, FALSE),
(4, 3, 'Delta', 23, FALSE),
(5, 3, 'Echoloco', 22, TRUE);

INSERT INTO PET (ID, OWNER, NAME) VALUES
(1, 1, 'Rex'),
(2, 2, 'Petey'),
(3, 3, 'Duke'),
(4, 3, 'Poly');

INSERT INTO Topic (ID, NAME) VALUES
(1, 'Java'),
(2, 'React'),
(3, 'Go'),
(4, 'Accounting');
