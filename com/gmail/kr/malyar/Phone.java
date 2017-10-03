package com.gmail.kr.malyar;

/*Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
класс Network (сеть мобильного оператора). Телефон должен иметь метод
регистрации в сети мобильного оператора. Также у телефона должен быть метод call
(номер другого телефона), который переберет все телефоны, зарегистрированные в
сети. Если такой номер найден, то осуществить вызов, если нет - вывести сообщение
о неправильности набранного номера.*/


public class Phone {
    private String numberPhone;
    private Network network;
    private String model;

    public Phone(String numberPhone, String model) {
        this.numberPhone = numberPhone;
        this.model = model;
    }

    public Phone() {
        super();
    }


    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "numberPhone=" + numberPhone +
                ", network=" + network +
                ", model='" + model + '\'' +
                '}';
    }

    public void registration(Network network) {
        this.network = network;
        this.network.addPhone(this);
        if(Network.addPhone(this)==false){
            this.network = null;
        }
    }

    public void call(String numberPhone) {
        if(this.network==null){
            System.out.println("This phone don't register");
            return;
        }
        if (Network.phoneAvailable(numberPhone)){

            System.out.println("dzin-dzin");
            System.out.println("Calling" + numberPhone);
            this.inCall(numberPhone);
        }else{

            System.out.println("Number "+numberPhone+
                    " doesn't available ");
        }

    }
    public void inCall(String nomberPhone){
        System.out.println(this+"Dzin");
    }
}
