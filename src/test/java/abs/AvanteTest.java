package abs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AvanteTest {

    @Test
    @DisplayName("자동차 이름 반환")
    void getCarName(){
        // given
        RentCar avante = new Avante(150);

        // when
        String response = avante.getCarName();

        // then
        assertThat(response).isEqualTo("Avante");
    }

    @Test
    @DisplayName("자동차 연비 반환")
    void getFuelEfficiency(){
        // given
        RentCar avante = new Avante(150);

        // when
        int response = avante.getFuelEfficiency();

        // then
        assertThat(response).isEqualTo(15);
    }

    @Test
    @DisplayName("자동차 연료량 계산")
    void calculate(){
        // given
        RentCar avante = new Avante(150);

        // when
        int response = avante.calculate();

        // then
        assertThat(response).isEqualTo(10);
    }

    @Test
    @DisplayName("자동차 연료량 계산 시 0 입력한 경우")
    void calculateInputZero(){
        // given
        RentCar avante = new Avante(0);

        // when
        int response = avante.calculate();

        // then
        assertThat(response).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 연료량 계산 시 마이너스 입력한 경우")
    void calculateInputMinus(){
        // given
        RentCar avante = new Avante(-150);

        // when
        int response = avante.calculate();

        // then
        assertThat(response).isEqualTo(-10);
    }

}