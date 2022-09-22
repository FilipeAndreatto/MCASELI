/*
               File: SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit
        Description: SDT_ProdutosCadastrados
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:50.76
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit( )
   {
      this(  new ModelContext(SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit.class));
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit( ModelContext context )
   {
      super( context, "SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit");
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit( int remoteHandle ,
                                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit");
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit( StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "percentualSobreUso") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "permitePercentualSobreUso") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "taxaSobreUso") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "permiteTaxaSobreUso") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "permiteRepetirMesmoCiclo") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "SDT_ProdutosCadastrados.SDT_ProdutosCadastradosItem.overlimit" ;
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
      oWriter.writeElement("percentualSobreUso", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("permitePercentualSobreUso", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("taxaSobreUso", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("permiteTaxaSobreUso", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("permiteRepetirMesmoCiclo", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo)));
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
      AddObjectProperty("percentualSobreUso", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso, false);
      AddObjectProperty("permitePercentualSobreUso", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso, false);
      AddObjectProperty("taxaSobreUso", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso, false);
      AddObjectProperty("permiteTaxaSobreUso", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso, false);
      AddObjectProperty("permiteRepetirMesmoCiclo", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso = value ;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso( boolean value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso = value ;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso( boolean value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso = value ;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo( boolean value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit Clone( )
   {
      return (SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit struct )
   {
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso(struct.getPercentualsobreuso());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso(struct.getPermitepercentualsobreuso());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso(struct.getTaxasobreuso());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso(struct.getPermitetaxasobreuso());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo(struct.getPermiterepetirmesmociclo());
   }

   public StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit getStruct( )
   {
      StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit struct = new StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit ();
      struct.setPercentualsobreuso(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso());
      struct.setPermitepercentualsobreuso(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso());
      struct.setTaxasobreuso(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso());
      struct.setPermitetaxasobreuso(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso());
      struct.setPermiterepetirmesmociclo(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Percentualsobreuso ;
   protected java.math.BigDecimal gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Taxasobreuso ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitepercentualsobreuso ;
   protected boolean gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permitetaxasobreuso ;
   protected boolean gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit_Permiterepetirmesmociclo ;
}

