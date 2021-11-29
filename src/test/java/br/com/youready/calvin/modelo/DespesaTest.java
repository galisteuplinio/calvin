package br.com.youready.calvin.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DespesaTest {
    
    @Test
    public void testeDespesa() {
        Despesa despesa = new Despesa(34.34, "comida");

        Double valorDespesa = despesa.valor();

        Assertions.assertEquals(34.34, valorDespesa);
    }
    
    @ParameterizedTest
    @ValueSource(doubles = {0,-10, -1, -10000})
    public void testa(double valorInvalido) {
       
        Assertions.assertThrows(ValorDespesaInvalido.class, () -> new Despesa(valorInvalido, "comida") );
    }
}
