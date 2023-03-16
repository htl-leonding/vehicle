package at.htl.vehicle.person;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class PersonTest {

    @Test
    void itShouldHaveNameSusi_givenNameSusi() {
        var person = new Person(
                "Susi",
                LocalDate.of(2000, Month.AUGUST, 10));
        assertThat(person.getName()).isEqualTo("Susi");
    }
}