package be.techfix.reverseproxy.controller;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("hello")
    public String getHelloLandingPage(){
        return "hello";
    }

    @GetMapping("cleanup")
    public String cleanupBankingFiles(@RequestParam String bankCustomerIds ){
        String query = "update bf set isdeleted = 1 where bankcustomer_id in ("+bankCustomerIds+") and customerreference like 'cloned single payment%' and isdeleted = 0 and status not in (19,21)";
        System.out.println(query);
        return "hello";
    }
}
