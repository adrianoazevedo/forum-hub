package br.com.api.forumhub.domain.topico.validacoes.atualizacao;

import br.com.api.forumhub.domain.topico.DadosTopicoAtualizacao;

public interface ValidadorDeAtualizacaoDeTopico {

    void validar(Long id, DadosTopicoAtualizacao dadosTopicoAtualizacao);

}
