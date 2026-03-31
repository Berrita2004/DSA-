1# Write your MySQL query statement below
2select  s.student_id,s.student_name,u.subject_name,count(e.subject_name) as attended_exams
3from Students s
4cross join Subjects u
5left join Examinations e
6on s.student_id = e. student_id and u.subject_name = e.subject_name
7group by s.student_id, s.student_name, u.subject_name
8order by s.student_id, u.subject_name;