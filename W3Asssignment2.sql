CREATE TABLE Customers (
    customer_id VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(50),
    address VARCHAR(100),
    phone_number VARCHAR(15),
    email VARCHAR(50)
);

CREATE TABLE Hotel_details (
    hotel_id INT PRIMARY KEY,
    hotel_name VARCHAR(50),
    hotel_type VARCHAR(20),
    rating DECIMAL(3,1)
);

CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    customer_id VARCHAR(10),
    hotel_id INT,
    order_date DATE,
    order_amount DECIMAL(10,2),
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id),
    FOREIGN KEY (hotel_id) REFERENCES Hotel_details(hotel_id)
);

CREATE TABLE Delivery_partners (
    partner_id INT PRIMARY KEY,
    partner_name VARCHAR(50),
    phone_number VARCHAR(15),
    rating DECIMAL(3,1)
);
INSERT INTO Customers VALUES
('CST1001', 'Jackson', '123 Main St', '1234567890', 'Jackson@gmail.com'),
('CST1002', 'James', '456 Elm St', '2345678901', 'James@yahoo.com'),
('CST1003', 'Jenny', '789 Oak St', '3456789012', 'Jenny@gmail.com'),
('CST1004', 'Jashmitha', '321 Pine St', '4567890123', 'Jashmitha@hotmail.com');

INSERT INTO Delivery_partners VALUES
(101, 'kaiser', '5678901234', 4.7),
(102, 'sudharshan', '6789012345', 4.2),
(103, 'kiran', '7890123456', 3.9),
(104, 'sagar', '8901234567', 4.5);

INSERT INTO Hotel_details VALUES
(5, 'A2B', 'VEG', 4.5),
(6, 'Pizza Hut', 'NON-VEG', 4.2),
(7, 'Dominos', 'NON-VEG', 4.0),
(8, 'KFC', 'NON-VEG', 3.8);

INSERT INTO Orders VALUES
(101, 'CST1001', 1, '2019-05-10', 500.00),
(102, 'CST1002', 2, '2019-05-11', 750.00),
(103, 'CST1003', 3, '2019-05-12', 600.00),
(104, 'CST1004', 4, '2019-06-01', 800.00),
(5, 'CST1001', 2, '2019-06-02', 700.00),
(6, 'CST1002', 3, '2019-06-03', 550.00),
(7, 'CST1003', 1, '2019-06-04', 450.00);

--Delivery Partner details based on rating--
SELECT partner_id, partner_name, phone_number
FROM Delivery_partners
WHERE rating BETWEEN 3 AND 5
ORDER BY partner_id;

--Hunger eats - update table--
UPDATE Customers
SET phone_number = '9876543278'
WHERE customer_id = 'CST1004';

--Customers having gmail id--
SELECT customer_id, customer_name, address, phone_number
FROM Customers
WHERE email LIKE '%@gmail.com'
ORDER BY customer_id;

--Hunger eats - change datatype--
ALTER TABLE Customers
ALTER COLUMN customer_id TYPE INT USING customer_id::integer;

--Hunger eats - Change the field name--
ALTER TABLE Hotel_Details
RENAME COLUMN Rating TO Hotel_Rating;

--Hotel_info--
SELECT CONCAT(hotel_name, ' is a ', hotel_type, ' hotel') AS HOTEL_INFO
FROM Hotel_details
ORDER BY HOTEL_INFO DESC;

--Hotels that took order more than five times--
SELECT h.hotel_id, h.hotel_name, COUNT(*) AS NO_OF_ORDERS
FROM Hotel_details h
JOIN Orders o ON h.hotel_id = o.hotel_id
GROUP BY h.hotel_id, h.hotel_name
HAVING COUNT(*) > 5
ORDER BY h.hotel_id ASC;

--. Hotels not taken orders in a specific month--
SELECT DISTINCT h.hotel_id, h.hotel_name, h.hotel_type
FROM Hotel_details h
LEFT JOIN Orders o ON h.hotel_id = o.hotel_id AND TO_CHAR(o.order_date, 'YYYY-MM') = '2019-05'
WHERE o.order_id IS NULL
ORDER BY h.hotel_id ASC;

--Order details--
CREATE TABLE PIZZA (
    pizza_id INT PRIMARY KEY,
    pizza_type VARCHAR(20),
    amount DECIMAL(10,2)
);

--.Pizza Store - Update PIZZA table 1.2--
UPDATE PIZZA
SET amount = amount * 0.97
WHERE pizza_type = 'Extra Large';

--
CREATE TABLE IF NOT EXISTS salesman (
    salesman_id INT PRIMARY KEY,
    name VARCHAR(50)
);

--Create table with Foreign Key constraint--
CREATE TABLE IF NOT EXISTS new_orders (
    order_id INT PRIMARY KEY,
    order_date DATE,
    amount DECIMAL(10, 2),
    salesman_id INT,
    FOREIGN KEY (salesman_id) REFERENCES salesman(salesman_id)
);

--Alter Supplier table with Check Constraint--
CREATE TABLE IF NOT EXISTS Supplier (
    supplier_id INT PRIMARY KEY,
    supplier_name VARCHAR(50)
);

ALTER TABLE Supplier
ADD CONSTRAINT check_supplier_name CHECK (LENGTH(supplier_name) > 0);

SELECT * FROM Supplier;








