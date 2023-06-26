package edu.miki.webflux.First_Project;

import edu.miki.webflux.First_Project.questions.Question1;
import edu.miki.webflux.First_Project.questions.Question2;
import edu.miki.webflux.First_Project.questions.Question3;
import edu.miki.webflux.First_Project.questions.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Long> numbers = new ArrayList<>();
        numbers.add(1L);
        numbers.add(2L);
        numbers.add(3L);
        numbers.add(4L);
        numbers.add(5L);

        Question1 q1 = new Question1();
        q1.inc(numbers)
                .doOnNext(System.out::println)
                .subscribe();

        List<User> invite = new ArrayList<>();
        invite.add(new User(1234L, "João", "joao@gmail", "2ws456", false));
        invite.add(new User(1234L, "Marco", "marco@gmail", "sfb123", false));
        invite.add(new User(1234L, "Maria", "maria@gmail", "855h57", false));
        invite.add(new User(1234L, "Josefa", "josefa@gmail", "nurvev", true));

        Question2 q2 = new Question2();
        q2.countAdmins(invite)
                .doOnSuccess(System.out::println)
                .subscribe();

        Question3 q3 = new Question3();
        q3.userIsValid(new User(1234L, "Valid", "valid@gmail", "2ws456as4", false));
        //q3.userIsValid(new User(1234L, "Invalid", "invalid@gmail", "2ws", false));

    }

}
