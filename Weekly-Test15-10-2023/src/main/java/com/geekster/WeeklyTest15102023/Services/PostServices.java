package com.geekster.WeeklyTest15102023.Services;

import com.geekster.WeeklyTest15102023.Model.Post;
import com.geekster.WeeklyTest15102023.Repo.IPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServices {

    @Autowired
    IPost post;


    public void createPost(Post newPost) {
        post.save(newPost);
    }

    public Post getPOstById(Integer id) {

        return post.findById(id).orElseThrow();

    }
}
