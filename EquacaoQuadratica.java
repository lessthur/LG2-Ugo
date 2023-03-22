public class EquacaoQuadratica {
    private double a;
    private double b;
    private double c;
    double [] raizes = new double[2];

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }

    public void setA(double a) throws Exception{
        if (a == 0)
            throw new Exception("Argumento inválido! Não pode ser zero. ");
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }

    private double calcularDelta(){
        return (b*b) - (4 * a * c);
    }

    public double calcularRaiz0()throws Exception{
        double delta = this.calcularDelta();
        if (delta < 0)
            throw new Exception("Delta é negativo, portanto, não existem raízes reais. ");
        //função sqrt retorna a raiz quadrada de um determinado número
        raizes[0] = (-b + Math.sqrt(delta)/(2 * a));
        return raizes[0];
    }

    public double calcularRaiz1()throws Exception{
        double delta = this.calcularDelta();
        if (delta < 0)
            throw new Exception("Delta é negativo, portanto, não existem raízes reais. ");
        //função sqrt retorna a raiz quadrada de um determinado número
        raizes[1] = (-b + Math.sqrt(delta)/(2 * a));
        return raizes[1];
    }
}
