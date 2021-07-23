package me.zilzu.kiosk.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;


@Sql(value = {"classpath:basic_dml.sql"})
@SpringBootTest
class StoreServiceTest {

    @Autowired
    private StoreService storeService;

    @Test
    public void doOrder_기본_테스트() {

        // Store table에 넣는 과정
        StoreSaveRequest storeSaveRequest = new StoreSaveRequest(1L,"엄지칼국수","수영구 망미번영로52번길 115","01083662113","10:30:00","20:30:00",1L);

        storeService.saveStore(storeSaveRequest);

        // Store table에서 꺼내오는 과정
        Store store = storeService.getStore(1L);

        assertThat(store.getStoreId()).isEqualTo(1L);
        assertThat(store.getStoreName()).isEqualTo("엄지칼국수");
        assertThat(store.getLocation()).isEqualTo("수영구 망미번영로52번길 115");
        assertThat(store.getTel()).isEqualTo("01083662113");
        assertThat(store.getOpenTime()).isEqualTo("10:30:00");
        assertThat(store.getCloseTime()).isEqualTo("20:30:00");
        assertThat(store.getOwnerId()).isEqualTo(1L);
    }
}