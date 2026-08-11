-- Last updated: 8/11/2026, 4:05:51 PM

SELECT
    eu.unique_id,
    e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
    ON e.id = eu.id;
