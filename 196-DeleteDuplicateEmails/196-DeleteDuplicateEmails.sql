-- Last updated: 8/11/2026, 4:14:30 PM
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.Email = p2.Email
AND p1.Id > p2.Id;