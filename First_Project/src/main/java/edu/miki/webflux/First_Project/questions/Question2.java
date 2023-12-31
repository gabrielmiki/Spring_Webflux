package edu.miki.webflux.First_Project.questions;

import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){

        return Mono.just((long) users.size());

    }

}
