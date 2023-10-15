package com.geekster.WeeklyTest15102023.Repo;

import ch.qos.logback.core.subst.Token;
import com.geekster.WeeklyTest15102023.Model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IToken extends JpaRepository<AuthenticationToken, Long> {
    AuthenticationToken findFirstByToken(String newToken);
}
