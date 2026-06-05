CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
        SELECT salary
      FROM Employee e1
      WHERE N - 1 =
      (
          SELECT COUNT(DISTINCT e2.salary)
          FROM Employee e2
          WHERE e1.salary < e2.salary
      )
      LIMIT 1
  );
END