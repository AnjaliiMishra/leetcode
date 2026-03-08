# Write your MySQL query statement below
SELECT c.contest_id,ROUND(COUNT(DISTINCT c.user_id)*100/( SELECT COUNT(*)FROM users),2) AS percentage
FROM register c
LEFT JOIN users u
ON c.user_id=u.user_id
GROUP BY c.contest_id
ORDER BY percentage DESC,c.contest_id ASC;