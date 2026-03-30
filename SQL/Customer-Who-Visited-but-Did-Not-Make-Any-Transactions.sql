1# Write your MySQL query statement below
2Select v.customer_id , count(v.visit_id) as count_no_trans
3from Visits v
4left join Transactions t
5on v.visit_id = t.visit_id
6where t.transaction_id is Null
7group by v.customer_id;