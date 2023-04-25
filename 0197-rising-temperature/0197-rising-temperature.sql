# Write your MySQL query statement below
select distinct a.id 
from Weather as a , Weather as b 
where a.temperature >b.temperature and DATEDIFF(a.recordDate,b.recordDate)=1