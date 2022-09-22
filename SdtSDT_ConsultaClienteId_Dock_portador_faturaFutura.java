/*
               File: SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:50.2
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura( StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFutura struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "dataVencimento") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorTotal") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDT_ConsultaClienteId_Dock_portador.faturaFutura" ;
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
      oWriter.writeElement("dataVencimento", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorTotal", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal, 10, 5)));
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
      AddObjectProperty("dataVencimento", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento, false);
      AddObjectProperty("valorTotal", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal, false);
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFutura struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento(struct.getDatavencimento());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal(struct.getValortotal());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFutura getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFutura struct = new StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFutura ();
      struct.setDatavencimento(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento());
      struct.setValortotal(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Valortotal ;
   protected String sTagName ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura_Datavencimento ;
}

