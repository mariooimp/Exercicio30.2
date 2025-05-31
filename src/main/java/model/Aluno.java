package model;

/**
 *
 * @author mario
 */
public class Aluno {
    private int id;
    private int idade;
    private double peso;
    private double altura;
    private String nome;

    public Aluno() {
    }

    public Aluno(int id, int idade, double peso, double altura, String nome) {
        this.id = id;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
