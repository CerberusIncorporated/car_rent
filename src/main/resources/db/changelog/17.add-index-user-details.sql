
ALTER TABLE `user_details`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,
    ADD PRIMARY KEY (`id`),
    ADD KEY `user_id` (`user_id`);
