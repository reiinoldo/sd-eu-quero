cd %homepath%
cd workspace\EuQUero\src\
set path=%path%;"C:\Arquivos de programas\Java\jdk1.7.0_25\bin"
apt br\org\furb\ws\usuario\UsuarioWS.java
wsimport -keep -p br.org.furb.ws.usuario.cliente http://localhost:8080/usuario?wsdl
