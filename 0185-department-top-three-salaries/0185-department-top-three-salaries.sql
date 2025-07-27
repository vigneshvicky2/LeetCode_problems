# Write your MySQL query statement below
-- select () from department d;
with ans as (
select d.name as Department ,e.name as Employee , salary as Salary , dense_rank() over ( partition by departmentId order by salary desc ) as rnk   from employee e
join department d on d.id = e.departmentId
order by  departmentId
)
select Department , Employee , Salary from ans
where rnk<=3;
 
