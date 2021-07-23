package me.zilzu.kiosk.store;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StoreMapper {

    void saveStore(StoreSaveRequest storeSaveRequest);

    Store getStore(Long storeId);
}
