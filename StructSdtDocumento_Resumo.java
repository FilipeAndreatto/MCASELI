/*
               File: StructSdtDocumento_Resumo
        Description: Documento
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:12.95
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtDocumento_Resumo implements Cloneable, java.io.Serializable
{
   public StructSdtDocumento_Resumo( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtDocumento_Resumo_Docdataemissao = cal.getTime() ;
      gxTv_SdtDocumento_Resumo_Docfusohorario = "" ;
      gxTv_SdtDocumento_Resumo_Docdhaut = "" ;
      gxTv_SdtDocumento_Resumo_Docdigestvalue = cal.getTime() ;
      gxTv_SdtDocumento_Resumo_Docnomeemitente = "" ;
      gxTv_SdtDocumento_Resumo_Doccnpjdestinatario = "" ;
      gxTv_SdtDocumento_Resumo_Docnomedestinatario = "" ;
      gxTv_SdtDocumento_Resumo_Docvlrtotal = new java.math.BigDecimal(0) ;
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

   public java.util.Date getDocdataemissao( )
   {
      return gxTv_SdtDocumento_Resumo_Docdataemissao ;
   }

   public void setDocdataemissao( java.util.Date value )
   {
      gxTv_SdtDocumento_Resumo_Docdataemissao = value ;
   }

   public String getDocfusohorario( )
   {
      return gxTv_SdtDocumento_Resumo_Docfusohorario ;
   }

   public void setDocfusohorario( String value )
   {
      gxTv_SdtDocumento_Resumo_Docfusohorario = value ;
   }

   public String getDocdhaut( )
   {
      return gxTv_SdtDocumento_Resumo_Docdhaut ;
   }

   public void setDocdhaut( String value )
   {
      gxTv_SdtDocumento_Resumo_Docdhaut = value ;
   }

   public java.util.Date getDocdigestvalue( )
   {
      return gxTv_SdtDocumento_Resumo_Docdigestvalue ;
   }

   public void setDocdigestvalue( java.util.Date value )
   {
      gxTv_SdtDocumento_Resumo_Docdigestvalue = value ;
   }

   public String getDocnomeemitente( )
   {
      return gxTv_SdtDocumento_Resumo_Docnomeemitente ;
   }

   public void setDocnomeemitente( String value )
   {
      gxTv_SdtDocumento_Resumo_Docnomeemitente = value ;
   }

   public String getDoccnpjdestinatario( )
   {
      return gxTv_SdtDocumento_Resumo_Doccnpjdestinatario ;
   }

   public void setDoccnpjdestinatario( String value )
   {
      gxTv_SdtDocumento_Resumo_Doccnpjdestinatario = value ;
   }

   public String getDocnomedestinatario( )
   {
      return gxTv_SdtDocumento_Resumo_Docnomedestinatario ;
   }

   public void setDocnomedestinatario( String value )
   {
      gxTv_SdtDocumento_Resumo_Docnomedestinatario = value ;
   }

   public java.math.BigDecimal getDocvlrtotal( )
   {
      return gxTv_SdtDocumento_Resumo_Docvlrtotal ;
   }

   public void setDocvlrtotal( java.math.BigDecimal value )
   {
      gxTv_SdtDocumento_Resumo_Docvlrtotal = value ;
   }

   protected String gxTv_SdtDocumento_Resumo_Docfusohorario ;
   protected String gxTv_SdtDocumento_Resumo_Docdhaut ;
   protected String gxTv_SdtDocumento_Resumo_Docnomeemitente ;
   protected String gxTv_SdtDocumento_Resumo_Doccnpjdestinatario ;
   protected String gxTv_SdtDocumento_Resumo_Docnomedestinatario ;
   protected java.util.Date gxTv_SdtDocumento_Resumo_Docdataemissao ;
   protected java.util.Date gxTv_SdtDocumento_Resumo_Docdigestvalue ;
   protected java.math.BigDecimal gxTv_SdtDocumento_Resumo_Docvlrtotal ;
}

