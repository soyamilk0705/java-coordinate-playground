package abs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SonataTest {

    @Test
    @DisplayName("자동차 이름 반환")
    void getCarName(){
        // given
        RentCar sonata = new Sonata(100);

        // when
        String response = sonata.getCarName();

        // then
        assertThat(response).isEqualTo("Sonata");
    }

    @Test
    @DisplayName("자동차 연비 반환")
    void getFuelEfficiency(){
        // given
        RentCar sonata = new Sonata(100);

        // when
        int response = sonata.getFuelEfficiency();

        // then
        assertThat(response).isEqualTo(10);
    }

    @Test
    @DisplayName("자동차 연료량 계산")
    void calculate(){
        // given
        RentCar sonata = new Sonata(100);

        // when
        int response = sonata.calculate();

        // then
        assertThat(response).isEqualTo(10);
    }

    @Test
    @DisplayName("자동차 연료량 계산 시 0 입력한 경우")
    void calculateInputZero(){
        // given
        RentCar sonata = new Sonata(0);

        // when
        int response = sonata.calculate();

        // then
        assertThat(response).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 연료량 계산 시 마이너스 입력한 경우")
    void calculateInputMinus(){
        // given
        RentCar sonata = new Sonata(-100);

        // when
        int response = sonata.calculate();

        // then
        assertThat(response).isEqualTo(-10);
    }
}