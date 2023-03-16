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
