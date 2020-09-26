CREATE SCHEMA ` internet_shop` DEFAULT CHARACTER SET utf8;
CREATE TABLE `internet_shop`.`products`(
`product_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(45) NOT NULL,
`price` DOUBLE NOT NULL,
`deleted` TINYINT NOT NULL DEFAULT 0 ,
PRIMARY KEY (`product_id`)
);
