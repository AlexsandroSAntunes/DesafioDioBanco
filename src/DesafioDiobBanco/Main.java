package DesafioDiobBanco;

public class Main {
        public static void main(String[] args) {
            Conta cc = new ContaCorrente();
            Conta contaPoupanca = new ContaPoupanca();

            cc.depositar(100.0);
            contaPoupanca.depositar(200.0);

            System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
            System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
        }
    }

