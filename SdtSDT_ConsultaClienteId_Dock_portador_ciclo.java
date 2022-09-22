/*
               File: SdtSDT_ConsultaClienteId_Dock_portador_ciclo
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:50.7
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador_ciclo extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador_ciclo( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador_ciclo.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_ciclo( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador_ciclo");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_ciclo( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador_ciclo");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_ciclo( StructSdtSDT_ConsultaClienteId_Dock_portador_ciclo struct )
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
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "diaCorte") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "diaVencimento") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "descricao") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ativo") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "corteUltimoDiaMes") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "diasCarencia") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "descricaoContaBancariaCicloAtual") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "descricaoContaBancariaProximoCiclo") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo = oReader.getValue() ;
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
         sName = "SDT_ConsultaClienteId_Dock_portador.ciclo" ;
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
      oWriter.writeElement("id", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("diaCorte", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("diaVencimento", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("descricao", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("ativo", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("corteUltimoDiaMes", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("diasCarencia", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("descricaoContaBancariaCicloAtual", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("descricaoContaBancariaProximoCiclo", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo));
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
      AddObjectProperty("id", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id, false);
      AddObjectProperty("diaCorte", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte, false);
      AddObjectProperty("diaVencimento", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento, false);
      AddObjectProperty("descricao", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao, false);
      AddObjectProperty("ativo", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo, false);
      AddObjectProperty("corteUltimoDiaMes", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames, false);
      AddObjectProperty("diasCarencia", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia, false);
      AddObjectProperty("descricaoContaBancariaCicloAtual", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual, false);
      AddObjectProperty("descricaoContaBancariaProximoCiclo", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_ciclo Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador_ciclo)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador_ciclo struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id(struct.getId());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte(struct.getDiacorte());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento(struct.getDiavencimento());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao(struct.getDescricao());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo(struct.getAtivo());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames(struct.getCorteultimodiames());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia(struct.getDiascarencia());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual(struct.getDescricaocontabancariacicloatual());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo(struct.getDescricaocontabancariaproximociclo());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador_ciclo getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador_ciclo struct = new StructSdtSDT_ConsultaClienteId_Dock_portador_ciclo ();
      struct.setId(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id());
      struct.setDiacorte(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte());
      struct.setDiavencimento(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento());
      struct.setDescricao(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao());
      struct.setAtivo(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo());
      struct.setCorteultimodiames(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames());
      struct.setDiascarencia(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia());
      struct.setDescricaocontabancariacicloatual(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual());
      struct.setDescricaocontabancariaproximociclo(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Id ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diacorte ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diavencimento ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Diascarencia ;
   protected String sTagName ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricao ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Ativo ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Corteultimodiames ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariacicloatual ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_ciclo_Descricaocontabancariaproximociclo ;
}

