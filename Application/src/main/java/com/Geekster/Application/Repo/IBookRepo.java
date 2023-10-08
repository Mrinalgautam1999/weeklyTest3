package com.Geekster.Application.Repo;

import com.Geekster.Application.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book, Integer> {
}
