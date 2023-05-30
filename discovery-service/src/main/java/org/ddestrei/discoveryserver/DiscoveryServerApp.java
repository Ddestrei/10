package org.ddestrei.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DiscoveryServerApp.class).web(WebApplicationType.SERVLET).run(args);
    }
}
