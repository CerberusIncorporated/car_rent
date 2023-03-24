
CREATE TABLE IF NOT EXISTS `document`
(
    `id`              INT          NOT NULL,
    `user_details_id` INT          NOT NULL,
    `hash`            VARCHAR(14)  NOT NULL,
    `identifier`      VARCHAR(14)  NOT NULL,
    `expiration_date` TIMESTAMP(6) NOT NULL
);