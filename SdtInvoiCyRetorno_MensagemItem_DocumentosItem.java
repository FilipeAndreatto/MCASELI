/*
               File: SdtInvoiCyRetorno_MensagemItem_DocumentosItem
        Description: InvoiCyRetorno
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:23.50
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInvoiCyRetorno_MensagemItem_DocumentosItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtInvoiCyRetorno_MensagemItem_DocumentosItem( )
   {
      this(  new ModelContext(SdtInvoiCyRetorno_MensagemItem_DocumentosItem.class));
   }

   public SdtInvoiCyRetorno_MensagemItem_DocumentosItem( ModelContext context )
   {
      super( context, "SdtInvoiCyRetorno_MensagemItem_DocumentosItem");
   }

   public SdtInvoiCyRetorno_MensagemItem_DocumentosItem( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtInvoiCyRetorno_MensagemItem_DocumentosItem");
   }

   public SdtInvoiCyRetorno_MensagemItem_DocumentosItem( StructSdtInvoiCyRetorno_MensagemItem_DocumentosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Documento") )
            {
               if ( oReader.getNodeType() == 1 )
               {
                  GXSoapError = oReader.read() ;
                  gxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento = oReader.getValue() ;
                  GXSoapError = oReader.read() ;
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
         sName = "InvoiCyRetorno.MensagemItem.DocumentosItem" ;
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
      oWriter.writeStartElement("Documento");
      oWriter.writeCData(GXutil.rtrim( gxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento));
      oWriter.writeEndElement();
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("Documento", gxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento, false);
   }

   public String getgxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento( )
   {
      return gxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento ;
   }

   public void setgxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento( String value )
   {
      gxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento = "" ;
      sTagName = "" ;
   }

   public SdtInvoiCyRetorno_MensagemItem_DocumentosItem Clone( )
   {
      return (SdtInvoiCyRetorno_MensagemItem_DocumentosItem)(clone()) ;
   }

   public void setStruct( StructSdtInvoiCyRetorno_MensagemItem_DocumentosItem struct )
   {
      setgxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento(struct.getDocumento());
   }

   public StructSdtInvoiCyRetorno_MensagemItem_DocumentosItem getStruct( )
   {
      StructSdtInvoiCyRetorno_MensagemItem_DocumentosItem struct = new StructSdtInvoiCyRetorno_MensagemItem_DocumentosItem ();
      struct.setDocumento(getgxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtInvoiCyRetorno_MensagemItem_DocumentosItem_Documento ;
}

