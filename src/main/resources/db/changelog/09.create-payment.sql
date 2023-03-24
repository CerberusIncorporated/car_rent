
CREATE TABLE IF NOT EXISTS `payment`
(
    `id`          INT            NOT NULL,
    `order_id`    INT            NOT NULL,
    `status_name`      VARCHAR(15)    NOT NULL,
    `total_price` DECIMAL(10, 2) NOT NULL,
    `datetime`    TIMESTAMP(6)   NOT NULL
);