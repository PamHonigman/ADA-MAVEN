create database Veterinaria;
use Veterinaria;

create table registros(
ID int auto_increment not null primary key,
nombre varchar(30) not null,
años int not null,
raza varchar(30) not null
);

insert into registros(nombre, años, raza)
values
('Sultán', 6, 'Perro - Ovejero Alemán'),
('Min', 4, 'Gato - Maine Coon'),
('Shandi', 15, 'Gato - Mestizo'),
('Tomi', 13, 'Perro - Cocker Spaniel'),
('Lola', 8, 'Perro - Golden Retriever'),
('Mishka', 10, 'Gato - Siamés');

select * from registros;