package com.ryulth.board.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ryulth.board.pojo.Response.PostDetailResponse;
import com.ryulth.board.pojo.Response.PostListResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface PostService {
    ObjectMapper mapper = new ObjectMapper();
    ResponseEntity<PostListResponse> getPosts(String semesterCode, String classCode) throws JsonProcessingException;
    ResponseEntity<PostDetailResponse> getPostOne(Long postId) throws JsonProcessingException;
    String updatePost(Long postId, String payload) throws IOException;
    String deletePost(Long postId) throws IOException;
    String writePost(String payload) throws IOException;
}
