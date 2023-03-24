
ALTER TABLE `orders`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,
    ADD PRIMARY KEY (`id`),
    ADD KEY `user_id` (`user_id`),
    ADD KEY `car_id` (`car_id`),
    ADD KEY `status_name` (status_name);
