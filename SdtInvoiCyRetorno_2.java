/*
               File: SdtInvoiCyRetorno_2
        Description: InvoiCyRetorno_2
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:23.52
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInvoiCyRetorno_2 extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtInvoiCyRetorno_2( )
   {
      this(  new ModelContext(SdtInvoiCyRetorno_2.class));
   }

   public SdtInvoiCyRetorno_2( ModelContext context )
   {
      super( context, "SdtInvoiCyRetorno_2");
   }

   public SdtInvoiCyRetorno_2( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtInvoiCyRetorno_2");
   }

   public SdtInvoiCyRetorno_2( StructSdtInvoiCyRetorno_2 struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mensagem") )
            {
               if ( gxTv_SdtInvoiCyRetorno_2_Mensagem == null )
               {
                  gxTv_SdtInvoiCyRetorno_2_Mensagem = new GxObjectCollection(SdtInvoiCyRetorno_2_MensagemItem.class, "InvoiCyRetorno_2.MensagemItem", "MCASELI4", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtInvoiCyRetorno_2_Mensagem.readxmlcollection(oReader, "Mensagem", "MensagemItem") ;
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
         sName = "InvoiCyRetorno_2" ;
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
      if ( gxTv_SdtInvoiCyRetorno_2_Mensagem != null )
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
         gxTv_SdtInvoiCyRetorno_2_Mensagem.writexmlcollection(oWriter, "Mensagem", sNameSpace1, "MensagemItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      if ( gxTv_SdtInvoiCyRetorno_2_Mensagem != null )
      {
         AddObjectProperty("Mensagem", gxTv_SdtInvoiCyRetorno_2_Mensagem, false);
      }
   }

   public GxObjectCollection getgxTv_SdtInvoiCyRetorno_2_Mensagem( )
   {
      if ( gxTv_SdtInvoiCyRetorno_2_Mensagem == null )
      {
         gxTv_SdtInvoiCyRetorno_2_Mensagem = new GxObjectCollection(SdtInvoiCyRetorno_2_MensagemItem.class, "InvoiCyRetorno_2.MensagemItem", "MCASELI4", remoteHandle);
      }
      return gxTv_SdtInvoiCyRetorno_2_Mensagem ;
   }

   public void setgxTv_SdtInvoiCyRetorno_2_Mensagem( GxObjectCollection value )
   {
      gxTv_SdtInvoiCyRetorno_2_Mensagem = value ;
   }

   public void setgxTv_SdtInvoiCyRetorno_2_Mensagem_SetNull( )
   {
      gxTv_SdtInvoiCyRetorno_2_Mensagem = null ;
   }

   public boolean getgxTv_SdtInvoiCyRetorno_2_Mensagem_IsNull( )
   {
      if ( gxTv_SdtInvoiCyRetorno_2_Mensagem == null )
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
      sTagName = "" ;
   }

   public SdtInvoiCyRetorno_2 Clone( )
   {
      return (SdtInvoiCyRetorno_2)(clone()) ;
   }

   public void setStruct( StructSdtInvoiCyRetorno_2 struct )
   {
      GxObjectCollection gxTv_SdtInvoiCyRetorno_2_Mensagem_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtInvoiCyRetorno_2_Mensagem_aux1 = new GxObjectCollection();
      gxTv_SdtInvoiCyRetorno_2_Mensagem_aux1.setStruct(struct.getMensagem());
      for (int i = 0; i < gxTv_SdtInvoiCyRetorno_2_Mensagem_aux1.size(); i++)
      {
         gxTv_SdtInvoiCyRetorno_2_Mensagem_aux.add(new SdtInvoiCyRetorno_2_MensagemItem((StructSdtInvoiCyRetorno_2_MensagemItem)gxTv_SdtInvoiCyRetorno_2_Mensagem_aux1.elementAt(i)));
      }
      setgxTv_SdtInvoiCyRetorno_2_Mensagem(gxTv_SdtInvoiCyRetorno_2_Mensagem_aux);
   }

   public StructSdtInvoiCyRetorno_2 getStruct( )
   {
      StructSdtInvoiCyRetorno_2 struct = new StructSdtInvoiCyRetorno_2 ();
      Vector aux_vectorgxTv_SdtInvoiCyRetorno_2_Mensagem = getgxTv_SdtInvoiCyRetorno_2_Mensagem().getStruct();
      Vector aux_vector1gxTv_SdtInvoiCyRetorno_2_Mensagem = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtInvoiCyRetorno_2_Mensagem.size(); i++)
      {
         aux_vector1gxTv_SdtInvoiCyRetorno_2_Mensagem.addElement(((SdtInvoiCyRetorno_2_MensagemItem)aux_vectorgxTv_SdtInvoiCyRetorno_2_Mensagem.elementAt(i)).getStruct());
      }
      struct.setMensagem(aux_vector1gxTv_SdtInvoiCyRetorno_2_Mensagem);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected GxObjectCollection gxTv_SdtInvoiCyRetorno_2_Mensagem=null ;
}

