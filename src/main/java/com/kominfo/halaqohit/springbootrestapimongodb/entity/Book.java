package com.kominfo.halaqohit.springbootrestapimongodb.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest-api-mongodb
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-21
 * Time: 03:55
 * To change this template use File | Settings | File Templates.
 */
@Data
@NoArgsConstructor
@Document(collection = "BOOK")
public class Book {

    @Id
    @Field("id")
    private int id;

    @NotNull
    @Size(min = 1)
    @Field("name")
    private String name;

    @NotNull
    @Size(min = 1)
    @Field("description")
    private String description;

    public Book(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}