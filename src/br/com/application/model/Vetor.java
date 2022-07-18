package br.com.application.model;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    
    private int totalDeAlunos = 0;
    
    private void garantaEspaco() {
        if (this.totalDeAlunos == this.alunos.length) {
            Aluno[] novaArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novaArray[i] = this.alunos[i];
            }
            this.alunos = novaArray;
        }
    }
    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDeAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }

        if (this.totalDeAlunos == 0) {
            return "[]";
        }
        
        builder.append(this.alunos[this.totalDeAlunos - 1]);
        builder.append("]");
        return builder.toString();
    }
    
    public void adiciona(Aluno aluno) {
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }
    
    public void adiciona(int posicao, Aluno aluno) {
        
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        for (int i = this.totalDeAlunos - 1; i >= posicao; i-=1) {
            this.alunos[i + 1] = this.alunos[i];
        }
        
        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;
    }
    
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (aluno == this.alunos[i]) {
                return true;
            }
        }      
        return false;
    }
    
    public Aluno pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }
    
    public void remove(int posicao) {
    
    }
    
    public int tamanho() {
        return this.totalDeAlunos;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeAlunos;
    }
    
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }
}
