package me.zilzu.kiosk.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ownerService")
public class OwnerService {

    @Autowired
    private final OwnerMapper ownerMapper;

    public OwnerService(OwnerMapper ownerMapper) {
        this.ownerMapper = ownerMapper;
    }

    public void addOwner(OwnerSaveRequest ownerSaveRequest) {
        ownerMapper.addOwner(ownerSaveRequest);
    }
}
