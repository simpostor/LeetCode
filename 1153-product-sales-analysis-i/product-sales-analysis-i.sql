# Write your MySQL query statement below
SELECT  PRICE, YEAR, PRODUCT_NAME FROM
SALES LEFT JOIN PRODUCT ON SALES.PRODUCT_ID = PRODUCT.PRODUCT_ID;