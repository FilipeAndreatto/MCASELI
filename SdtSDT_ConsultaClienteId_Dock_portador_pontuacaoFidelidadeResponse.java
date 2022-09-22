/*
               File: SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:49.79
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse( int remoteHandle ,
                                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse( StructSdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "idCliente") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorPontuacao") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "dataReferencia") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "descricaoPrograma") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma = oReader.getValue() ;
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
         sName = "SDT_ConsultaClienteId_Dock_portador.pontuacaoFidelidadeResponse" ;
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
      oWriter.writeElement("idCliente", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorPontuacao", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("dataReferencia", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("descricaoPrograma", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma));
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
      AddObjectProperty("idCliente", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente, false);
      AddObjectProperty("valorPontuacao", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao, false);
      AddObjectProperty("dataReferencia", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia, false);
      AddObjectProperty("descricaoPrograma", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma, false);
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente(struct.getIdcliente());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao(struct.getValorpontuacao());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia(struct.getDatareferencia());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma(struct.getDescricaoprograma());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse struct = new StructSdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse ();
      struct.setIdcliente(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente());
      struct.setValorpontuacao(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao());
      struct.setDatareferencia(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia());
      struct.setDescricaoprograma(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Idcliente ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Valorpontuacao ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Datareferencia ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse_Descricaoprograma ;
}

