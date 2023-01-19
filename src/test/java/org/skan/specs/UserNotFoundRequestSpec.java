package org.skan.specs;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.with;
import static org.skan.helpers.CustomAllureListener.withCustomTemplates;

public class UserNotFoundRequestSpec {

    public static RequestSpecification userNotFoundRequestSpec = with()
            .filter(withCustomTemplates())
            .basePath("api/users/23")
            .log().uri();

}
