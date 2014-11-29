package br.org.furb.corba.notificacao;

import java.util.ArrayList;
import java.util.List;

import _notificacao.NotificacaoInterfacePOA;
import br.org.furb.controller.DesejoController;
import br.org.furb.controller.OfertaController;
import br.org.furb.controller.UsuarioController;
import br.org.furb.controller.dao.impl.NotificacaoDaoImpl;
import br.org.furb.model.Desejo;
import br.org.furb.model.Notificacao;
import br.org.furb.model.Oferta;
import br.org.furb.model.TipoNotificacao;
import br.org.furb.model.Usuario;

public class NotificacaoImpl extends NotificacaoInterfacePOA{

	@Override
	public String getNotificacoes(int idUsuario) {
		NotificacaoDaoImpl dao = new NotificacaoDaoImpl();
		
		Notificacao notificacao = new Notificacao();
		
		String notificacoes = "";
		
		notificacao.setIdUsuario(idUsuario);
		List<Notificacao> listNotificacoes = new ArrayList<Notificacao>();
		
		try {
			listNotificacoes = dao.listar(notificacao, null);
		} catch (Exception e) {		
			e.printStackTrace();
		}	
		
		for (int i = 0; i < listNotificacoes.size(); i++) {
			notificacao = listNotificacoes.get(i);
			notificacoes += notificacao.getDescricao() + ";";
		}		
		
		return notificacoes;
	}

	@Override
	public boolean criarNotificacao(int idUsuario, int tipoNotificacao, int idDesejoOferta) {
		NotificacaoDaoImpl dao = new NotificacaoDaoImpl();
		TipoNotificacao tipo = TipoNotificacao.values()[tipoNotificacao];
		String descricao = "";
		
		System.out.println(tipo.toString());
		
		Notificacao notificacao = new Notificacao();
		
		try {
			
			notificacao.setId(dao.incrementar());
			notificacao.setIdUsuario(idUsuario);
			notificacao.setTipoNotificacao(tipo);
			
			if (tipo == TipoNotificacao.DESEJO){
				
				DesejoController desejoController = new DesejoController();
				Desejo desejo = new Desejo();
				desejo.setIdDesejo(idDesejoOferta);
				desejoController.buscar(desejo);
				
				descricao = "Seu desejo '" + desejo.getDescricao()+ "' foi criado com sucesso. Compartilhe com seus amigos.";
			}else if (tipo == TipoNotificacao.OFERTA){
				OfertaController ofertaController = new OfertaController();				
				Oferta oferta = new Oferta();				
				oferta.setId(idDesejoOferta);
				ofertaController.buscar(oferta);
				
				DesejoController desejoController = new DesejoController();
				Desejo desejo = new Desejo();
				desejo.setIdDesejo(oferta.getIdDesejo());
				desejoController.buscar(desejo);
				
				UsuarioController usuarioController = new UsuarioController();
				Usuario usuario = usuarioController.buscar(oferta.getIdUsuario());
				
				descricao = "Seu desejo " + desejo.getDescricao() + " foi ofertado por " + usuario.getNome();
			}else{
				descricao = "Notificação não identificada " + tipoNotificacao;
			}	
			
			notificacao.setDescricao(descricao);		
			//notificacao.setStatus("");		
		
			dao.salvar(notificacao);
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return true;
	}

}
