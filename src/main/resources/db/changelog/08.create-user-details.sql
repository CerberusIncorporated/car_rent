
CREATE TABLE IF NOT EXISTS `user_details`
(
    `id`                    INT          NOT NULL,
    `user_id`               INT          NOT NULL,
    `phone_number`          VARCHAR(13)  NOT NULL,
    `first_name`            VARCHAR(100) NOT NULL,
    `second_name`           VARCHAR(100) NOT NULL,
    `middle_name`           VARCHAR(100) NULL
);