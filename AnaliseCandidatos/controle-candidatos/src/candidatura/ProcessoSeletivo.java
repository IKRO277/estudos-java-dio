package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void  imprimirSelecionados(){
        String [] candidatos = {"ICARO", "LARISSA", "EMILLY", "VITOR", "ALEXANDRE"};
        System.out.println("Imprimindo a lista de candidatos por indice");
        for(int indices = 0; indices < candidatos.length; indices++){
            System.out.println("O canditato de numero: "+ (indices+1) + candidatos[indices] + " foi selecionado" );
        }
        
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
                else
                    System.out.println("Contato realizado com Sucesso");
        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
        System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
        else
        System.out.println(" Não Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
    }       

    static void selecaoCandidatos() {
        // Array contendo os nomes dos candidatos
        String[] candidatos = {"ICARO", "LARISSA", "EMILLY", "VITOR", "ALEXANDRE", "EMANUEL", "ARISTOTELES", "JOAO", "AUGUSTO", "LILITH"};

        // Contadores para acompanhar o número de candidatos selecionados e o índice do candidato atual
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;

        // Salário base utilizado como referência para seleção de candidatos
        double salarioBase = 2000.0;

        // Laço de repetição para avaliar candidatos
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            // Obtém o nome do candidato atual
            String candidato = candidatos[candidatosAtual];

            // Gera um valor aleatório para o salário pretendido do candidato
            double salarioPretendido = valorPretendido();

            // Exibe informações sobre o candidato e seu salário pretendido
            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido);

            // Verifica se o candidato foi selecionado com base em seu salário pretendido
            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado");
            }

            // Move para o próximo candidato
            candidatosAtual++;
        }
    }

    // Método para gerar um valor aleatório de salário pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    

    // Método para analisar o candidato com base em seu salário pretendido
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
     
       static boolean atender(){
        return new Random().nextInt(3)==1;
    }

 
}
