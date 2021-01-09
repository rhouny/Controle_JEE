package org.sid.sevservicepart2;
import org.sid.sevservicepart2.sec.entities.AppRole;
import org.sid.sevservicepart2.sec.entities.AppUser;

import org.sid.sevservicepart2.sec.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class SevServicePart2Application {

    public static void main(String[] args) {
        SpringApplication.run(SevServicePart2Application.class, args);
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    CommandLineRunner start(AccountService accountService){
        return args -> {
            accountService.addNewRole(new AppRole(null,"User"));
            accountService.addNewRole(new AppRole(null,"Admin"));
            accountService.addNewRole(new AppRole(null,"Custommer_Manager"));
            accountService.addNewRole(new AppRole(null,"Product_Manager"));
            accountService.addNewRole(new AppRole(null,"Billing_Manager"));

            accountService.addNewUser(new AppUser(null,"user1","1234",new ArrayList<>()));
            accountService.addNewUser(new AppUser(null,"admin","1234",new ArrayList<>()));
            accountService.addNewUser(new AppUser(null,"user2","1234",new ArrayList<>()));
            accountService.addNewUser(new AppUser(null,"user3","1234",new ArrayList<>()));
            accountService.addNewUser(new AppUser(null,"user4","1234",new ArrayList<>()));

            accountService.addRoleToUser("user1","User");
            accountService.addRoleToUser("admin","Admin");
            accountService.addRoleToUser("admin","User");
            accountService.addRoleToUser("user2","Custommer_Manager");
            accountService.addRoleToUser("user3","User");
            accountService.addRoleToUser("user3","Product_Manager");
            accountService.addRoleToUser("user4","User");
            accountService.addRoleToUser("user4","Billing_Manager");
        };
    }
}
