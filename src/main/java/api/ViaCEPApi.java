package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ViaCEPApi {
    private static final String BASE_URL = "https://viacep.com.br/ws/";

    public static Response consultarCEP(String cep) {
        return RestAssured.get(BASE_URL + cep + "/json");
    }
}
