package me.zilzu.kiosk.owner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OwnerController {

    @Autowired
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping(value = "/owner")
    public void save(@RequestBody OwnerSaveRequest ownerSaveRequest) {

        ownerService.addOwner(ownerSaveRequest);

        log.info("ownerAdd = {}", ownerSaveRequest);
    }
}
