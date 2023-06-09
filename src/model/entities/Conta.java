package model.entities;

import java.util.InputMismatchException;

import model.exceptions.DominioExceptions;

public class Conta {
	private Integer numero;
	private String nome;
	private Double Saldo;
	private Double limiteDeSaque;
	
	public Conta() {
	}
	
	public Conta(Integer numero, String nome, Double saldo, Double limiteDeSaque) throws DominioExceptions {
		this.numero = numero;
		this.nome = nome;
		Saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return Saldo;
	}

	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	
	public void deposito(double valor) {
		Saldo += valor;
	}
	
	public void saque(double valor)  {
			validarSaque(valor);
	        Saldo -= valor;
	    }
	private void validarSaque(double saque) {
		if (saque > getLimiteDeSaque()) {
			throw new DominioExceptions("Erro de saque: A quantia excede o limite de saque");
		}
		if (saque > getSaldo()) {
			throw new DominioExceptions("Erro de saque: Saldo insuficiente");
		}
	}
	
	
	@Override
	
	public String toString() {
		return "Numero da conta: " 
			  + numero
			  + "\nTitular da conta: "
			  + nome
			  + "\nLimite de empréstimo: R$"
			  + limiteDeSaque
			  + "\nSaldo atual: "
			  + Saldo;
	
	

}
	}
