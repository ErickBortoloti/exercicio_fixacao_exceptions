package model.entities;

import model.exceptions.DominioExceptions;

public class Conta {
	private Integer numero;
	private String nome;
	private Double Saldo;
	private Double limiteDeSaque;
	
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
	
	public double saque(double saque) throws DominioExceptions  {
	       if (saque > limiteDeSaque) {
	            throw new DominioExceptions("ERRO DE SAQUE: Valor para saque não pode ser maior que o limite");
	        }

	        if (saque > Saldo) {
	            throw new DominioExceptions("ERRO DE SAQUE: Saldo insuficiente");
	        }

	        return Saldo -= saque;
	    }
	
	
	@Override
	
	public String toString() {
		return "Numero da conta: " 
			  + numero
			  + "\nTitular "
			  + nome
			  + "\nSaldo inicial: "
			  + Saldo
			  + "\nLimite de empréstimo: R$"
			  + limiteDeSaque;
	
	

}
	}
