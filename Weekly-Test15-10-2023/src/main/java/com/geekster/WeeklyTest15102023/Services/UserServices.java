package com.geekster.WeeklyTest15102023.Services;

import com.geekster.WeeklyTest15102023.Controller.UserController;
import com.geekster.WeeklyTest15102023.Model.AuthenticationToken;
import com.geekster.WeeklyTest15102023.Model.Post;
import com.geekster.WeeklyTest15102023.Model.User;
import com.geekster.WeeklyTest15102023.Model.dto.SignInDto;
import com.geekster.WeeklyTest15102023.Repo.IUser;
import com.geekster.WeeklyTest15102023.Services.Hashing.PasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserServices {

    @Autowired
    IUser user;

    @Autowired
    TokenServices tokenServices;

    @Autowired
    PostServices postServices;


    public String signUp(User newUser) {

        String newEmail = newUser.getEmail();

        User existingUser = user.findFirstByEmail(newEmail);


        if(existingUser != null){
            return "already email registered try another email";

        }

        String password = newUser.getPassword();

        try {
            String encryptedPassword = PasswordEncryptor.encrypt(password);
            newUser.setPassword(encryptedPassword);
            user.save(newUser);
            return "Instagram User Register";
        }catch (NoSuchAlgorithmException e){
            return "Internal server error";
        }




    }

    public String signIn(SignInDto signInDto) {

        String newEmail = signInDto.getEmail();
        User existingUser = user.findFirstByEmail(newEmail);

        if(existingUser == null){
            return "you are not registered user";
        }

        try {
            String encryptedPassword = PasswordEncryptor.encrypt(signInDto.getPassword());

            if(existingUser.getPassword().equals(encryptedPassword)){

                AuthenticationToken token = new AuthenticationToken(existingUser);
                tokenServices.createToken(token);
                return "signIn successfully";
            }else{
                return "Invalid Credential";
            }

        }catch (NoSuchAlgorithmException e){
            return "Internal Server error";

        }
    }

    public String createInstagramPost(String email, String token, Post post) {

        if(tokenServices.authentication(email,token)){

            User existingUser = user.findFirstByEmail(email);
            post.setUser(existingUser);

            postServices.createPost(post);
            return "Post Successfully";


        }else{
            return "Authentication error";
        }
    }
}
