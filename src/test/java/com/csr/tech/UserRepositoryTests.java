package com.csr.tech;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.csr.tech.model.User;
import com.csr.tech.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

   @Autowired
   private TestEntityManager entityManager;
    
   @Autowired
   private UserRepository repo;
    
   // test methods go below
   @Test
   public void testCreateUser() {
       User user = new User();
       user.setEmail("3mansipalve0@gmail.com");
       user.setPassword("mansi2000");
       user.setFirstName("Mansi");
       user.setLastName("Palve");
        
       User savedUser = repo.save(user);
        
       User existUser = entityManager.find(User.class, savedUser.getId());
        
       assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
        
   }
}
