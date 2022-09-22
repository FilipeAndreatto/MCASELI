/*
               File: SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem
        Description: EnvioEvento
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:23.25
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem( )
   {
      this(  new ModelContext(SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem.class));
   }

   public SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem( ModelContext context )
   {
      super( context, "SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem");
   }

   public SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem( int remoteHandle ,
                                                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem");
   }

   public SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem( StructSdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NumeroItem") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "QtdeItem") && ( oReader.getNodeType() != 2 ) && ( GXutil.strcmp(oReader.getNamespaceURI(), "") == 0 ) )
            {
               gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "EnvioEvento.Evento.EveInf.Evedet.ProrrogICMS.ProrrogICMSItem" ;
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
      oWriter.writeElement("NumeroItem", GXutil.trim( GXutil.str( gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeElement("QtdeItem", GXutil.trim( GXutil.strNoRound( gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem, 18, 4)));
      if ( GXutil.strcmp(sNameSpace, "") != 0 )
      {
         oWriter.writeAttribute("xmlns", "");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("NumeroItem", gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem, false);
      AddObjectProperty("QtdeItem", GXutil.ltrim( GXutil.strNoRound( gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem, 18, 4)), false);
   }

   public short getgxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem( )
   {
      return gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem ;
   }

   public void setgxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem( short value )
   {
      gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem = value ;
   }

   public java.math.BigDecimal getgxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem( )
   {
      return gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem ;
   }

   public void setgxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem( java.math.BigDecimal value )
   {
      gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem Clone( )
   {
      return (SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem)(clone()) ;
   }

   public void setStruct( StructSdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem struct )
   {
      setgxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem(struct.getNumeroitem());
      setgxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem(struct.getQtdeitem());
   }

   public StructSdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem getStruct( )
   {
      StructSdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem struct = new StructSdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem ();
      struct.setNumeroitem(getgxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem());
      struct.setQtdeitem(getgxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem());
      return struct ;
   }

   protected short gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Numeroitem ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtEnvioEvento_Evento_EveInf_Evedet_ProrrogICMS_ProrrogICMSItem_Qtdeitem ;
   protected String sTagName ;
}

