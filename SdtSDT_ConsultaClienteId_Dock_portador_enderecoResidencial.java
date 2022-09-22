/*
               File: SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:50.44
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial( int remoteHandle ,
                                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial( StructSdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "logradouro") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "complemento") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "numero") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "bairro") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cep") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "uf") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cidade") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( readOk == 0 )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "SDT_ConsultaClienteId_Dock_portador.enderecoResidencial" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("logradouro", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("complemento", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("numero", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("bairro", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("cep", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("uf", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("cidade", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("logradouro", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro, false);
      AddObjectProperty("complemento", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento, false);
      AddObjectProperty("numero", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero, false);
      AddObjectProperty("bairro", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro, false);
      AddObjectProperty("cep", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep, false);
      AddObjectProperty("uf", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf, false);
      AddObjectProperty("cidade", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade, false);
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro(struct.getLogradouro());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento(struct.getComplemento());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero(struct.getNumero());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro(struct.getBairro());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep(struct.getCep());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf(struct.getUf());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade(struct.getCidade());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial struct = new StructSdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial ();
      struct.setLogradouro(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro());
      struct.setComplemento(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento());
      struct.setNumero(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero());
      struct.setBairro(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro());
      struct.setCep(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep());
      struct.setUf(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf());
      struct.setCidade(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Logradouro ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Complemento ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Numero ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Bairro ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cep ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Uf ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial_Cidade ;
}

