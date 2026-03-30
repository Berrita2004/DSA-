1SELECT 
2    p.product_id,
3    ROUND(
4        IFNULL(SUM(u.units * p.price) / SUM(u.units), 0)
5    , 2) AS average_price
6FROM Prices p
7LEFT JOIN UnitsSold u
8    ON p.product_id = u.product_id
9   AND u.purchase_date BETWEEN p.start_date AND p.end_date
10GROUP BY p.product_id;
11