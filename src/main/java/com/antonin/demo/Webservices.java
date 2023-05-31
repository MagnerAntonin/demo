package com.antonin.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api")
public class Webservices {
   @GetMapping(value = "/hello")
    String getContacts(){
       return "<html><body>coucou</body></html>";

   }
}
