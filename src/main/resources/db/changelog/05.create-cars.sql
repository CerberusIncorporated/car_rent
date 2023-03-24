
CREATE TABLE IF NOT EXISTS `cars`
(
    `id`                INT                              NOT NULL,
    `brand`             VARCHAR(50)                      NOT NULL,
    `model`             VARCHAR(100)                     NOT NULL,
    `color`             VARCHAR(50)                      NOT NULL,
    `seats`             INT                              NOT NULL,
    `gearbox`           ENUM ('AUTOMATIC', 'MANUAL')     NOT NULL,
    `manufactured_year` YEAR(4)                          NOT NULL,
    `engine_type`       ENUM ('PETROL', 'DIESEL', 'GAS') NOT NULL,
    `price`             DECIMAL(10, 2)                   NOT NULL,
    `vin`               VARCHAR(17)                      NOT NULL,
    `plate`             VARCHAR(10)                      NULL,
    `class`             VARCHAR(30)                      NULL
);