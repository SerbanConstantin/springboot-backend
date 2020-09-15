package com.example.springbootbackend;

import com.example.springbootbackend.model.Product;
import com.example.springbootbackend.model.User;
import com.example.springbootbackend.repository.ProductRepository;
import com.example.springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        this.userRepository.save(new User("ion", "creanga", "ion@yahoo.com"));
        this.userRepository.save(new User("mihai", "eminescu", "mihai@yahoo.com"));
        this.userRepository.save(new User("george", "cosbuc", "george@yahoo.com"));
        this.userRepository.save(new User("john", "bacovia", "john@yahoo.com"));

        User user1 = new User();
        user1.setFirstName("mihail");
        user1.setLastName("sadoveanu");
        user1.setEmail("mihail@yahoo.com");
        userRepository.save(user1);

        this.productRepository.save(new Product("telefon", "telefonie mobila","apple"));
        this.productRepository.save(new Product("televizor", "tv-audio-video", "sony"));
        this.productRepository.save(new Product("laptop", "device", "hp"));





    }
}
