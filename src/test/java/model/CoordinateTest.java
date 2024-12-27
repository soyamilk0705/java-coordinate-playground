package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {

    @Test
    @DisplayName("입력값 검증으로 true 반환")
    void isCorrectRangeTrue(){
        // given
        Coordinate coordinate = new Coordinate(24.0);

        // when
        boolean response = coordinate.isCorrectRange();

        // then
        assertThat(response).isTrue();
    }

    @Test
    @DisplayName("입력값 검증으로 false 반환")
    void isCorrectRangeFalse(){
        // given
        Coordinate coordinate = new Coordinate(24.1);

        // when
        boolean response = coordinate.isCorrectRange();

        // then
        assertThat(response).isFalse();
    }
}
