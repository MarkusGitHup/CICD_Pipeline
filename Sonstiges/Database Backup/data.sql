CREATE DATABASE parcel_database;

USE parcel_database;

CREATE TABLE gurtmass (Paketgroesse VARCHAR(20), Min_Gurtmass INT, Max_Gurtmass INT);

INSERT INTO gurtmass (Paketgroesse, Min_Gurtmass, Max_Gurtmass) VALUES ('XS',0,35);

INSERT INTO gurtmass (Paketgroesse, Min_Gurtmass, Max_Gurtmass) VALUES ('S',35,50);

INSERT INTO gurtmass (Paketgroesse, Min_Gurtmass, Max_Gurtmass) VALUES ('M',50,65);

INSERT INTO gurtmass (Paketgroesse, Min_Gurtmass, Max_Gurtmass) VALUES ('L',65,80);

INSERT INTO gurtmass (Paketgroesse, Min_Gurtmass, Max_Gurtmass) VALUES ('XL',80,300);

