public class filme {

    public static void main(String[] args) {
        System.out.println("Bem vindos ao TecFlix");
        System.out.println("Filme: Master Of The Universe 1987");

        int anoDeLancamento = 1987;
        System.out.println("Ano de lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 5.4;
        // Média calculada pelas notas do Luiz, Rafael e Renan
        double media = (6.6 + 9.5 + 10) / 3;
        System.out.println("A Média que o Segundo Tec deu " + media);

        String sinopse;

        sinopse = """
                Filme do He-Man antigo
                Estrelado por Dolph Lundgren
                O filme tem nota mediana
                e foi lançado em
                """ + anoDeLancamento;
        System.out.println(sinopse);
    }
}
