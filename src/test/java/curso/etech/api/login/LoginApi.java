package curso.etech.api.login;

import curso.etech.common.StaticVariables;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class LoginApi {

    public void postLogin(){

            HashMap<String, String> body = new HashMap<>();
            body.put("email", "automacao@etech.dev");
            body.put("senha", "Etech@123");

        Response response =
            given()
                .contentType(ContentType.JSON)
                .body(body)
            .when()
                .post("https://1rzg9j3gj7.execute-api.us-east-1.amazonaws.com/hom/filmes/api/v1/auth/login")
            .then()
                .statusCode(201)
                .extract().response();

        String acessToken = response.path("dados.access_token").toString();
        StaticVariables.setAccessToken(acessToken);
    }
}
