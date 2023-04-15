package edu.nf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("edu.nf.mapper")
@SpringBootApplication
public class JacksonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JacksonDemoApplication.class, args);
    }

}
