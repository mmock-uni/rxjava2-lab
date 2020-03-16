package me.escoffier.lab.chapter2;


import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class Code2 {

    private static List<String> SUPER_HEROES = Arrays.asList(
        "Superman",
        "Batman",
        "Aquaman",
        "Asterix",
        "Captain America"
    );

    public static void main(String... args) {
        Observable.fromIterable(SUPER_HEROES)
            .map(name -> {
                if (name.endsWith("x")) {
                    throw new RuntimeException("What a terrible failure!");
                }
                return name.toUpperCase();
            })
            // Use doOnNext, doOnComplete and doOnError to print messages
            // on each item, when the stream complete, and when an error occurs
            .doOnNext(single -> System.out.println("Next >> " + single))
            .doOnComplete(() -> System.out.println("All worked fine"))
            .doOnError(e -> System.out.println("Error >> " + e.getMessage()))
            .subscribe();
    }
}
