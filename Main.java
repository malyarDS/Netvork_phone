import com.gmail.kr.malyar.Network;
import com.gmail.kr.malyar.Phone;

/*Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
класс Network (сеть мобильного оператора). Телефон должен иметь метод
регистрации в сети мобильного оператора. Также у телефона должен быть метод call
(номер другого телефона), который переберет все телефоны, зарегистрированные в
сети. Если такой номер найден, то осуществить вызов, если нет - вывести сообщение
о неправильности набранного номера.*/

public class Main {
    public static void main(String[] args) {
        Network bestNetwork = new Network();
        Phone phoneOne = new Phone("123","Nokia");
        Phone phoneTwo = new Phone("456","LG");

        phoneOne.registration(bestNetwork);
        phoneTwo.registration(bestNetwork);

        phoneOne.call("456");
        phoneTwo.call("123");
        phoneOne.call("789");
    }
}
