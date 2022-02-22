CREATE TABLE pessoa (
	cod_pessoa BIGINT(20) PRIMARY KEY auto_increment NOT NULL,
    nome VARCHAR(60) NOT NULL
) engine=InnoDB default charset=utf8;