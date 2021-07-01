package me.zilzu.kiosk.owner;

import org.springframework.stereotype.Service;

@Service("ownerService")
public class OwnerService {
    private final OwnerMapper ownerMapper;

    public OwnerService(OwnerMapper ownerMapper) {
        this.ownerMapper = ownerMapper;
    }

    public void addOwner(Owner owner) {
//        passwordChecker.check(owner.getOwnerId(), owner.getPassword(), owner.getRegion(), owner.getBusinessNumber());

//        passwordChecker.check(owner.getLoginInformation());

        ownerMapper.addOwner(owner);
    }
}
