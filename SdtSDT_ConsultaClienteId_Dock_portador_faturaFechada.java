/*
               File: SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:49.91
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada( StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFechada struct )
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
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "dataVencimento") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorTotal") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "somaPagamentos") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorMinimoRenegociacao") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorMinimoRotativo") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorPagamentoMinimo") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorPrestacoesParceladas") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "possuiPagamentoMinimo") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "hashFatura") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura = oReader.getValue() ;
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
         sName = "SDT_ConsultaClienteId_Dock_portador.faturaFechada" ;
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
      oWriter.writeElement("id", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("dataVencimento", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorTotal", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("somaPagamentos", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorMinimoRenegociacao", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorMinimoRotativo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorPagamentoMinimo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorPrestacoesParceladas", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("possuiPagamentoMinimo", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("hashFatura", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura));
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
      AddObjectProperty("id", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id, false);
      AddObjectProperty("dataVencimento", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento, false);
      AddObjectProperty("valorTotal", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal, false);
      AddObjectProperty("somaPagamentos", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos, false);
      AddObjectProperty("valorMinimoRenegociacao", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao, false);
      AddObjectProperty("valorMinimoRotativo", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo, false);
      AddObjectProperty("valorPagamentoMinimo", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo, false);
      AddObjectProperty("valorPrestacoesParceladas", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas, false);
      AddObjectProperty("possuiPagamentoMinimo", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo, false);
      AddObjectProperty("hashFatura", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo( boolean value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFechada struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id(struct.getId());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento(struct.getDatavencimento());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal(struct.getValortotal());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos(struct.getSomapagamentos());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao(struct.getValorminimorenegociacao());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo(struct.getValorminimorotativo());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo(struct.getValorpagamentominimo());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas(struct.getValorprestacoesparceladas());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo(struct.getPossuipagamentominimo());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura(struct.getHashfatura());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFechada getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFechada struct = new StructSdtSDT_ConsultaClienteId_Dock_portador_faturaFechada ();
      struct.setId(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id());
      struct.setDatavencimento(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento());
      struct.setValortotal(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal());
      struct.setSomapagamentos(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos());
      struct.setValorminimorenegociacao(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao());
      struct.setValorminimorotativo(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo());
      struct.setValorpagamentominimo(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo());
      struct.setValorprestacoesparceladas(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas());
      struct.setPossuipagamentominimo(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo());
      struct.setHashfatura(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Id ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valortotal ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorenegociacao ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorminimorotativo ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorpagamentominimo ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Valorprestacoesparceladas ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Possuipagamentominimo ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Datavencimento ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Somapagamentos ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada_Hashfatura ;
}

