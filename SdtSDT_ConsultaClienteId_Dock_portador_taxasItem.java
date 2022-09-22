/*
               File: SdtSDT_ConsultaClienteId_Dock_portador_taxasItem
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:50.32
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador_taxasItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador_taxasItem( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador_taxasItem.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_taxasItem( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador_taxasItem");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_taxasItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador_taxasItem");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_taxasItem( StructSdtSDT_ConsultaClienteId_Dock_portador_taxasItem struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
      mapper.put( "descrição" ,  "Descrig6g7o" );
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "descriG6G7o") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorContratado") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "desconto") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "dataFimDesconto") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "dataFimDoCarencia") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "numeroCobrancas") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "natureza") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza = oReader.getValue() ;
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
         sName = "SDT_ConsultaClienteId_Dock_portador.taxasItem" ;
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
      oWriter.writeElement("descriG6G7o", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorContratado", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("desconto", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("dataFimDesconto", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("dataFimDoCarencia", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("numeroCobrancas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("natureza", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza));
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
      AddObjectProperty("descrição", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o, false);
      AddObjectProperty("valorContratado", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado, false);
      AddObjectProperty("desconto", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto, false);
      AddObjectProperty("dataFimDesconto", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto, false);
      AddObjectProperty("dataFimDoCarencia", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia, false);
      AddObjectProperty("numeroCobrancas", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas, false);
      AddObjectProperty("natureza", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza, false);
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_taxasItem Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador_taxasItem)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador_taxasItem struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o(struct.getDescrig6g7o());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado(struct.getValorcontratado());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto(struct.getDesconto());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto(struct.getDatafimdesconto());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia(struct.getDatafimdocarencia());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas(struct.getNumerocobrancas());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza(struct.getNatureza());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador_taxasItem getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador_taxasItem struct = new StructSdtSDT_ConsultaClienteId_Dock_portador_taxasItem ();
      struct.setDescrig6g7o(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o());
      struct.setValorcontratado(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado());
      struct.setDesconto(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto());
      struct.setDatafimdesconto(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto());
      struct.setDatafimdocarencia(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia());
      struct.setNumerocobrancas(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas());
      struct.setNatureza(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Valorcontratado ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Desconto ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Numerocobrancas ;
   protected String sTagName ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Descrig6g7o ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdesconto ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Datafimdocarencia ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_taxasItem_Natureza ;
}

