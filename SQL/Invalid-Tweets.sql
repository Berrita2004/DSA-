1# Write your MySQL query statement below
2Select tweet_id
3from Tweets
4where CHAR_LENGTH(content) > 15