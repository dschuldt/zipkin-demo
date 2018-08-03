package de.dschuldt.helloservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HelloService {

    private static final Logger LOG = LoggerFactory.getLogger(HelloService.class);
    @Autowired
    private RestTemplate restTemplate;
    @Value("${world-service.url}")
    private String worldServiceUrl;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/hello")
    public String hello() {

        LOG.info("/hello endpoint called");
        String response = restTemplate.getForObject(worldServiceUrl, String.class);
        return String.format("I say hello and my colleague says: %s", response);
    }
}
