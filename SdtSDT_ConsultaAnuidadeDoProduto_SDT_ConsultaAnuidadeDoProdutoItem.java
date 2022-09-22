/*
               File: SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem
        Description: SDT_ConsultaAnuidadeDoProduto
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:48.89
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem( )
   {
      this(  new ModelContext(SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem.class));
   }

   public SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem");
   }

   public SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem( int remoteHandle ,
                                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem");
   }

   public SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem( StructSdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "id") )
            {
               gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "descricao") )
            {
               gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valor") )
            {
               gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "faturamentoMinimo") )
            {
               gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "numParcelasCancelamento") )
            {
               gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "isBonificada") )
            {
               gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorRecobranca") )
            {
               gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "status") )
            {
               gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "estornavel") )
            {
               gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "SDT_ConsultaAnuidadeDoProduto.SDT_ConsultaAnuidadeDoProdutoItem" ;
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
      oWriter.writeElement("id", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("descricao", GXutil.rtrim( gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valor", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("faturamentoMinimo", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("numParcelasCancelamento", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("isBonificada", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorRecobranca", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("status", GXutil.rtrim( gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("estornavel", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel)));
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
      AddObjectProperty("id", gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id, false);
      AddObjectProperty("descricao", gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao, false);
      AddObjectProperty("valor", gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor, false);
      AddObjectProperty("faturamentoMinimo", gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo, false);
      AddObjectProperty("numParcelasCancelamento", gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento, false);
      AddObjectProperty("isBonificada", gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada, false);
      AddObjectProperty("valorRecobranca", gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca, false);
      AddObjectProperty("status", gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status, false);
      AddObjectProperty("estornavel", gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id( )
   {
      return gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id ;
   }

   public void setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id = value ;
   }

   public String getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao( )
   {
      return gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao ;
   }

   public void setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao( String value )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor( )
   {
      return gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor ;
   }

   public void setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo( )
   {
      return gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo ;
   }

   public void setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento( )
   {
      return gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento ;
   }

   public void setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada( )
   {
      return gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada ;
   }

   public void setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada( boolean value )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca( )
   {
      return gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca ;
   }

   public void setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca = value ;
   }

   public String getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status( )
   {
      return gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status ;
   }

   public void setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status( String value )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel( )
   {
      return gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel ;
   }

   public void setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel( boolean value )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao = "" ;
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem Clone( )
   {
      return (SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem struct )
   {
      setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id(struct.getId());
      setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao(struct.getDescricao());
      setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor(struct.getValor());
      setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo(struct.getFaturamentominimo());
      setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento(struct.getNumparcelascancelamento());
      setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada(struct.getIsbonificada());
      setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca(struct.getValorrecobranca());
      setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status(struct.getStatus());
      setgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel(struct.getEstornavel());
   }

   public StructSdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem getStruct( )
   {
      StructSdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem struct = new StructSdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem ();
      struct.setId(getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id());
      struct.setDescricao(getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao());
      struct.setValor(getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor());
      struct.setFaturamentominimo(getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo());
      struct.setNumparcelascancelamento(getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento());
      struct.setIsbonificada(getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada());
      struct.setValorrecobranca(getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca());
      struct.setStatus(getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status());
      struct.setEstornavel(getgxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Id ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valor ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Faturamentominimo ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Numparcelascancelamento ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Valorrecobranca ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Isbonificada ;
   protected boolean gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Estornavel ;
   protected String gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Descricao ;
   protected String gxTv_SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem_Status ;
}

