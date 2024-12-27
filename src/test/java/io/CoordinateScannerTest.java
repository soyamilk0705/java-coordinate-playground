package io;

import messages.ErrorMessages;
import model.Coordinate;
import model.Point;
import model.Points;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CoordinateScannerTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "(10,10)-(14,15)",
            "(0,0)-(24,24)",
            "(15,15)-(0,0)"
    })
    @DisplayName("입력 포맷 검증")
    void isCorrectFormat(String input){
        // given
        CoordinateScanner scanner = new CoordinateScanner();

        // when, then
        assertDoesNotThrow(() -> scanner.isCorrectFormat(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "(10,10-(14,15)",
            "(00)-(24,24)",
            "(15,)-(0,0)",
            "(10,10)(14,15)",
            "(10, 130)-(14,  15)",
            "(10,10)-14,15)"
    })
    @DisplayName("입력 포맷 검증 시 예외 발생")
    void isInvalidCorrectFormat(String input){
        // given
        CoordinateScanner scanner = new CoordinateScanner();

        // when
        IllegalArgumentException fail = assertThrows(IllegalArgumentException.class, () -> scanner.isCorrectFormat(input));

        // then
        assertThat(fail.getMessage()).isEqualTo(ErrorMessages.INVALID_FORMAT_INPUT);
    }

    @Test
    @DisplayName("입력값 파싱 후 Points 객체 생성")
    void parseNumber(){
        // given
        CoordinateScanner scanner = new CoordinateScanner();
        Points mockPoints = new Points(Point.from(10, 10), Point.from(14, 15));

        // when
        Points points = scanner.parseNumber("(10,10)-(14,15)");

        // then
        assertThat(points.equals(mockPoints)).isTrue();
    }

}