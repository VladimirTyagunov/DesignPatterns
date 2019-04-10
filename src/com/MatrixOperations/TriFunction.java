package com.MatrixOperations;

import java.util.Objects;

@FunctionalInterface
public interface TriFunction<T, U, S> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param t the first input argument
     * @param u the second input argument
     * @param s the third input argument
     */
    void accept(T t, U u, S s);

    /**
     * Returns a composed {@code BiConsumer} that performs, in sequence, this
     * operation followed by the {@code after} operation. If performing either
     * operation throws an exception, it is relayed to the caller of the
     * composed operation.  If performing this operation throws an exception,
     * the {@code after} operation will not be performed.
     *
     * @param after the operation to perform after this operation
     * @return a composed {@code BiConsumer} that performs in sequence this
     * operation followed by the {@code after} operation
     * @throws NullPointerException if {@code after} is null
     */
    default TriFunction<T, U, S> andThen(TriFunction<? super T, ? super U, ? super S> after) {
        Objects.requireNonNull(after);

        return (l, r, rr) -> {
            accept(l, r, rr);
            after.accept(l, r, rr);
        };
    }
}
