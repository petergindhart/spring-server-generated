--schema
DROP TABLE IF EXISTS EmployeeTopic;
DROP TABLE IF EXISTS Topic;
DROP TABLE IF EXISTS Pet;
DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
    Id int AUTO_INCREMENT PRIMARY KEY,
    ManagerId int,
    Name varchar(200) NOT NULL,
    HireDate datetime,
    AgeAtHire int,
    IsEskimo boolean,
    FOREIGN KEY(ManagerId) REFERENCES Employee(Id)
);

CREATE TABLE Pet (
    Id int AUTO_INCREMENT PRIMARY KEY,
    Name varchar(200) NOT NULL,
    OwnerId int NOT NULL,
    FOREIGN KEY(OwnerId) REFERENCES Employee(Id)
);

CREATE TABLE Topic (
    Id int AUTO_INCREMENT PRIMARY KEY,
    Name varchar(200) NOT NULL
);

CREATE TABLE EmployeeTopic (
    EmployeeId int,
    TopicId int,
    PRIMARY KEY(EmployeeId, TopicId),
    FOREIGN KEY(EmployeeId) REFERENCES Employee(Id) ON DELETE CASCADE,
    FOREIGN KEY(TopicId) REFERENCES Topic(Id) ON DELETE CASCADE
);

--seed data
INSERT INTO Employee (Id, ManagerId, Name, HireDate, AgeAtHire, IsEskimo) VALUES
(1, NULL, 'Alpha', DATE'2010-01-01', 40, FALSE),
(2, 1, 'Bravo', DATE'2011-01-01', 25, FALSE),
(3, 1, 'Charlie', DATE'2012-01-01', 24, FALSE),
(4, 3, 'Delta', DATE'2013-01-01', 23, FALSE),
(5, 3, 'Echoloco', DATE'2014-01-01', 22, TRUE);

--INSERT INTO Employee (Name, HireDate, AgeAtHire, IsEskimo) VALUES
--('Alpha', DATE'2010-01-01', 40, FALSE),
--('Bravo', DATE'2011-01-01', 25, FALSE),
--('Charlie', DATE'2012-01-01', 24, FALSE),
--('Delta', DATE'2013-01-01', 23, FALSE),
--('Echoloco', DATE'2014-01-01', 22, TRUE);
--
--update Employee a set ManagerId = (select Id from Employee b where b.Name = 'Alpha') where Name in ('Bravo', 'Charlie');
--update Employee a set ManagerId = (select Id from Employee b where b.Name = 'Charlie') where Name in ('Delta', 'Echoloco');

INSERT INTO Pet (Id, OwnerId, Name) VALUES
(1, 1, 'Rex'),
(2, 2, 'Petey'),
(3, 3, 'Duke'),
(4, 3, 'Poly');

INSERT INTO Topic (Id, Name) VALUES
(1, 'Java'),
(2, 'React'),
(3, 'Go'),
(4, 'Accounting');

INSERT INTO EmployeeTopic (TopicId, EmployeeId) VALUES
(1, 2),
(2, 5),
(2, 4),
(4, 1);