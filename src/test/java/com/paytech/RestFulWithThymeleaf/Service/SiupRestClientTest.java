/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytech.RestFulWithThymeleaf.Service;

import com.paytech.RestFulWithThymeleaf.dto.rest;
import java.util.List;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author denigunawan
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SiupRestClientTest {
  @Autowired private SiupRestClient client;
    
  public void testDaftarClient(){
      List<rest> hasil = client.dataClient();
      for(rest k : hasil){
          System.out.println("kode adalah"+k.getKode());
      }
  }
}
