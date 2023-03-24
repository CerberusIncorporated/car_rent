
CREATE TABLE IF NOT EXISTS `users`
(
    `id`       INT          NOT NULL,
    `email`    VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `role`     varchar(50) NOT NULL
);