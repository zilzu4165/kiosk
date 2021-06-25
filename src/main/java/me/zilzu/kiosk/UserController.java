package me.zilzu.kiosk;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping(value = "/user/{id}")
    public String read(@PathVariable Integer id,
                       @RequestParam String region) {
        return id + " " + region;
    }

    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String save(@RequestBody UserSaveRequest request) {

        return "json: " + request.toString();
    }

    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String save2(@ModelAttribute UserSaveRequest request) {
        return "x-www-form-urlencoded: " + request.toString();
    }
}
