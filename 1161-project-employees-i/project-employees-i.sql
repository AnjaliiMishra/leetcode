# Write your MySQL query statement below
SELECT p.project_id,round(sum(e.experience_years)/COUNT(p.project_id),2) AS average_years
FROM project p
LEFT JOIN employee e
ON p.employee_id=e.employee_id
GROUP BY p.project_id;