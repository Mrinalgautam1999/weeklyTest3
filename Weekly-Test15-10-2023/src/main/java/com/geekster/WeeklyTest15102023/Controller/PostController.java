package com.geekster.WeeklyTest15102023.Controller;

import com.geekster.WeeklyTest15102023.Model.Post;
import com.geekster.WeeklyTest15102023.Services.PostServices;
import com.geekster.WeeklyTest15102023.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    PostServices postServices;

    @Autowired
    UserServices userServices;

    @PostMapping("Post/{email}/{token}")
    public String createInstagramPost(@PathVariable String email,@PathVariable String token,@RequestBody Post post){
        return userServices.createInstagramPost(email, token, post);
    }

    @GetMapping("Post/{id}")
    public Post getPostById(@PathVariable Integer id){
        return postServices.getPOstById(id);
    }

}
