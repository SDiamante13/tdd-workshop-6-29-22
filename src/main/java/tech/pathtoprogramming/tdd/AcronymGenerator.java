package tech.pathtoprogramming.tdd;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AcronymGenerator {

    public String generate(String fullName) {
        if (fullName.isBlank()) {
            return "";
        }

        String[] names = splitBySpacesAndHyphens(fullName);

        return Arrays.stream(names)
                .map(this::toUpperCaseExceptForVon)
                .map(this::getInitial)
                .collect(Collectors.joining());
    }

    private String[] splitBySpacesAndHyphens(String fullName) {
        return fullName.split("[-\\s]");
    }

    private String toUpperCaseExceptForVon(String name) {
        return name.equals("von") ? name : name.toUpperCase();
    }

    private String getInitial(String name) {
        return name.substring(0, 1);
    }
}
