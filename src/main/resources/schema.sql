CREATE TABLE `menu` (
                        `menu_id` bigint NOT NULL AUTO_INCREMENT,
                        `type` varchar(45) NOT NULL,
                        `name` varchar(45) NOT NULL,
                        `price` int NOT NULL,
                        `image_url` varchar(200) DEFAULT NULL,
                        PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `owner` (
                         `owner_id` bigint NOT NULL AUTO_INCREMENT,
                         `name` varchar(45) NOT NULL,
                         `email` varchar(45) NOT NULL,
                         `phone_number` varchar(45) NOT NULL,
                         `business_number` varchar(45) NOT NULL,
                         `id` varchar(45) NOT NULL,
                         `password` varchar(45) NOT NULL,
                         PRIMARY KEY (`owner_id`),
                         UNIQUE KEY `ID_UNIQUE` (`id`),
                         UNIQUE KEY `email_UNIQUE` (`email`),
                         UNIQUE KEY `phonenumber_UNIQUE` (`phone_number`),
                         UNIQUE KEY `businessnumber_UNIQUE` (`business_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `store` (
                         `store_id` bigint NOT NULL AUTO_INCREMENT,
                         `store_name` varchar(45) NOT NULL,
--                          `menu` varchar(45) NOT NULL,
                         `location` varchar(45) NOT NULL,
                         `tel` varchar(45) NOT NULL,
                         `open_time` time NOT NULL,
                         `close_time` time NOT NULL,
                         `owner_id` bigint NOT NULL,
                         PRIMARY KEY (`store_id`),
                         KEY `fk_store_owner_id_idx` (`owner_id`),
                         CONSTRAINT `fk_store_owner_id` FOREIGN KEY (`owner_id`) REFERENCES `owner` (`owner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
                        `user_id` bigint NOT NULL AUTO_INCREMENT,
                        `finger_print` varchar(50) NOT NULL COMMENT '지문 해쉬값',
                        PRIMARY KEY (`user_id`),
                        UNIQUE KEY `finger_print_UNIQUE` (`finger_print`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `order` (
                         `order_id` bigint NOT NULL AUTO_INCREMENT,
                         `total_price` int NOT NULL,
                         `order_time` timestamp NOT NULL default now(),
                         `take_out` char(1) NOT NULL COMMENT 'y/n',
                         `payment_method` varchar(45) NOT NULL COMMENT 'CARD / CASH',
                         `user_id` bigint NOT NULL,
                         `store_id` bigint NOT NULL,
                         PRIMARY KEY (`order_id`),
                         KEY `user_id_idx` (`user_id`),
                         KEY `fk_order_store_id_idx` (`store_id`),
                         CONSTRAINT `fk_order_store_id` FOREIGN KEY (`store_id`) REFERENCES `store` (`store_id`),
                         CONSTRAINT `fk_order_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `order_menu` (
                              `order_menu_id` bigint NOT NULL AUTO_INCREMENT,
                              `quantity` int NOT NULL DEFAULT '1',
                              `price` int NOT NULL,
                              `order_id` bigint NOT NULL,
                              `menu_id` bigint NOT NULL,
                              PRIMARY KEY (`order_menu_id`),
                              KEY `fk_order_menu_order_id_idx` (`order_id`),
                              KEY `fk_order_menu_menu_id_idx` (`menu_id`),
                              CONSTRAINT `fk_order_menu_menu_id` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`),
                              CONSTRAINT `fk_order_menu_order_id` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `order_test` (
    `order_code` bigint NOT NULL AUTO_INCREMENT,
    `order_time` timestamp NOT NULL default NOW()
)



