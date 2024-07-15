package br.com.api.forumhub.domain.usuario.validacoes.cadastrar;

import br.com.api.forumhub.domain.usuario.DadosUsuarioCadastro;

public interface ValidadorDeCadastroDeUsuario {

    void validar(DadosUsuarioCadastro dados);

}
