package com.sp.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.sp.beans")
//@ComponentScan({"com.sp.beans","----","----"})
//@ComponentScan(basePackages = {"com.sp.beans"})
public class SpringConfigFile {

}
