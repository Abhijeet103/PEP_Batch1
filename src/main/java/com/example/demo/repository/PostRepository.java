package com.example.demo.repository;

import com.example.demo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Integer> {

    List<Post> findByUserIdOrderByCreatedAtDesc(Long user_id);

//    @Query('select p from post')
//    List<Post> findfeed(Long userId)


    List<Post> findByCommentContainingIgnoreCaseOrderByCreatedAtDesc(String comments);

}
