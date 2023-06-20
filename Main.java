

public class Main {
    public static void main(String[] args) {
        Calcul calc = new Calcul(12, 2);
        System.out.println(calc);
        calc.summa();
        calc.delenie();
        calc.setA(15);
        calc.setB(5);
        calc.delenie();
        // и еще делаем напрямую
        System.out.println(calc.raznost(5, 4));
        System.out.println(calc.delenie(4, 2));
    }
}
