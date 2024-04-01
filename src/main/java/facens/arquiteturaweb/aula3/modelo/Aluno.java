package facens.arquiteturaweb.aula3.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {
    @Id
    private Long id;
    private String nome;
    private String curso;
    private String cidade;
    private String nomeMae;
    private String nomePai;

    public Aluno(Long id, String nome, String curso, String cidade, String nomeMae, String nomePai) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.cidade = cidade;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }

    public Aluno() {
    }

    // Getters e Setters (exemplo)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
}
