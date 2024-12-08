package abs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class K5Test {
    @Test
    @DisplayName("자동차 이름 반환")
    void getCarName(){
        // given
        RentCar k5 = new K5(130);

        // when
        String response = k5.getCarName();

        // then
        assertThat(response).isEqualTo("K5");
    }

    @Test
    @DisplayName("자동차 연비 반환")
    void getFuelEfficiency(){
        // given
        RentCar k5 = new K5(130);

        // when
        int response = k5.getFuelEfficiency();

        // then
        assertThat(response).isEqualTo(13);
    }

    @Test
    @DisplayName("자동차 연료량 계산")
    void calculate(){
        // given
        RentCar k5 = new K5(130);

        // when
        int response = k5.calculate();

        // then
        assertThat(response).isEqualTo(10);
    }

    @Test
    @DisplayName("자동차 연료량 계산 시 0 입력한 경우")
    void calculateInputZero(){
        // given
        RentCar k5 = new K5(0);

        // when
        int response = k5.calculate();

        // then
        assertThat(response).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 연료량 계산 시 마이너스 입력한 경우")
    void calculateInputMinus(){
        // given
        RentCar k5 = new K5(-130);

        // when
        int response = k5.calculate();

        // then
        assertThat(response).isEqualTo(-10);
    }
}