package org.openapitools.controller;

import java.time.OffsetDateTime;
import org.openapitools.model.User;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for UserController
 */
@MicronautTest
public class UserControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    UserController controller;

    /**
     * This test is used to validate the implementation of createUser() method
     *
     * The method should: Create user
     *
     * This can only be done by the logged in user.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createUserMethodTest() {
        // given
        User _body = new User();

        // when
        controller.createUser(_body).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user' to the features of createUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createUserClientApiTest() throws IOException {
        // given
        User body = new User();
        String uri = UriTemplate.of("/user").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createUsersWithArrayInput() method
     *
     * The method should: Creates list of users with given input array
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createUsersWithArrayInputMethodTest() {
        // given
        List<User> _body = Arrays.asList();

        // when
        controller.createUsersWithArrayInput(_body).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user/createWithArray' to the features of createUsersWithArrayInput() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createUsersWithArrayInputClientApiTest() throws IOException {
        // given
        List<User> body = Arrays.asList();
        String uri = UriTemplate.of("/user/createWithArray").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createUsersWithListInput() method
     *
     * The method should: Creates list of users with given input array
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createUsersWithListInputMethodTest() {
        // given
        List<User> _body = Arrays.asList();

        // when
        controller.createUsersWithListInput(_body).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user/createWithList' to the features of createUsersWithListInput() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createUsersWithListInputClientApiTest() throws IOException {
        // given
        List<User> body = Arrays.asList();
        String uri = UriTemplate.of("/user/createWithList").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteUser() method
     *
     * The method should: Delete user
     *
     * This can only be done by the logged in user.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteUserMethodTest() {
        // given
        String username = "example";

        // when
        controller.deleteUser(username).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user/{username}' to the features of deleteUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteUserClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user/{username}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("username", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getUserByName() method
     *
     * The method should: Get user by user name
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getUserByNameMethodTest() {
        // given
        String username = "example";

        // when
        User result = controller.getUserByName(username).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user/{username}' to the features of getUserByName() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getUserByNameClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user/{username}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("username", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, User.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of loginUser() method
     *
     * The method should: Logs user into the system
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void loginUserMethodTest() {
        // given
        String username = "example";
        String password = "example";

        // when
        String result = controller.loginUser(username, password).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user/login' to the features of loginUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void loginUserClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user/login").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("username", "example") // The query parameter format should be 
            .add("password", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, String.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of logoutUser() method
     *
     * The method should: Logs out current logged in user session
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void logoutUserMethodTest() {
        // given

        // when
        controller.logoutUser().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user/logout' to the features of logoutUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void logoutUserClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user/logout").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateUser() method
     *
     * The method should: Updated user
     *
     * This can only be done by the logged in user.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateUserMethodTest() {
        // given
        String username = "example";
        User _body = new User();

        // when
        controller.updateUser(username, _body).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user/{username}' to the features of updateUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateUserClientApiTest() throws IOException {
        // given
        User body = new User();
        String uri = UriTemplate.of("/user/{username}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("username", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
