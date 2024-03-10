package com.project.examportalbackend.repository;

import com.project.examportalbackend.models.Category;
import com.project.examportalbackend.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCategory(Category category);
}
