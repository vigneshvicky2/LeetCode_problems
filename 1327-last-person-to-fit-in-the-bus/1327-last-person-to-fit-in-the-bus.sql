select person_name from (SELECT person_id as p_id , person_name as person_name , turn as turn , weight as weight, SUM(weight) OVER (ORDER BY turn) AS cumulative_weight
FROM queue) as t
where t.cumulative_weight<=1000
order by t.turn desc
limit 1;