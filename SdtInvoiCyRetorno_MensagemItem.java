/*
               File: SdtInvoiCyRetorno_MensagemItem
        Description: InvoiCyRetorno
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:23.47
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInvoiCyRetorno_MensagemItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtInvoiCyRetorno_MensagemItem( )
   {
      this(  new ModelContext(SdtInvoiCyRetorno_MensagemItem.class));
   }

   public SdtInvoiCyRetorno_MensagemItem( ModelContext context )
   {
      super( context, "SdtInvoiCyRetorno_MensagemItem");
   }

   public SdtInvoiCyRetorno_MensagemItem( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtInvoiCyRetorno_MensagemItem");
   }

   public SdtInvoiCyRetorno_MensagemItem( StructSdtInvoiCyRetorno_MensagemItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Codigo") )
            {
               gxTv_SdtInvoiCyRetorno_MensagemItem_Codigo = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descricao") )
            {
               gxTv_SdtInvoiCyRetorno_MensagemItem_Descricao = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Documentos") )
            {
               if ( gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos == null )
               {
                  gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos = new GxObjectCollection(SdtInvoiCyRetorno_MensagemItem_DocumentosItem.class, "InvoiCyRetorno.MensagemItem.DocumentosItem", "InvoiCy", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos.readxmlcollection(oReader, "Documentos", "DocumentosItem") ;
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
         sName = "InvoiCyRetorno.MensagemItem" ;
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
      oWriter.writeElement("Codigo", GXutil.trim( GXutil.str( gxTv_SdtInvoiCyRetorno_MensagemItem_Codigo, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "InvoiCy") != 0 )
      {
         oWriter.writeAttribute("xmlns", "InvoiCy");
      }
      oWriter.writeElement("Descricao", GXutil.rtrim( gxTv_SdtInvoiCyRetorno_MensagemItem_Descricao));
      if ( GXutil.strcmp(sNameSpace, "InvoiCy") != 0 )
      {
         oWriter.writeAttribute("xmlns", "InvoiCy");
      }
      if ( gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "InvoiCy") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "InvoiCy" ;
         }
         else
         {
            sNameSpace1 = "InvoiCy" ;
         }
         gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos.writexmlcollection(oWriter, "Documentos", sNameSpace1, "DocumentosItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("Codigo", gxTv_SdtInvoiCyRetorno_MensagemItem_Codigo, false);
      AddObjectProperty("Descricao", gxTv_SdtInvoiCyRetorno_MensagemItem_Descricao, false);
      if ( gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos != null )
      {
         AddObjectProperty("Documentos", gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos, false);
      }
   }

   public int getgxTv_SdtInvoiCyRetorno_MensagemItem_Codigo( )
   {
      return gxTv_SdtInvoiCyRetorno_MensagemItem_Codigo ;
   }

   public void setgxTv_SdtInvoiCyRetorno_MensagemItem_Codigo( int value )
   {
      gxTv_SdtInvoiCyRetorno_MensagemItem_Codigo = value ;
   }

   public String getgxTv_SdtInvoiCyRetorno_MensagemItem_Descricao( )
   {
      return gxTv_SdtInvoiCyRetorno_MensagemItem_Descricao ;
   }

   public void setgxTv_SdtInvoiCyRetorno_MensagemItem_Descricao( String value )
   {
      gxTv_SdtInvoiCyRetorno_MensagemItem_Descricao = value ;
   }

   public GxObjectCollection getgxTv_SdtInvoiCyRetorno_MensagemItem_Documentos( )
   {
      if ( gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos == null )
      {
         gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos = new GxObjectCollection(SdtInvoiCyRetorno_MensagemItem_DocumentosItem.class, "InvoiCyRetorno.MensagemItem.DocumentosItem", "InvoiCy", remoteHandle);
      }
      return gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos ;
   }

   public void setgxTv_SdtInvoiCyRetorno_MensagemItem_Documentos( GxObjectCollection value )
   {
      gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos = value ;
   }

   public void setgxTv_SdtInvoiCyRetorno_MensagemItem_Documentos_SetNull( )
   {
      gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos = null ;
   }

   public boolean getgxTv_SdtInvoiCyRetorno_MensagemItem_Documentos_IsNull( )
   {
      if ( gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos == null )
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
      gxTv_SdtInvoiCyRetorno_MensagemItem_Descricao = "" ;
      sTagName = "" ;
   }

   public SdtInvoiCyRetorno_MensagemItem Clone( )
   {
      return (SdtInvoiCyRetorno_MensagemItem)(clone()) ;
   }

   public void setStruct( StructSdtInvoiCyRetorno_MensagemItem struct )
   {
      setgxTv_SdtInvoiCyRetorno_MensagemItem_Codigo(struct.getCodigo());
      setgxTv_SdtInvoiCyRetorno_MensagemItem_Descricao(struct.getDescricao());
      GxObjectCollection gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos_aux1 = new GxObjectCollection();
      gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos_aux1.setStruct(struct.getDocumentos());
      for (int i = 0; i < gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos_aux1.size(); i++)
      {
         gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos_aux.add(new SdtInvoiCyRetorno_MensagemItem_DocumentosItem((StructSdtInvoiCyRetorno_MensagemItem_DocumentosItem)gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos_aux1.elementAt(i)));
      }
      setgxTv_SdtInvoiCyRetorno_MensagemItem_Documentos(gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos_aux);
   }

   public StructSdtInvoiCyRetorno_MensagemItem getStruct( )
   {
      StructSdtInvoiCyRetorno_MensagemItem struct = new StructSdtInvoiCyRetorno_MensagemItem ();
      struct.setCodigo(getgxTv_SdtInvoiCyRetorno_MensagemItem_Codigo());
      struct.setDescricao(getgxTv_SdtInvoiCyRetorno_MensagemItem_Descricao());
      Vector aux_vectorgxTv_SdtInvoiCyRetorno_MensagemItem_Documentos = getgxTv_SdtInvoiCyRetorno_MensagemItem_Documentos().getStruct();
      Vector aux_vector1gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtInvoiCyRetorno_MensagemItem_Documentos.size(); i++)
      {
         aux_vector1gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos.addElement(((SdtInvoiCyRetorno_MensagemItem_DocumentosItem)aux_vectorgxTv_SdtInvoiCyRetorno_MensagemItem_Documentos.elementAt(i)).getStruct());
      }
      struct.setDocumentos(aux_vector1gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtInvoiCyRetorno_MensagemItem_Codigo ;
   protected String sTagName ;
   protected String gxTv_SdtInvoiCyRetorno_MensagemItem_Descricao ;
   protected GxObjectCollection gxTv_SdtInvoiCyRetorno_MensagemItem_Documentos=null ;
}

