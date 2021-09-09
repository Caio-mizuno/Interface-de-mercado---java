


DROP SCHEMA IF EXISTS `Atv04` ;

CREATE SCHEMA IF NOT EXISTS `Atv04` DEFAULT CHARACTER SET utf8 ;
USE `Atv04` ;

DROP TABLE IF EXISTS `Atv04`.`Pessoa` ;

CREATE TABLE IF NOT EXISTS `Atv04`.`Pessoa` (
  `idPessoa` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(80) NOT NULL,
  `cpf` INT NOT NULL,
  `telefone` VARCHAR(16) NOT NULL,
  
  `endereco` VARCHAR(100) NULL,
  `tipo` INT NOT NULL,
  
  
  PRIMARY KEY (`idPessoa`),
  UNIQUE INDEX (`idPessoa`)
);

DROP TABLE IF EXISTS `Atv04`.`Produto` ;

CREATE TABLE IF NOT EXISTS `Atv04`.`Produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(80) NOT NULL,
  `categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProduto`),
  UNIQUE INDEX (`idProduto`)
);

DROP TABLE IF EXISTS `Atv04`.`Pedido` ;

CREATE TABLE IF NOT EXISTS `Atv04`.`Pedido` (
  `idPedido` INT NOT NULL AUTO_INCREMENT,
  `data` VARCHAR(10) NOT NULL,
  `Cliente_idPessoa` INT NOT NULL,
  `Funcionario_idPessoa` INT NOT NULL,
  `Produto_idProduto` INT NOT NULL,
  PRIMARY KEY (`idPedido`),
  UNIQUE INDEX (`idPedido`),
  INDEX (`Cliente_idPessoa`),
  INDEX (`Produto_idProduto`),
  INDEX (`Funcionario_idPessoa`),
  CONSTRAINT `fk_Pedido_Pessoa`
    FOREIGN KEY (`Cliente_idPessoa`)
    REFERENCES `Atv04`.`Pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Produto1`
    FOREIGN KEY (`Produto_idProduto`)
    REFERENCES `Atv04`.`Produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Pessoa1`
    FOREIGN KEY (`Funcionario_idPessoa`)
    REFERENCES `Atv04`.`Pessoa` (`idPessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

insert into Pessoa(idPessoa,nome,cpf,telefone,endereco,tipo) values (default,'Caio','90290590','34363','r. cananeia',1);
insert into pessoa(idPessoa,nome,cpf,telefone,endereco,tipo) values (default,'juli','936332322','6346346','r. bjamin',2);
insert into pessoa(idPessoa,nome,cpf,telefone,endereco,tipo) values (default,'eliton','007896456','644884567','r. truitew',1);
insert into pessoa(idPessoa,nome,cpf,telefone,endereco,tipo) values (default,'ariel','45565748','3934512','r. ccvniueu',1);
insert into pessoa(idPessoa,nome,cpf,telefone,endereco,tipo) values (default,'alessandro','779693242','22311532','r. uipta',2);
insert into pessoa(idPessoa,nome,cpf,telefone,endereco,tipo) values (default,'pablo','966777890','3434562626' , 'r. tompson' ,1);



insert into produto(idproduto,nome,categoria) values (default,'Sushi','japones');
insert into produto(idproduto,nome,categoria) values (default,'Sashimi','japones');
insert into produto(idproduto,nome,categoria) values (default,'Temaki','japones');
insert into produto(idproduto,nome,categoria) values (default,'Yakisoba','japones');
insert into produto(idproduto,nome,categoria) values (default,'Soba','japones');
insert into produto(idproduto,nome,categoria) values (default,'Lamen','japones');
insert into produto(idproduto,nome,categoria) values (default,'Estrogonofe','japones');
insert into produto(idproduto,nome,categoria) values (default,'Bife','americano');
insert into produto(idproduto,nome,categoria) values (default,'Fritas','americano');
insert into produto(idproduto,nome,categoria) values (default,'Vomito','troll');

select * from produto;