/*
               File: SdtInvoiCyFramework
        Description: InvoiCyFramework
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:23.33
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInvoiCyFramework extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtInvoiCyFramework( )
   {
      this(  new ModelContext(SdtInvoiCyFramework.class));
   }

   public SdtInvoiCyFramework( ModelContext context )
   {
      super( context, "SdtInvoiCyFramework");
   }

   public SdtInvoiCyFramework( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtInvoiCyFramework");
   }

   public SdtInvoiCyFramework( StructSdtInvoiCyFramework struct )
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

   public int invoicyframework_servico( )
   {
      int returninvoicyframework_servico ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_servico = 0;
      returninvoicyframework_servico = InvoiCyFramework_externalReference.InvoiCyFramework_Servico() ;
      return returninvoicyframework_servico ;
   }

   public int invoicyframework_versao( )
   {
      int returninvoicyframework_versao ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_versao = 0;
      returninvoicyframework_versao = InvoiCyFramework_externalReference.InvoiCyFramework_Versao() ;
      return returninvoicyframework_versao ;
   }

   public String invoicyframework_alertas( )
   {
      String returninvoicyframework_alertas ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_alertas = "";
      returninvoicyframework_alertas = InvoiCyFramework_externalReference.InvoiCyFramework_Alertas() ;
      return returninvoicyframework_alertas ;
   }

   public String invoicyframework_log( )
   {
      String returninvoicyframework_log ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_log = "";
      returninvoicyframework_log = InvoiCyFramework_externalReference.InvoiCyFramework_Log() ;
      return returninvoicyframework_log ;
   }

   public String invoicyframework_emitedocumento( String gxTp_param0 ,
                                                  String gxTp_param1 )
   {
      String returninvoicyframework_emitedocumento ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_emitedocumento = "";
      returninvoicyframework_emitedocumento = InvoiCyFramework_externalReference.InvoiCyFramework_EmiteDocumento(gxTp_param0, gxTp_param1) ;
      return returninvoicyframework_emitedocumento ;
   }

   public int invoicyframework_ambienteemissao( int gxTp_param0 )
   {
      int returninvoicyframework_ambienteemissao ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_ambienteemissao = 0;
      returninvoicyframework_ambienteemissao = InvoiCyFramework_externalReference.InvoiCyFramework_AmbienteEmissao(gxTp_param0) ;
      return returninvoicyframework_ambienteemissao ;
   }

   public int invoicyframework_arquivosistema( String gxTp_param0 ,
                                               String gxTp_param1 )
   {
      int returninvoicyframework_arquivosistema ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_arquivosistema = 0;
      returninvoicyframework_arquivosistema = InvoiCyFramework_externalReference.InvoiCyFramework_ArquivoSistema(gxTp_param0, gxTp_param1) ;
      return returninvoicyframework_arquivosistema ;
   }

   public String invoicyframework_obtemparametro( int gxTp_param0 )
   {
      String returninvoicyframework_obtemparametro ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_obtemparametro = "";
      returninvoicyframework_obtemparametro = InvoiCyFramework_externalReference.InvoiCyFramework_ObtemParametro(gxTp_param0) ;
      return returninvoicyframework_obtemparametro ;
   }

   public int invoicyframework_imprimetexto( String gxTp_param0 )
   {
      int returninvoicyframework_imprimetexto ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_imprimetexto = 0;
      returninvoicyframework_imprimetexto = InvoiCyFramework_externalReference.InvoiCyFramework_ImprimeTexto(gxTp_param0) ;
      return returninvoicyframework_imprimetexto ;
   }

   public String invoicyframework_obtemdatahorauf( int gxTp_param0 ,
                                                   int gxTp_param1 )
   {
      String returninvoicyframework_obtemdatahorauf ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_obtemdatahorauf = "";
      returninvoicyframework_obtemdatahorauf = InvoiCyFramework_externalReference.InvoiCyFramework_ObtemDataHoraUF(gxTp_param0, gxTp_param1) ;
      return returninvoicyframework_obtemdatahorauf ;
   }

   public int invoicyframework_configura( String gxTp_param0 ,
                                          String gxTp_param1 )
   {
      int returninvoicyframework_configura ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_configura = 0;
      returninvoicyframework_configura = InvoiCyFramework_externalReference.InvoiCyFramework_Configura(gxTp_param0, gxTp_param1) ;
      return returninvoicyframework_configura ;
   }

   public int invoicyframework_configurasat( String gxTp_param0 ,
                                             String gxTp_param1 ,
                                             String gxTp_param2 )
   {
      int returninvoicyframework_configurasat ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_configurasat = 0;
      returninvoicyframework_configurasat = InvoiCyFramework_externalReference.InvoiCyFramework_ConfiguraSAT(gxTp_param0, gxTp_param1, gxTp_param2) ;
      return returninvoicyframework_configurasat ;
   }

   public int invoicyframework_configurauf( int gxTp_param0 ,
                                            String gxTp_param1 ,
                                            String gxTp_param2 )
   {
      int returninvoicyframework_configurauf ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_configurauf = 0;
      returninvoicyframework_configurauf = InvoiCyFramework_externalReference.InvoiCyFramework_ConfiguraUF(gxTp_param0, gxTp_param1, gxTp_param2) ;
      return returninvoicyframework_configurauf ;
   }

   public int invoicyframework_imprimedocumento( String gxTp_param0 )
   {
      int returninvoicyframework_imprimedocumento ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_imprimedocumento = 0;
      returninvoicyframework_imprimedocumento = InvoiCyFramework_externalReference.InvoiCyFramework_ImprimeDocumento(gxTp_param0) ;
      return returninvoicyframework_imprimedocumento ;
   }

   public int invoicyframework_insereparametrosemissao( int gxTp_param0 ,
                                                        int gxTp_param1 ,
                                                        String gxTp_param2 ,
                                                        int gxTp_param3 ,
                                                        String gxTp_param4 ,
                                                        String gxTp_param5 )
   {
      int returninvoicyframework_insereparametrosemissao ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_insereparametrosemissao = 0;
      returninvoicyframework_insereparametrosemissao = InvoiCyFramework_externalReference.InvoiCyFramework_InsereParametrosEmissao(gxTp_param0, gxTp_param1, gxTp_param2, gxTp_param3, gxTp_param4, gxTp_param5) ;
      return returninvoicyframework_insereparametrosemissao ;
   }

   public int invoicyframework_configurainvoicy( String gxTp_param0 ,
                                                 String gxTp_param1 ,
                                                 String gxTp_param2 )
   {
      int returninvoicyframework_configurainvoicy ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_configurainvoicy = 0;
      returninvoicyframework_configurainvoicy = InvoiCyFramework_externalReference.InvoiCyFramework_ConfiguraInvoicy(gxTp_param0, gxTp_param1, gxTp_param2) ;
      return returninvoicyframework_configurainvoicy ;
   }

   public int invoicyframework_configuradiretorio( String gxTp_param0 )
   {
      int returninvoicyframework_configuradiretorio ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_configuradiretorio = 0;
      returninvoicyframework_configuradiretorio = InvoiCyFramework_externalReference.InvoiCyFramework_ConfiguraDiretorio(gxTp_param0) ;
      return returninvoicyframework_configuradiretorio ;
   }

   public String invoicyframework_emitecontingencia( String gxTp_param0 )
   {
      String returninvoicyframework_emitecontingencia ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_emitecontingencia = "";
      returninvoicyframework_emitecontingencia = InvoiCyFramework_externalReference.InvoiCyFramework_EmiteContingencia(gxTp_param0) ;
      return returninvoicyframework_emitecontingencia ;
   }

   public String invoicyframework_relatoriopendentes( )
   {
      String returninvoicyframework_relatoriopendentes ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_relatoriopendentes = "";
      returninvoicyframework_relatoriopendentes = InvoiCyFramework_externalReference.InvoiCyFramework_RelatorioPendentes() ;
      return returninvoicyframework_relatoriopendentes ;
   }

   public int invoicyframework_enviadocumentospendentes( )
   {
      int returninvoicyframework_enviadocumentospendentes ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_enviadocumentospendentes = 0;
      returninvoicyframework_enviadocumentospendentes = InvoiCyFramework_externalReference.InvoiCyFramework_EnviaDocumentosPendentes() ;
      return returninvoicyframework_enviadocumentospendentes ;
   }

   public String invoicyframework_enviadocumentospendentesquantidade( int gxTp_param0 )
   {
      String returninvoicyframework_enviadocumentospendentesquantidade ;
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      returninvoicyframework_enviadocumentospendentesquantidade = "";
      returninvoicyframework_enviadocumentospendentesquantidade = InvoiCyFramework_externalReference.InvoiCyFramework_EnviaDocumentosPendentesQuantidade(gxTp_param0) ;
      return returninvoicyframework_enviadocumentospendentesquantidade ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
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
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
   }

   public info.migrate.InvoiCyFramework getExternalInstance( )
   {
      if ( InvoiCyFramework_externalReference == null )
      {
         InvoiCyFramework_externalReference = new info.migrate.InvoiCyFramework() ;
      }
      return InvoiCyFramework_externalReference ;
   }

   public void setExternalInstance( info.migrate.InvoiCyFramework value )
   {
      InvoiCyFramework_externalReference = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
   }

   public SdtInvoiCyFramework Clone( )
   {
      return (SdtInvoiCyFramework)(clone()) ;
   }

   public void setStruct( StructSdtInvoiCyFramework struct )
   {
   }

   public StructSdtInvoiCyFramework getStruct( )
   {
      StructSdtInvoiCyFramework struct = new StructSdtInvoiCyFramework ();
      return struct ;
   }

   protected info.migrate.InvoiCyFramework InvoiCyFramework_externalReference=null ;
}

