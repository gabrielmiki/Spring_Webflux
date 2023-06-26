package edu.miki.webflux.First_Project.questions;

public record User(Long id,
                   String name,
                   String email,
                   String password,
                   Boolean isAdmin) {

}
