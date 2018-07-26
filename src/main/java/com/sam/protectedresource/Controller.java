package com.sam.protectedresource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    Logger log = LoggerFactory.getLogger(this.getClass());



    @GetMapping("/private/hello")
    public String getMessage() {
        return "hello Admin";
    }



    @RequestMapping( value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Users> getMessageAll(@RequestHeader HttpHeaders headers) {

        ResourceOwnerPasswordResourceDetails details = new ResourceOwnerPasswordResourceDetails();
        details.setPassword("");
        details.setUsername("");
        details.setAccessTokenUri("");
        details.setClientId("");
        details.setClientSecret("");

        RestTemplate restTemplate = new RestTemplate();

        log.info(" info1: " + headers.keySet( ));

        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<Users> responseEntity = restTemplate.exchange("http://localhost:9000/asd", HttpMethod.GET, entity, Users.class);
        return responseEntity;

    }



}
