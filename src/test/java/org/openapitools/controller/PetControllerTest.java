package org.openapitools.controller;

import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;
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
 * API tests for PetController
 */
@MicronautTest
public class PetControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    PetController controller;

    /**
     * This test is used to validate the implementation of addPet() method
     *
     * The method should: Add a new pet to the store
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void addPetMethodTest() {
        // given
        Pet _body = new Pet("doggie", Arrays.asList("example"));

        // when
        controller.addPet(_body).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pet' to the features of addPet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void addPetClientApiTest() throws IOException {
        // given
        Pet body = new Pet("doggie", Arrays.asList("example"));
        String uri = UriTemplate.of("/pet").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deletePet() method
     *
     * The method should: Deletes a pet
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deletePetMethodTest() {
        // given
        Long petId = 56L;
        String apiKey = "example";

        // when
        controller.deletePet(petId, apiKey).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pet/{petId}' to the features of deletePet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deletePetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/pet/{petId}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("petId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("application/json")
            .header("api_key", "example");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of findPetsByStatus() method
     *
     * The method should: Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void findPetsByStatusMethodTest() {
        // given
        List<String> status = Arrays.asList("available");

        // when
        List<Pet> result = controller.findPetsByStatus(status).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pet/findByStatus' to the features of findPetsByStatus() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void findPetsByStatusClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/pet/findByStatus").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("status", Arrays.asList("available")); // The query format should be multi

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, Pet.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of findPetsByTags() method
     *
     * The method should: Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void findPetsByTagsMethodTest() {
        // given
        List<String> tags = Arrays.asList("example");

        // when
        List<Pet> result = controller.findPetsByTags(tags).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pet/findByTags' to the features of findPetsByTags() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void findPetsByTagsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/pet/findByTags").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("tags", Arrays.asList("example")); // The query format should be multi

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(List.class, Pet.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getPetById() method
     *
     * The method should: Find pet by ID
     *
     * Returns a single pet
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getPetByIdMethodTest() {
        // given
        Long petId = 56L;

        // when
        Pet result = controller.getPetById(petId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pet/{petId}' to the features of getPetById() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getPetByIdClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/pet/{petId}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("petId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Pet.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updatePet() method
     *
     * The method should: Update an existing pet
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updatePetMethodTest() {
        // given
        Pet _body = new Pet("doggie", Arrays.asList("example"));

        // when
        controller.updatePet(_body).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pet' to the features of updatePet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updatePetClientApiTest() throws IOException {
        // given
        Pet body = new Pet("doggie", Arrays.asList("example"));
        String uri = UriTemplate.of("/pet").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.PUT(uri, body)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updatePetWithForm() method
     *
     * The method should: Updates a pet in the store with form data
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updatePetWithFormMethodTest() {
        // given
        Long petId = 56L;
        String name = "example";
        String status = "example";

        // when
        controller.updatePetWithForm(petId, name, status).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pet/{petId}' to the features of updatePetWithForm() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updatePetWithFormClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("name", "example");
            put("status", "example");
        }};
        String uri = UriTemplate.of("/pet/{petId}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("petId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of uploadFile() method
     *
     * The method should: uploads an image
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void uploadFileMethodTest() {
        // given
        Long petId = 56L;
        String additionalMetadata = "example";
        CompletedFileUpload _file = null;

        // when
        ModelApiResponse result = controller.uploadFile(petId, additionalMetadata, _file).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pet/{petId}/uploadImage' to the features of uploadFile() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void uploadFileClientApiTest() throws IOException {
        // given
        Map<String, Object> form = new HashMap<String, Object>(){{
            // Fill in the body form parameters
            put("additionalMetadata", "example");
            put("file", new FileReader(File.createTempFile("test", ".tmp")));
        }};
        String uri = UriTemplate.of("/pet/{petId}/uploadImage").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("petId", 56L);
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, form)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ModelApiResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
