/*
               File: SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos
        Description: SDT_ProdutosCadastrados
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:50.62
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos( )
   {
      this(  new ModelContext(SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos.class));
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos( ModelContext context )
   {
      super( context, "SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos");
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos( int remoteHandle ,
                                                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos");
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos( StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "cobrarMulta") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "multa") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regraCalculoMulta") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ignorarMultaAnterior") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ignorarSaldoRolado") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "mora") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "regraCalculoMora") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "jurosRotativo") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "realizarEstornoJurosPagamento") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "SDT_ProdutosCadastrados.SDT_ProdutosCadastradosItem.encargos" ;
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
      oWriter.writeElement("cobrarMulta", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("multa", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("regraCalculoMulta", GXutil.rtrim( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("ignorarMultaAnterior", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("ignorarSaldoRolado", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("mora", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("regraCalculoMora", GXutil.rtrim( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("jurosRotativo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("realizarEstornoJurosPagamento", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento)));
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
      AddObjectProperty("cobrarMulta", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta, false);
      AddObjectProperty("multa", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa, false);
      AddObjectProperty("regraCalculoMulta", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta, false);
      AddObjectProperty("ignorarMultaAnterior", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior, false);
      AddObjectProperty("ignorarSaldoRolado", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado, false);
      AddObjectProperty("mora", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora, false);
      AddObjectProperty("regraCalculoMora", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora, false);
      AddObjectProperty("jurosRotativo", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo, false);
      AddObjectProperty("realizarEstornoJurosPagamento", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento, false);
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta( boolean value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa = value ;
   }

   public String getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta( String value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta = value ;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior( boolean value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior = value ;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado( boolean value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora = value ;
   }

   public String getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora( String value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo = value ;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento( boolean value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta = "" ;
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora = "" ;
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos Clone( )
   {
      return (SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos struct )
   {
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta(struct.getCobrarmulta());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa(struct.getMulta());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta(struct.getRegracalculomulta());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior(struct.getIgnorarmultaanterior());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado(struct.getIgnorarsaldorolado());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora(struct.getMora());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora(struct.getRegracalculomora());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo(struct.getJurosrotativo());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento(struct.getRealizarestornojurospagamento());
   }

   public StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos getStruct( )
   {
      StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos struct = new StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos ();
      struct.setCobrarmulta(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta());
      struct.setMulta(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa());
      struct.setRegracalculomulta(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta());
      struct.setIgnorarmultaanterior(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior());
      struct.setIgnorarsaldorolado(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado());
      struct.setMora(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora());
      struct.setRegracalculomora(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora());
      struct.setJurosrotativo(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo());
      struct.setRealizarestornojurospagamento(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Multa ;
   protected java.math.BigDecimal gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Mora ;
   protected java.math.BigDecimal gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Jurosrotativo ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Cobrarmulta ;
   protected boolean gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarmultaanterior ;
   protected boolean gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Ignorarsaldorolado ;
   protected boolean gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Realizarestornojurospagamento ;
   protected String gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomulta ;
   protected String gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos_Regracalculomora ;
}

