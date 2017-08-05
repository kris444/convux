package com.xxx.rasa.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class RasaRestRoutes extends RouteBuilder {

    @Override
    public void configure() {
        restConfiguration()
                .contextPath("/rasa").apiContextPath("/api-doc")
                .apiProperty("api.title", "rasa rest API")
                .apiProperty("api.version", "1.0")
                .apiProperty("cors", "true")
                .apiContextRouteId("doc-api")
                .component("servlet")
                .bindingMode(RestBindingMode.json);

    }

}
