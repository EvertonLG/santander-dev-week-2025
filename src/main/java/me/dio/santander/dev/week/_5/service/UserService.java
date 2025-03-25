package me.dio.santander.dev.week._5.service;

import me.dio.santander.dev.week._5.dio.domain.model.User;

public interface UserService {

    User findById(long id);

    User create(User userToCreate);
}
