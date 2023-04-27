package com.grp_169.application;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.grp_169.application.model.FollowModel;
import com.grp_169.application.repository.FollowRepository;

@DataJpaTest
public class FollowRepositoryTests {
    
    @Autowired private FollowRepository repo;

    @Test
    public void testAddFollow(){
        FollowModel followModel = new FollowModel(10, 100, 1, 0);
        FollowModel savedFollowModel = repo.save(followModel);

    //     assertThat(savedFollowModel).isNotNull();
    }
    
}
