use magasin;

create table fournisseurs(four_num char(5) primary key, four_nom varchar(25) not null unique,four_adresse varchar(50),four_cp smallint check (four_cp>0),four_date date check (four_date<=sysdate()));
INSERT INTO fournisseurs VALUES('F0001','Dubois SA', 'rue du puits perdu, 58', 4020, '1950/01/01');
INSERT INTO fournisseurs VALUES('F0002','les libraires réunis', 'avenue de la boule, 54', 1000, '1978/08/15');
INSERT INTO fournisseurs VALUES('F0003','IMPRIMAT', 'rue du pont, 45', 4400, '1995/09/02');
INSERT INTO fournisseurs VALUES('F0004','Mac Gregor', 'rue haute, 54', 1000, '1987/08/01');
INSERT INTO fournisseurs VALUES('F0005','Bureautique 2000', 'rue du bassin, 254', 4000, '1996/01/01');
create table articles (art_num char(8) primary key,art_nom varchar(30) not null,art_coul varchar(20),art_stock integer,art_seuil integer,art_pa integer not null,art_four char(5) references fournisseurs, index(art_four));
INSERT INTO articles VALUES('A01','agrafeuse','ROUGE',10,2,229,'F0004');
INSERT INTO articles VALUES('A02','calculatrice','NOIR',5,20,635,'F0001');
INSERT INTO articles VALUES('A03','perforatrice','BLANC',3,2,230,'F0004');
INSERT INTO articles VALUES('A04','lampe de bureau', 'ROUGE',3,10,349,'F0005');
INSERT INTO articles VALUES('A05','Stylo','BLANC',30,20,39,'F0005');
INSERT INTO articles VALUES('A06','STYLO','BLEU',30,10,49,'F0005');
INSERT INTO articles VALUES('A07','3 stylos','VERT',19,10,99,'F0005');
INSERT INTO articles VALUES('A08','bloc de feuilles quadrillées', default,7,12,70,'F0003');
INSERT INTO articles VALUES('A09','bloc de feuilles lignées',default,11,11,85,'F0003');
INSERT INTO articles VALUES('A10','classeur 10 cm','GRIS',21,30,50,'F0002');
INSERT INTO articles VALUES('A11','classeur 5 cm','Noir',19,30,50,'F0002');
INSERT INTO articles VALUES('A12','crayon','ROUGE',95,10,35,'F0002');
INSERT INTO articles VALUES('A13','marqueur','VERT',90,10,35,'F0002');
INSERT INTO articles VALUES('A14','marqueur','BLEU',80,10,35,'F0002');
INSERT INTO articles VALUES('A15','crayon','NOIR',45,10,35,'F0002');
select * from fournisseurs;
select * from articles;

select art_num,art_nom,art_coul,art_pa from articles
where art_coul not like'vert' and (art_pa between 10 and 100)
order by art_nom desc,art_num;

select art_num,art_nom,art_stock,art_seuil from articles
where art_stock<=art_seuil;

select four_nom from fournisseurs
/*where four_adresse like'% 54'*/
where four_adresse rlike"^.*[^0-9]54[^0-9]?.*$"
order by four_nom;

select art_nom,art_coul,art_pa from articles
where art_coul ='rouge' and art_pa<75 or art_coul is null;

select four_nom from fournisseurs
where four_nom like'%e%e%' and four_cp = '1000';

select art_nom,art_seuil-art_stock as art_dif from articles
where art_stock<art_seuil
order by art_num;

select * from articles
where art_coul = 'rouge' and art_stock>art_seuil and art_nom not like '%c%';

select distinct art_coul from articles
where art_nom like '%stylo%';

select * from articles
where art_four in ('f0001','f0002','f0003');

select * from fournisseurs
where (select year (four_date)) <1990 and four_cp not in ('1000;4000');

select concat(Ucase(Left((Art_nom),1)),LCase(substring((Art_nom),2))," est de couleur ", lcase(Art_coul)) AS Expr1 FROM articles
where art_coul is not null;

select (select year (sysdate()))-(select year (four_date)) as annee from fournisseurs;
/*SELECT round(DATEDIFF( SYSDATE(), four_date )/365) from fournisseurs;*/

select count(distinct art_nom) as décompte from articles;

select art_nom,sum(art_stock) as stock from articles
group by art_nom;

select avg(art_pa) as avg,min(art_pa) as min,max(art_pa) as max from articles;

select sum(art_stock*art_pa) as somme from articles;

select sum(art_stock) from articles
where art_coul='rouge' and art_pa<100;

select art_nom, avg(art_pa) as avg,min(art_pa) as min,max(art_pa) as max,count(distinct art_coul) as coulDiff from articles
group by art_nom;

/*select * from articles , fournisseurs where four_num=art_four group by art_num;*/
select * from articles join fournisseurs on four_num=art_four group by art_num;

select four_nom , count(art_num) as article from fournisseurs join articles on four_num=art_four group by four_nom order by four_num; 

select four_nom , count(art_num) as article from fournisseurs join articles on four_num=art_four where four_num='f0005' group by four_nom;

create table localite(loc_ville char(30),loc_cp smallint check(loc_cp>999 and loc_cp<10000),loc_repres smallint check(loc_repres=1 or loc_repres=2));
insert into localite values('Liège',4000,1);
insert into localite values('Bruxelles',1000,2);
insert into localite values('Herstal',4400,1);
insert into localite values('Visé',4600,1);
insert into localite values('Zaventem',1039,2);

select * from localite;
select four_nom, four_adresse , four_cp ,loc_ville from fournisseurs,localite where (four_cp=loc_cp and loc_repres=1);
select * from articles where art_pa<(select avg(art_pa) from articles where art_coul='rouge') order by art_nom,art_pa desc;
select loc_ville,loc_cp,four_nom from localite left outer join fournisseurs on loc_cp=four_cp;
select art_nom,four_nom from articles,fournisseurs where (art_coul in('rouge','vert','noir') and four_cp=any(select loc_cp from localite);
select art_nom,four_nom from fournisseurs join localite join articles on (four_cp=loc_cp and loc_repres=1) where art_coul in('rouge','vert','noir');