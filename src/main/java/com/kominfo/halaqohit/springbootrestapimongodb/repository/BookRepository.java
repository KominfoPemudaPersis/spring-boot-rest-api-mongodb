package com.kominfo.halaqohit.springbootrestapimongodb.repository;

import com.kominfo.halaqohit.springbootrestapimongodb.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


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
@RepositoryRestResource
public interface BookRepository extends MongoRepository<Book, Integer> {
}