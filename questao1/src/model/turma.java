package model;

import java.util.ArrayList;
import java.util.Scanner;

public class turma {

    Scanner sc = new Scanner(System.in);
    ArrayList<aluno> Alunos = new ArrayList<>();

    public turma() {
    }

    public void cadastrarAluno() {

        System.out.println("Informe o nome do aluno: ");
        String nome = sc.next();
        System.out.println("Informe o numero da matricula: ");
        int matricula = sc.nextInt();

        aluno estudante = new aluno(nome, matricula);
        estudante.cadastrarNotas();
        Alunos.add(estudante);
    }

    public void listAprovados() {
        System.out.println("\nAprovados:"); // Adicionei um cabeçalho para facilitar a leitura
        for (aluno a : Alunos) {
            if (a.verify()) {
                System.out.println(a);
            }
        }
    }

    public void listReprovados() {
        System.out.println("\nReprovados:"); // Adicionei um cabeçalho para facilitar a leitura
        for (aluno a : Alunos) {
            if (!a.verify()) {
                System.out.println(a);
            }
        }
    }
}