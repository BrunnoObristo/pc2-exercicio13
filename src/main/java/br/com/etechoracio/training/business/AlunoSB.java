package br.com.etechoracio.training.business;

import org.springframework.stereotype.Service;

import br.com.etechoracio.common.business.BaseSB;
import br.com.etechoracio.training.dao.AlunoDAO;
import br.com.etechoracio.training.model.Aluno;

@Service
public class AlunoSB extends BaseSB {

	private AlunoDAO alunoDAO;

	@Override
	protected void postConstructImpl() {
		alunoDAO = getDAO(AlunoDAO.class);

	}

	public void save(Aluno aluno) {
		alunoDAO.save(aluno);
	}
}
