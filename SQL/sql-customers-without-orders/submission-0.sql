-- Write your query below
Select c.name
from customers c
left join orders o
on c.id = o.id
where c.id not in (select customer_id from orders);
