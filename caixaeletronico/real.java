package caixaeletronico;

public class real{

    private double valorreal;

    public real(){
        super();
    }

    public real(double valorreal){
        this.valorreal = valorreal;
    }

    public double getValorreal() {
        return valorreal;
    }

    public void setValorreal(double valorreal) {
        this.valorreal = valorreal;
    }

    public void sacarreal(){
        
        String notas = "Cédulas Disponíveis R$2, R$5, R$10, R$20, R$50, R$100 ";
        
        System.out.println(notas);
        
    } 

}

//alan é um amigo gente boa
