# Write your MySQL query statement below
select max(e1.salary) as SecondHighestSalary from employee e1,employee e2
where e1.salary != (select max(e2.salary) from employee e2);