package calculator;
// Написать калькулятор в ООП стиле(инкапсуляция, наследованеи. полиморфизм)
// программа написана через методы которые позволяют задавать значения а и б для решения
// а также при выборе метода можно сразу в методе указывать значения и решать необходимый премер
public class Main {
    public static void main(String[] args) {
        Calcul calc = new Calcul(12, 2);
        calc.summa();
        calc.delenie();
        System.out.println(calc.delenie(4, 2));
        calc.setA(15);
        calc.setB(5);
        calc.delenie();
    }
}
