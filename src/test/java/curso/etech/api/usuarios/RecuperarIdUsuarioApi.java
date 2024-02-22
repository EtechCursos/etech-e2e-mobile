package curso.etech.api.usuarios;
import curso.etech.api.login.LoginApi;
import curso.etech.common.StaticVariables;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RecuperarIdUsuarioApi {


    public void getUsuarioEmail(){
        Response response =
            given()
                .contentType(ContentType.JSON)
                .header("Authorization", "bearer " + StaticVariables.getAccessToken())
            .when()
                .get("https://1rzg9j3gj7.execute-api.us-east-1.amazonaws.com/hom/filmes/api/v1/usuarios/email/" + StaticVariables.getEmail())
            .then()
                .statusCode(200)
                .extract().response();

        String id = response.path("dados._id").toString();
        StaticVariables.setId(id);
    }
}
