package br.com.api.forumhub.domain.usuario.validacoes.atualizar;

import br.com.api.forumhub.domain.usuario.DadosUsuarioAtualizacao;

public interface ValidadorDeAtualizacaoDeUsuario {

    void validar(DadosUsuarioAtualizacao dados);
}
