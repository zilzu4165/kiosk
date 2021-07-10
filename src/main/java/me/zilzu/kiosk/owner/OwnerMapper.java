package me.zilzu.kiosk.owner;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OwnerMapper {

    void addOwner(OwnerSaveRequest ownerSaveRequest);

    List<Owner> getOwner(String id);
}
