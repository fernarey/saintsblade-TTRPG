DROP TABLE IF EXISTS test_table;
CREATE TABLE test_table (
  sometext VARCHAR(255)
);

INSERT INTO test_table(sometext) 
values ('abc');

SELECT sometext
from test_table;

INSERT INTO test_table(sometext) 
values ('def');

INSERT INTO test_table (sometext)
VALUES ('ghi');