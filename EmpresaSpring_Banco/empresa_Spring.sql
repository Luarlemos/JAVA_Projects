CREATE DATABASE empresa_Spring;

USE empresa_Spring;

CREATE TABLE cliente(
	id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email varchar(100) unique,
    cpf VARCHAR(15) NOT NULL,
    rg VARCHAR(15),
    telefone VARCHAR(20),
    endereco VARCHAR(255)
)ENGINE = InnoDB;

CREATE TABLE funcionario(
	id_funcionario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email varchar(100) NOT NULL unique,
    cpf VARCHAR(15) NOT NULL,
    rg VARCHAR(15),
    telefone VARCHAR(20),
	endereco VARCHAR(255),
    cargo VARCHAR(50) NOT NULL,
    salario DECIMAL(10,2) NOT NULL DEFAULT 0,
    senha VARCHAR(40) NOT NULL,
	habilitado boolean NOT NULL
)ENGINE = InnoDB;

CREATE TABLE pedido (
	id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    data_pedido DATE NOT NULL,
    status_pedido VARCHAR(20) NOT NULL DEFAULT "pendente",
    fk_cliente INT NOT NULL,
    FOREIGN KEY (fk_cliente) REFERENCES cliente(id_cliente)
) ENGINE = InnoDB;
ALTER TABLE pedido ADD COLUMN fk_funcionario INT NOT NULL;
ALTER TABLE pedido ADD FOREIGN KEY (fk_funcionario) REFERENCES funcionario(id_funcionario);

CREATE TABLE autorizacao(
	email VARCHAR(255) PRIMARY KEY NOT NULL,
    autoridade VARCHAR(45) NOT NULL
)ENGINE = InnoDB;