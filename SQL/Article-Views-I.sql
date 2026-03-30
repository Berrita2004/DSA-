1# Write your MySQL query statement below
2Select distinct author_id AS id 
3from Views 
4where author_id = viewer_id 
5order by author_id Asc