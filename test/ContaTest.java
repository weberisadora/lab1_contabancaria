import main.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    private Conta conta;

    @BeforeEach
    public void setUp() {
        conta = new Conta("Isadora Weber", "101112");
    }

    @Test
    public void depositarValorValido() {
        conta.depositar(100.00);
        assertEquals(100.00, conta.getSaldo());
    }

    @Test
    public void depositarValorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            conta.depositar(0.00);
        });
    }

    @Test
    public void sacarValorValido() {
        conta.depositar(100.00);
        conta.sacar(50.00);
        assertEquals(50.00, conta.getSaldo());
    }

    @Test
    public void sacarValorInvalido() {
        conta.depositar(100.00);

        assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(200.00);
        });
    }
}