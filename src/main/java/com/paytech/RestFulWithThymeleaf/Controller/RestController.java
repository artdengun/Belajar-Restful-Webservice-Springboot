
package com.paytech.RestFulWithThymeleaf.Controller;

import com.paytech.RestFulWithThymeleaf.Service.SiupRestClient;
import com.sun.org.apache.bcel.internal.classfile.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class RestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestController.class);

    @Autowired private SiupRestClient siupRestClient;
    
    @GetMapping("/rest/list")
public ModelMap daftarClient(){
    return new ModelMap().addAttribute("daftarClient",siupRestClient.dataClient());
    
    }   
    
@GetMapping("/rest/form")
public ModelMap daftarForm(){
    return new ModelMap();

    }
@PostMapping("/rest/form")

public String prosesForm(){
    LOGGER.info("Menyimpan Data");
    return "redirect:list";
}
    
}
