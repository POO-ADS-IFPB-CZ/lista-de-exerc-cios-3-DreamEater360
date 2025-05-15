package view;

import model.*;

public class Main {
    public static void main(String[] args) {
        turma sala = new turma();
        sala.cadastrarAluno();
        sala.cadastrarAluno();
        sala.cadastrarAluno();

        sala.listAprovados();
        sala.listReprovados();

    }
}