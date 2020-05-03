
use rental_db;
Database changed


select * from rental_records;
+-----------+------------+-------------+------------+------------+-------------+
| rental_id | veh_reg_no | customer_id | start_date | end_date   | lastUpdated |
+-----------+------------+-------------+------------+------------+-------------+
|         1 | SBA1111A   |        1001 | 2012-01-01 | 2012-01-21 | NULL        |
|         2 | SBA1111A   |        1001 | 2012-02-01 | 2012-02-05 | NULL        |
|         3 | GA5555E    |        1003 | 2012-01-05 | 2012-01-31 | NULL        |
|         4 | GA6666F    |        1004 | 2012-01-20 | 2012-02-20 | NULL        |
|         5 | SBA1111A   |        1001 | 2020-04-04 | 2020-04-14 | NULL        |
|         6 | GA5555E    |        1003 | 2020-04-05 | 2020-07-05 | NULL        |
+-----------+------------+-------------+------------+------------+-------------+
6 rows in set (0.00 sec)

mysql> select * from customers;
+-------------+--------------+--------------------+----------+----------+
| customer_id | name         | address            | phone    | discount |
+-------------+--------------+--------------------+----------+----------+
|        1001 | Tan Ah Teck  | 8 Happy Ave        | 88888888 |      0.1 |
|        1002 | Mohammed Ali | 1 Kg Java          | 99999999 |     0.15 |
|        1003 | Kumar        | 5 Serangoon Road   | 55555555 |        0 |
|        1004 | Kevin Jones  | 2 Sunset boulevard | 22222222 |      0.2 |
+-------------+--------------+--------------------+----------+----------+
4 rows in set (0.01 sec)

mysql> select * from vehicles;

| veh_reg_no | category | brand               | desc                     | photo        | daily_rate
+------------+----------+---------------------+--------------------------+--------------+-----------
-+
| GA5555E    | truck    | NISSAN CABSTAR 3.0L | Lorry, Manual            | 0x           |      89.99
| GA6666F    | truck    | OPEL COMBO 1.6L     | Van, Manual              | 0x           |      69.99
| SBA1111A   | car      | NISSAN SUNNY 1.6L   | 4 Door Saloon, Automatic | 0x           |      99.99
| SBB2222B   | car      | TOYOTA ALTIS 1.6L   | 4 Door Saloon, Automatic | 0x           |      99.99
| SBC3333C   | car      | HONDA CIVIC 1.8L    | 4 Door Saloon, Automatic | 0x           |     119.99
+------------+----------+---------------------+--------------------------+--------------+-----------
-+
5 rows in set (0.01 sec)

/*
List the vehicles rented out on '2012-01-10' (not available for rental), 
in columns of vehicle registration no, customer name, start date and end date.

*/
mysql> SELECT r.veh_reg_no
    -> , c.name, r.start_date, r.end_date
    -> FROM rental_records AS r
    -> INNER JOIN customers AS c USING (customer_id)
    -> WHERE '2012-01-10' BETWEEN r.start_date AND r.end_date;
+------------+-------------+------------+------------+
| veh_reg_no | name        | start_date | end_date   |
+------------+-------------+------------+------------+
| SBA1111A   | Tan Ah Teck | 2012-01-01 | 2012-01-21 |
| GA5555E    | Kumar       | 2012-01-05 | 2012-01-31 |
+------------+-------------+------------+------------+
2 rows in set (0.00 sec)

/*
List all vehicles rented out today, in columns registration number, customer name, start date, end date.
*/

mysql> SELECT r.veh_reg_no, c.name, r.start_date, r.end_date
    -> FROM rental_records as r
    -> INNER JOIN customers AS c USING (customer_id)
    -> WHERE r.start_date = (CURDATE() - INTERVAL 1 DAY);
+------------+-------------+------------+------------+
| veh_reg_no | name        | start_date | end_date   |
+------------+-------------+------------+------------+
| SBA1111A   | Tan Ah Teck | 2020-04-04 | 2020-04-14 |
+------------+-------------+------------+------------+
1 row in set (0.00 sec)

/*
Similarly, list the vehicles rented out (not available for rental) 
for the period from '2012-01-03' to '2012-01-18'.
*/

mysql> SELECT r.veh_reg_no
    -> ,r.start_date, r.end_date
    -> FROM rental_records as r
    -> WHERE r.start_date BETWEEN'2012-01-03' AND '2012-01-18';
+------------+------------+------------+
| veh_reg_no | start_date | end_date   |
+------------+------------+------------+
| GA5555E    | 2012-01-05 | 2012-01-31 |
+------------+------------+------------+
1 row in set (0.00 sec)



mysql> SELECT r.veh_reg_no
    -> ,r.start_date, r.end_date
    -> FROM rental_records as r
    -> WHERE (r.start_date >='2012-01-01') AND (r.end_date <= '2012-02-20');
+------------+------------+------------+
| veh_reg_no | start_date | end_date   |
+------------+------------+------------+
| SBA1111A   | 2012-01-01 | 2012-01-21 |
| SBA1111A   | 2012-02-01 | 2012-02-05 |
| GA5555E    | 2012-01-05 | 2012-01-31 |
| GA6666F    | 2012-01-20 | 2012-02-20 |
+------------+------------+------------+
4 rows in set (0.00 sec)



mysql> SELECT r.veh_reg_no
    -> ,r.start_date, r.end_date
    -> FROM rental_records as r
    -> WHERE '2012-01-10' NOT BETWEEN r.start_date AND r.end_date;
+------------+------------+------------+
| veh_reg_no | start_date | end_date   |
+------------+------------+------------+
| SBA1111A   | 2012-02-01 | 2012-02-05 |
| GA6666F    | 2012-01-20 | 2012-02-20 |
| SBA1111A   | 2020-04-04 | 2020-04-14 |
| GA5555E    | 2020-04-05 | 2020-07-05 |
+------------+------------+------------+
4 rows in set (0.00 sec)

