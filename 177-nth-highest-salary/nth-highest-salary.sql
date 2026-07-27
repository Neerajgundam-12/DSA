CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
        select salary from (select salary,DENSE_RANK() over (order by salary desc) as dr
         from Employee) as t where dr=N limit 1
  );
END