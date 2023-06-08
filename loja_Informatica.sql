create schema loja_informatica;
use loja_informatica;

CREATE TABLE IF NOT EXISTS `loja_informatica`.`cliente` (
  `idcliente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(14) ,
  `cnpj` VARCHAR(18) ,
  `endereco` VARCHAR(60) ,
  `telefone` VARCHAR(14) ,
  PRIMARY KEY (`idcliente`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  UNIQUE INDEX `cnpj_UNIQUE` (`cnpj` ASC)  )
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `loja_informatica`.`fornecedor` (
  `idFornecedor` INT NOT NULL AUTO_INCREMENT,
  `NomeFornecedor` VARCHAR(45) NOT NULL,
  `cnpj` VARCHAR(18) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NULL,
  PRIMARY KEY (`idFornecedor`),
  UNIQUE INDEX `cnpj_UNIQUE` (`cnpj` ASC)  ))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `loja_informatica`.`pedidos` (
  `idpedido` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `idcliente` INT NOT NULL,
  `subTotal` float,
  PRIMARY KEY (`idpedido`),
  INDEX `fk_pedidos_clientes1_idx` (`idcliente` ASC) ,
  CONSTRAINT `fk_pedidos_clientes1`
    FOREIGN KEY (`idcliente`)
    REFERENCES `loja_informatica`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `loja_informatica`.`produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `Produto` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `estoque` INT NOT NULL,
  `preco` float,
  `idFornecedor` INT NOT NULL,
  PRIMARY KEY (`idProduto`),
  INDEX `fk_produto_fornecedor1_idx` (`idFornecedor` ASC) ,
  CONSTRAINT `fk_produto_forncedor1`
    FOREIGN KEY (`ideditora`)
    REFERENCES `loja_informatica`.`fornecedor` (`idFornecedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `loja_informatica`.`pedidos` (
  `idpedido` INT NOT NULL,
  `idproduto` INT NOT NULL,
  INDEX `fk_pedidos_has_produto_produto1_idx` (`idlivro` ASC) ,
  INDEX `fk_pedidos_has_produto_pedidos1_idx` (`idpedido` ASC) ,
  CONSTRAINT `fk_pedidos_has_produto_pedidos1`
    FOREIGN KEY (`idpedido`)
    REFERENCES `loja_informatica`.`pedidos` (`idpedido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_has_produto_produto1`
    FOREIGN KEY (`idlivro`)
    REFERENCES `loja_informatica`.`produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;