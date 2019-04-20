package org.ctl.telequark

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

//@QuarkusTest
open class EnhancedQuoteResourceTest {

//    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/quote")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

}