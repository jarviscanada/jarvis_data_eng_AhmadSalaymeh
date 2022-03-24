SELECT cpu_number,id as host_id,total_mem FROM host_info
GROUP BY 1, 2, 3
ORDER BY 1,3 DESC;

SELECT hu.host_id, hi.hostname,
       round5(hu.timestamp) as round5,
       avg(avg_mem_perecentage(hi.total_mem,hu.memory_free) )as mem
FROM host_info  hi
         FULL JOIN host_usage hu on hi.id = hu.host_id
WHERE hi.id = hu.host_id
GROUP BY 1,2,3
ORDER BY 1;


SELECT hu.host_id,round5(hu.timestamp) as ts, COUNT(*) as num_data_points
FROM host_usage as hu
GROUP BY 1,2
HAVING COUNT(*) < 3
order by 3 ;


---FUNCTIONS----
-- SELECT date_trunc('hour', timestamp) + date_part('minute', timestamp):: int / 5 * interval '5 min'
-- FROM host_usage;

-- CREATE FUNCTION round5(ts timestamp) RETURNS timestamp AS
-- $$
-- BEGIN
--     RETURN date_trunc('hour', ts) + date_part('minute', ts):: int / 5 * interval '5 min';
-- END;
-- $$
--     LANGUAGE PLPGSQL;
--
-- SELECT host_id, timestamp, round5(timestamp)
-- FROM host_usage;

-- CREATE FUNCTION avg_mem_perecentage(total_mem int, memory_free int) RETURNS INT
--     AS
--     $$
--        BEGIN
--             return (round(((total_mem / 1000) - memory_free),2)/(total_mem/1000)) * 100;
--
--        END;
--     $$
--     LANGUAGE PLPGSQL;
--
--


