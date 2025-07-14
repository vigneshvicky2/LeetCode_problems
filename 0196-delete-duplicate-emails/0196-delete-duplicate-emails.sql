# Write your MySQL query statement below
delete e 
from Person e
join Person u on u.email = e.email and u.id < e.id;