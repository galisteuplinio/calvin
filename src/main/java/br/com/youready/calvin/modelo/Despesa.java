package br.com.youready.calvin.modelo;

public class Despesa {
    private final Double valor;
    
    public Despesa(double valor, String string) {
        if (valor <= 0){
            throw new ValorDespesaInvalido();
        }
        this.valor = valor;
    }

    public Double valor() {

        return this.valor;
    }
    

}
