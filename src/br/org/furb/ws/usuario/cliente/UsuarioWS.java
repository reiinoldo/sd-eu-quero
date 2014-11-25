
package br.org.furb.ws.usuario.cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UsuarioWS", targetNamespace = "http://usuario.ws.furb.org.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UsuarioWS {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "autenticar", targetNamespace = "http://usuario.ws.furb.org.br/", className = "br.org.furb.ws.usuario.cliente.Autenticar")
    @ResponseWrapper(localName = "autenticarResponse", targetNamespace = "http://usuario.ws.furb.org.br/", className = "br.org.furb.ws.usuario.cliente.AutenticarResponse")
    @Action(input = "http://usuario.ws.furb.org.br/UsuarioWS/autenticarRequest", output = "http://usuario.ws.furb.org.br/UsuarioWS/autenticarResponse")
    public String autenticar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns br.org.furb.ws.usuario.cliente.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscar", targetNamespace = "http://usuario.ws.furb.org.br/", className = "br.org.furb.ws.usuario.cliente.Buscar")
    @ResponseWrapper(localName = "buscarResponse", targetNamespace = "http://usuario.ws.furb.org.br/", className = "br.org.furb.ws.usuario.cliente.BuscarResponse")
    @Action(input = "http://usuario.ws.furb.org.br/UsuarioWS/buscarRequest", output = "http://usuario.ws.furb.org.br/UsuarioWS/buscarResponse")
    public Usuario buscar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
