package me.escoffier.lab.chapter3;

import io.vertx.reactivex.core.buffer.Buffer;

import static me.escoffier.superheroes.Helpers.fs;

/**
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class Code7 {

    public static void main(String[] args) {
        fs()
        .rxReadFile("hello.txt", Buffer.buffer("hello"))
                .subscribe(
                        () -> System.out.println("File written"),
                        Throwable::printStackTrace
                )
            // Use rxWriteFile to write a message to a file
            // This method accept a buffer, create a buffer with Buffer.buffer("message")

            // Don't forget to subscribe
        ;
    }
}
