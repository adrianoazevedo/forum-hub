package br.com.api.forumhub.domain.topico;

import br.com.api.forumhub.domain.curso.Curso;
import br.com.api.forumhub.domain.usuario.DadosDetalhamentoUsuario;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id,
                                      String titulo,
                                      String mensagem,
                                      LocalDateTime dataCriacao,
                                      br.com.api.forumhub.domain.topico.StatusTopico status,
                                      DadosDetalhamentoUsuario usuario,
                                      Curso curso) {
    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getStatus(), new DadosDetalhamentoUsuario(topico.getUsuario()), topico.getCurso());
    }
}
