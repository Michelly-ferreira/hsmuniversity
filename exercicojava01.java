pacote PrimeiroPackage;
import java.util.Scanner;
classe pública PrimeiraClasse {

	public static void main (String [] args) {
		// TODO stub do método gerado automaticamente
		Scanner sn = novo Scanner (System.in);
		System.out.println ("Bem-vindo ao sistema de cálculo de mídia do próximo nível");
		System.out.print ("Digite a nota da prova do 1o Bimestre:");
		int notaProvaB1 = sn.nextInt ();
		System.out.print ("Digite a nota do projeto 1o Bimestre:");
		int notaProjetoB1 = sn.nextInt ();
		System.out.print ("Digite a nota da lista de exercícios do 1o Bimestre:");
		int notaExercB1 = sn.nextInt ();
		System.out.print ("Digite a nota de contribuição de projetos recomendados do 1o Bimestre:");
		int notaContribB1 = sn.nextInt ();
		int mediaB1 = ((notaProvaB1 * 3) + (notaProjetoB1 * 3) + (notaExercB1 * 2) + (notaContribB1 * 3)) / 10; 
		System.out.print ("Digite a nota da prova do 2o Bimestre:");
		int notaProvaB2 = sn.nextInt ();
		System.out.print ("Digite a nota do projeto do 2o Bimestre:");
		int notaProjetoB2 = sn.nextInt ();
		System.out.print ("Digite a nota da lista de exercícios do 2o Bimestre:");
		int notaExercB2 = sn.nextInt ();
		System.out.print ("Digite a nota de contribuição de projetos recomendados do 2o Bimestre:");
		int notaContribB2 = sn.nextInt ();
		int mediaB2 = ((notaProvaB2 * 3) + (notaProjetoB2 * 3) + (notaExercB2 * 2) + (notaContribB2 * 3)) / 10; 
		System.out.print ("Digite a nota da prova do 3o Bimestre:");
		int notaProvaB3 = sn.nextInt ();
		System.out.print ("Digite a nota do projeto 3o Bimestre:");
		int notaProjetoB3 = sn.nextInt ();
		System.out.print ("Digite a nota da lista de exercícios do 3o Bimestre:");
		int notaExercB3 = sn.nextInt ();
		System.out.print ("Digite a nota de contribuicao de projetos recomendados do 3o Bimestre:");
		int notaContribB3 = sn.nextInt ();
		int mediaB3 = ((notaProvaB3 * 3) + (notaProjetoB3 * 3) + (notaExercB3 * 2) + (notaContribB3 * 3)) / 10;
		int mediaSemestral = (mediaB1 + mediaB2 + mediaB3) / 3;
		System.out.println ("Sua mídia no 1o Bimestre foi de" + mediaB1);
		System.out.println ("Sua mídia no 2o Bimestre foi de" + mediaB2);
		System.out.println ("Sua mídia no 3o Bimestre foi de" + mediaB3);
		if (mediaSemestral> = 8) {
			System.out.print ("Parabens! Voce foi aprovado! Sua media semestral foi de" + mediaSemestral);
		} outro {
			System.out.print ("Infelizmente voce foi reprovado. Sua media semestral foi de" + mediaSemestral);
		}
	}

}