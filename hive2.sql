use training;

insert overwrite directory '/user/cloudera/hive-result3' row format delimited fields terminated by ','
select stock_id, sum(volume) from nyse group by stock_id;



