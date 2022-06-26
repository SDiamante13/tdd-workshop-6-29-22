package tech.pathtoprogramming.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AcronymGeneratorTest {
    @ParameterizedTest
    @CsvSource({
            "'',''",
            "Tom,T",
            "Steven Diamante,SD",
            "martin schmidt,MS",
            "Jan Erich Mueller,JEM",
            "Jan-Erich Schmidt,JES",
            "Paul Meyer-Schmidt,PMS",
            "Paul von Lahnstein,PvL",
            "Martin von Lahnstein-Meyer,MvLM"
    })
    void returnsAcronymOfPersonsFullName(String fullName, String expectedAcronym) {
        AcronymGenerator acronymGenerator = new AcronymGenerator();

        String result = acronymGenerator.generate(fullName);

        assertThat(result).isEqualTo(expectedAcronym);
    }
}
