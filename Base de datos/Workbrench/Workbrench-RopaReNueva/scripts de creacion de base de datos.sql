-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuarios` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `Nombre_Usuario` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(45) NOT NULL,
  `Telefono` VARCHAR(45) NOT NULL,
  `Contraseña` VARCHAR(45) NOT NULL,
  `Direccion` TEXT(100) NOT NULL,
  `Metodo_De_Pago` VARCHAR(45) NOT NULL,
  `Tipo_De_Usuario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Pedidos` (
  `idPedidos` INT NOT NULL AUTO_INCREMENT,
  `Total` FLOAT NOT NULL,
  `Datos_De_Envio` TEXT(100) NOT NULL,
  `Clientes_idClientes` INT NOT NULL,
  `Usuarios_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idPedidos`, `Clientes_idClientes`),
  INDEX `fk_Pedidos_Usuarios1_idx` (`Usuarios_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Pedidos_Usuarios1`
    FOREIGN KEY (`Usuarios_idUsuario`)
    REFERENCES `mydb`.`Usuarios` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Categorias` (
  `idCategorias` INT NOT NULL AUTO_INCREMENT,
  `NombreCategoria` VARCHAR(45) NOT NULL,
  `Producto_idProducto` INT NOT NULL,
  `Producto_Clientes_idClientes` INT NOT NULL,
  `Producto_Pedidos_idPedidos` INT NOT NULL,
  `Producto_Pedidos_Clientes_idClientes` INT NOT NULL,
  `Producto_Categorías_idCategorías` INT NOT NULL,
  PRIMARY KEY (`idCategorias`, `Producto_idProducto`, `Producto_Clientes_idClientes`, `Producto_Pedidos_idPedidos`, `Producto_Pedidos_Clientes_idClientes`, `Producto_Categorías_idCategorías`),
  INDEX `fk_Categorías_Producto1_idx` (`Producto_idProducto` ASC, `Producto_Clientes_idClientes` ASC, `Producto_Pedidos_idPedidos` ASC, `Producto_Pedidos_Clientes_idClientes` ASC, `Producto_Categorías_idCategorías` ASC) VISIBLE,
  CONSTRAINT `fk_Categorías_Producto1`
    FOREIGN KEY (`Producto_idProducto` , `Producto_Clientes_idClientes` , `Producto_Pedidos_idPedidos` , `Producto_Pedidos_Clientes_idClientes` , `Producto_Categorías_idCategorías`)
    REFERENCES `mydb`.`Producto` (`idProducto` , `Clientes_idClientes` , `Pedidos_idPedidos` , `Pedidos_Clientes_idClientes` , `Categorías_idCategorías`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `Nombre_Producto` VARCHAR(45) NOT NULL,
  `Descripcion_Producto` VARCHAR(200) NOT NULL,
  `Precio_Productol` FLOAT NOT NULL,
  `Clientes_idClientes` INT NOT NULL,
  `Pedidos_idPedidos` INT NOT NULL,
  `Pedidos_Clientes_idClientes` INT NOT NULL,
  `Categorías_idCategorías` INT NOT NULL,
  `Categorías_idCategorías1` INT NOT NULL,
  `Categorías_Producto_idProducto` INT NOT NULL,
  `Categorías_Producto_Clientes_idClientes` INT NOT NULL,
  `Categorías_Producto_Pedidos_idPedidos` INT NOT NULL,
  `Categorías_Producto_Pedidos_Clientes_idClientes` INT NOT NULL,
  `Categorías_Producto_Categorías_idCategorías` INT NOT NULL,
  `Usuarios_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idProducto`, `Clientes_idClientes`, `Pedidos_idPedidos`, `Pedidos_Clientes_idClientes`, `Categorías_idCategorías`, `Categorías_idCategorías1`, `Categorías_Producto_idProducto`, `Categorías_Producto_Clientes_idClientes`, `Categorías_Producto_Pedidos_idPedidos`, `Categorías_Producto_Pedidos_Clientes_idClientes`, `Categorías_Producto_Categorías_idCategorías`),
  INDEX `fk_Producto_Pedidos1_idx` (`Pedidos_idPedidos` ASC, `Pedidos_Clientes_idClientes` ASC) VISIBLE,
  INDEX `fk_Producto_Categorías1_idx` (`Categorías_idCategorías1` ASC, `Categorías_Producto_idProducto` ASC, `Categorías_Producto_Clientes_idClientes` ASC, `Categorías_Producto_Pedidos_idPedidos` ASC, `Categorías_Producto_Pedidos_Clientes_idClientes` ASC, `Categorías_Producto_Categorías_idCategorías` ASC) VISIBLE,
  INDEX `fk_Producto_Usuarios1_idx` (`Usuarios_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Producto_Pedidos1`
    FOREIGN KEY (`Pedidos_idPedidos` , `Pedidos_Clientes_idClientes`)
    REFERENCES `mydb`.`Pedidos` (`idPedidos` , `Clientes_idClientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_Categorías1`
    FOREIGN KEY (`Categorías_idCategorías1` , `Categorías_Producto_idProducto` , `Categorías_Producto_Clientes_idClientes` , `Categorías_Producto_Pedidos_idPedidos` , `Categorías_Producto_Pedidos_Clientes_idClientes` , `Categorías_Producto_Categorías_idCategorías`)
    REFERENCES `mydb`.`Categorias` (`idCategorias` , `Producto_idProducto` , `Producto_Clientes_idClientes` , `Producto_Pedidos_idPedidos` , `Producto_Pedidos_Clientes_idClientes` , `Producto_Categorías_idCategorías`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_Usuarios1`
    FOREIGN KEY (`Usuarios_idUsuario`)
    REFERENCES `mydb`.`Usuarios` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
