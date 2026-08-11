-- Last updated: 8/11/2026, 4:06:43 PM
-- 1173. Immediate Food Delivery II
SELECT
    ROUND(
        100.0 * AVG(order_date = customer_pref_delivery_date),
        2
    ) AS immediate_percentage
FROM Delivery
WHERE (customer_id, order_date) IN (
    SELECT customer_id, MIN(order_date)
    FROM Delivery
    GROUP BY customer_id
);