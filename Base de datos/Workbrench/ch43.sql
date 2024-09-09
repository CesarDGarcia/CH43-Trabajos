

CREATE DATABASE ch43;

-- MySQL Workbench Forward Engineering


USE `ch43` ;

-- -----------------------------------------------------
-- Table `ch43`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch43`.`clientes` (
  `id_clientes` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NOT NULL,
  `correo` VARCHAR(100) NOT NULL,
  `direccion` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_clientes`))
ENGINE = InnoDB;

INSERT INTO `clientes` 
(`nombre`,  `correo`, `direccion`) 
VALUES 
('Tadeo Zepeda', 'maara@gmail.com', 'calle poniente 2'),
('Yareri Arcos', 'gaby@gmail.com', 'calle poniente 1'),
('Daniel Maldonado', 'dani@gmail.com', 'calle poniente 3'),
('Paola Mireles', 'pao@gmail.com', 'calle poniente 4'),
('Fernanda Ramos', 'fer@gmail.com', 'calle poniente 5');

-- -----------------------------------------------------
-- Table `ch43`.`detalles_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch43`.`detalles_pedido` (
  `id_detalles_pedido` INT NOT NULL,
  `cantidad` INT NOT NULL,
  `precio_unitario` INT NOT NULL,
  `descuento` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`id_detalles_pedido`))
ENGINE = InnoDB;

INSERT INTO `ch43`.`detalles_pedido` (`id_detalles_pedido`, `cantidad`, `precio_unitario`, `descuento`)
VALUES
(1, 10, 50, 5.00),
(2, 5, 100, 10.00),
(3, 3, 75, 7.50),
(4, 7, 20, 2.00),
(5, 2, 150, 15.00);



-- -----------------------------------------------------
-- Table `ch43`.`pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch43`.`pedidos` (
  `id_pedidos` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `estado_pedido` VARCHAR(255) NOT NULL,
  `total` DECIMAL(10,2) UNSIGNED NOT NULL,
  `clientes_id_clientes` INT NOT NULL,
  `detalles_pedido_id_detalles_pedido` INT NOT NULL,
  PRIMARY KEY (`id_pedidos`),
  INDEX `fk_pedidos_clientes_idx` (`clientes_id_clientes` ASC) VISIBLE,
  INDEX `fk_pedidos_detalles_pedido1_idx` (`detalles_pedido_id_detalles_pedido` ASC) VISIBLE,
  CONSTRAINT `fk_pedidos_clientes`
    FOREIGN KEY (`clientes_id_clientes`)
    REFERENCES `ch43`.`clientes` (`id_clientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_detalles_pedido1`
    FOREIGN KEY (`detalles_pedido_id_detalles_pedido`)
    REFERENCES `ch43`.`detalles_pedido` (`id_detalles_pedido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ch43`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch43`.`productos` (
  `id_productos` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(80) NOT NULL,
  `descripcion` TEXT(300) NOT NULL,
  `precio` DECIMAL(10,2) NOT NULL,
  `stock` INT NOT NULL,
  `detalles_pedido_id_detalles_pedido` INT NOT NULL,
  PRIMARY KEY (`id_productos`),
  INDEX `fk_productos_detalles_pedido1_idx` (`detalles_pedido_id_detalles_pedido` ASC) VISIBLE,
  CONSTRAINT `fk_productos_detalles_pedido1`
    FOREIGN KEY (`detalles_pedido_id_detalles_pedido`)
    REFERENCES `ch43`.`detalles_pedido` (`id_detalles_pedido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch43`.`categoria` (
  `id_categoria` INT NOT NULL,
  `nombre` VARCHAR(80) NOT NULL,
  `descripcion` TEXT(300) NOT NULL,
  `fecha_creacion` DATE NOT NULL,
  PRIMARY KEY (`id_categoria`))
ENGINE = InnoDB;




-- -----------------------------------------------------
-- Table `mydb`.`categoria_productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch43`.`categoria_productos` (
  `productos_id_productos` INT NOT NULL,
  `categoria_id_categoria` INT NOT NULL,
  PRIMARY KEY (`productos_id_productos`, `categoria_id_categoria`),
  INDEX `fk_productos_has_categoria_categoria1_idx` (`categoria_id_categoria` ASC) VISIBLE,
  INDEX `fk_productos_has_categoria_productos1_idx` (`productos_id_productos` ASC) VISIBLE,
  CONSTRAINT `fk_productos_has_categoria_productos1`
    FOREIGN KEY (`productos_id_productos`)
    REFERENCES `ch43`.`productos` (`id_productos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_productos_has_categoria_categoria1`
    FOREIGN KEY (`categoria_id_categoria`)
    REFERENCES `ch43`.`categoria` (`id_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;




