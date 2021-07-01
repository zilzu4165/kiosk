package me.zilzu.kiosk.owner;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository(value = "ownerMapper")
public interface OwnerMapper {

    void addOwner(Owner owner);
}
