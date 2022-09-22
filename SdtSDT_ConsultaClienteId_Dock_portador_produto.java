/*
               File: SdtSDT_ConsultaClienteId_Dock_portador_produto
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:50.21
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador_produto extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador_produto( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador_produto.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_produto( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador_produto");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_produto( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador_produto");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_produto( StructSdtSDT_ConsultaClienteId_Dock_portador_produto struct )
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
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "descricao") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "isProdutoDigital") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "isProdutoBandeirado") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "encargos") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "limiteExtra") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "overlimit") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit = oReader.getValue() ;
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
         sName = "SDT_ConsultaClienteId_Dock_portador.produto" ;
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
      oWriter.writeElement("id", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("descricao", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("isProdutoDigital", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("isProdutoBandeirado", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("encargos", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("limiteExtra", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("overlimit", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit));
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
      AddObjectProperty("id", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id, false);
      AddObjectProperty("descricao", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao, false);
      AddObjectProperty("isProdutoDigital", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital, false);
      AddObjectProperty("isProdutoBandeirado", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado, false);
      AddObjectProperty("encargos", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos, false);
      AddObjectProperty("limiteExtra", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra, false);
      AddObjectProperty("overlimit", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_produto Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador_produto)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador_produto struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id(struct.getId());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao(struct.getDescricao());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital(struct.getIsprodutodigital());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado(struct.getIsprodutobandeirado());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos(struct.getEncargos());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra(struct.getLimiteextra());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit(struct.getOverlimit());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador_produto getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador_produto struct = new StructSdtSDT_ConsultaClienteId_Dock_portador_produto ();
      struct.setId(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id());
      struct.setDescricao(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao());
      struct.setIsprodutodigital(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital());
      struct.setIsprodutobandeirado(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado());
      struct.setEncargos(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos());
      struct.setLimiteextra(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra());
      struct.setOverlimit(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Id ;
   protected String sTagName ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Descricao ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutodigital ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Isprodutobandeirado ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Encargos ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Limiteextra ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_produto_Overlimit ;
}

