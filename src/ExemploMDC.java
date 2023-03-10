public class ExemploMDC {
    public static void main(String[] args) {
        MDC objetoMDC = new MDC();
        objetoMDC.exibirMN();
        //objetoMDC.setMN(-5,6);
        objetoMDC.setM(20);
        objetoMDC.setN(6);
        objetoMDC.exibirMN();
        long resultadoMDC = objetoMDC.calcularMDC();
        System.out.println("mdc = " +resultadoMDC);
    }
}
