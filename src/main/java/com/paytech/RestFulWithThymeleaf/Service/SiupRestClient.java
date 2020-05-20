/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytech.RestFulWithThymeleaf.Service;

import com.paytech.RestFulWithThymeleaf.dto.rest;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author denigunawan
 */
@Service
public class SiupRestClient {
    
    
    @Value("${server.rest}")
    private String restServer;
    private RestTemplate restTemplate = new RestTemplate();
    
    public List<rest> dataClient(){
        ResponseEntity<rest[]> response = restTemplate.
                getForEntity(restServer + "/api/kelurahan", rest[].class);
        return Arrays.asList(response.getBody());
        
    }
}
