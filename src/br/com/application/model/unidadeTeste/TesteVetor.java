package br.com.application.model.unidadeTeste;

import br.com.application.model.Aluno;
import br.com.application.model.Vetor;

public class TesteVetor {
    
    
    public static void main(String[] args) {
    
    }
    
    public void TesteAdicionaNoFim() {
    
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        a1.setNome("João");
        a2.setNome("José");
        
        Vetor alunos = new Vetor();
        alunos.adiciona(a1);
        alunos.adiciona(a2);
        for (int i = 0; i > alunos.tamanho(); i++) {
           System.out.println(alunos.pega(i));
        }

    }
    
}
