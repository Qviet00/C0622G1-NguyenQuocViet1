package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findAllByCategoryBlog_NameOfCategoryContains(String name);
    List<Blog> findAllByCategoryBlog_Id(int id);

    Blog findAllByIdContaining(int id);
}
