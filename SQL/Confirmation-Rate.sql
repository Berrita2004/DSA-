1# Write your MySQL query statement below
2select s.user_id, round (ifnull( sum(c.action='confirmed')/ count(c.action), 0),2) as confirmation_rate
3from Signups s
4left join Confirmations c
5on s.user_id = c.user_id
6group by s.user_id 
7
8