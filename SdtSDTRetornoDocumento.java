/*
               File: SdtSDTRetornoDocumento
        Description: SDTRetornoDocumento
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:23.65
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTRetornoDocumento extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRetornoDocumento( )
   {
      this(  new ModelContext(SdtSDTRetornoDocumento.class));
   }

   public SdtSDTRetornoDocumento( ModelContext context )
   {
      super( context, "SdtSDTRetornoDocumento");
   }

   public SdtSDTRetornoDocumento( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRetornoDocumento");
   }

   public SdtSDTRetornoDocumento( StructSdtSDTRetornoDocumento struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocModelo") )
            {
               gxTv_SdtSDTRetornoDocumento_Docmodelo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocNumero") )
            {
               gxTv_SdtSDTRetornoDocumento_Docnumero = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocSerie") )
            {
               gxTv_SdtSDTRetornoDocumento_Docserie = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocChaAcesso") )
            {
               gxTv_SdtSDTRetornoDocumento_Docchaacesso = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocProtocolo") )
            {
               gxTv_SdtSDTRetornoDocumento_Docprotocolo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocEvenSeq") )
            {
               gxTv_SdtSDTRetornoDocumento_Docevenseq = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocEveTp") )
            {
               gxTv_SdtSDTRetornoDocumento_Docevetp = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocEveId") )
            {
               gxTv_SdtSDTRetornoDocumento_Doceveid = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocPDFBase64") )
            {
               gxTv_SdtSDTRetornoDocumento_Docpdfbase64 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocPDFDownload") )
            {
               gxTv_SdtSDTRetornoDocumento_Docpdfdownload = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocDhAut") )
            {
               gxTv_SdtSDTRetornoDocumento_Docdhaut = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocDigestValue") )
            {
               gxTv_SdtSDTRetornoDocumento_Docdigestvalue = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocXMLBase64") )
            {
               gxTv_SdtSDTRetornoDocumento_Docxmlbase64 = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocXMLDownload") )
            {
               gxTv_SdtSDTRetornoDocumento_Docxmldownload = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DocImpressora") )
            {
               gxTv_SdtSDTRetornoDocumento_Docimpressora = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Situacao") )
            {
               if ( gxTv_SdtSDTRetornoDocumento_Situacao == null )
               {
                  gxTv_SdtSDTRetornoDocumento_Situacao = new SdtSDTRetornoDocumento_Situacao(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDTRetornoDocumento_Situacao.readxml(oReader, "Situacao") ;
               }
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
         sName = "SDTRetornoDocumento" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "MCASELI4" ;
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
      oWriter.writeElement("DocModelo", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docmodelo));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocNumero", GXutil.trim( GXutil.str( gxTv_SdtSDTRetornoDocumento_Docnumero, 9, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocSerie", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docserie));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocChaAcesso", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docchaacesso));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocProtocolo", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docprotocolo));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocEvenSeq", GXutil.trim( GXutil.str( gxTv_SdtSDTRetornoDocumento_Docevenseq, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocEveTp", GXutil.trim( GXutil.str( gxTv_SdtSDTRetornoDocumento_Docevetp, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocEveId", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Doceveid));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocPDFBase64", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docpdfbase64));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocPDFDownload", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docpdfdownload));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocDhAut", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docdhaut));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocDigestValue", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docdigestvalue));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocXMLBase64", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docxmlbase64));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocXMLDownload", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Docxmldownload));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("DocImpressora", GXutil.trim( GXutil.str( gxTv_SdtSDTRetornoDocumento_Docimpressora, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      if ( gxTv_SdtSDTRetornoDocumento_Situacao != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDTRetornoDocumento_Situacao.writexml(oWriter, "Situacao", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("DocModelo", gxTv_SdtSDTRetornoDocumento_Docmodelo, false);
      AddObjectProperty("DocNumero", gxTv_SdtSDTRetornoDocumento_Docnumero, false);
      AddObjectProperty("DocSerie", gxTv_SdtSDTRetornoDocumento_Docserie, false);
      AddObjectProperty("DocChaAcesso", gxTv_SdtSDTRetornoDocumento_Docchaacesso, false);
      AddObjectProperty("DocProtocolo", gxTv_SdtSDTRetornoDocumento_Docprotocolo, false);
      AddObjectProperty("DocEvenSeq", gxTv_SdtSDTRetornoDocumento_Docevenseq, false);
      AddObjectProperty("DocEveTp", gxTv_SdtSDTRetornoDocumento_Docevetp, false);
      AddObjectProperty("DocEveId", gxTv_SdtSDTRetornoDocumento_Doceveid, false);
      AddObjectProperty("DocPDFBase64", gxTv_SdtSDTRetornoDocumento_Docpdfbase64, false);
      AddObjectProperty("DocPDFDownload", gxTv_SdtSDTRetornoDocumento_Docpdfdownload, false);
      AddObjectProperty("DocDhAut", gxTv_SdtSDTRetornoDocumento_Docdhaut, false);
      AddObjectProperty("DocDigestValue", gxTv_SdtSDTRetornoDocumento_Docdigestvalue, false);
      AddObjectProperty("DocXMLBase64", gxTv_SdtSDTRetornoDocumento_Docxmlbase64, false);
      AddObjectProperty("DocXMLDownload", gxTv_SdtSDTRetornoDocumento_Docxmldownload, false);
      AddObjectProperty("DocImpressora", gxTv_SdtSDTRetornoDocumento_Docimpressora, false);
      if ( gxTv_SdtSDTRetornoDocumento_Situacao != null )
      {
         AddObjectProperty("Situacao", gxTv_SdtSDTRetornoDocumento_Situacao, false);
      }
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docmodelo( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docmodelo ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docmodelo( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docmodelo = value ;
   }

   public int getgxTv_SdtSDTRetornoDocumento_Docnumero( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docnumero ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docnumero( int value )
   {
      gxTv_SdtSDTRetornoDocumento_Docnumero = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docserie( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docserie ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docserie( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docserie = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docchaacesso( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docchaacesso ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docchaacesso( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docchaacesso = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docprotocolo( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docprotocolo ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docprotocolo( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docprotocolo = value ;
   }

   public byte getgxTv_SdtSDTRetornoDocumento_Docevenseq( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docevenseq ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docevenseq( byte value )
   {
      gxTv_SdtSDTRetornoDocumento_Docevenseq = value ;
   }

   public int getgxTv_SdtSDTRetornoDocumento_Docevetp( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docevetp ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docevetp( int value )
   {
      gxTv_SdtSDTRetornoDocumento_Docevetp = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Doceveid( )
   {
      return gxTv_SdtSDTRetornoDocumento_Doceveid ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Doceveid( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Doceveid = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docpdfbase64( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docpdfbase64 ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docpdfbase64( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docpdfbase64 = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docpdfdownload( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docpdfdownload ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docpdfdownload( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docpdfdownload = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docdhaut( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docdhaut ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docdhaut( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docdhaut = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docdigestvalue( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docdigestvalue ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docdigestvalue( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docdigestvalue = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docxmlbase64( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docxmlbase64 ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docxmlbase64( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docxmlbase64 = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Docxmldownload( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docxmldownload ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docxmldownload( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Docxmldownload = value ;
   }

   public short getgxTv_SdtSDTRetornoDocumento_Docimpressora( )
   {
      return gxTv_SdtSDTRetornoDocumento_Docimpressora ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Docimpressora( short value )
   {
      gxTv_SdtSDTRetornoDocumento_Docimpressora = value ;
   }

   public SdtSDTRetornoDocumento_Situacao getgxTv_SdtSDTRetornoDocumento_Situacao( )
   {
      if ( gxTv_SdtSDTRetornoDocumento_Situacao == null )
      {
         gxTv_SdtSDTRetornoDocumento_Situacao = new SdtSDTRetornoDocumento_Situacao(remoteHandle, context);
      }
      return gxTv_SdtSDTRetornoDocumento_Situacao ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Situacao( SdtSDTRetornoDocumento_Situacao value )
   {
      gxTv_SdtSDTRetornoDocumento_Situacao = value;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Situacao_SetNull( )
   {
      gxTv_SdtSDTRetornoDocumento_Situacao = (SdtSDTRetornoDocumento_Situacao)null;
   }

   public boolean getgxTv_SdtSDTRetornoDocumento_Situacao_IsNull( )
   {
      if ( gxTv_SdtSDTRetornoDocumento_Situacao == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTRetornoDocumento_Docmodelo = "" ;
      gxTv_SdtSDTRetornoDocumento_Docserie = "" ;
      gxTv_SdtSDTRetornoDocumento_Docchaacesso = "" ;
      gxTv_SdtSDTRetornoDocumento_Docprotocolo = "" ;
      gxTv_SdtSDTRetornoDocumento_Doceveid = "" ;
      gxTv_SdtSDTRetornoDocumento_Docpdfbase64 = "" ;
      gxTv_SdtSDTRetornoDocumento_Docpdfdownload = "" ;
      gxTv_SdtSDTRetornoDocumento_Docdhaut = "" ;
      gxTv_SdtSDTRetornoDocumento_Docdigestvalue = "" ;
      gxTv_SdtSDTRetornoDocumento_Docxmlbase64 = "" ;
      gxTv_SdtSDTRetornoDocumento_Docxmldownload = "" ;
      sTagName = "" ;
   }

   public SdtSDTRetornoDocumento Clone( )
   {
      return (SdtSDTRetornoDocumento)(clone()) ;
   }

   public void setStruct( StructSdtSDTRetornoDocumento struct )
   {
      setgxTv_SdtSDTRetornoDocumento_Docmodelo(struct.getDocmodelo());
      setgxTv_SdtSDTRetornoDocumento_Docnumero(struct.getDocnumero());
      setgxTv_SdtSDTRetornoDocumento_Docserie(struct.getDocserie());
      setgxTv_SdtSDTRetornoDocumento_Docchaacesso(struct.getDocchaacesso());
      setgxTv_SdtSDTRetornoDocumento_Docprotocolo(struct.getDocprotocolo());
      setgxTv_SdtSDTRetornoDocumento_Docevenseq(struct.getDocevenseq());
      setgxTv_SdtSDTRetornoDocumento_Docevetp(struct.getDocevetp());
      setgxTv_SdtSDTRetornoDocumento_Doceveid(struct.getDoceveid());
      setgxTv_SdtSDTRetornoDocumento_Docpdfbase64(struct.getDocpdfbase64());
      setgxTv_SdtSDTRetornoDocumento_Docpdfdownload(struct.getDocpdfdownload());
      setgxTv_SdtSDTRetornoDocumento_Docdhaut(struct.getDocdhaut());
      setgxTv_SdtSDTRetornoDocumento_Docdigestvalue(struct.getDocdigestvalue());
      setgxTv_SdtSDTRetornoDocumento_Docxmlbase64(struct.getDocxmlbase64());
      setgxTv_SdtSDTRetornoDocumento_Docxmldownload(struct.getDocxmldownload());
      setgxTv_SdtSDTRetornoDocumento_Docimpressora(struct.getDocimpressora());
      setgxTv_SdtSDTRetornoDocumento_Situacao(new SdtSDTRetornoDocumento_Situacao(struct.getSituacao()));
   }

   public StructSdtSDTRetornoDocumento getStruct( )
   {
      StructSdtSDTRetornoDocumento struct = new StructSdtSDTRetornoDocumento ();
      struct.setDocmodelo(getgxTv_SdtSDTRetornoDocumento_Docmodelo());
      struct.setDocnumero(getgxTv_SdtSDTRetornoDocumento_Docnumero());
      struct.setDocserie(getgxTv_SdtSDTRetornoDocumento_Docserie());
      struct.setDocchaacesso(getgxTv_SdtSDTRetornoDocumento_Docchaacesso());
      struct.setDocprotocolo(getgxTv_SdtSDTRetornoDocumento_Docprotocolo());
      struct.setDocevenseq(getgxTv_SdtSDTRetornoDocumento_Docevenseq());
      struct.setDocevetp(getgxTv_SdtSDTRetornoDocumento_Docevetp());
      struct.setDoceveid(getgxTv_SdtSDTRetornoDocumento_Doceveid());
      struct.setDocpdfbase64(getgxTv_SdtSDTRetornoDocumento_Docpdfbase64());
      struct.setDocpdfdownload(getgxTv_SdtSDTRetornoDocumento_Docpdfdownload());
      struct.setDocdhaut(getgxTv_SdtSDTRetornoDocumento_Docdhaut());
      struct.setDocdigestvalue(getgxTv_SdtSDTRetornoDocumento_Docdigestvalue());
      struct.setDocxmlbase64(getgxTv_SdtSDTRetornoDocumento_Docxmlbase64());
      struct.setDocxmldownload(getgxTv_SdtSDTRetornoDocumento_Docxmldownload());
      struct.setDocimpressora(getgxTv_SdtSDTRetornoDocumento_Docimpressora());
      struct.setSituacao(getgxTv_SdtSDTRetornoDocumento_Situacao().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTRetornoDocumento_Docevenseq ;
   protected short gxTv_SdtSDTRetornoDocumento_Docimpressora ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTRetornoDocumento_Docnumero ;
   protected int gxTv_SdtSDTRetornoDocumento_Docevetp ;
   protected String gxTv_SdtSDTRetornoDocumento_Docserie ;
   protected String gxTv_SdtSDTRetornoDocumento_Docchaacesso ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRetornoDocumento_Docpdfbase64 ;
   protected String gxTv_SdtSDTRetornoDocumento_Docxmlbase64 ;
   protected String gxTv_SdtSDTRetornoDocumento_Docmodelo ;
   protected String gxTv_SdtSDTRetornoDocumento_Docprotocolo ;
   protected String gxTv_SdtSDTRetornoDocumento_Doceveid ;
   protected String gxTv_SdtSDTRetornoDocumento_Docpdfdownload ;
   protected String gxTv_SdtSDTRetornoDocumento_Docdhaut ;
   protected String gxTv_SdtSDTRetornoDocumento_Docdigestvalue ;
   protected String gxTv_SdtSDTRetornoDocumento_Docxmldownload ;
   protected SdtSDTRetornoDocumento_Situacao gxTv_SdtSDTRetornoDocumento_Situacao=null ;
}

