# Write your MySQL query statement below
SELECT u.unique_id,e.name
FROM employees e 
LEFT JOIN employeeuni u
on e.id=u.id;
