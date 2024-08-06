package com.carrafasoft.mentoria.lojavirtual;

import com.carrafasoft.mentoria.lojavirtual.enums.model.Acesso;
import com.carrafasoft.mentoria.lojavirtual.repository.AcessoRepository;
import com.carrafasoft.mentoria.lojavirtual.service.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = LojaVirtualMentoriaApplication.class)
class LojaVirtualMentoriaApplicationTests {


	@Autowired
	private AcessoService service;

	@Autowired
	private AcessoRepository repository;

	@Test
	public void testeCadastraAcesso() {

		Acesso acesso = new Acesso();
		acesso.setDescricao("ROLE_GM");

		service.save(acesso);
	}

}
