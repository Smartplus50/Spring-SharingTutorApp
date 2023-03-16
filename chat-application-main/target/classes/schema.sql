CREATE TABLE IF NOT EXISTS USERS (
  userid INT PRIMARY KEY auto_increment,
  username VARCHAR(20),
  salt VARCHAR,
  password VARCHAR,
  firstname VARCHAR(20),
  lastname VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS MESSAGES (
  messageid INT PRIMARY KEY auto_increment,
  username VARCHAR NOT NULL,
  messagetext VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS TUTORS (
  tutorid INT PRIMARY KEY auto_increment,
  tutorname VARCHAR(20),
  salt VARCHAR,
  tutorpassword VARCHAR,
  firstname VARCHAR(20),
  lastname VARCHAR(20)
);