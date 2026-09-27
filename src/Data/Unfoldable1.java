    // Mirrors the JavaScript unfoldr1ArrayImpl: the first element always comes
    // from f, and the loop stops once the trailing Maybe is Nothing. Arrays are
    // Object[] in this backend.
    public static Object unfoldr1ArrayImpl = (java.util.function.Function<Object, Object>) (isNothing) ->
        (java.util.function.Function<Object, Object>) (fromJust) ->
        (java.util.function.Function<Object, Object>) (fst) ->
        (java.util.function.Function<Object, Object>) (snd) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (b) -> {
            java.util.List<Object> result = new java.util.ArrayList<>();
            Object value = b;
            while (true) {
                Object tuple = ((java.util.function.Function<Object, Object>) f).apply(value);
                result.add(((java.util.function.Function<Object, Object>) fst).apply(tuple));
                Object maybe = ((java.util.function.Function<Object, Object>) snd).apply(tuple);
                if ((Boolean) ((java.util.function.Function<Object, Object>) isNothing).apply(maybe)) {
                    return result.toArray(new Object[0]);
                }
                value = ((java.util.function.Function<Object, Object>) fromJust).apply(maybe);
            }
        };
