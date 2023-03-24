
ALTER TABLE `document`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,
    ADD PRIMARY KEY (`id`),
    ADD KEY `user_details_id` (`user_details_id`);