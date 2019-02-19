package com.ryulth.board.repository;

import com.ryulth.board.dto.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {
    List<Post> findBySemesterCodeAndClassCode(String semesterCode,String classCode);
}
