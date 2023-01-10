package com.example.za4asa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Za4asaApplication implements CommandLineRunner {
private Logger logger= LoggerFactory.getLogger(this.getClass());
@Autowired
PlayerDao dao;
    public static void main(String[] args) {
        SpringApplication.run(Za4asaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All Players Data: {}", dao.getAllPlayers());
    }
}
