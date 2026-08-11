-- Last updated: 8/11/2026, 4:05:30 PM

SELECT
    u.name,
    SUM(t.amount) AS balance
FROM Users u
JOIN Transactions t
    ON u.account = t.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;
