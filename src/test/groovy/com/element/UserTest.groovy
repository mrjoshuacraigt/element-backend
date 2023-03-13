package com.element

import com.element.user.UserClient
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification


@MicronautTest
class UserTest extends Specification{

    @Inject
    UserClient userClient

    void 'Is correct User'() {
        expect:
        userClient.getUserById("34").blockingGet().userName == "Hello User 34"

    }

}
