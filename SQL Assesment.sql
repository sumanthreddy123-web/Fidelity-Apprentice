create table Worker(
worker_Id int primary key,
first_Name varchar(30),
last_Name varchar(30),
salary int,
joining_Date date,
department varchar(30)
);
 
create table Title(
worker_Ref_Id int,
worker_title varchar(30),
affected_from date,
foreign key(worker_Ref_Id) references Worker(worker_Id)
);
 
create table Bonus(
worker_Ref_Id int,
bonus_Amount int,
bonus_date date,
foreign key(worker_Ref_Id) references Worker(worker_Id) 
);

insert into Worker values(1, 'Monika', 'Arora', 100000, '2020-02-14', 'HR'), 
(2, 'Niharika', 'Verma', 80000, '2011-02-14', 'Admin'),
(3, 'Vishal', 'Singhal', 300000, '2020-02-14', 'HR'), 
(4, 'Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
(5, 'Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'), 
(6, 'Vipul', 'Diwan', 200000, '2011-06-14', 'Account');

 
 
insert into Bonus values(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(1, 4500, '2020-02-16'), 
(2, 3500, '2011-02-16');
 
 
insert into Title values(1, 'manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(4, 'Asst.manager', '2016-06-11'),
(6, 'Lead', '2016-06-11'), 
(3, 'Lead', '2016-06-11');

select w.first_Name, w.salary, t.worker_title 
from Worker w 
Join Title t on w.worker_Id = t.worker_Ref_Id;

CREATE OR REPLACE FUNCTION count_workers_with_nth_highest_salary(n INTEGER)
RETURNS INTEGER AS $$
DECLARE
    nth_highest_salary DECIMAL(10, 2);
    worker_count INTEGER;
BEGIN
    SELECT DISTINCT salary INTO nth_highest_salary
    FROM (
        SELECT salary, 
               DENSE_RANK() OVER (ORDER BY salary DESC) as salary_rank
        FROM Worker
    ) ranked_salaries
    WHERE salary_rank = n;

    SELECT COUNT(*) INTO worker_count
    FROM Worker
    WHERE salary = nth_highest_salary;
    RETURN worker_count;
END;
$$ LANGUAGE plpgsql;

SELECT count_workers_with_nth_highest_salary(1) AS workers_with_highest_salary;