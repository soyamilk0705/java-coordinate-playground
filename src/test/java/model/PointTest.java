package model;

import messages.ErrorMessages;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PointTest {

    @Test
    @DisplayName("x, y 좌표값 범위 유효성 검사")
    void validateRange(){
        // given
        Point point = Point.from(24.0, 0.0);

        // when, then
        assertDoesNotThrow(point::validateRange);
    }

    @Test
    @DisplayName("x 좌표값 범위 초과로 예외 발생")
    void validateRange_overRangeX(){
        // given, when
        IllegalArgumentException fail = assertThrows(IllegalArgumentException.class, () -> Point.from(24.1, 0.0));

        // then
        assertThat(fail.getMessage()).isEqualTo(ErrorMessages.INVALID_RANGE_INPUT);

    }

    @Test
    @DisplayName("y 좌표값 범위 초과로 예외 발생")
    void validateRange_overRangeY(){
        // given, when
        IllegalArgumentException fail = assertThrows(IllegalArgumentException.class, () -> Point.from(24.0, -0.9));

        // then
        assertThat(fail.getMessage()).isEqualTo(ErrorMessages.INVALID_RANGE_INPUT);

    }

    @Test
    @DisplayName("x, y 좌표값 범위 초과로 예외 발생")
    void validateRange_overRangeXY(){
        // given, when
        IllegalArgumentException fail = assertThrows(IllegalArgumentException.class, () -> Point.from(24.1, -0.9));

        // then
        assertThat(fail.getMessage()).isEqualTo(ErrorMessages.INVALID_RANGE_INPUT);

    }
}
