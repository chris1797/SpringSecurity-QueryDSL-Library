package com.security.demo.repository;

import com.security.demo.domain.entity.Article;
import com.security.demo.mapper.ArticleRepositorySupport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>, ArticleRepositorySupport {

}
