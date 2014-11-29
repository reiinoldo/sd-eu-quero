package _anuncio;


/**
* _anuncio/AnuncioInterfaceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./br/org/furb/corba/anuncio/AnuncioCORBA.idl
* S�bado, 29 de Novembro de 2014 18h42min46s BRST
*/

abstract public class AnuncioInterfaceHelper
{
  private static String  _id = "IDL:anuncio/AnuncioInterface:1.0";

  public static void insert (org.omg.CORBA.Any a, _anuncio.AnuncioInterface that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static _anuncio.AnuncioInterface extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (_anuncio.AnuncioInterfaceHelper.id (), "AnuncioInterface");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static _anuncio.AnuncioInterface read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AnuncioInterfaceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, _anuncio.AnuncioInterface value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static _anuncio.AnuncioInterface narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof _anuncio.AnuncioInterface)
      return (_anuncio.AnuncioInterface)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _anuncio._AnuncioInterfaceStub stub = new _anuncio._AnuncioInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static _anuncio.AnuncioInterface unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof _anuncio.AnuncioInterface)
      return (_anuncio.AnuncioInterface)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _anuncio._AnuncioInterfaceStub stub = new _anuncio._AnuncioInterfaceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}