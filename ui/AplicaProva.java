package ui;
import model.QuestaoSimples;
import model.QuestaoMultiplaEscolha;
import model.QuestaoComDica;
import java.util.Scanner;

public class AplicaProva {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String respostaAluno;
	QuestaoSimples prova[];
	
	prova = new QuestaoSimples[3];
	prova[0] = new QuestaoSimples("Resultado de 1 + 1","2");
	prova[1] = new QuestaoComDica("Linguagem de programacao orientada a objetos","Java","Xícara de café");
	prova[2] = new QuestaoMultiplaEscolha("2 x 2 é igual a:","c","a","5","b","9","c","4","d","7");
	
	for (int questao = 0; questao < prova.length; questao++) {
		System.out.println(prova[questao].apQuestao());
		respostaAluno = input.nextLine();
		if (prova[questao].corrigir(respostaAluno)) {
			System.out.println("Resposta correta");
			}
		else {
			System.out.println("Resposta incorreta");
			}
		}
	}
}