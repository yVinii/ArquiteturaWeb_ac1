package facens.arquiteturaweb.ac1.service;

import facens.arquiteturaweb.ac1.modelo.Aluno;

import java.util.List;

public interface AlunoService {
    List<Aluno> getAllAlunos();
    Aluno getAlunoById(Long id);
    Aluno createAluno(Aluno aluno);
}

