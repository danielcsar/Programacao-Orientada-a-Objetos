package atividades;

public class MainImovel {

	public static void main(String[] args) {
		Imovel imovelUm = new Imovel();
		imovelUm.codimovel = 1;
		imovelUm.bairro = "Centro";
		imovelUm.tipo = "apto";
		imovelUm.valor = 25000;
	
		Imovel imovelDois = new Imovel();
		imovelDois.codimovel = 2;
		imovelDois.bairro = "Quitandinha";
		imovelDois.tipo = "casa";
		imovelDois.valor = 98900;
		
		Imovel reajusteApto = new Imovel();
		reajusteApto.reajuste(imovelUm.tipo, imovelUm.valor);

		Imovel reajusteCasa = new Imovel();
		reajusteCasa.reajuste(imovelDois.tipo, imovelDois.valor);
		
		Imovel categoriaUm = new Imovel();
	    categoriaUm.categoria(imovelUm.valor);

	    Imovel categoriaDois = new Imovel();
	    categoriaDois.categoria(imovelDois.valor);
	}
}
