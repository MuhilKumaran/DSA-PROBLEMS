# Write your MySQL query statement below
select customer_number from orders
Group by customer_number
order by count(*) desc limit 1 