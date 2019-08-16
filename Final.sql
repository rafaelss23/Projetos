select * from departamento;
select * from vendedor;
select * from produto;
use projetojdbc;

describe departamento;
describe vendedor;
describe produto;




create table produto(
id_produto int(11) auto_increment not null,
nome varchar(30) not null,
Preço float not null,
DepartamentoId int (11) not null,
primary key (id_produto)
);
alter table produto
add foreign key (DepartamentoId)
references departamento(id);

create table vendedor (
Id int(11) auto_increment not null,
Nome Varchar(30) not null,
Email varchar (100) not null,
Data_nascimento varchar (10) not null,
Salario double not null,
DepartamentoId int (11) not null,
primary key (id),
key ix_Seller_DepartamentoId (DepartamentoId),
constraint FK_Seller_departamento_DepartamentoId Foreign key (DepartamentoId) references departamento (id)
);

create table departamento(
id int(30) not null auto_increment,
nome varchar (100) not null,
primary key (id)
);