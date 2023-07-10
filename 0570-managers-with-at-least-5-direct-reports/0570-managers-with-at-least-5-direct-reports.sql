# Write your MySQL query statement below
select b.name
from Employee as a join Employee as b on a.managerId=b.id 
group by a.managerId
having count(*) >=5