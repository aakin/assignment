--Assignment Question 3.1
SELECT m.name, m.address, o.dues, o.location
FROM members m
JOIN organization o ON m.id = o.member_id;

--Assignment Question 3.2
SELECT *
FROM members
WHERE age > 45;

--Assignment Question 3.3
SELECT *
FROM members m
JOIN organization o ON m.id = o.member_id
WHERE o.dues = 0;