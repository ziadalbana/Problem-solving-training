# Write your MySQL query statement below
select sell_date,count(DISTINCT  product) as num_sold,GROUP_CONCAT(DISTINCT product order by product ) as products
from Activities
group by sell_date;