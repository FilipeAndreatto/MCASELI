/*
               File: SdtSDTValidaAmbiente
        Description: SDTValidaAmbiente
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:23.75
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTValidaAmbiente extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTValidaAmbiente( )
   {
      this(  new ModelContext(SdtSDTValidaAmbiente.class));
   }

   public SdtSDTValidaAmbiente( ModelContext context )
   {
      super( context, "SdtSDTValidaAmbiente");
   }

   public SdtSDTValidaAmbiente( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTValidaAmbiente");
   }

   public SdtSDTValidaAmbiente( StructSdtSDTValidaAmbiente struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "loja") )
            {
               gxTv_SdtSDTValidaAmbiente_Loja = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "caixa") )
            {
               gxTv_SdtSDTValidaAmbiente_Caixa = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "URLSefaz") )
            {
               gxTv_SdtSDTValidaAmbiente_Urlsefaz = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "URLChaveSefaz") )
            {
               gxTv_SdtSDTValidaAmbiente_Urlchavesefaz = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TokenSefaz") )
            {
               gxTv_SdtSDTValidaAmbiente_Tokensefaz = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "IDTokenSefaz") )
            {
               gxTv_SdtSDTValidaAmbiente_Idtokensefaz = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ChaveAcesso") )
            {
               gxTv_SdtSDTValidaAmbiente_Chaveacesso = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ChaveParceiro") )
            {
               gxTv_SdtSDTValidaAmbiente_Chaveparceiro = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DiretorioInvoicy") )
            {
               gxTv_SdtSDTValidaAmbiente_Diretorioinvoicy = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmissorNFCe") )
            {
               gxTv_SdtSDTValidaAmbiente_Emissornfce = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NomeEmissorNFCe") )
            {
               gxTv_SdtSDTValidaAmbiente_Nomeemissornfce = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "W03NFCe") )
            {
               gxTv_SdtSDTValidaAmbiente_W03nfce = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Contingencia") )
            {
               gxTv_SdtSDTValidaAmbiente_Contingencia = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DiretorioInvoicyDocs") )
            {
               gxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CGC") )
            {
               gxTv_SdtSDTValidaAmbiente_Cgc = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UF") )
            {
               gxTv_SdtSDTValidaAmbiente_Uf = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BematechComNumero") )
            {
               gxTv_SdtSDTValidaAmbiente_Bematechcomnumero = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TimeOutWS") )
            {
               gxTv_SdtSDTValidaAmbiente_Timeoutws = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UF_Estado") )
            {
               gxTv_SdtSDTValidaAmbiente_Uf_estado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CtgAtrasoInv") )
            {
               gxTv_SdtSDTValidaAmbiente_Ctgatrasoinv = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "SDTValidaAmbiente" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "MCASELI" ;
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
      oWriter.writeElement("loja", GXutil.trim( GXutil.str( gxTv_SdtSDTValidaAmbiente_Loja, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("caixa", GXutil.trim( GXutil.str( gxTv_SdtSDTValidaAmbiente_Caixa, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("URLSefaz", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Urlsefaz));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("URLChaveSefaz", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Urlchavesefaz));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("TokenSefaz", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Tokensefaz));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("IDTokenSefaz", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Idtokensefaz));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("ChaveAcesso", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Chaveacesso));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("ChaveParceiro", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Chaveparceiro));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("DiretorioInvoicy", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Diretorioinvoicy));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("EmissorNFCe", GXutil.trim( GXutil.str( gxTv_SdtSDTValidaAmbiente_Emissornfce, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("NomeEmissorNFCe", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Nomeemissornfce));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("W03NFCe", GXutil.trim( GXutil.str( gxTv_SdtSDTValidaAmbiente_W03nfce, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("Contingencia", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDTValidaAmbiente_Contingencia)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("DiretorioInvoicyDocs", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("CGC", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Cgc));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("UF", GXutil.trim( GXutil.str( gxTv_SdtSDTValidaAmbiente_Uf, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("BematechComNumero", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Bematechcomnumero));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("TimeOutWS", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Timeoutws));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("UF_Estado", GXutil.rtrim( gxTv_SdtSDTValidaAmbiente_Uf_estado));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeElement("CtgAtrasoInv", GXutil.trim( GXutil.str( gxTv_SdtSDTValidaAmbiente_Ctgatrasoinv, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("loja", gxTv_SdtSDTValidaAmbiente_Loja, false);
      AddObjectProperty("caixa", gxTv_SdtSDTValidaAmbiente_Caixa, false);
      AddObjectProperty("URLSefaz", gxTv_SdtSDTValidaAmbiente_Urlsefaz, false);
      AddObjectProperty("URLChaveSefaz", gxTv_SdtSDTValidaAmbiente_Urlchavesefaz, false);
      AddObjectProperty("TokenSefaz", gxTv_SdtSDTValidaAmbiente_Tokensefaz, false);
      AddObjectProperty("IDTokenSefaz", gxTv_SdtSDTValidaAmbiente_Idtokensefaz, false);
      AddObjectProperty("ChaveAcesso", gxTv_SdtSDTValidaAmbiente_Chaveacesso, false);
      AddObjectProperty("ChaveParceiro", gxTv_SdtSDTValidaAmbiente_Chaveparceiro, false);
      AddObjectProperty("DiretorioInvoicy", gxTv_SdtSDTValidaAmbiente_Diretorioinvoicy, false);
      AddObjectProperty("EmissorNFCe", gxTv_SdtSDTValidaAmbiente_Emissornfce, false);
      AddObjectProperty("NomeEmissorNFCe", gxTv_SdtSDTValidaAmbiente_Nomeemissornfce, false);
      AddObjectProperty("W03NFCe", gxTv_SdtSDTValidaAmbiente_W03nfce, false);
      AddObjectProperty("Contingencia", gxTv_SdtSDTValidaAmbiente_Contingencia, false);
      AddObjectProperty("DiretorioInvoicyDocs", gxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs, false);
      AddObjectProperty("CGC", gxTv_SdtSDTValidaAmbiente_Cgc, false);
      AddObjectProperty("UF", gxTv_SdtSDTValidaAmbiente_Uf, false);
      AddObjectProperty("BematechComNumero", gxTv_SdtSDTValidaAmbiente_Bematechcomnumero, false);
      AddObjectProperty("TimeOutWS", gxTv_SdtSDTValidaAmbiente_Timeoutws, false);
      AddObjectProperty("UF_Estado", gxTv_SdtSDTValidaAmbiente_Uf_estado, false);
      AddObjectProperty("CtgAtrasoInv", gxTv_SdtSDTValidaAmbiente_Ctgatrasoinv, false);
   }

   public short getgxTv_SdtSDTValidaAmbiente_Loja( )
   {
      return gxTv_SdtSDTValidaAmbiente_Loja ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Loja( short value )
   {
      gxTv_SdtSDTValidaAmbiente_Loja = value ;
   }

   public short getgxTv_SdtSDTValidaAmbiente_Caixa( )
   {
      return gxTv_SdtSDTValidaAmbiente_Caixa ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Caixa( short value )
   {
      gxTv_SdtSDTValidaAmbiente_Caixa = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Urlsefaz( )
   {
      return gxTv_SdtSDTValidaAmbiente_Urlsefaz ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Urlsefaz( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Urlsefaz = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Urlchavesefaz( )
   {
      return gxTv_SdtSDTValidaAmbiente_Urlchavesefaz ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Urlchavesefaz( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Urlchavesefaz = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Tokensefaz( )
   {
      return gxTv_SdtSDTValidaAmbiente_Tokensefaz ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Tokensefaz( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Tokensefaz = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Idtokensefaz( )
   {
      return gxTv_SdtSDTValidaAmbiente_Idtokensefaz ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Idtokensefaz( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Idtokensefaz = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Chaveacesso( )
   {
      return gxTv_SdtSDTValidaAmbiente_Chaveacesso ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Chaveacesso( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Chaveacesso = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Chaveparceiro( )
   {
      return gxTv_SdtSDTValidaAmbiente_Chaveparceiro ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Chaveparceiro( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Chaveparceiro = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Diretorioinvoicy( )
   {
      return gxTv_SdtSDTValidaAmbiente_Diretorioinvoicy ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Diretorioinvoicy( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Diretorioinvoicy = value ;
   }

   public byte getgxTv_SdtSDTValidaAmbiente_Emissornfce( )
   {
      return gxTv_SdtSDTValidaAmbiente_Emissornfce ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Emissornfce( byte value )
   {
      gxTv_SdtSDTValidaAmbiente_Emissornfce = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Nomeemissornfce( )
   {
      return gxTv_SdtSDTValidaAmbiente_Nomeemissornfce ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Nomeemissornfce( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Nomeemissornfce = value ;
   }

   public byte getgxTv_SdtSDTValidaAmbiente_W03nfce( )
   {
      return gxTv_SdtSDTValidaAmbiente_W03nfce ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_W03nfce( byte value )
   {
      gxTv_SdtSDTValidaAmbiente_W03nfce = value ;
   }

   public boolean getgxTv_SdtSDTValidaAmbiente_Contingencia( )
   {
      return gxTv_SdtSDTValidaAmbiente_Contingencia ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Contingencia( boolean value )
   {
      gxTv_SdtSDTValidaAmbiente_Contingencia = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs( )
   {
      return gxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Cgc( )
   {
      return gxTv_SdtSDTValidaAmbiente_Cgc ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Cgc( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Cgc = value ;
   }

   public byte getgxTv_SdtSDTValidaAmbiente_Uf( )
   {
      return gxTv_SdtSDTValidaAmbiente_Uf ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Uf( byte value )
   {
      gxTv_SdtSDTValidaAmbiente_Uf = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Bematechcomnumero( )
   {
      return gxTv_SdtSDTValidaAmbiente_Bematechcomnumero ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Bematechcomnumero( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Bematechcomnumero = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Timeoutws( )
   {
      return gxTv_SdtSDTValidaAmbiente_Timeoutws ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Timeoutws( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Timeoutws = value ;
   }

   public String getgxTv_SdtSDTValidaAmbiente_Uf_estado( )
   {
      return gxTv_SdtSDTValidaAmbiente_Uf_estado ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Uf_estado( String value )
   {
      gxTv_SdtSDTValidaAmbiente_Uf_estado = value ;
   }

   public short getgxTv_SdtSDTValidaAmbiente_Ctgatrasoinv( )
   {
      return gxTv_SdtSDTValidaAmbiente_Ctgatrasoinv ;
   }

   public void setgxTv_SdtSDTValidaAmbiente_Ctgatrasoinv( short value )
   {
      gxTv_SdtSDTValidaAmbiente_Ctgatrasoinv = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTValidaAmbiente_Urlsefaz = "" ;
      gxTv_SdtSDTValidaAmbiente_Urlchavesefaz = "" ;
      gxTv_SdtSDTValidaAmbiente_Tokensefaz = "" ;
      gxTv_SdtSDTValidaAmbiente_Idtokensefaz = "" ;
      gxTv_SdtSDTValidaAmbiente_Chaveacesso = "" ;
      gxTv_SdtSDTValidaAmbiente_Chaveparceiro = "" ;
      gxTv_SdtSDTValidaAmbiente_Diretorioinvoicy = "" ;
      gxTv_SdtSDTValidaAmbiente_Nomeemissornfce = "" ;
      gxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs = "" ;
      gxTv_SdtSDTValidaAmbiente_Cgc = "" ;
      gxTv_SdtSDTValidaAmbiente_Bematechcomnumero = "" ;
      gxTv_SdtSDTValidaAmbiente_Timeoutws = "" ;
      gxTv_SdtSDTValidaAmbiente_Uf_estado = "" ;
      sTagName = "" ;
   }

   public SdtSDTValidaAmbiente Clone( )
   {
      return (SdtSDTValidaAmbiente)(clone()) ;
   }

   public void setStruct( StructSdtSDTValidaAmbiente struct )
   {
      setgxTv_SdtSDTValidaAmbiente_Loja(struct.getLoja());
      setgxTv_SdtSDTValidaAmbiente_Caixa(struct.getCaixa());
      setgxTv_SdtSDTValidaAmbiente_Urlsefaz(struct.getUrlsefaz());
      setgxTv_SdtSDTValidaAmbiente_Urlchavesefaz(struct.getUrlchavesefaz());
      setgxTv_SdtSDTValidaAmbiente_Tokensefaz(struct.getTokensefaz());
      setgxTv_SdtSDTValidaAmbiente_Idtokensefaz(struct.getIdtokensefaz());
      setgxTv_SdtSDTValidaAmbiente_Chaveacesso(struct.getChaveacesso());
      setgxTv_SdtSDTValidaAmbiente_Chaveparceiro(struct.getChaveparceiro());
      setgxTv_SdtSDTValidaAmbiente_Diretorioinvoicy(struct.getDiretorioinvoicy());
      setgxTv_SdtSDTValidaAmbiente_Emissornfce(struct.getEmissornfce());
      setgxTv_SdtSDTValidaAmbiente_Nomeemissornfce(struct.getNomeemissornfce());
      setgxTv_SdtSDTValidaAmbiente_W03nfce(struct.getW03nfce());
      setgxTv_SdtSDTValidaAmbiente_Contingencia(struct.getContingencia());
      setgxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs(struct.getDiretorioinvoicydocs());
      setgxTv_SdtSDTValidaAmbiente_Cgc(struct.getCgc());
      setgxTv_SdtSDTValidaAmbiente_Uf(struct.getUf());
      setgxTv_SdtSDTValidaAmbiente_Bematechcomnumero(struct.getBematechcomnumero());
      setgxTv_SdtSDTValidaAmbiente_Timeoutws(struct.getTimeoutws());
      setgxTv_SdtSDTValidaAmbiente_Uf_estado(struct.getUf_estado());
      setgxTv_SdtSDTValidaAmbiente_Ctgatrasoinv(struct.getCtgatrasoinv());
   }

   public StructSdtSDTValidaAmbiente getStruct( )
   {
      StructSdtSDTValidaAmbiente struct = new StructSdtSDTValidaAmbiente ();
      struct.setLoja(getgxTv_SdtSDTValidaAmbiente_Loja());
      struct.setCaixa(getgxTv_SdtSDTValidaAmbiente_Caixa());
      struct.setUrlsefaz(getgxTv_SdtSDTValidaAmbiente_Urlsefaz());
      struct.setUrlchavesefaz(getgxTv_SdtSDTValidaAmbiente_Urlchavesefaz());
      struct.setTokensefaz(getgxTv_SdtSDTValidaAmbiente_Tokensefaz());
      struct.setIdtokensefaz(getgxTv_SdtSDTValidaAmbiente_Idtokensefaz());
      struct.setChaveacesso(getgxTv_SdtSDTValidaAmbiente_Chaveacesso());
      struct.setChaveparceiro(getgxTv_SdtSDTValidaAmbiente_Chaveparceiro());
      struct.setDiretorioinvoicy(getgxTv_SdtSDTValidaAmbiente_Diretorioinvoicy());
      struct.setEmissornfce(getgxTv_SdtSDTValidaAmbiente_Emissornfce());
      struct.setNomeemissornfce(getgxTv_SdtSDTValidaAmbiente_Nomeemissornfce());
      struct.setW03nfce(getgxTv_SdtSDTValidaAmbiente_W03nfce());
      struct.setContingencia(getgxTv_SdtSDTValidaAmbiente_Contingencia());
      struct.setDiretorioinvoicydocs(getgxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs());
      struct.setCgc(getgxTv_SdtSDTValidaAmbiente_Cgc());
      struct.setUf(getgxTv_SdtSDTValidaAmbiente_Uf());
      struct.setBematechcomnumero(getgxTv_SdtSDTValidaAmbiente_Bematechcomnumero());
      struct.setTimeoutws(getgxTv_SdtSDTValidaAmbiente_Timeoutws());
      struct.setUf_estado(getgxTv_SdtSDTValidaAmbiente_Uf_estado());
      struct.setCtgatrasoinv(getgxTv_SdtSDTValidaAmbiente_Ctgatrasoinv());
      return struct ;
   }

   protected byte gxTv_SdtSDTValidaAmbiente_Emissornfce ;
   protected byte gxTv_SdtSDTValidaAmbiente_W03nfce ;
   protected byte gxTv_SdtSDTValidaAmbiente_Uf ;
   protected short gxTv_SdtSDTValidaAmbiente_Loja ;
   protected short gxTv_SdtSDTValidaAmbiente_Caixa ;
   protected short gxTv_SdtSDTValidaAmbiente_Ctgatrasoinv ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTValidaAmbiente_Urlchavesefaz ;
   protected String gxTv_SdtSDTValidaAmbiente_Idtokensefaz ;
   protected String gxTv_SdtSDTValidaAmbiente_Nomeemissornfce ;
   protected String gxTv_SdtSDTValidaAmbiente_Cgc ;
   protected String gxTv_SdtSDTValidaAmbiente_Timeoutws ;
   protected String gxTv_SdtSDTValidaAmbiente_Uf_estado ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDTValidaAmbiente_Contingencia ;
   protected String gxTv_SdtSDTValidaAmbiente_Urlsefaz ;
   protected String gxTv_SdtSDTValidaAmbiente_Tokensefaz ;
   protected String gxTv_SdtSDTValidaAmbiente_Chaveacesso ;
   protected String gxTv_SdtSDTValidaAmbiente_Chaveparceiro ;
   protected String gxTv_SdtSDTValidaAmbiente_Diretorioinvoicy ;
   protected String gxTv_SdtSDTValidaAmbiente_Diretorioinvoicydocs ;
   protected String gxTv_SdtSDTValidaAmbiente_Bematechcomnumero ;
}

