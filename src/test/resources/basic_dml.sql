insert into `user`(finger_print)
values ('12312839128');

insert into `owner`(`name`, email, phone_number, business_number, `id`, `password`)
values ('박성수', 'pfpf@gmail.com', '1023010310', '2138213', 'zilzu', 'idjsioadj');

insert into `store`(store_name, location, tel, open_time, close_time, owner_id)
values ('엄지칼국수', '수영구 망미번영로52번길 115', '01083662113', '10:30', '20:30', '1');

insert into menu(TYPE,NAME,price,image_url )
values ('noodle','칼국수', 8000 ,'www.naver.com');

insert into "ORDER"(total_price,take_out, payment_method, user_id, store_id)
values(7000,'Y','CARD',1,1);

insert into order_menu(quantity, price, order_id, menu_id)
values(1,100,1,1);
