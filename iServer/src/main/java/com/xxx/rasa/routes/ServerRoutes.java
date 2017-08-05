package com.xxx.rasa.routes;

import com.xxx.rasa.domain.Config;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

/**
 * Created by himanshu on 6/17/17.
 */
@Component
public class ServerRoutes extends RouteBuilder {

    @Override
    public void configure() {
        rest("/server")
                .get("/status").to("direct:getStatus")
                .put("/start").to("direct:startServer")
                .get("/config").to("direct:getConfig")
                .put("/config").to("direct:putConfig");

        from("direct:getStatus").to("http://localhost:5000/status?bridgeEndpoint=true")
                .unmarshal().json(JsonLibrary.Jackson);

        from("direct:getConfig").to("http://localhost:5000/config?bridgeEndpoint=true")
                .unmarshal().json(JsonLibrary.Jackson, Config.class);

        from("direct:putConfig")
                .setHeader(Exchange.FILE_NAME,constant("config.json"))
                .marshal().json(JsonLibrary.Jackson, true)
                .to("file:/home/himanshu/rasa_nlu?keepLastModified=true&fileExist=Override&charset=utf-8");

        from("direct:statServer")
                .to("log: Start server not implemented");


    }
}
