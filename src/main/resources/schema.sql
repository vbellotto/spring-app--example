DROP TABLE IF EXISTS item;

CREATE TABLE item (
  id INT AUTO_INCREMENT,
  name VARCHAR(250) NOT NULL PRIMARY KEY ,
  description VARCHAR(250) NOT NULL,
  creator VARCHAR(250) NOT NULL,
  version VARCHAR(250) NOT NULL
);