package _notificacao;

/**
* _notificacao/NotificacaoInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./br/org/furb/corba/notificacao/NotificacaoCORBA.idl
* S�bado, 29 de Novembro de 2014 14h09min53s BRST
*/

public final class NotificacaoInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public _notificacao.NotificacaoInterface value = null;

  public NotificacaoInterfaceHolder ()
  {
  }

  public NotificacaoInterfaceHolder (_notificacao.NotificacaoInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = _notificacao.NotificacaoInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    _notificacao.NotificacaoInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return _notificacao.NotificacaoInterfaceHelper.type ();
  }

}
