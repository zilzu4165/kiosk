package me.zilzu.kiosk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {

    // store?id=1 or store?id=2
    @GetMapping(value = "/store")
    public String read(@RequestParam List<Integer> id,
                       @RequestParam String region) {
        return id.toString() + ", " + region;
    }

    @PostMapping(value = "/store")
    public void save() {

    }
}