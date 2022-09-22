/*
               File: StructSdtDocumento
        Description: Documento
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:12.86
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtDocumento implements Cloneable, java.io.Serializable
{
   public StructSdtDocumento( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtDocumento_Docmodelo = "" ;
      gxTv_SdtDocumento_Docserie = "" ;
      gxTv_SdtDocumento_Docchaacesso = "" ;
      gxTv_SdtDocumento_Docprotocolo = "" ;
      gxTv_SdtDocumento_Docevenseq = "" ;
      gxTv_SdtDocumento_Docevetp = "" ;
      gxTv_SdtDocumento_Doceveid = "" ;
      gxTv_SdtDocumento_Docpdfbase64 = "" ;
      gxTv_SdtDocumento_Docpdfdownload = "" ;
      gxTv_SdtDocumento_Docdhaut = cal.getTime() ;
      gxTv_SdtDocumento_Docdigestvalue = "" ;
      gxTv_SdtDocumento_Docxmlbase64 = "" ;
      gxTv_SdtDocumento_Docxmldownload = "" ;
      gxTv_SdtDocumento_Docimpressora = "" ;
      gxTv_SdtDocumento_Docsitcodigo = "" ;
      gxTv_SdtDocumento_Docsitdescricao = "" ;
      gxTv_SdtDocumento_Docxml = "" ;
      gxTv_SdtDocumento_Docxmllink = "" ;
      gxTv_SdtDocumento_Docpdf = "" ;
      gxTv_SdtDocumento_Docpdflink = "" ;
      gxTv_SdtDocumento_Dhrecbto = "" ;
      gxTv_SdtDocumento_Ntemvigor = "" ;
      gxTv_SdtDocumento_Imprimirumaviacontingencia = "" ;
      gxTv_SdtDocumento_Docimpprefeitura = "" ;
      gxTv_SdtDocumento_Docstatus = "" ;
      gxTv_SdtDocumento_Certhoravencimento = "" ;
      gxTv_SdtDocumento_Eventos = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getDocmodelo( )
   {
      return gxTv_SdtDocumento_Docmodelo ;
   }

   public void setDocmodelo( String value )
   {
      gxTv_SdtDocumento_Docmodelo = value ;
   }

   public int getDocnumero( )
   {
      return gxTv_SdtDocumento_Docnumero ;
   }

   public void setDocnumero( int value )
   {
      gxTv_SdtDocumento_Docnumero = value ;
   }

   public String getDocserie( )
   {
      return gxTv_SdtDocumento_Docserie ;
   }

   public void setDocserie( String value )
   {
      gxTv_SdtDocumento_Docserie = value ;
   }

   public String getDocchaacesso( )
   {
      return gxTv_SdtDocumento_Docchaacesso ;
   }

   public void setDocchaacesso( String value )
   {
      gxTv_SdtDocumento_Docchaacesso = value ;
   }

   public String getDocprotocolo( )
   {
      return gxTv_SdtDocumento_Docprotocolo ;
   }

   public void setDocprotocolo( String value )
   {
      gxTv_SdtDocumento_Docprotocolo = value ;
   }

   public String getDocevenseq( )
   {
      return gxTv_SdtDocumento_Docevenseq ;
   }

   public void setDocevenseq( String value )
   {
      gxTv_SdtDocumento_Docevenseq = value ;
   }

   public String getDocevetp( )
   {
      return gxTv_SdtDocumento_Docevetp ;
   }

   public void setDocevetp( String value )
   {
      gxTv_SdtDocumento_Docevetp = value ;
   }

   public String getDoceveid( )
   {
      return gxTv_SdtDocumento_Doceveid ;
   }

   public void setDoceveid( String value )
   {
      gxTv_SdtDocumento_Doceveid = value ;
   }

   public String getDocpdfbase64( )
   {
      return gxTv_SdtDocumento_Docpdfbase64 ;
   }

   public void setDocpdfbase64( String value )
   {
      gxTv_SdtDocumento_Docpdfbase64 = value ;
   }

   public String getDocpdfdownload( )
   {
      return gxTv_SdtDocumento_Docpdfdownload ;
   }

   public void setDocpdfdownload( String value )
   {
      gxTv_SdtDocumento_Docpdfdownload = value ;
   }

   public java.util.Date getDocdhaut( )
   {
      return gxTv_SdtDocumento_Docdhaut ;
   }

   public void setDocdhaut( java.util.Date value )
   {
      gxTv_SdtDocumento_Docdhaut = value ;
   }

   public String getDocdigestvalue( )
   {
      return gxTv_SdtDocumento_Docdigestvalue ;
   }

   public void setDocdigestvalue( String value )
   {
      gxTv_SdtDocumento_Docdigestvalue = value ;
   }

   public String getDocxmlbase64( )
   {
      return gxTv_SdtDocumento_Docxmlbase64 ;
   }

   public void setDocxmlbase64( String value )
   {
      gxTv_SdtDocumento_Docxmlbase64 = value ;
   }

   public String getDocxmldownload( )
   {
      return gxTv_SdtDocumento_Docxmldownload ;
   }

   public void setDocxmldownload( String value )
   {
      gxTv_SdtDocumento_Docxmldownload = value ;
   }

   public String getDocimpressora( )
   {
      return gxTv_SdtDocumento_Docimpressora ;
   }

   public void setDocimpressora( String value )
   {
      gxTv_SdtDocumento_Docimpressora = value ;
   }

   public String getDocsitcodigo( )
   {
      return gxTv_SdtDocumento_Docsitcodigo ;
   }

   public void setDocsitcodigo( String value )
   {
      gxTv_SdtDocumento_Docsitcodigo = value ;
   }

   public String getDocsitdescricao( )
   {
      return gxTv_SdtDocumento_Docsitdescricao ;
   }

   public void setDocsitdescricao( String value )
   {
      gxTv_SdtDocumento_Docsitdescricao = value ;
   }

   public String getDocxml( )
   {
      return gxTv_SdtDocumento_Docxml ;
   }

   public void setDocxml( String value )
   {
      gxTv_SdtDocumento_Docxml = value ;
   }

   public String getDocxmllink( )
   {
      return gxTv_SdtDocumento_Docxmllink ;
   }

   public void setDocxmllink( String value )
   {
      gxTv_SdtDocumento_Docxmllink = value ;
   }

   public String getDocpdf( )
   {
      return gxTv_SdtDocumento_Docpdf ;
   }

   public void setDocpdf( String value )
   {
      gxTv_SdtDocumento_Docpdf = value ;
   }

   public String getDocpdflink( )
   {
      return gxTv_SdtDocumento_Docpdflink ;
   }

   public void setDocpdflink( String value )
   {
      gxTv_SdtDocumento_Docpdflink = value ;
   }

   public String getDhrecbto( )
   {
      return gxTv_SdtDocumento_Dhrecbto ;
   }

   public void setDhrecbto( String value )
   {
      gxTv_SdtDocumento_Dhrecbto = value ;
   }

   public String getNtemvigor( )
   {
      return gxTv_SdtDocumento_Ntemvigor ;
   }

   public void setNtemvigor( String value )
   {
      gxTv_SdtDocumento_Ntemvigor = value ;
   }

   public String getImprimirumaviacontingencia( )
   {
      return gxTv_SdtDocumento_Imprimirumaviacontingencia ;
   }

   public void setImprimirumaviacontingencia( String value )
   {
      gxTv_SdtDocumento_Imprimirumaviacontingencia = value ;
   }

   public String getDocimpprefeitura( )
   {
      return gxTv_SdtDocumento_Docimpprefeitura ;
   }

   public void setDocimpprefeitura( String value )
   {
      gxTv_SdtDocumento_Docimpprefeitura = value ;
   }

   public String getDocstatus( )
   {
      return gxTv_SdtDocumento_Docstatus ;
   }

   public void setDocstatus( String value )
   {
      gxTv_SdtDocumento_Docstatus = value ;
   }

   public String getCerthoravencimento( )
   {
      return gxTv_SdtDocumento_Certhoravencimento ;
   }

   public void setCerthoravencimento( String value )
   {
      gxTv_SdtDocumento_Certhoravencimento = value ;
   }

   public StructSdtDocumento_Resumo getResumo( )
   {
      return gxTv_SdtDocumento_Resumo ;
   }

   public void setResumo( StructSdtDocumento_Resumo value )
   {
      gxTv_SdtDocumento_Resumo = value;
   }

   public String getEventos( )
   {
      return gxTv_SdtDocumento_Eventos ;
   }

   public void setEventos( String value )
   {
      gxTv_SdtDocumento_Eventos = value ;
   }

   public StructSdtDocumento_NFSe getNfse( )
   {
      return gxTv_SdtDocumento_Nfse ;
   }

   public void setNfse( StructSdtDocumento_NFSe value )
   {
      gxTv_SdtDocumento_Nfse = value;
   }

   public StructSdtDocumento_Situacao getSituacao( )
   {
      return gxTv_SdtDocumento_Situacao ;
   }

   public void setSituacao( StructSdtDocumento_Situacao value )
   {
      gxTv_SdtDocumento_Situacao = value;
   }

   protected int gxTv_SdtDocumento_Docnumero ;
   protected String gxTv_SdtDocumento_Docstatus ;
   protected String gxTv_SdtDocumento_Docpdfbase64 ;
   protected String gxTv_SdtDocumento_Docxmlbase64 ;
   protected String gxTv_SdtDocumento_Docxml ;
   protected String gxTv_SdtDocumento_Docpdf ;
   protected String gxTv_SdtDocumento_Docmodelo ;
   protected String gxTv_SdtDocumento_Docserie ;
   protected String gxTv_SdtDocumento_Docchaacesso ;
   protected String gxTv_SdtDocumento_Docprotocolo ;
   protected String gxTv_SdtDocumento_Docevenseq ;
   protected String gxTv_SdtDocumento_Docevetp ;
   protected String gxTv_SdtDocumento_Doceveid ;
   protected String gxTv_SdtDocumento_Docpdfdownload ;
   protected String gxTv_SdtDocumento_Docdigestvalue ;
   protected String gxTv_SdtDocumento_Docxmldownload ;
   protected String gxTv_SdtDocumento_Docimpressora ;
   protected String gxTv_SdtDocumento_Docsitcodigo ;
   protected String gxTv_SdtDocumento_Docsitdescricao ;
   protected String gxTv_SdtDocumento_Docxmllink ;
   protected String gxTv_SdtDocumento_Docpdflink ;
   protected String gxTv_SdtDocumento_Dhrecbto ;
   protected String gxTv_SdtDocumento_Ntemvigor ;
   protected String gxTv_SdtDocumento_Imprimirumaviacontingencia ;
   protected String gxTv_SdtDocumento_Docimpprefeitura ;
   protected String gxTv_SdtDocumento_Certhoravencimento ;
   protected String gxTv_SdtDocumento_Eventos ;
   protected java.util.Date gxTv_SdtDocumento_Docdhaut ;
   protected StructSdtDocumento_Resumo gxTv_SdtDocumento_Resumo=null ;
   protected StructSdtDocumento_NFSe gxTv_SdtDocumento_Nfse=null ;
   protected StructSdtDocumento_Situacao gxTv_SdtDocumento_Situacao=null ;
}

