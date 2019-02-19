package com.ryulth.board.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ryulth.board.pojo.Response.CommentDetailResponse;
import com.ryulth.board.pojo.Response.PostDetailResponse;
import com.ryulth.board.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class CommentController {
    @Value("${board.app.token}")
    private String boardToken;

    @Autowired
    CommentService commentService;

    @PostMapping("/posts/{postId}/comment")
    public String writeComment(
            @RequestHeader("appToken") final String appToken,
            @RequestBody String payload,
            @PathVariable("postId") Long postId) throws IOException {
        if (boardToken.equals(appToken)) {
            return commentService.writeComment(payload, postId);
        }
        return null;
    }

    /*
     * 댓글 상세 정보
     */
    @GetMapping("/comments/{commentId}")
    public ResponseEntity<CommentDetailResponse> getCommentOne(
            @RequestHeader("appToken") final String appToken,
            @PathVariable("commentId") Long commentId) throws JsonProcessingException {
        if (boardToken.equals(appToken)) {
            return commentService.getCommentOne(commentId);
        }
        return null;
    }

    /*
     * 댓글 수정
     */
    @PutMapping("/comments/{commentId}")
    public String updateComment(
            @RequestHeader("appToken") final String appToken,
            @PathVariable("commentId") Long commentId,
            @RequestBody String payload) throws IOException {
        if (boardToken.equals(appToken)) {
            return commentService.updateComment(commentId, payload);
        }
        return null;
    }

    /*
     * 게시글 삭제
     */
    @DeleteMapping("/comments/{commentId}")
    public String deletePost(
            @RequestHeader("appToken") final String appToken,
            @PathVariable("commentId") Long commentId) throws IOException {
        if (boardToken.equals(appToken)) {
            return commentService.deleteComment(commentId);
        }
        return null;
    }
}
