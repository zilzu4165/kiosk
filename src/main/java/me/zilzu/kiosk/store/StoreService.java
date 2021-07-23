package me.zilzu.kiosk.store;

import org.springframework.stereotype.Service;

@Service
public class StoreService {

    private StoreMapper storeMapper;

    public StoreService(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    public void saveStore(StoreSaveRequest storeSaveRequest) {
        storeMapper.saveStore(storeSaveRequest);
    }

    public Store getStore(Long storeId) {
        return storeMapper.getStore(storeId);
    }
}
