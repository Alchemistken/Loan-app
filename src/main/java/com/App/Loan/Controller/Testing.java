package com.App.Loan.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Testing {

    @GetMapping("/")
    public String getMethodName() {
        return new String("kaam to kar rahah hai");
    }
    
    
}
