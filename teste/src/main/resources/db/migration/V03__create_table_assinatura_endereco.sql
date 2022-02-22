CREATE TABLE assinatura_endereco (
	cod_assinatura_endereco BIGINT(20) PRIMARY KEY auto_increment NOT NULL,
    tipo_endereco VARCHAR(10) NOT NULL,
    numero_cep BIGINT(20) NOT NULL,
    cod_assinatura BIGINT(20) NOT NULL,
    FOREIGN KEY (cod_assinatura) REFERENCES assinatura(cod_assinatura)
) engine=InnoDB default charset=utf8;