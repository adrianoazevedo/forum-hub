package br.com.api.forumhub.domain.resposta.validacoes.atualizacao;

import br.com.api.forumhub.domain.resposta.DadosRespostaAtualizacao;

public interface ValidadorDeAtualizacaoResposta {

    void validar(Long idResposta, DadosRespostaAtualizacao dadosRespostaAtualizacao);

}
