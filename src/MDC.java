
public class MDC {
    //atributo m da classe mdc
    private long m;
    //atributo n da classe mdc
    private long n;

    public long calcularMDC(){
        long m = this.m;
        long n = this.n;
        long r = 0;
        do{
            r = m % n;
            m = n;
            n = r;
        }while (n != 0);
        return m;
    }

    //método para alterar os atributos m e n da classe mdc
    public void setMN(long m, long n){
        this.setM(m);
        this.setN(n);

    }

    //método para alterar o atributo m da classe mdc
    public void setM (long m) throws Exception{
        this.m = m;

        if(m < 1){

            throw new Exception ("Valor invalido para m");
        }
    }

    //método para alterar o atributo n da classe mdc
    public void setN(long n){
        this.n = n;
    }

    //método para obter/ler o atributo m da classe
    public long getM(){
        return this.m;
    }

    //método para obter/ler o atributo n da classe
    public long getN(){
        return this.n;
    }

    public void exibirMN(){
        System.out.println("m :" +this.m);
        System.out.println("n :" +this.n);
    }
}
