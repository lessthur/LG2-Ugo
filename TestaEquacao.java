import java.util.Scanner;

public class TestaEquacao {
    public static void main(String[] args) {
        EquacaoQuadratica equacao1 = new EquacaoQuadratica();
        EquacaoQuadratica equacao2 = new EquacaoQuadratica();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o coeficiente a: ");
        double a = input.nextDouble();
        System.out.println("Digite o coeficiente b: ");
        double b = input.nextDouble();
        System.out.println("Digite o coeficiente c: ");
        double c = input.nextDouble();

        System.out.println("Equação 1: ");
        System.out.println(equacao1.getA()+ "x² + " + equacao1.getB() + "x + " + equacao1.getC());
        System.out.println("Equação 2: ");
        System.out.println(equacao2.getA()+ "x² + " + equacao2.getB() + "x + " + equacao2.getC());

        try{
            equacao1.setA(a);
        }catch (Exception ex) {
            System.out.println("Exceção ocorrida" + ex.getMessage());
            try {
                equacao1.setA(1);
            }catch (Exception ex1) {

            }
        }
        equacao1.setB(b);
        equacao1.setC(c);
        double raizes[] = new double[2];
        try {
            raizes[0] = equacao1.calcularRaiz0();
            raizes[1] = equacao1.calcularRaiz1();
        } catch (Exception ex) {
            System.out.println("Exceção ocorrida" + ex.getMessage());
        }
        System.out.println("x1 = " + raizes[0]);
        System.out.println("x2 = " + raizes[1]);
    }
}
