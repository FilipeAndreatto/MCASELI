/*
               File: SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra
        Description: SDT_ProdutosCadastrados
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:50.69
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra( )
   {
      this(  new ModelContext(SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra.class));
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra( ModelContext context )
   {
      super( context, "SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra");
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra( int remoteHandle ,
                                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra");
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra( StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "percentualPadrao") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorPadrao") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "habilitarClientesNovos") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "SDT_ProdutosCadastrados.SDT_ProdutosCadastradosItem.limiteExtra" ;
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
      oWriter.writeElement("percentualPadrao", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorPadrao", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("habilitarClientesNovos", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos)));
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
      AddObjectProperty("percentualPadrao", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao, false);
      AddObjectProperty("valorPadrao", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao, false);
      AddObjectProperty("habilitarClientesNovos", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao = value ;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos( boolean value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra Clone( )
   {
      return (SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra struct )
   {
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao(struct.getPercentualpadrao());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao(struct.getValorpadrao());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos(struct.getHabilitarclientesnovos());
   }

   public StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra getStruct( )
   {
      StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra struct = new StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra ();
      struct.setPercentualpadrao(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao());
      struct.setValorpadrao(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao());
      struct.setHabilitarclientesnovos(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Percentualpadrao ;
   protected java.math.BigDecimal gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Valorpadrao ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra_Habilitarclientesnovos ;
}

