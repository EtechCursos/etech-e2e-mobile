package curso.etech.api.usuarios;

import curso.etech.api.login.LoginApi;
import curso.etech.common.StaticVariables;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeletarUsuarioApi {

    RecuperarIdUsuarioApi recuperarIdUsuario = new RecuperarIdUsuarioApi();
    LoginApi loginApi = new LoginApi();

    public void deleteUsuarioId(){
        loginApi.postLogin();
        recuperarIdUsuario.getUsuarioEmail();
        given()
            .contentType(ContentType.JSON)
            .header("Authorization", "bearer " + StaticVariables.getAccessToken())
        .when()
            .delete("https://1rzg9j3gj7.execute-api.us-east-1.amazonaws.com/hom/filmes/api/v1/usuarios/" + StaticVariables.getId())
        .then()
            .statusCode(200);
    }
}
