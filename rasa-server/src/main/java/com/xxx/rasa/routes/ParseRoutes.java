package com.xxx.rasa.routes;

import com.xxx.rasa.domain.response.Response;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

/**
 * Created by himanshu on 6/22/17.
 */
@Component
public class ParseRoutes extends RouteBuilder {

    @Override
    public void configure() {
        rest("/parse")
                .get("/").to("direct:parseGet")
                .post("/").consumes("application/json").to("direct:parsePost");

        from("direct:parseGet")
                .to("http://localhost:5000?bridgeEndpoint=true")
                .unmarshal().json(JsonLibrary.Jackson);

        from("direct:parsePost")
                .marshal().json(JsonLibrary.Jackson)
                .setHeader(Exchange.HTTP_METHOD, constant("POST"))
                .setHeader("Content-Type",constant("application/json"))
                .to("http://localhost:5000?bridgeEndpoint=true")
                .unmarshal().json(JsonLibrary.Jackson, Response.class);

    }
}
