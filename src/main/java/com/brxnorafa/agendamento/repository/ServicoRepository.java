package com.brxnorafa.agendamento.repository;

import com.brxnorafa.agendamento.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
