-- Last updated: 8/11/2026, 4:14:51 PM
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
WHERE e.salary > m.salary;