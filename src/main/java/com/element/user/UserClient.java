package com.element.user;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.rxjava3.core.Single;

@Client("/user")
public interface UserClient {

    @Get("/{id}")
    Single<User> getUserById(String id);
}
