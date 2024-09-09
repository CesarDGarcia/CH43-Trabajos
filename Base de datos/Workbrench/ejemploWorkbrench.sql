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
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `Clientecol` VARCHAR(45) NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuarios` (
  `idUsuarios` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `Télefono` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Dirección` VARCHAR(45) NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  PRIMARY KEY (`idUsuarios`),
  INDEX `fk_Usuarios_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_Usuarios_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Proveedores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Proveedores` (
  `idProveedores` INT NOT NULL AUTO_INCREMENT,
  `Especialidad` VARCHAR(45) NOT NULL,
  `Usuarios_idUsuarios` INT NOT NULL,
  PRIMARY KEY (`idProveedores`),
  INDEX `fk_Proveedores_Usuarios_idx` (`Usuarios_idUsuarios` ASC) VISIBLE,
  CONSTRAINT `fk_Proveedores_Usuarios`
    FOREIGN KEY (`Usuarios_idUsuarios`)
    REFERENCES `mydb`.`Usuarios` (`idUsuarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Productos` (
  `idProductos` INT NOT NULL AUTO_INCREMENT,
  `Nombre_Servicio` VARCHAR(45) NOT NULL,
  `Descripción` VARCHAR(45) NOT NULL,
  `Precio` TINYINT(100) NOT NULL,
  `Pedido_idPedido` INT NOT NULL,
  `Pedido_Cliente_idCliente` INT NOT NULL,
  PRIMARY KEY (`idProductos`),
  INDEX `fk_Productos_Pedido1_idx` (`Pedido_idPedido` ASC, `Pedido_Cliente_idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_Productos_Pedido1`
    FOREIGN KEY (`Pedido_idPedido` , `Pedido_Cliente_idCliente`)
    REFERENCES `mydb`.`Pedido` (`idPedido` , `Cliente_idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Pedido` (
  `idPedido` INT NOT NULL AUTO_INCREMENT,
  `Fecha` VARCHAR(45) NOT NULL,
  `Total` VARCHAR(45) NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  `Productos_idProductos` INT NOT NULL,
  PRIMARY KEY (`idPedido`, `Cliente_idCliente`),
  INDEX `fk_Pedido_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE,
  INDEX `fk_Pedido_Productos1_idx` (`Productos_idProductos` ASC) VISIBLE,
  CONSTRAINT `fk_Pedido_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `mydb`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Productos1`
    FOREIGN KEY (`Productos_idProductos`)
    REFERENCES `mydb`.`Productos` (`idProductos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Servicio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Servicio` (
  `idServicio` INT NOT NULL AUTO_INCREMENT,
  `Nombre_Servicio` VARCHAR(45) NOT NULL,
  `Descripción` VARCHAR(45) NOT NULL,
  `Precio` TINYINT(100) NOT NULL,
  `Proveedores_idProveedores` INT NOT NULL,
  `Pedido_idPedido` INT NOT NULL,
  `Pedido_Cliente_idCliente` INT NOT NULL,
  PRIMARY KEY (`idServicio`, `Proveedores_idProveedores`),
  INDEX `fk_Servicio_Proveedores1_idx` (`Proveedores_idProveedores` ASC) VISIBLE,
  INDEX `fk_Servicio_Pedido1_idx` (`Pedido_idPedido` ASC, `Pedido_Cliente_idCliente` ASC) VISIBLE,
  CONSTRAINT `fk_Servicio_Proveedores1`
    FOREIGN KEY (`Proveedores_idProveedores`)
    REFERENCES `mydb`.`Proveedores` (`idProveedores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Servicio_Pedido1`
    FOREIGN KEY (`Pedido_idPedido` , `Pedido_Cliente_idCliente`)
    REFERENCES `mydb`.`Pedido` (`idPedido` , `Cliente_idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
