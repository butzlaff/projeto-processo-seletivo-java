package edu.butzlaff.candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando o processo seletivo...");

        analizarCandidato(2100.0);
        analizarCandidato(2000.0);
        analizarCandidato(1900.0);
    }
    static void analizarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
