select setval('hibernate_sequence',1000);

-- PERSON
insert into x_person (p_id, p_dob, p_name)
values (1,'2000-01-02','John Doe');

-- VEHICLE
insert into x_vehicle (v_id, v_brand, v_model)
values (1,'VW','eGolf');
insert into x_vehicle (v_id, v_brand, v_model)
values (2,'Mercedes','C200');
insert into x_vehicle (v_id, v_brand, v_model)
values (3,'Hyundai','Tucson');

-- rentals
insert into x_rental (r_id, r_discount, r_end_date_time, r_start_date_time, r_p_id, r_v_id)
values (1, 0, '2023-03-17 17:16:00', '2023-03-16 10:56:00', 1, 1);
insert into x_rental (r_id, r_discount, r_end_date_time, r_start_date_time, r_p_id, r_v_id)
values (2, 10, '2023-04-17 17:16:00', '2023-04-16 10:56:00', 1, 2);
