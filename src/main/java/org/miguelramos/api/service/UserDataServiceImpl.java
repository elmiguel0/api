package org.miguelramos.api.service;

import org.miguelramos.api.domain.UserData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserDataServiceImpl implements UserDataService {

    private RestTemplate restTemplate;

    public UserDataServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public UserData getUserData(Integer num) {
        ResponseEntity<UserData> user = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users/" + num
                ,UserData.class);
         return user.getBody();
    }
}
