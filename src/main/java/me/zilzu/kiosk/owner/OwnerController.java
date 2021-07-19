package me.zilzu.kiosk.owner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping(value = "/owner")
    public void save(@RequestBody OwnerSaveRequest ownerSaveRequest) {

        ownerService.addOwner(ownerSaveRequest);

        log.info("ownerAdd = {}", ownerSaveRequest);
    }

    @GetMapping(value = "/owner/{id}")
    public List<Owner> getOwner(@PathVariable String id) {
        return ownerService.getOwner(id);
    }
}
