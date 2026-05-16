package dtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


// TODO: verify this will work
@SpringBootApplication
public class ModelMapper {

    public static void main(String[] args) {
        SpringApplication.run(ModelMapper.class, args);
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
