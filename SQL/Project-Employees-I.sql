1# Write your MySQL query statement below
2SELECT p.project_id , 
3Round(AVG(e.experience_years), 2) as average_years
4FROM Project p 
5JOIN Employee e
6on  p.employee_id = e.employee_id
7Group by p.project_id;