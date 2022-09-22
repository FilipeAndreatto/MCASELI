/*
               File: SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:49.62
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse( int remoteHandle ,
                                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse( StructSdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "limite") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "saldoDisponivel") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "saldoReservado") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "saldoParceladoDisp") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "limiteParcelado") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "devedorTotal") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "utilizaLimiteExtra") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorLimiteExtra") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "limiteExtraTotal") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "saldoDisponivelExtra") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorFaturaFechada") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "clienteEmBloqueioJuridico") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "SDT_ConsultaClienteId_Dock_portador.extratoClienteResponse" ;
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
      oWriter.writeElement("limite", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("saldoDisponivel", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("saldoReservado", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("saldoParceladoDisp", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("limiteParcelado", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("devedorTotal", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("utilizaLimiteExtra", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorLimiteExtra", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("limiteExtraTotal", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("saldoDisponivelExtra", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorFaturaFechada", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("clienteEmBloqueioJuridico", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico)));
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
      AddObjectProperty("limite", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite, false);
      AddObjectProperty("saldoDisponivel", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel, false);
      AddObjectProperty("saldoReservado", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado, false);
      AddObjectProperty("saldoParceladoDisp", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp, false);
      AddObjectProperty("limiteParcelado", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado, false);
      AddObjectProperty("devedorTotal", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal, false);
      AddObjectProperty("utilizaLimiteExtra", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra, false);
      AddObjectProperty("valorLimiteExtra", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra, false);
      AddObjectProperty("limiteExtraTotal", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal, false);
      AddObjectProperty("saldoDisponivelExtra", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra, false);
      AddObjectProperty("valorFaturaFechada", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada, false);
      AddObjectProperty("clienteEmBloqueioJuridico", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra( boolean value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico( boolean value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite(struct.getLimite());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel(struct.getSaldodisponivel());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado(struct.getSaldoreservado());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp(struct.getSaldoparceladodisp());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado(struct.getLimiteparcelado());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal(struct.getDevedortotal());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra(struct.getUtilizalimiteextra());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra(struct.getValorlimiteextra());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal(struct.getLimiteextratotal());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra(struct.getSaldodisponivelextra());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada(struct.getValorfaturafechada());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico(struct.getClienteembloqueiojuridico());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse struct = new StructSdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse ();
      struct.setLimite(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite());
      struct.setSaldodisponivel(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel());
      struct.setSaldoreservado(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado());
      struct.setSaldoparceladodisp(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp());
      struct.setLimiteparcelado(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado());
      struct.setDevedortotal(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal());
      struct.setUtilizalimiteextra(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra());
      struct.setValorlimiteextra(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra());
      struct.setLimiteextratotal(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal());
      struct.setSaldodisponivelextra(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra());
      struct.setValorfaturafechada(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada());
      struct.setClienteembloqueiojuridico(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limite ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivel ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoreservado ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldoparceladodisp ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteparcelado ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Devedortotal ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorfaturafechada ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Utilizalimiteextra ;
   protected boolean gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Clienteembloqueiojuridico ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Valorlimiteextra ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Limiteextratotal ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse_Saldodisponivelextra ;
}

