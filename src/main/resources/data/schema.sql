CREATE TABLE customer(
    id INTEGER PRIMARY KEY,
    first_name VARCHAR DEFAULT NULL,
    last_name VARCHAR DEFAULT NULL
);

CREATE TABLE product(
    id INTEGER PRIMARY KEY,
    name VARCHAR DEFAULT NULL,
    price VARCHAR DEFAULT NULL    
);

CREATE TABLE orders(
    id INTEGER PRIMARY KEY,
    customer_id INTEGER,
    product_id INTEGER,
    qty INTEGER
);

INSERT INTO customer(id, first_name, last_name) VALUES (1, 'Customer', 'One');
INSERT INTO customer(id, first_name, last_name) VALUES (2, 'Customer', 'Two');
INSERT INTO customer(id, first_name, last_name) VALUES (3, 'Customer', 'Three');

INSERT INTO product(id, name, price) VALUES (1, 'Product A', 1000);
INSERT INTO product(id, name, price) VALUES (2, 'Product B', 1100);
INSERT INTO product(id, name, price) VALUES (3, 'Product C', 1200);
INSERT INTO product(id, name, price) VALUES (4, 'Product D', 1300);
INSERT INTO product(id, name, price) VALUES (5, 'Product E', 1400);

