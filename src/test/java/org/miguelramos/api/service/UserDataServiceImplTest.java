package org.miguelramos.api.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.miguelramos.api.domain.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserDataServiceImplTest {

    @Autowired
    UserDataServiceImpl userDataService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getUserData() {
        UserData userData = userDataService.getUserData(3);
        assertEquals(3,userData.getId());
    }
}