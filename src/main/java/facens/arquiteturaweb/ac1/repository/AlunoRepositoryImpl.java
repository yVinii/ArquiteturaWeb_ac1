package facens.arquiteturaweb.ac1.repository;

import facens.arquiteturaweb.ac1.modelo.Aluno;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

/*
Esta anotação é usada para indicar que a classe é um componente de acesso a dados (repositório).
Ela informa ao Spring que a classe anotada como @Repository é responsável por interagir com a fonte de dados, como um
banco de dados, fornecendo operações CRUD (create, read, update, delete) para uma entidade específica.
 */
@Repository
public class AlunoRepositoryImpl implements AlunoRepository {
    private final List<Aluno> alunos = new ArrayList<>();
    private Long nextId = 1L;

    public AlunoRepositoryImpl() {
        // Adiciona alguns alunos pré-cadastrados
        alunos.add(new Aluno(1L, "Vinicius", "ADS", "Itu", "Erica", "Marcelo"));
        alunos.add(new Aluno(2L, "Arthur", "Metrologia", "São Roque", "Gláucia", "Alex"));
        alunos.add(new Aluno(3L, "Kauan", "Engenharia Civil", "São Roque", "Kauane", "Kauano"));
        nextId = 4L; // Atualiza o próximo ID
    }

    @Override
    public List<Aluno> findAll() {
        return alunos;
    }

    @Override
    public Aluno findById(Long id) {
        return alunos.stream()
                .filter(aluno -> aluno.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Aluno save(Aluno aluno) {
        if (aluno.getId() == null) {
            aluno.setId(nextId++);
            alunos.add(aluno);
        } else {
            alunos.removeIf(a -> a.getId().equals(aluno.getId()));
            alunos.add(aluno);
        }
        return aluno;
    }
}
