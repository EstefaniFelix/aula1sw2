package primeiro_exemplo.modelos;

public class Pessoa {
    // Atributos
    public String nome;
    public int idade;

    // Métodos
    // boolean --> verdadeiro e falso
    // Camelcase --> padrão de escrita Java
    public boolean verificarMarioridade() {
        return this.idade >= 18;
    }
}

