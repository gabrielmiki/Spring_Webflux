package edu.miki.webflux.First_Project.questions;

import reactor.core.publisher.Mono;

public class Question3 {

    /*
    Verifica se o usuário passado é valido, caso seja retorna void, caso contrário deve disparar uma exception
    (para esse desafio vamos considerar que o usário é valido quando ele tem uma senha com mais de 8 caractéres)
     */
    public void userIsValid(final User user){

        Mono.just(user)
                .filter(n -> n.password().length() >= 8)
                .switchIfEmpty(Mono.defer(() -> Mono.error(new Exception())))
                .doOnSuccess(System.out::println)
                .subscribe();

    }

}
