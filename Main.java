public class Main {
    public static void main (String[] args){
        Pessoa pessoa = new Pessoa(nome:"Leo");
        pessoa.setIdade(idade:30);

        pessoa.setPeso(93.5);
        pessoa.setAltura(altura:187);


        pessoa.ApresentacaoPessoal();
    }
    
}