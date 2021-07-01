package me.zilzu.kiosk.owner;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository(value = "ownerMapper")
public interface OwnerMapper {

//    @Insert()
    void addOwner(OwnerSaveRequest ownerSaveRequest);
}
