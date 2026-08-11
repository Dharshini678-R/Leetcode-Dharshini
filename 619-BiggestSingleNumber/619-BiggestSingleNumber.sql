-- Last updated: 8/11/2026, 4:10:17 PM
SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS SingleNumbers;
