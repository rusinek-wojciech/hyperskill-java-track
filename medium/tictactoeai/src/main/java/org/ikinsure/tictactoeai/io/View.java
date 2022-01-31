package org.ikinsure.tictactoeai.io;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class View {

    private final Consumer<String> consumer;
    private final Supplier<String> stringSupplier;
    private final Supplier<Integer> intSupplier;

    public View(Consumer<String> consumer,
                Supplier<String> stringSupplier,
                Supplier<Integer> intSupplier) {
        this.consumer = consumer;
        this.stringSupplier = stringSupplier;
        this.intSupplier = intSupplier;
    }

    public String nextString() {
        return stringSupplier.get();
    }

    public int nextInt() {
        return intSupplier.get();
    }

    public void out(String text) {
        consumer.accept(text);
    }
}

