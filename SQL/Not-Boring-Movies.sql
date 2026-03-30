1# Write your MySQL query statement below
2SELECT id, movie , description , rating 
3from Cinema 
4where id%2 = 1 AND  description != 'boring'
5order by rating DESC