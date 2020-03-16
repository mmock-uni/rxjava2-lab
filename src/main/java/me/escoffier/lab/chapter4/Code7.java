package me.escoffier.lab.chapter4;


import java.util.HashSet;

import static me.escoffier.superheroes.Helpers.heroes;
import static me.escoffier.superheroes.Helpers.villains;

public class Code7 {

    public static void main(String[] args) {
        villains()
                .reduce(new HashSet<>(), (set, superstuff) -> {
                    set.addAll(superstuff.getSuperpowers());
                    return set;
                }).subscribe(
                        set -> System.out.println(set.size())
        )
            // Build a set containing all the super power from the villain
            // This exercise uses the `reduce` method
            
        ;
    }

}
