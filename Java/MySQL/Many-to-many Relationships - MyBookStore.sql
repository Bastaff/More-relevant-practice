--
-- Table structure for table `authors`
--

DROP TABLE IF EXISTS `authors`;
CREATE TABLE `authors` (
  `authorID` int DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `authors` WRITE;
INSERT INTO `authors` VALUES (1,'Tan Ah Teck','teck@nowhere.com'),(2,'Mohamed Ali','ali@somewhere.com'),(3,'Kumar','kumar@abc.com'),(4,'Kelvin Jones','kelvin@xzy.com');
UNLOCK TABLES;

DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `isbn` int DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `qty` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `books` WRITE;
INSERT INTO `books` VALUES (1001,'Java for Dummies',11.11,11),(1002,'Only Java',22.22,22),(1003,'Java ABC',33.33,33),(1004,'Java 123',44.44,44);
UNLOCK TABLES;

DROP TABLE IF EXISTS `books_authors`;
CREATE TABLE `books_authors` (
  `authorID` int DEFAULT NULL,
  `isbn` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `books_authors` WRITE;
INSERT INTO `books_authors` VALUES (1,1001),(2,1001),(3,1001),(1,1002),(3,1002),(2,1003),(2,1004);
UNLOCK TABLES;

-- Dump completed on 2020-04-02 22:44:40

-- EXERCISES
-- 1. Create a database called "mybookstore".
-- 2. Use "mybookstore" as the default database.
-- 3. Create 3 tables "books", "authors", and "books_authors" in the database "mybookstore", with column names and types as shown in the database diagram.
-- 4. Insert the respective records into the tables, and list the contents of each of the tables.
-- 5. List all the books (title, price, qty) by "Tan Ah Teck" with price less than 20.
-- 6. List all the authors (name and email) for the book title "Java for Dummies".
-- 7. List all the books (title, price, qty) and all the authors (name and email) for books with title beginning with "Java" (Hints: title LIKE 'Java%').

-- I accidentally closed the command prompt window and lost all my progress except for Exercise 6



SHOW databases;
+--------------------+
| Database           |
+--------------------+
| abctrading         |
| information_schema |
| mybookstore        |
| mysql              |
| performance_schema |
| studentdb          |
| sys                |
+--------------------+
7 rows in set (0.00 sec)

USE mybookstore;
Database changed
SELECT * FROM books;
+------+------------------+-------+------+
| isbn | title            | price | qty  |
+------+------------------+-------+------+
| 1001 | Java for Dummies | 11.11 |   11 |
| 1002 | Only Java        | 22.22 |   22 |
| 1003 | Java ABC         | 33.33 |   33 |
| 1004 | Java 123         | 44.44 |   44 |
+------+------------------+-------+------+
4 rows in set (0.00 sec)

SELECT * FROM authors;
+----------+--------------+-------------------+
| authorID | name         | email             |
+----------+--------------+-------------------+
|        1 | Tan Ah Teck  | teck@nowhere.com  |
|        2 | Mohamed Ali  | ali@somewhere.com |
|        3 | Kumar        | kumar@abc.com     |
|        4 | Kelvin Jones | kelvin@xzy.com    |
+----------+--------------+-------------------+
4 rows in set (0.00 sec)

SELECT * FROM books_authors;
+----------+------+
| authorID | isbn |
+----------+------+
|        1 | 1001 |
|        2 | 1001 |
|        3 | 1001 |
|        1 | 1002 |
|        3 | 1002 |
|        2 | 1003 |
|        2 | 1004 |
+----------+------+
7 rows in set (0.00 sec)


mysql> SELECT books.title, books.price, books.qty, authors.name, authors.email
    -> FROM books, books_authors, authors
    -> WHERE books.isbn = books_authors.isbn
    -> AND authors.authorID = books_authors.authorID
    -> AND books.title LIKE 'JAVA%';
+------------------+-------+------+-------------+-------------------+
| title            | price | qty  | name        | email             |
+------------------+-------+------+-------------+-------------------+
| Java for Dummies | 11.11 |   11 | Tan Ah Teck | teck@nowhere.com  |
| Java for Dummies | 11.11 |   11 | Mohamed Ali | ali@somewhere.com |
| Java ABC         | 33.33 |   33 | Mohamed Ali | ali@somewhere.com |
| Java 123         | 44.44 |   44 | Mohamed Ali | ali@somewhere.com |
| Java for Dummies | 11.11 |   11 | Kumar       | kumar@abc.com     |
+------------------+-------+------+-------------+-------------------+
5 rows in set (0.00 sec)
