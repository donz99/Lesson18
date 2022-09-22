package Lesson17;

public class Main {
    public static void main(String[] args) {

        /*Phone p1 = new Phone(0,"s2",100);
        System.out.println(p1);
        p1.receiveCall("Валя",123212131);
        p1.getNumber(2813123);


        Phone p2 = new Phone(1,"G8",200);
        System.out.println(p2);
        p1.receiveCall("Галя",232132);
        p1.getNumber(5813121);

        Phone p3 = new Phone(2,"SD92",300);
        System.out.println(p3);
        p1.receiveCall("Шаля",12321313);
        p1.getNumber(9813129);*/

        /*Person p = new Person();
        System.out.println(p);
        Person p1 = new Person("Вася Пупкин", 30);
        System.out.println(p1);
        p1.move();*/

        Matrix a = new Matrix(2,2);
        a.fillMatrix(1);
        a.print();
        System.out.println();

        /*Matrix b = new Matrix(2,2);
        b.fillMatrix(2);
        b.print();
        System.out.println();

        Matrix c = a.addMatrix(b);
        if (c != null) c.print();
        else System.out.println("ошибка");
        System.out.println();*/

        a.umnMatrix(3);
        a.print();

        Reader[][] arr = new Reader[][]();


    }


}
