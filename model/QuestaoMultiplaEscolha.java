package model;

public class QuestaoMultiplaEscolha extends QuestaoSimples{
	private String alt1, alt2, alt3, alt4, resp1, resp2, resp3, resp4;

	public QuestaoMultiplaEscolha(String enunciado, String resposta, String alt1, String resp1, String alt2, String resp2, 
			String alt3, String resp3, String alt4, String resp4) {
		super(enunciado, resposta);
		this.alt1 = alt1;
		this.alt2 = alt2;
		this.alt3 = alt3;
		this.alt4 = alt4;
		this.resp1 = resp1;
		this.resp2 = resp2;
		this.resp3 = resp3;
		this.resp4 = resp4;
	}
	public String apQuestao() {
		return "Questão: "+enunciado+"\n"+
										alt1+") "+resp1 +"\n"
										+alt2+") "+resp2+"\n"
										+alt3+") "+resp3+"\n"
										+alt4+") "+resp4;
	}
}