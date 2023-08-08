package phuocvu.org.SPRINGBOOT_DEMO.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import phuocvu.org.SPRINGBOOT_DEMO.model.Product;
import phuocvu.org.SPRINGBOOT_DEMO.repository.ProductRepository;

@Configuration
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Product productB = new Product("iPad Air Green", 2021,599.0,"");
                Product productA = new Product("MacBook Pro 15", 2020,2200.0, "");
//                logger.info("insert data: "+productRepository.save(productA));
//                logger.info("insert data: "+productRepository.save(productB));
            }
        };
    }
}