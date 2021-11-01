import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormTest {
    @BeforeAll
static void beforeAll() {
    Configuration.startMaximized = true;
}

    @Test
    public void firstTest() {
        open("https://dev-l11.test.gosuslugi.ru/600155/1/form");
        $("#login").setValue("112-233-446 96"); //авторизация//
        $("#password").setValue("11111111");
        $("#loginByPwdButton").click(); //клик по входу//
        $(byText("Каменев И.В.")).click(); // УЗ //
        $(byText("Начать заново")).click();
        $(byText("Начать")).click();
        $(byText("Переоформление лицензии на осуществление предпринимательской деятельности по управлению многоквартирными домами")).click();
        $(byText("Индивидуальный предприниматель")).click(); //Укажите категорию заявителя//
        $(byText("Верно")).click();
        $(byText("Верно")).click();
        $(byText("Верно")).click();
        $(byText("Верно")).click();
        $(byText("Верно")).click();
        $(".multiline-input").setValue("Витька пишет тест"); //Сведения о завителе //
        $(".form__input").click();
        $(".form__input").setValue("317768885377");


        $(".text-input").setValue("317768885377");
        $(".text-input invalid").setValue("310640924084370"); //Сведения о завителе //
        $(".search-input ng-pristine ng-valid ng-touched invalid").setValue("317768885377"); //Сведения о завителе //










        $(".flex-container").click(); //Выбор УЗ//
        $(".button-container").click();
        $(".button font-").click();
        $(".answer-btn__icon").click();
        $(".answer-btn__container").click(); //Подуслуга //
        $(".answer-btn__container").click();
        $(".answer-btn__title").click();
        //  $(".answer-btn__title").click();




    }
    }

