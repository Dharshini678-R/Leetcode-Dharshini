-- Last updated: 8/11/2026, 4:14:46 PM
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;