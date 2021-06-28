package me.zilzu.kiosk.store;

import lombok.extern.slf4j.Slf4j;
import me.zilzu.kiosk.model.Store;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
public class StoreController {

    @GetMapping("/store")
    public String read(@RequestParam List<Integer> id,
                       @RequestParam String region) {
        return id.toString() + " ," + region;
    }

    @PostMapping(value = "/store")
    public String save(@RequestBody Store store) {
        log.info("store = {}", store);

        return store.toString();
    }

    @PostMapping(value = "/store2", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String saveForForm(@ModelAttribute Store store) {
        log.info("store= {}", store);

        return store.toString();
    }

    @GetMapping("/store/{id}")
    public String mappingPath(@PathVariable Long id ) {
        log.info("mappingPath storeId= {}", id);

        return "ok";
    }
}
