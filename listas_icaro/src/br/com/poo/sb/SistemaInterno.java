package br.com.poo.sb;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.sb.contas.Conta;
import br.com.poo.sb.contas.ContaCorrente;
import br.com.poo.sb.contas.ContaCorrenteEspecial;
import br.com.poo.util.Util;

public class SistemaInterno {
	
	static final Logger logger = Util.setupLogger();

	public static void operacoesBancarias(int op, double valor, Conta remetente, Conta destino) {	
		
		try {
			switch (op) {
			case 1:
				remetente.sacar(valor);
				logger.log(Level.INFO, () -> "Operação de saque realizada com sucesso. Saldo disponível: R$" + remetente.getSaldo());
				break;
			case 2:
				remetente.depositar(valor);
				logger.log(Level.INFO, () -> "Operação de depósito realizada com sucesso. Saldo disponível: R$" + remetente.getSaldo());
				break;
			case 3:
				remetente.transferir(destino, valor);
				logger.log(Level.INFO, () -> "Operação de transferência realizada com sucesso.Saldo disponível: R$" + remetente.getSaldo());
				break;
			default:
				throw new OperacaoInvalidaException("Operação inválida: " + op);
			}
		} catch (SaldoInsuficienteException e) {
			logger.log(Level.WARNING, "Erro ao realizar a operação: Saldo insuficiente", e);
		} catch (OperacaoInvalidaException e) {
			logger.log(Level.WARNING, "Erro ao realizar a operação: Operação inválida", e);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Erro inesperado ao realizar a operação", e);
		}
	}

	public static void main(String[] args) throws SaldoInsuficienteException, OperacaoInvalidaException {
		
		//Chama customizer
		Util.customizer();
		
		// instancia minhaConta
		Conta minhaConta = new Conta(123, "Pedro", 1000);
		ContaCorrente minhaContaCorrente = new ContaCorrente(123, "Pedro", 0, 100);
		ContaCorrenteEspecial minhaContaCorrenteEspecial = new ContaCorrenteEspecial(123, "Especial", 1000, 100, 500, 500);

		// instancia contaDestino
		Conta contaDestino = new Conta(321, "Destino da Silva", 5000);

		// imprime as duas contas na tela
		logger.log(Level.INFO, () -> "Minha conta\n" + minhaConta);
		logger.log(Level.INFO, () -> "Conta destino\n" + contaDestino);
		logger.log(Level.INFO, () -> "Conta Corrente\n" + minhaContaCorrente);
		logger.log(Level.INFO, () -> "Conta Corrente Especial\n" + minhaContaCorrenteEspecial);
		
		// aplicar juros cheque especial
//		minhaContaCorrente.sacar(50);
//		logger.log(Level.INFO, () -> "Conta Corrente\n" + minhaContaCorrente);
//		minhaContaCorrente.sacarChequeEspecial(50);
//		minhaContaCorrente.aplicarJurosCE(0.10);
//		logger.log(Level.INFO, () -> "Conta Corrente\n" + minhaContaCorrente);
//		minhaContaCorrente.aplicarJurosCE(0.10);
//		logger.log(Level.INFO, () -> "Conta Corrente\n" + minhaContaCorrente);
//		minhaContaCorrente.aplicarJurosCE(0.10);
//		logger.log(Level.INFO, () -> "Conta Corrente\n" + minhaContaCorrente);
		
		
		
		
//
//		operacoesBancarias(1, 2, minhaConta, null); // saque sucesso
//		operacoesBancarias(1, 2000, minhaConta, null); // saque saldo insuficiente
//		operacoesBancarias(1, -5, minhaConta, null); // saque valor invalido
//		
//		operacoesBancarias(2, 2, minhaConta, null); // deposito sucesso
//		operacoesBancarias(2, -9, minhaConta, null); // deposito erro
//		
//		operacoesBancarias(3, 500, minhaConta, contaDestino); // transf sucesso
//		operacoesBancarias(3, 1000, minhaConta, contaDestino); // transf erro - saldo insuficiente
//		operacoesBancarias(3, 200, minhaConta, null); // transf erro - conta destino inexistente
//		operacoesBancarias(3, 200, null, contaDestino); // transf erro - conta remetente inexistente
//		operacoesBancarias(3, 200, contaDestino, minhaConta ); // transf sucesso - destino > minha conta

	}

}
