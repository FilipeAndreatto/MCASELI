/*
               File: SdtSDTRetornoDocumento_Situacao
        Description: SDTRetornoDocumento
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:23.72
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTRetornoDocumento_Situacao extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDTRetornoDocumento_Situacao( )
   {
      this(  new ModelContext(SdtSDTRetornoDocumento_Situacao.class));
   }

   public SdtSDTRetornoDocumento_Situacao( ModelContext context )
   {
      super( context, "SdtSDTRetornoDocumento_Situacao");
   }

   public SdtSDTRetornoDocumento_Situacao( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTRetornoDocumento_Situacao");
   }

   public SdtSDTRetornoDocumento_Situacao( StructSdtSDTRetornoDocumento_Situacao struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SitCodigo") )
            {
               gxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SitDescricao") )
            {
               gxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao = oReader.getValue() ;
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
         sName = "SDTRetornoDocumento.Situacao" ;
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
      oWriter.writeElement("SitCodigo", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("SitDescricao", GXutil.rtrim( gxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao));
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
      AddObjectProperty("SitCodigo", gxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo, false);
      AddObjectProperty("SitDescricao", gxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao, false);
   }

   public String getgxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo( )
   {
      return gxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo = value ;
   }

   public String getgxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao( )
   {
      return gxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao ;
   }

   public void setgxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao( String value )
   {
      gxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo = "" ;
      gxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao = "" ;
      sTagName = "" ;
   }

   public SdtSDTRetornoDocumento_Situacao Clone( )
   {
      return (SdtSDTRetornoDocumento_Situacao)(clone()) ;
   }

   public void setStruct( StructSdtSDTRetornoDocumento_Situacao struct )
   {
      setgxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo(struct.getSitcodigo());
      setgxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao(struct.getSitdescricao());
   }

   public StructSdtSDTRetornoDocumento_Situacao getStruct( )
   {
      StructSdtSDTRetornoDocumento_Situacao struct = new StructSdtSDTRetornoDocumento_Situacao ();
      struct.setSitcodigo(getgxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo());
      struct.setSitdescricao(getgxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtSDTRetornoDocumento_Situacao_Sitcodigo ;
   protected String gxTv_SdtSDTRetornoDocumento_Situacao_Sitdescricao ;
}

