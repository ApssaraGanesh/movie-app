# movie-app db script
create database app;
use app;
show tables;


CREATE TABLE showtime (
    ShowtimeID int NOT NULL,
    MovieID int,
    TheaterID int,
    Date date,
    Time time,
    PRIMARY KEY (ShowtimeID)
    
);

CREATE TABLE movie(
movieID int NOT NULL,
title varchar(250),
duration timestamp,
releaseDate date,
language varchar(20),
genre varchar(20),
PRIMARY KEY(movieID)
);
desc movie;
desc theatre;
desc showtime;
DROP TABLE showtime;
ALTER TABLE showtime DROP COLUMN TheaterID;

ALTER TABLE showtime ADD FOREIGN KEY (MovieID) REFERENCES movie(movieID);
ALTER TABLE showtime ADD FOREIGN KEY (TheaterID) REFERENCES theatre(theatreID);
ALTER TABLE showtime DROP FOREIGN KEY TheaterID;
SHOW CREATE TABLE showtime;

SELECT
    CONSTRAINT_NAME
FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE REFERENCED_TABLE_NAME = 'shoetime';

CREATE TABLE theatre(
theatreID int not null,
theatreName varchar(50),
location varchar(50),
capacity int,
PRIMARY KEY(theatreID)
);

ALTER TABLE showtime ADD COLUMN city varchar(50);


insert into movie values(1,'The Shawshank Redemption' , '2023-03-20 02:22:00','1994-10-14','English','Drama');
insert into movie values(2,'The Godfather',	'2023-03-20 02:00:00','1972-03-24','English','Crime');
insert into movie values(3	,'The Dark Knight','2023-03-20 03:30:00','2008-07-18','English','Action');
insert into movie values(4	,'Pulp Fiction','2023-03-20 02:15:00','1994-10-14','English','Crime');
insert into movie values(5	,'Schindlers List',	'2023-03-20 02:22:00','1994-02-04','English','Drama');
insert into movie values(6	,'Fight Club',	'2023-03-20 01:22:00','1999-10-15','English','Drama');
insert into movie values(7	,'Forrest Gump'	,'2023-03-20 03:30:00','1994-07-06','English','Drama');
insert into movie values(8,	'Inception'	,'2023-03-20 01:45:00',	'2010-07-16','English','Action');
insert into movie values(9	,'The Matrix',	'2023-03-20 02:30:00','1999-03-31','English','Action');
insert into movie values(10	,'Titanic','2023-03-20 03:00:00','1997-12-19','English','Drama');

select * from movie;
ALTER TABLE showtime ADD COLUMN city varchar(50);
select * from  showtime;
insert into showtime values(1,1,1,'2024-02-26','15:00','New York');
insert into showtime values(2,1,2,'2024-02-26','17:30','Los Angeles');
insert into showtime values(3,2,3,'2024-02-26','16:45','Chicago');
insert into showtime values(4,3,2,'2024-02-26','20:00','New York');
insert into showtime values(5,2	,1,'2024-02-26'	,'19:15','New York');
insert into showtime values(6,1,3,'2024-02-27','14:00','Los Angeles');
insert into showtime values(7,3,1,'2024-02-27','17:30','Chicago');
insert into showtime values(8,2,2,'2024-02-27','16:45','Los Angeles');
insert into showtime values(9,1,2,'2024-02-27','20:00','New York');
insert into showtime values(10,3,3,'2024-02-27','19:15','Chicago');
INSERT INTO `app`.`showtime` (`ShowtimeID`, `MovieID`, `TheaterID`, `Date`, `Time`, `city`) VALUES ('11', '1', '2', '2024-02-26', '18:30:00', 'Los Angeles');
INSERT INTO `app`.`showtime` (`ShowtimeID`, `MovieID`, `TheaterID`, `Date`, `Time`, `city`) VALUES ('12', '1', '2', '2024-02-26', '19:35:00', 'Los Angeles');

select * from movie;
ALTER TABLE movie RENAME COLUMN MovieId TO movieId;
select * from showtime;

 select MovieID  from movie where title = 'The Shawshank Redemption';
 
  select showtimeID,MovieID,TheaterID,time,city from showtime where movieId = 1 and city = 'Los Angeles'and date = '2024-02-26';

desc showtime;





