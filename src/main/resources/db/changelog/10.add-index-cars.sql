
ALTER TABLE `cars`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,
    ADD PRIMARY KEY (`id`),
    ADD UNIQUE KEY `vin` (`vin`);
