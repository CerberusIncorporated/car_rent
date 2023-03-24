
CREATE TABLE IF NOT EXISTS `orders`
(
    `id`                INT          NOT NULL,
    `user_id`           INT          NOT NULL,
    `car_id`            INT          NOT NULL,
    `status_name`            VARCHAR(15)  NOT NULL,
    `start_date`        TIMESTAMP(6) NOT NULL,
    `end_date`          TIMESTAMP(6) NOT NULL,
    `rejection_comment` VARCHAR(500) NULL,
    `return_comment`    VARCHAR(500) NULL
);