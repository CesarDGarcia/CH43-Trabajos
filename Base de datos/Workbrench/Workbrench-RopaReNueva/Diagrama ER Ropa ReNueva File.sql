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
  `Metodo_De_Pago` VARCHAR(45),
  `Tipo_De_Usuario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;

INSERT INTO `Usuarios`
(`Nombre_Usuario`, `Correo`, `Telefono`, `Contraseña`, `Direccion`, `Metodo_De_Pago`, `Tipo_De_Usuario`)
VALUE
('Dani', 'danielaluna.contacto@gmail.com', '5567068854', 'Admin123', 'Tenorios 298, CDMX', 'N/A', 'Administrador'),
('Dilan', 'dilansadrak8@gmail.com', ' 5610455930', 'Admin123', 'Av. Aztecas', 'N/A', 'Administrador'),
('Juan', ' juan.labhernandez@gmail.com', '5528494954', 'Admin123', 'Poniente123', 'N/A', 'Administrador'),
('Cesar', 'cesargd58@gmail.com', '5534101898', 'Admn123', 'Ecatepec de Morelos', 'N/A', 'Adminitrador'),
('Arturo ', 'arturo.ramirez.santillan32@gmail.com','5518284746','Admin123','Av. México #231','N/A','Administrador'),
('Salvador','salvadorGonzalezG29@gmail.com','5573644377','Admin123','Nezahualcoyotl EdoMex','N/A','Arministrador'),
('Joana','johanacuevas1412@gmail.com ','5538945519  ','Admin123','10 de mayo #33','N/A','Administrador'),
('Ris','ris@mail.com','5572737374','Ris123','3 de octubre 140','4000124567899','Usuario'),
('Fani','fani@mail','5563456713','Fani123','amanecer Ranchero 12','1234567812345678','Usuario'),
('Franco','fran@mail.com','55727375421','Fran123','12 de Nobriembre 230','4000124560023','Usuario'),
('Eliseo','eli@mail','5563451426','Eli123','francisco gimenes 20','1234567812345340','Usuario');



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

INSERT INTO `Pedidos` (`Total`, `Datos_De_Envio`)
VALUES
('700.99','3 de octubre 140'),
('145.50','amanecer Ranchero 12'),
('99.90','12 de Nobriembre 230'),
('250.30','francisco gimenes 20');


-- -----------------------------------------------------
-- Table `mydb`.`Categorías`
-- ----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Categorias` (
  `idCategorias` INT NOT NULL AUTO_INCREMENT,
  `NombreCategoria` VARCHAR(45) NOT NULL,
  `Producto_idProducto` INT NOT NULL,
  `Producto_Clientes_idClientes` INT NOT NULL,
  `Producto_Pedidos_idPedidos` INT NOT NULL,
  `Producto_Pedidos_Clientes_idClientes` INT NOT NULL,
  `Producto_Categorias_idCategorias` INT NOT NULL,
  PRIMARY KEY (`idCategorías`, `Producto_idProducto`, `Producto_Clientes_idClientes`, `Producto_Pedidos_idPedidos`, `Producto_Pedidos_Clientes_idClientes`, `Producto_Categorias_idCategorias`),
  INDEX `fk_Categorias_Producto1_idx` (`Producto_idProducto` ASC, `Producto_Clientes_idClientes` ASC, `Producto_Pedidos_idPedidos` ASC, `Producto_Pedidos_Clientes_idClientes` ASC, `Producto_Categorias_idCategorias` ASC) VISIBLE,
  CONSTRAINT `fk_Categorías_Producto1`
    FOREIGN KEY (`Producto_idProducto` , `Producto_Clientes_idClientes` , `Producto_Pedidos_idPedidos` , `Producto_Pedidos_Clientes_idClientes` , `Producto_Categorias_idCategorias`)
    REFERENCES `mydb`.`Producto` (`idProducto` , `Clientes_idClientes` , `Pedidos_idPedidos` , `Pedidos_Clientes_idClientes` , `Categorias_idCategorias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `Categorias`
(`NombreCategoria`)
VALUE
('Tallas'),
('Pantalones'),
('Short bermudas'),
('Ropa deportiva'),
('Playeras'),
('Vestidos'),
('Camisas'),
('Faldas'),
('Sudaderas'),
('Chamarras'),
('Abrigos'),
('Ver todos');

-- -----------------------------------------------------
-- Table `mydb`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `Nombre_Producto` VARCHAR(45) NOT NULL,
  `Descripción_Producto` VARCHAR(200) NOT NULL,
  `Talla` VARCHAR(20) NOT NULL,
  `Color` VARCHAR(20) NOT NULL,
  `Precio_Producto` FLOAT NOT NULL,
  `Clientes_idClientes` INT NOT NULL,
  `Pedidos_idPedidos` INT NOT NULL,
  `Pedidos_Clientes_idClientes` INT NOT NULL,
  `Categorias_idCategorias` INT NOT NULL,
  `Categorias_idCategorias1` INT NOT NULL,
  `Categorias_Producto_idProducto` INT NOT NULL,
  `Categorias_Producto_Clientes_idClientes` INT NOT NULL,
  `Categorias_Producto_Pedidos_idPedidos` INT NOT NULL,
  `Categorias_Producto_Pedidos_Clientes_idClientes` INT NOT NULL,
  `Categorias_Producto_Categorias_idCategorias` INT NOT NULL,
  `Usuarios_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idProducto`, `Clientes_idClientes`, `Pedidos_idPedidos`, `Pedidos_Clientes_idClientes`, `Categorias_idCategorias`, `Categorias_idCategorias1`, `Categorias_Producto_idProducto`, `Categorias_Producto_Clientes_idClientes`, `Categorias_Producto_Pedidos_idPedidos`, `Categorias_Producto_Pedidos_Clientes_idClientes`, `Categorias_Producto_Categorias_idCategorias`),
  INDEX `fk_Producto_Pedidos1_idx` (`Pedidos_idPedidos` ASC, `Pedidos_Clientes_idClientes` ASC) VISIBLE,
  INDEX `fk_Producto_Categorias1_idx` (`Categorias_idCategorias1` ASC, `Categorias_Producto_idProducto` ASC, `Categorias_Producto_Clientes_idClientes` ASC, `Categorias_Producto_Pedidos_idPedidos` ASC, `Categorias_Producto_Pedidos_Clientes_idClientes` ASC, `Categorias_Producto_Categorias_idCategorias` ASC) VISIBLE,
  INDEX `fk_Producto_Usuarios1_idx` (`Usuarios_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Producto_Pedidos1`
    FOREIGN KEY (`Pedidos_idPedidos` , `Pedidos_Clientes_idClientes`)
    REFERENCES `mydb`.`Pedidos` (`idPedidos` , `Clientes_idClientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_Categorias1`
    FOREIGN KEY (`Categorias_idCategorias1` , `Categorias_Producto_idProducto` , `Categorias_Producto_Clientes_idClientes` , `Categorias_Producto_Pedidos_idPedidos` , `Categorias_Producto_Pedidos_Clientes_idClientes` , `Categorias_Producto_Categorias_idCategorias`)
    REFERENCES `mydb`.`Categorias` (`idCategorias` , `Producto_idProducto` , `Producto_Clientes_idClientes` , `Producto_Pedidos_idPedidos` , `Producto_Pedidos_Clientes_idClientes` , `Producto_Categorias_idCategorias`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_Usuarios1`
    FOREIGN KEY (`Usuarios_idUsuario`)
    REFERENCES `mydb`.`Usuarios` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
;
INSERT INTO `Producto`
(`Nombre_Producto`, `Descripción_Producto`, `Talla`, `Color`, `Precio_Producto`)
VALUE
('Jeans Pantalon ','Pantalon de mezclilla','3XL','Azul','120.50'),
('Playera','Playera 100% algodon','M','Blanca','100.00'),
('Blusa','Blusa Olgada','XS','Roja','85.00'),
('Aeropostal Camisa','Camisa aeropostal casual','XL','Negra','200.80'),
('Bermuda','Bermuda Negra con cinturon','CH','Negra','80.00'),
('Short','Shor Casual','S','Rojo','150.50'),
('Camisa','Camisa 100% algodon','S','Verde','129.00'),
('Sudadera','Sudadera Batman','L','Roja','120.50'),
('Abrigo','Gabardina con bolsillo cafe','M','Beige','479.99'),
('Vestido','Vestido largo formal','G','Azul','2000.00'),
('Falda','Falda Casul cuadros','G','Negra','65.50'),
('Chamarra','chamarra tipo piel','XL','Negra','285.50');

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
