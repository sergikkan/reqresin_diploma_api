package org.skan.specs;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.with;
import static org.skan.helpers.CustomAllureListener.withCustomTemplates;


public class CheckUsersPerPageRequestSpec {

    public static RequestSpecification checkUsersPerPageRequestSpec = with()
            .filter(withCustomTemplates())
            .basePath("/api/users?page=1")
            .log().uri();
}
