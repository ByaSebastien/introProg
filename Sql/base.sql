use introprog2021c;/* Dire qu'on travaille sur la DB introprog2021c */

create table formations(for_code integer primary key auto_increment,
for_nom varchar(50) not null,
for_annee year(4) not null check(for_annee>2000),
unique(for_nom,for_annee));
insert into formations (for_code,for_nom,for_annee) values (default,'intro prog',2021);
insert into formations values (default,'intro prog',2020);
insert into formations (for_nom,for_annee) values ('intro prog',2022);
insert into formations values (default,'java',2020);
insert into formations values (default,'java',2021);
update formations set for_nom='web dev',for_annee=2022 where for_code=6;
delete from formations where for_code=6;

create table stagiaires(sta_code integer primary key auto_increment,
sta_nom varchar(30) not null check(trim(sta_nom)<>''),
sta_prenom varchar(30) not null check(trim(sta_prenom)<>''),
sta_ddn date,
sta_fk_formations integer null,
index(sta_fk_formations),
foreign key(sta_fk_formations) references formations(for_code));
insert into stagiaires values(default,'stanou','kevinou','1999-05-12',1);
select * from formations;
select * from stagiaires where sta_fk_formations is null;
select * from stagiaires, formations where sta_fk_formations=for_code;
