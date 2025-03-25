package com.codeWithKeshav.Fullstack_Backend.Repository;

import com.codeWithKeshav.Fullstack_Backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
