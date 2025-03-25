package com.codeWithKeshav.Fullstack_Backend.Exception;

public class UserNotFoundException  extends RuntimeException{
     public UserNotFoundException(Long id)
     {
         super("could not found the user with Id"+id);
     }

}
