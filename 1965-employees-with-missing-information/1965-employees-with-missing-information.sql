# Write your MySQL query statement below
select r.employee_id
from (select * from Employees left join Salaries using(employee_id) union select * from Employees right join Salaries using(employee_id)) as r
where r.salary is null or r.name is null
order by r.employee_id