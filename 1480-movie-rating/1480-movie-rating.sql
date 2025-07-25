# Write your MySQL query statement below
with rat as (
    select user_id,count(distinct(movie_id)) as cnt  from movierating 
    group by user_id 
), 
avg as(
    select movie_id , avg(rating) as av from movierating 
    where created_at between '2020-02-01' and '2020-02-29'
    group by movie_id
)

(select name as 'results' from rat a
left join users u on a.user_id = u.user_id 
where a.cnt = (select max(cnt) from rat)
order by cnt, name
limit 1)
union all
(select title as 'results' from avg a 
left join movies m on a.movie_id = m.movie_id
where a.av = (select max(av) from avg)
order by av ,title
limit 1);
