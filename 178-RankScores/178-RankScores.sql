-- Last updated: 8/11/2026, 4:14:59 PM
SELECT
    Score,
    DENSE_RANK() OVER (ORDER BY Score DESC) AS "Rank"
FROM Scores;