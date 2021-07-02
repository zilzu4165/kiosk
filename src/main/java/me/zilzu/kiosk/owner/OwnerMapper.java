package me.zilzu.kiosk.owner;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface OwnerMapper {

    void addOwner(Owner Owner);
}
