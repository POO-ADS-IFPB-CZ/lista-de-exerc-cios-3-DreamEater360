package model;

import java.util.ArrayList;
import java.util.Scanner;

public class aluno {

    private String nome;
    private int matricula;
    private ArrayList<Double> notas = new ArrayList<>();
    private float media;
    Scanner sc = new Scanner(System.in);


    public aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public void cadastrarNotas() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe a " + i + "ª nota:");
            notas.add(sc.nextDouble());
        }
        calcularMedia();
    }

    public void calcularMedia() {
        float sum = 0;
        for (Double nota : notas) {
            sum += nota;
        }
        this.media = sum / notas.size();
    }

    public float getMedia() {
        return media;
    }

    public boolean verify() {
        return media >= 7;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", Matrícula: " + matricula + ", Média: " + media;
    }

}