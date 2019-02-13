package com.ryulth.board.repository;

import com.ryulth.board.dto.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Long> {
    List<Comment> findByPostId(Long postId);
}
