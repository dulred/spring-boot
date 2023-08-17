package dev.dulred.demo.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
// @ConfigurationProperties(prefix = "person")
// @PropertySource("classpath:/jdbc.properties")  //加载第三方文件
public class Person {
 
    private String name;
    private Integer age;
    private Boolean man;
    private Date birth;
    private Map<String,Object> map;
    private List<Object> list;
}

