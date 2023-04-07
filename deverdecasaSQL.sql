-- Criar base de dados

CREATE DATABASE sistema_bancario;

-- Ativar a base para trabalhar

USE sistema_bancario;

CREATE TABLE tb_banco(
codigo INT,
nome VARCHAR(120),
PRIMARY KEY(codigo)
);

CREATE TABLE tb_agencia(
cod_banco INT,
numero_agencia INT,
endereco VARCHAR(120),
FOREIGN KEY(cod_banco) REFERENCES tb_banco(codigo),
PRIMARY KEY(numero_agencia)
);

CREATE TABLE tb_cliente(
cpf VARCHAR(14),
nome VARCHAR(120),
sexo VARCHAR(1),
endereco VARCHAR(120),
PRIMARY KEY(cpf)
);

CREATE TABLE tb_conta(
numero_conta int,
saldo DECIMAL(6,2),
tipo_conta varchar(8),
num_agencia int,
CHECK(tipo_conta in('corrente','poupanca')),
FOREIGN KEY(num_agencia) REFERENCES tb_agencia(numero_agencia),
PRIMARY KEY(numero_conta)
);

CREATE TABLE tb_historico(
cpf_cliente VARCHAR(14),
num_conta INT,
data_inicio DATE,
FOREIGN KEY(cpf_cliente) REFERENCES tb_cliente(cpf),
FOREIGN KEY (num_conta) REFERENCES tb_conta(numero_conta)
);
 
 CREATE TABLE telefone_cliente(
 cpf_cli VARCHAR(14),
 telefone VARCHAR(9),
 FOREIGN KEY(cpf_cli) REFERENCES tb_cliente(cpf)
 );
 
 -- DML (INSERT / UPDATE / DELETE)

-- Inserir dados na tabela banco:

INSERT INTO tb_banco
(codigo, nome) VALUES (1, 'Banco do Brasil');

INSERT INTO tb_banco
(codigo, nome) VALUES (4, 'CEF');

-- verificando se os dados foram inseridos:

select * from tb_banco;

INSERT INTO tb_agencia
(numero_agencia, endereco,cod_banco) VALUES (322,'Av.Wafredo Macedo Brandao, 1139',4 );

INSERT INTO tb_agencia
(numero_agencia, endereco,cod_banco) VALUES (1253,'R.Bancário Sérgio Guerra, 17',1);

INSERT INTO tb_cliente
(cpf,nome,sexo,endereco) VALUES ('111.222.333-44', 'Bruna Andrade', 'F', 'Rua Jose Firmino Ferreira, 1050');

INSERT INTO tb_cliente
(cpf,nome,sexo,endereco) VALUES ('666.777.888-99', 'Radegondes Silva', 'M', 'Av.Epitacio Pessoa, 1008');

INSERT INTO tb_cliente
(cpf,nome,sexo,endereco) VALUES ('555.444.777-33', 'Miguel Xavier', 'M', 'Rua Bancário Sérgio Guerra, 640');

INSERT INTO tb_conta
(numero_conta,saldo,tipo_conta,num_agencia) VALUES ('11765-2', 22.74505, 'corrente', '322');

INSERT INTO tb_conta
(numero_conta,saldo,tipo_conta,num_agencia) VALUES ('21010-7', 3.10096, 'poupanca', '1253');

INSERT INTO tb_conta
(numero_conta,saldo,tipo_conta,num_agencia) VALUES ('21010-7', 3.10096, 'poupanca', '1253');







 
 
 
 