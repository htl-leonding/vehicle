-- PERSON
insert into x_person (p_id, p_dob, p_name)
values (nextval('hibernate_sequence'),'2000-01-02','John Doe');

-- VEHICLE
insert into x_vehicle (v_id, v_brand, v_model)
values (nextval('hibernate_sequence'),'VW','eGolf');
insert into x_vehicle (v_id, v_brand, v_model)
values (nextval('hibernate_sequence'),'Mercedes','C200');
insert into x_vehicle (v_id, v_brand, v_model)
values (nextval('hibernate_sequence'),'Hyundai','Tucson');
