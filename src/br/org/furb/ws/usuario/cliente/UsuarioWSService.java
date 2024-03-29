
package br.org.furb.ws.usuario.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UsuarioWSService", targetNamespace = "http://usuario.ws.furb.org.br/", wsdlLocation = "http://localhost/usuario?wsdl")
public class UsuarioWSService
    extends Service
{

    private final static URL USUARIOWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException USUARIOWSSERVICE_EXCEPTION;
    private final static QName USUARIOWSSERVICE_QNAME = new QName("http://usuario.ws.furb.org.br/", "UsuarioWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/usuario?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USUARIOWSSERVICE_WSDL_LOCATION = url;
        USUARIOWSSERVICE_EXCEPTION = e;
    }

    public UsuarioWSService() {
        super(__getWsdlLocation(), USUARIOWSSERVICE_QNAME);
    }

    public UsuarioWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USUARIOWSSERVICE_QNAME, features);
    }

    public UsuarioWSService(URL wsdlLocation) {
        super(wsdlLocation, USUARIOWSSERVICE_QNAME);
    }

    public UsuarioWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USUARIOWSSERVICE_QNAME, features);
    }

    public UsuarioWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UsuarioWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UsuarioWS
     */
    @WebEndpoint(name = "UsuarioWSPort")
    public UsuarioWS getUsuarioWSPort() {
        return super.getPort(new QName("http://usuario.ws.furb.org.br/", "UsuarioWSPort"), UsuarioWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsuarioWS
     */
    @WebEndpoint(name = "UsuarioWSPort")
    public UsuarioWS getUsuarioWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://usuario.ws.furb.org.br/", "UsuarioWSPort"), UsuarioWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USUARIOWSSERVICE_EXCEPTION!= null) {
            throw USUARIOWSSERVICE_EXCEPTION;
        }
        return USUARIOWSSERVICE_WSDL_LOCATION;
    }

}
