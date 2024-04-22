-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema kibobazar
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `kibobazar` ;

-- -----------------------------------------------------
-- Schema kibobazar
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `kibobazar` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `kibobazar` ;

-- -----------------------------------------------------
-- Table `kibobazar`.`categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kibobazar`.`categorias` (
  `id_categorias` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(70) NOT NULL,
  `descripcion` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`id_categorias`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `kibobazar`.`privilegios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kibobazar`.`privilegios` (
  `id_privilegios` BIGINT NOT NULL AUTO_INCREMENT,
  `privilegios` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_privilegios`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `kibobazar`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kibobazar`.`clientes` (
  `id_clientes` BIGINT NOT NULL AUTO_INCREMENT,
  `id_privilegios` BIGINT NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `apellido` VARCHAR(100) NOT NULL,
  `correo` VARCHAR(100) NOT NULL,
  `telefono` VARCHAR(15) NOT NULL,
  `contraseña` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_clientes`, `id_privilegios`),
  INDEX `clientes_has_privilegios_idx` (`id_privilegios` ASC) VISIBLE,
  CONSTRAINT `clientes_has_privilegios`
    FOREIGN KEY (`id_privilegios`)
    REFERENCES `kibobazar`.`privilegios` (`id_privilegios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `kibobazar`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kibobazar`.`productos` (
  `id_product` BIGINT NOT NULL AUTO_INCREMENT,
  `id_categorias` BIGINT NOT NULL,
  `nombre` VARCHAR(200) NOT NULL,
  `talla` VARCHAR(10) NOT NULL,
  `imagen` TEXT NOT NULL,
  `material` VARCHAR(100) NOT NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  `medidas` VARCHAR(150) NOT NULL,
  `precio` DECIMAL(9,2) NOT NULL,
  PRIMARY KEY (`id_product`, `id_categorias`),
  INDEX `id_categoria` (`id_categorias` ASC) VISIBLE,
  CONSTRAINT `products_ibfk_1`
    FOREIGN KEY (`id_categorias`)
    REFERENCES `kibobazar`.`categorias` (`id_categorias`))
ENGINE = InnoDB
AUTO_INCREMENT = 31
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `kibobazar`.`pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kibobazar`.`pedidos` (
  `id_pedidos` BIGINT NOT NULL AUTO_INCREMENT,
  `id_clientes` BIGINT NOT NULL,
  `id_productos` BIGINT NOT NULL,
  `monto` DECIMAL(9,2) NOT NULL,
  `direccion_envio` VARCHAR(200) NOT NULL,
  `direccion_pedido` VARCHAR(200) NOT NULL,
  `correo` VARCHAR(100) NOT NULL,
  `fecha_pedido` DATE NOT NULL,
  `estado_pedido` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_pedidos`, `id_clientes`, `id_productos`),
  INDEX `id_customer` (`id_clientes` ASC) VISIBLE,
  INDEX `id_product` (`id_productos` ASC) VISIBLE,
  CONSTRAINT `orders_ibfk_1`
    FOREIGN KEY (`id_clientes`)
    REFERENCES `kibobazar`.`clientes` (`id_clientes`),
  CONSTRAINT `orders_ibfk_2`
    FOREIGN KEY (`id_productos`)
    REFERENCES `kibobazar`.`productos` (`id_product`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `kibobazar`.`pedidos_has_productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kibobazar`.`pedidos_has_productos` (
  `id_pedidos_has_productos` BIGINT NOT NULL,
  `pedidos_id_ pedidos` BIGINT NOT NULL,
  `productos_id_productos` BIGINT NOT NULL,
  PRIMARY KEY (`id_pedidos_has_productos`, `pedidos_id_ pedidos`, `productos_id_productos`),
  INDEX `fk_orders_has_products_products1_idx` (`productos_id_productos` ASC) VISIBLE,
  INDEX `fk_orders_has_products_orders1_idx` (`pedidos_id_ pedidos` ASC) VISIBLE,
  CONSTRAINT `fk_orders_has_products_orders1`
    FOREIGN KEY (`pedidos_id_ pedidos`)
    REFERENCES `kibobazar`.`pedidos` (`id_pedidos`),
  CONSTRAINT `fk_orders_has_products_products1`
    FOREIGN KEY (`productos_id_productos`)
    REFERENCES `kibobazar`.`productos` (`id_product`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `kibobazar`.`clientes_has_privilegios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kibobazar`.`clientes_has_privilegios` (
  `clientes_id_clientes` BIGINT NOT NULL,
  `clientes_id_privilegios` BIGINT NOT NULL,
  `privilegios_id_privilegios` BIGINT NOT NULL,
  PRIMARY KEY (`clientes_id_clientes`, `clientes_id_privilegios`, `privilegios_id_privilegios`),
  INDEX `fk_clientes_has_privilegios_privilegios1_idx` (`privilegios_id_privilegios` ASC) VISIBLE,
  INDEX `fk_clientes_has_privilegios_clientes1_idx` (`clientes_id_clientes` ASC, `clientes_id_privilegios` ASC) VISIBLE,
  CONSTRAINT `fk_clientes_has_privilegios_clientes1`
    FOREIGN KEY (`clientes_id_clientes` , `clientes_id_privilegios`)
    REFERENCES `kibobazar`.`clientes` (`id_clientes` , `id_privilegios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_clientes_has_privilegios_privilegios1`
    FOREIGN KEY (`privilegios_id_privilegios`)
    REFERENCES `kibobazar`.`privilegios` (`id_privilegios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
