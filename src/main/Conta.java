package main;

import java.util.InputMismatchException;

public class Conta {
    private String nome;
    private double saldo;
    private String numero;

    public Conta(String nome, String numero) {
        this.saldo = 0;
        this.nome = nome;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0)
            saldo += valor;
        else
            throw new IllegalArgumentException("O valor informado deve ser maior que 0.");
    }

    public void sacar(double valor) {
        if (valor > 0)
            if (saldo >= valor)
                saldo -= valor;
            else
                throw new IllegalArgumentException("O valor informado é superior ao saldo disponível.");
        else
            throw new IllegalArgumentException("O valor informado deve ser maior que 0.");
    }

    @Override
    public String toString() {
        return "Saldo atual da conta: " + saldo;
    }
}
