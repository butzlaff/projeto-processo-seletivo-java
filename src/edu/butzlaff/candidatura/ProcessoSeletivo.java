package edu.butzlaff.candidatura;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    final static double SALARIO_BASE = 2000.0;
    static ArrayList<String> candidatosSelecionados = new ArrayList<>();
    static String[] candidatos = { "João", "Maria", "José", "Pedro", "Ana", "Carlos", "Paulo", "Marta", "Lucas", "Marcos" };

    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando o processo seletivo...");

        selecaoCandidato();
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        if (candidatosSelecionados.isEmpty()) {
            System.out.println("Nenhum candidato selecionado.");
            return;
        }
        for (String candidatoSelecionado : candidatosSelecionados) {
            System.out.println("Candidatos selecionados: " + candidatoSelecionado);
        }
    }

    static void selecaoCandidato() {
        int candidatosSelecionadosContador = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionadosContador < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Analisando o candidato " + candidato + " com o salário pretendido de R$ " + salarioPretendido);
            if (SALARIO_BASE > salarioPretendido) {
                candidatosSelecionadosContador++;
                candidatosSelecionados.add(candidato);
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }
}
