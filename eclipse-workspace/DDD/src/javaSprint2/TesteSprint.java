package javaSprint2;
import java.util.Scanner;

public class TesteSprint {
	

	public static void main(String[] args) {

	        Scanner menu = new Scanner (System.in);
	        System.out.println("TELA DE MENU: ");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("| Op��o 1 - Cadastro          |\n");
	        System.out.print("| Op��o 2 - Vagas             |\n");
	        System.out.print("| Op��o 3 - Modo Daltonismo   |\n");
	        System.out.print("| Op��o 4 - Entrevistas       |\n");
	        System.out.print("| Op��o 5 - Sair              |\n");
	        System.out.print("|-----------------------------|\n");
	        System.out.print("Digite uma op��o: ");

	        byte opcao = (byte) menu.nextInt();


	        switch (opcao) {
	        case 1:
	            System.out.println("\nOp��o Cadastro Selecionado");
	            Cadastro cad = new Cadastro("Gabriel", "fiap@gmail.com", "fiap123", "30/03/2004", "https//meuportifolio.com.br");
	            System.out.println(cad.getNome());
	            System.out.println(cad.getDataNascimento());
	            System.out.println(cad.getEmail());
	            System.out.println(cad.getSenha());
	            System.out.println(cad.getLinkPortifolio());
	            break;

	        case 2:
	            System.out.print("\nOp��o Vagas Selecionado\n");
	            SistemaVagas vag = new SistemaVagas("FIAP", "Manuten��o e Monitoramento", "CLT", "4 vagas abertas", "18 candidaturas confirmadas");
	            System.out.println(vag.getEmpresa());
	            System.out.println(vag.getSetores());
	            System.out.println(vag.getNivelCargo());
	            System.out.println(vag.getVaga());
	            System.out.println(vag.getCandidaturas());
	            break;

	        case 3:
	            System.out.print("\nOp��o Modo Daltonismo Selecionado\n");
	            modoDaltonismo dalt = new modoDaltonismo("RED, GREEN, BLUE", "Ligado");
	            System.out.println(dalt.getCores());
	            System.out.println(dalt.getAcesso());
	            break;
	            
	       case 4:
	    	   System.out.println("\nOp��o Entrevistas Selecionada\n");
	    	   Entrevista ent = new Entrevista("Entrevista agendada para o dia 25/12/2022", "�s " +"9:00");
	    	   System.out.println(ent.getDiaEntrevista());
	    	   System.out.println(ent.getHorario());
	    	   break;

	        default:
	            System.out.print("\nOp��o Inv�lida!");
	            break;

	        case 5:
	            System.out.print("\nAt� logo!");
	            menu.close();       
	        }
	    }
	}

