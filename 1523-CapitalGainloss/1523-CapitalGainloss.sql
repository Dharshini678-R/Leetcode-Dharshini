-- Last updated: 8/11/2026, 4:05:49 PM
-- 1393. Capital Gain/Loss
SELECT
    stock_name,
    SUM(
        CASE
            WHEN operation = 'Sell' THEN price
            ELSE -price
        END
    ) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;
