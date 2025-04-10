SELECT UNIQUE_ID , NAME FROM
Employees LEFT JOIN EmployeeUNI ON Employees.ID = EmployeeUNI.ID;