-- Last updated: 8/11/2026, 4:11:09 PM
# Write your MySQL query statement below
SELECT e.name
FROM Employee e
JOIN Employee m
ON e.id = m.managerId
GROUP BY e.id, e.name
HAVING COUNT(m.id) >= 5;