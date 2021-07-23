package me.zilzu.kiosk.store;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping(value = "/store")
    public void saveStore(@RequestBody StoreSaveRequest storeSaveRequest) {
        storeService.saveStore(storeSaveRequest);
        log.info("saveStore = {}", storeSaveRequest);
    }

    @GetMapping(value = "/store/{storeId}")
    public Store getStore(@PathVariable Long storeId) {
        return storeService.getStore(storeId);
    }
}


