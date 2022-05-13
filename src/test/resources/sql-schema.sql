DROP TABLE IF EXISTS `orders`;
DROP TABLE IF EXISTS `order_items`;
DROP TABLE IF EXISTS `items`;
DROP TABLE IF EXISTS `customers`;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);


CREATE TABLE IF NOT EXISTS `items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `item_name` VARCHAR(40) DEFAULT NULL,
    `item_price` DOUBLE,
    PRIMARY KEY (`id`)
);


CREATE TABLE IF NOT EXISTS `orders` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `customer_id` INT(11) NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`customer_id`) REFERENCES `customers` (`id`) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS `order_items`(
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`item_id` INT(11) NOT NULL,
    `order_id` INT(11) NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`) ON DELETE CASCADE,
    FOREIGN KEY (`item_id`) REFERENCES `items` (`id`) ON DELETE CASCADE
);
