package com.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.sp.resource.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
    	
    	Map<String , Object> map = new HashMap<String, Object>();
    	map.put("key_rollno", 104);
    	map.put("key_name", "vandita");
    	map.put("key_makrs", 86.4f);
    	
    	
    	String insert_sql_query = "INSERT INTO student VALUES(:key_rollno, :key_name, :key_makrs)";
    	int count = npJdbcTemplate.update(insert_sql_query, map);
    	if(count>0) {
    		System.out.println("value inserted");
    	}else {
    		System.out.println("value not inserted");
    	}
    } 
}
