import api.ViaCEPApi;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit5.AllureJunit5;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("REGRESSAO")
public class APITest {

    private static final String BASE_URL = "https://viacep.com.br/ws/";

    @Test
    @Description("Testa a consulta de um CEP válido")
    public void testCepValido() {
        String cep = "01001000";
        consultarCepValido(cep);
    }

    @Step("Consultando CEP válido: {cep}")
    private void consultarCepValido(String cep) {
        RestAssured
                .given()
                .baseUri(BASE_URL)
                .pathParam("cep", cep)
                .get("{cep}/json")
                .then()
                .assertThat()
                .statusCode(200)
                .body("cep", isA(String.class))
                .body("logradouro", isA(String.class))
                .body("complemento", isA(String.class))
                .body("bairro", isA(String.class))
                .body("localidade", isA(String.class))
                .body("uf", isA(String.class))
                .body("ibge", isA(String.class))
                .body("gia", isA(String.class))
                .body("ddd", isA(String.class))
                .body("siafi", isA(String.class))
                .time(lessThan(2000L));
    }

    @Test
    @Description("Testa a consulta de um CEP inválido")
    public void testCepInvalido() {
        String cep = "000000";
        consultarCepInvalido(cep);
    }

    @Step("Consultando CEP inválido: {cep}")
    private void consultarCepInvalido(String cep) {
        Response response = ViaCEPApi.consultarCEP(cep);
        assertEquals(400, response.getStatusCode());
    }
}
