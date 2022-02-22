CREATE TABLE assinatura (
	cod_assinatura BIGINT(20) PRIMARY KEY auto_increment NOT NULL,
    cod_produto BIGINT(20) NOT NULL,
    cod_pessoa BIGINT(20) NOT NULL,
    FOREIGN KEY (cod_pessoa) REFERENCES pessoa(cod_pessoa)
) engine=InnoDB default charset=utf8;