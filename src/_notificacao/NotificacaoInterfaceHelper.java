package _notificacao;


/**
* _notificacao/NotificacaoInterfaceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./br/org/furb/corba/notificacao/NotificacaoCORBA.idl
* S�bado, 29 de Novembro de 2014 18h42min47s BRST
*/

abstract public class NotificacaoInterfaceHelper
{
  private static String  _id = "IDL:notificacao/NotificacaoInterface:1.0";

  public static void insert (org.omg.CORBA.Any a, _notificacao.NotificacaoInterface that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static _notificacao.NotificacaoInterface extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (_notificacao.NotificacaoInterfaceHelper.id (), "NotificacaoInterface");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static _notificacao.NotificacaoInterface read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NotificacaoInterfaceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, _notificacao.NotificacaoInterface value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static _notificacao.NotificacaoInterface narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof _notificacao.NotificacaoInterface)
      return (_notificacao.NotificacaoInterface)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _notificacao._NotificacaoInterfaceStub stub = new _notificacao._NotificacaoInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static _notificacao.NotificacaoInterface unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof _notificacao.NotificacaoInterface)
      return (_notificacao.NotificacaoInterface)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _notificacao._NotificacaoInterfaceStub stub = new _notificacao._NotificacaoInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
