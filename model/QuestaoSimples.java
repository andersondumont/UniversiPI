package model;
public class QuestaoSimples {
	protected String enunciado, resposta;
	
	public QuestaoSimples(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public String apQuestao() {
		return "Questao: "+enunciado;
	}
	public boolean corrigir(String respostaAluno) {
		if (respostaAluno.equals(resposta)) {
			return true;
		}
		else {
			return false;
		}
	}
}
