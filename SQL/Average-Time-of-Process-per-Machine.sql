1# Write your MySQL query statement below
2select a.machine_id , 
3round(avg(b.timestamp - a.timestamp),3) as processing_time
4from Activity a
5join Activity b
6on a.machine_id = b.machine_id
7and a.process_id = b.process_id
8and a.activity_type = 'start'
9and b.activity_type = 'end'
10group by machine_id;