package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PointsTest {

    @Test
    @DisplayName("x 좌표 거리 계산")
    void minusX(){
        // given
        Points points = new Points(Point.from(10.0, 10.0), Point.from(14.0, 15.0));

        // when
        double response = points.minusX();

        // then
        assertThat(response).isEqualTo(-4.0);
    }

    @Test
    @DisplayName("y 좌표 거리 계산")
    void minusY(){
        // given
        Points points = new Points(Point.from(10.0, 10.0), Point.from(14.0, 15.0));

        // when
        double response = points.minusY();

        // then
        assertThat(response).isEqualTo(-5.0);
    }

}