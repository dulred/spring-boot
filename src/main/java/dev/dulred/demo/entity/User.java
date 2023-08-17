package dev.dulred.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// @ConfigurationProperties(prefix = "user")
// @Component
public class User {

  private int id ;
  private String name;
  private String email;
  private int age;

    
}
