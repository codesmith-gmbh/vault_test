package ch.codesmith.vault_test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class VaultTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(VaultTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Inspecting beans.");
            String[] names = ctx.getBeanDefinitionNames();
            Arrays.sort(names);
            Arrays.stream(names).forEach(System.out::println);
        };
    }

}
