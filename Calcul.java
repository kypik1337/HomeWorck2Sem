package calculator;

public class Calcul implements Deistvie{
    @Override
    public String toString() {
        return "Calcul [a=" + a + ", b=" + b + "]";
    }
    private int a;
    private int b;
    
    public Calcul(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public int summa(int a, int b) {
        return a + b;
    }
    @Override
    public double raznost(int a, int b) {
        return a - b;
    }
    @Override
    public double umnojenie(int a, int b) {
       return a * b;
    }
    @Override
    public double delenie(int a, int b) {
      return a / b;
    }
  
    
    public void summa(){
        System.out.println(a + b);
    }

    public void raznost(){
        System.out.println(a - b);
    }
    public void umnojenie() {
        System.out.println(a * b);
     }
     public void delenie() {
        System.out.println(a / b);
     }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
}
