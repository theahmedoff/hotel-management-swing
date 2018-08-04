use hotel;
select * from room;

ALTER TABLE booking ADD constraint fk_booking_customer FOREIGN KEY (booking_customer_id) REFERENCES customer(id);
ALTER TABLE booking ADD constraint fk_booking_room FOREIGN KEY (booking_room_id) REFERENCES room(id);

insert into room(property, room_type, room_view, adult_no, child_no, room_number, status) values('VIP', 'Double', 'Deniz', 2, 1, 100, 0);
insert into room(property, room_type, room_view, adult_no, child_no, room_number, status) values('Delux', 'Double', 'Deniz', 3, 1, 101, 1);

insert into admin(last_name, first_name, username, password, last_login_date) values('Aslan', 'Ahmedov', 'akmedoff', '121212', null);

insert into hotel.worker(name, surname, email, gender, phone, salary, address, date_of_birth, username, password) 
values('Sevinc', 'Agazade', 'seva_agazade@gmail.com', 'Female', '(055)777-75-51', '850 AZN', 'Baki', '1995-05-29', 'seva', '123456');

SELECT * FROM hotel.worker;

insert into hotel.booking(check_in, room_id, customer_id) values('2018-07-20',  1, 1);

update hotel.worker set surname = 'Agalarov' where id = 1;

delete from hotel.worker where id = 2;

select b.id as BID, b.check_in, b.check_out, r.id 
as RID, r.property, r.room_type, r.room_view, r.adult_no, r.child_no, r.room_number, r.status, c.id 
as CID, c.name, c.surname, c.date_of_birth, c.gender, c.address, c.number, c.email, c.nationality
from booking b inner join room r on b.room_id = r.id inner join customer c on b.customer_id = c.id;

select * from booking;


select * from admin;

select * from admin where username = 'akmedoff' and password = '121212';