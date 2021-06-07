package br.com.crls.rest.controller;

import br.com.crls.domain.model.Acao;
import br.com.crls.domain.service.AcaoService;
import br.com.crls.rest.dto.AcaoDTO;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("acoes")
@Produces(MediaType.APPLICATION_JSON)
public class AcaoController {

    @Inject
    AcaoService acaoService;

    @GET
    public Acao buscaAcoes() {
        return null;
    }

    @GET
    @Path("{valor_total}")
    public AcaoDTO buscaAcoesCalculado(final int valor_total) {
        return null;
    }

}
