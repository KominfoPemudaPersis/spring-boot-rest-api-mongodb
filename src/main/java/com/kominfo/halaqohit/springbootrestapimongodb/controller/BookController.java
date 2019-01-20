package com.kominfo.halaqohit.springbootrestapimongodb.controller;

import com.kominfo.halaqohit.springbootrestapimongodb.entity.Book;
import com.kominfo.halaqohit.springbootrestapimongodb.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest-api-mongodb
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-21
 * Time: 03:56
 * To change this template use File | Settings | File Templates.
 */
@RestController
@Slf4j
@RequestMapping("/api/books")
public class BookController {

    private BookRepository repository;

    @Autowired
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void createBook(@RequestBody Book book) {
        repository.save(book);
    }

    @GetMapping
    public List<Book> findAllBooks() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> findBookById(@PathVariable Integer id) {

        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBookWithId(@PathVariable int id) {
        repository.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllBooks() {
        repository.deleteAll();
    }
}