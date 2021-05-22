package in.ssc.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic/auth")
public class AuthController {

    @GetMapping("/getMessage")
    public String getAuthMessage(){
        return "Basic Auth is working";
    }
}
