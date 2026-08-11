-- Last updated: 8/11/2026, 4:14:54 PM
SELECT DISTINCT l1.Num AS ConsecutiveNums
FROM Logs l1
JOIN Logs l2
ON l1.Id = l2.Id - 1
JOIN Logs l3
ON l2.Id = l3.Id - 1
WHERE l1.Num = l2.Num
AND l2.Num = l3.Num;