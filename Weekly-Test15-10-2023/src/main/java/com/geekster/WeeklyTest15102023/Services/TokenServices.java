package com.geekster.WeeklyTest15102023.Services;

import ch.qos.logback.core.subst.Token;
import com.geekster.WeeklyTest15102023.Model.AuthenticationToken;
import com.geekster.WeeklyTest15102023.Repo.IToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServices {

    @Autowired
    IToken token;

    public boolean authentication(String email, String newToken) {

        AuthenticationToken existingToken = token.findFirstByToken(newToken);

        if(existingToken != null){
            return existingToken.getUser().getEmail().equals(email);
        }else{
            return false;
        }
    }

    public void createToken(AuthenticationToken newToken){
        token.save(newToken);
    }
}
