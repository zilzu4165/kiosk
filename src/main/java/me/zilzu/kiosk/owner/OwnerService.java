package me.zilzu.kiosk.owner;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    private final OwnerMapper ownerMapper;

    public OwnerService(OwnerMapper ownerMapper) {
        this.ownerMapper = ownerMapper;
    }

    public void addOwner(OwnerSaveRequest ownerSaveRequest) {
        ownerMapper.addOwner(ownerSaveRequest);
    }

    public List<Owner> getOwner(String id) {
        return ownerMapper.getOwner(id);
    }
}
