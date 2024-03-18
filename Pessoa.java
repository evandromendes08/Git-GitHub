public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;


    private Pessoa(String nome) {
            this.nome = nome;
    }

    public Pessoa(String nome, int idade, double peso, double autura) {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
    }
    private String getNome() {
        return nome;
    }
    private String getIdade() {
        return idade;
    }
    private String getPeso() {
        return peso;
    }
    private String getAltura() {
        return altura;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }

    public void Envelhecer (){
        this.idade += 1;
    }

    public void ApresentacaoPessoal(){
        System.out.println("Nome: "+nome+","+idade+"anos.");
        System.out.println("Peso: "+peso+" Kg, Altura: "+altura+" CM");
    } 
}