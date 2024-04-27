package com.kmj.demomongodb;

import com.kmj.demomongodb.database.repository.SpringDataRiceProductionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SpringDataRiceProductionRepository.class)
@SpringBootApplication
public class DemoMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMongodbApplication.class, args);
    }

}
