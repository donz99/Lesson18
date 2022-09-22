package Lesson17;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(){
        number = 0;  //или пишем name = null;
        model = "";
        weight = 0;
    }

    public Phone(int number, String model, int weight){
        this(number, model);
        this.weight=weight;
    }

    public Phone(int number, String model){
        this.number=number;
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return "Phone " +
                "number= " + number +
                ", model='" + model + '\'' +
                ", weight= " + weight;
    }

    public void receiveCall (String name) {
        System.out.println("Звонит: " + name);
    }

    public void receiveCall (String name, int number) {
        System.out.println("Звонит: " + name + " номер: " + number);
    }

    public void getNumber (int number) {
        System.out.println("Номер телефона: " + number);
        System.out.println();
    }
}
