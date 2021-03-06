package core.vk.utils;

import io.restassured.response.Response;

public class ResponseBodyHelpers {

    public static String getValueFromBody(Response resp, String path) {
        if (resp != null) {
            return resp.getBody().path(path).toString();
        } else throw new RuntimeException("The response wasn't received or path doesn't exist");
    }

}