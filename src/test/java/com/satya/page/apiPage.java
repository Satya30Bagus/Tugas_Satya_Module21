package pages;

import Helper.Endpoint;
import Helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.io.File;
import java.util.List;

import static Helper.Models.*;
import static org.assertj.core.api.Assertions.assertThat;

public class apiPage {

    String setURL, global_id;
    Response res;

    public void prepareUrlFor(String url) {
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USERS":
                setURL = Endpoint.CREATE_NEW_USERS;
            case "DELETE_USERS":
                setURL = Endpoint.DELETE_USERS;
                break;
            case "INVALID_URL":
                setURL = Endpoint.GET_LIST_USERS + "000";
            default:
                System.out.println("input right url");
        }
        System.out.println("endpoint siap pakai adalah : " + setURL);
    }

    public void hitApiGetListUsers() {
        res = getListUsers(setURL);
    }

    public void hitApiPostCreateUser() {
        res = postCreateUser(setURL);
    }

    public void validationStatusCodeIsEquals(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyGetListUsers() {
        List<Object> id = res.jsonPath().getList("id");
        List<Object> name = res.jsonPath().getList("name");
        List<Object> email = res.jsonPath().getList("email");
        List<Object> gender = res.jsonPath().getList("gender");
        List<Object> status = res.jsonPath().getList("status");

        assertThat(id.get(1)).isNotNull();
        assertThat(name.get(1)).isNotNull();
        assertThat(email.get(1)).isNotNull();
        assertThat(gender.get(1)).isIn("female", "male");
        assertThat(status.get(1)).isIn("active", "inactive");
    }

    public void validationResponseJsonWithJSONSchema(String filename) {
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void validationResponseBodyCreateUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        Integer id = jsonPathEvaluator.get("id");
        String name = jsonPathEvaluator.get("name");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");
        String status = jsonPathEvaluator.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female", "male");
        assertThat(status).isIn("active", "inactive");

        global_id = Integer.toString(id);
    }

    public void hitApiDeleteUser() {
        res = deleteUser(setURL, global_id);
    }

    public void hitApiUpdateUser() {
        res = updateUser(setURL, global_id);
    }

    public void validationResponseBodyUpdateUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        Integer id = jsonPathEvaluator.get("id");
        String name = jsonPathEvaluator.get("name");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");
        String status = jsonPathEvaluator.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female", "male");
        assertThat(status).isIn("active", "inactive");
    }

    public void theResponseMessageShouldBe (String arg0) {
        assertThat(res.statusLine()).contains(arg0);
        System.out.println("The response message is " + arg0);
    }
}
