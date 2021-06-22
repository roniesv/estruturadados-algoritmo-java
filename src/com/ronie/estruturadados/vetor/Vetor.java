package com.ronie.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos;
	int tamanho;
	
	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	
	/* public void adiciona(String elemento) { 
			for(int i = 0; i<this.elementos.length; i++) {
			   if(elementos[i]==null)
			   elementos[i] = elemento;
			   break; 
			}
	}*/	
	
	/*public void adiciona(String elemento) throws Exception {
		 if(this.tamanho <this.elementos.length) {
			 this.elementos[this.tamanho] = elemento;
			 this.tamanho++;
		 }else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos"); 
		 } 
		 
	 }*/
	 
	 public boolean adiciona(String elemento)
	 {
		 if(this.tamanho <this.elementos.length) 
		 {
			 this.elementos[this.tamanho] = elemento;
			 this.tamanho++;
			 return true;	 
		 }
		 return false;
		 //vamos que vamos
	}
	
	public int getTamanho() {
		return this.tamanho;
	}


	@Override
	public String toString() {
		StringBuilder s =  new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho>0) {
			s.append(this.elementos[tamanho-1]);
		}
		s.append("]");
		
		
		return s.toString();
	}


	/*
	 * @Override public String toString() {
	 * 
	 * String s = "["; for (int i=0; i<this.tamanho-1; i++) { s +=
	 * this.elementos[i]; s += ", "; } if(this.tamanho>0) { s +=
	 * this.elementos[this.tamanho-1];
	 * 
	 * } s+= "]"; //return Arrays.toString(elementos); return s; }
	 */
	
	
	
	
	 
}
