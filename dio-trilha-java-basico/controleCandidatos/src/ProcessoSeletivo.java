import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
      /**
      analisarCandidato(1900.0);    
      analisarCandidato(2200.0);    
      analisarCandidato(2000.0);   
      **/ 
      selecaoCandidatos();
      System.out.println();
      imprimirSelecionados();
      System.out.println();

      String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
      for (String candidato : candidatos) {
        entrandoEmContato(candidato);
      }

    }

    static void entrandoEmContato(String candidatos){
      int tentativasRealizadas = 1;
      boolean continuarTentando = true;
      boolean atendeu = false;
      do{

        atendeu = atender();
        continuarTentando = !atendeu;

        if (continuarTentando) {
            tentativasRealizadas++;
        }else{
          System.out.println("Contato realizado com sucesso");
        }

      } while(continuarTentando && tentativasRealizadas < 3);

      if(atendeu){
        System.out.println("Conseguimos contato com " + candidatos + " na " + tentativasRealizadas + " tentativas");
      } else {
        System.out.println("Não conseguimos contato com " + candidatos + ", número máximo de tentativas " + tentativasRealizadas + " realizadas");
      }

    }

    static boolean atender(){
      return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
      String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

      System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

      for (int i = 0; i < candidatos.length; i ++){
        System.out.println("O candidato de Nº " + (i+1) + " é o " + candidatos[i]);
      }
    }

    static void selecaoCandidatos(){
      String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

      int candidatosSelecionados = 0;
      int candidatosAtual = 0;
      double salarioBase = 2000.0;
      while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();

        System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);

        if (salarioBase >= salarioPretendido) {
          System.out.println("O candidato  " + candidato + " foi selecionado para a vaga");
          candidatosSelecionados ++;
        }
        candidatosAtual ++;
      }
    }

    static double valorPretendido(){
      return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido)  {
      double salarioBase = 2000.0;
      if(salarioBase > salarioPretendido){
        System.out.println("Ligar para o candidato");
      } else if (salarioBase == salarioPretendido){
        System.out.println("Ligar para o candidato com contra proposta");
      } else {
        System.out.println("Aguardando o resultado dos demais candidatos");
      }
    }
}
