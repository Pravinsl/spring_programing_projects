package com.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sp.beans.Address;
import com.sp.beans.Student;

@Configuration  // Use @Configuration instead of @Component
public class SpringConfigFile {

    @Bean
    public Address createAddrObj() {
        Address addr = new Address();
        addr.setHouseno(102);
        addr.setCity("delhi");
        addr.setPincode(123);
        return addr;
    }

    @Bean
    public Student createStdObj() {
        Student std = new Student();
        std.setName("deepak");
        std.setRollno(101);
        // std.setAddress(createAddrObj()); // Optionally set Address here
        return std;
    }
}

