package com.gmail.kr.malyar;

/*Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
класс Network (сеть мобильного оператора). Телефон должен иметь метод
регистрации в сети мобильного оператора. Также у телефона должен быть метод call
(номер другого телефона), который переберет все телефоны, зарегистрированные в
сети. Если такой номер найден, то осуществить вызов, если нет - вывести сообщение
о неправильности набранного номера.*/

public class Network {
    private static Phone[] registration = new Phone[0];


    public int phoneAvailable(Phone nomberPhone) {
        for (int i = 0; i < registration.length ; i++) {
            if (registration[i].getNumberPhone() == nomberPhone.getNumberPhone()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    public static boolean addPhone (Phone numberPhone){

            if (phoneAvailable(numberPhone)== 1){
                System.out.println("Number "
                        +numberPhone+
                " is registered");
                return false;
            }

            Phone[] tempArrPhone = new Phone[registration.length + 1];
            System.arraycopy(registration, 0, tempArrPhone,
                    registration.length, tempArrPhone.length);
            tempArrPhone[tempArrPhone.length - 1] = numberPhone;
            registration = tempArrPhone;
            return true;

        }

}
