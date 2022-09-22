/*
               File: SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem
        Description: SDT_ProdutosCadastrados
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:50.56
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem( )
   {
      this(  new ModelContext(SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem.class));
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem( ModelContext context )
   {
      super( context, "SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem");
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem( int remoteHandle ,
                                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem");
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem( StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem struct )
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
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "descricao") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "isProdutoDigital") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "isProdutoBandeirado") )
            {
               gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "encargos") )
            {
               if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos == null )
               {
                  gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos = new SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos.readxml(oReader, "encargos") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "limiteExtra") )
            {
               if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra == null )
               {
                  gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra = new SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra.readxml(oReader, "limiteExtra") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "overlimit") )
            {
               if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit == null )
               {
                  gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit = new SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit.readxml(oReader, "overlimit") ;
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
         sName = "SDT_ProdutosCadastrados.SDT_ProdutosCadastradosItem" ;
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
      oWriter.writeElement("id", GXutil.trim( GXutil.str( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("descricao", GXutil.rtrim( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("isProdutoDigital", GXutil.rtrim( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("isProdutoBandeirado", GXutil.rtrim( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos != null )
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
         gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos.writexml(oWriter, "encargos", sNameSpace1);
      }
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra != null )
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
         gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra.writexml(oWriter, "limiteExtra", sNameSpace1);
      }
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit != null )
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
         gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit.writexml(oWriter, "overlimit", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("id", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id, false);
      AddObjectProperty("descricao", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao, false);
      AddObjectProperty("isProdutoDigital", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital, false);
      AddObjectProperty("isProdutoBandeirado", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado, false);
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos != null )
      {
         AddObjectProperty("encargos", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos, false);
      }
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra != null )
      {
         AddObjectProperty("limiteExtra", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra, false);
      }
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit != null )
      {
         AddObjectProperty("overlimit", gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit, false);
      }
   }

   public long getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id( long value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id = value ;
   }

   public String getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao( String value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao = value ;
   }

   public String getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital( String value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital = value ;
   }

   public String getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado( )
   {
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado( String value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado = value ;
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos( )
   {
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos == null )
      {
         gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos = new SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos(remoteHandle, context);
      }
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos( SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos = value;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos_SetNull( )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos = (SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos)null;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos_IsNull( )
   {
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos == null )
      {
         return true ;
      }
      return false ;
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra( )
   {
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra == null )
      {
         gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra = new SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra(remoteHandle, context);
      }
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra( SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra = value;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra_SetNull( )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra = (SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra)null;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra_IsNull( )
   {
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra == null )
      {
         return true ;
      }
      return false ;
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit( )
   {
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit == null )
      {
         gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit = new SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit(remoteHandle, context);
      }
      return gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit ;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit( SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit value )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit = value;
   }

   public void setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit_SetNull( )
   {
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit = (SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit)null;
   }

   public boolean getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit_IsNull( )
   {
      if ( gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit == null )
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
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao = "" ;
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital = "" ;
      gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem Clone( )
   {
      return (SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem struct )
   {
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id(struct.getId());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao(struct.getDescricao());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital(struct.getIsprodutodigital());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado(struct.getIsprodutobandeirado());
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos(new SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos(struct.getEncargos()));
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra(new SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra(struct.getLimiteextra()));
      setgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit(new SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit(struct.getOverlimit()));
   }

   public StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem getStruct( )
   {
      StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem struct = new StructSdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem ();
      struct.setId(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id());
      struct.setDescricao(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao());
      struct.setIsprodutodigital(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital());
      struct.setIsprodutobandeirado(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado());
      struct.setEncargos(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos().getStruct());
      struct.setLimiteextra(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra().getStruct());
      struct.setOverlimit(getgxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Id ;
   protected String sTagName ;
   protected String gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Descricao ;
   protected String gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutodigital ;
   protected String gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Isprodutobandeirado ;
   protected SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_encargos gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Encargos=null ;
   protected SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_limiteExtra gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Limiteextra=null ;
   protected SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_overlimit gxTv_SdtSDT_ProdutosCadastrados_SDT_ProdutosCadastradosItem_Overlimit=null ;
}

