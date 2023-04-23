# Write your MySQL query statement below
select id , 
case 
      when p_id is null then 'Root'
      when id in (select a.id from Tree as a join Tree as b on a.id=b.p_id where a.p_id is not null)        then 'Inner'
      else 'Leaf'
end as type
  from Tree