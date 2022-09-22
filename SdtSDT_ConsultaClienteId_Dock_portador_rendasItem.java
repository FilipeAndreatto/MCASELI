/*
               File: SdtSDT_ConsultaClienteId_Dock_portador_rendasItem
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:49.54
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador_rendasItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador_rendasItem( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador_rendasItem.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_rendasItem( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador_rendasItem");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_rendasItem( int remoteHandle ,
                                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador_rendasItem");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_rendasItem( StructSdtSDT_ConsultaClienteId_Dock_portador_rendasItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "id") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valor") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "comprovada") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "idPessoa") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "principal") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "origem") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem = oReader.getValue() ;
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
         sName = "SDT_ConsultaClienteId_Dock_portador.rendasItem" ;
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
      oWriter.writeElement("id", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valor", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("comprovada", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("idPessoa", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("principal", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("origem", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem));
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
      AddObjectProperty("id", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id, false);
      AddObjectProperty("valor", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor, false);
      AddObjectProperty("comprovada", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada, false);
      AddObjectProperty("idPessoa", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa, false);
      AddObjectProperty("principal", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal, false);
      AddObjectProperty("origem", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_rendasItem Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador_rendasItem)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador_rendasItem struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id(struct.getId());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor(struct.getValor());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada(struct.getComprovada());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa(struct.getIdpessoa());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal(struct.getPrincipal());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem(struct.getOrigem());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador_rendasItem getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador_rendasItem struct = new StructSdtSDT_ConsultaClienteId_Dock_portador_rendasItem ();
      struct.setId(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id());
      struct.setValor(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor());
      struct.setComprovada(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada());
      struct.setIdpessoa(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa());
      struct.setPrincipal(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal());
      struct.setOrigem(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Id ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Valor ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Idpessoa ;
   protected String sTagName ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Comprovada ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Principal ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_rendasItem_Origem ;
}

