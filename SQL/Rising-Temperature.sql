1# Write your MySQL query statement below
2select W1.id 
3from Weather W1
4join Weather W2
5on datediff(W1.recordDate , W2.recordDate) = 1
6where W1.temperature > W2.temperature;