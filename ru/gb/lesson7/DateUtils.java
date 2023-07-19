package ru.gb.lesson7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DateUtils {

    private DateUtils() {

    }

    public static String convertDateToString(LocalDate date) {
        return date.format(DateTimeFormatter.ISO_DATE);
    }

    public static <T, R> Set<R> extractUnique(Collection<T> source, Function<T, R> extractor) {
        return source.stream()
                .map(extractor)
                .collect(Collectors.toSet());
    }

}
