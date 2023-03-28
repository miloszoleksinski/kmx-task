package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KmxController {
    private final String API_URL = "https://postman-echo.com/get?foo1=bar1&foo2=bar2";

    @GetMapping("home")
    public String home() {
        return HttpClient.callAPI(API_URL);
    }
}
