package com.cadastroclientespring;

import com.cadastroclientespring.reposiory.IClienteRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class CadastroClienteSpringApplication implements CommandLineRunner {

    private IClienteRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CadastroClienteSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
