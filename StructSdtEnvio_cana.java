/*
               File: StructSdtEnvio_cana
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:20.29
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_cana implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_cana( )
   {
      gxTv_SdtEnvio_cana_Safra = "" ;
      gxTv_SdtEnvio_cana_Ref = "" ;
      gxTv_SdtEnvio_cana_Qtotmes = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_cana_Qtotant = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_cana_Qtotger = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_cana_Vfor = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_cana_Vtotded = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_cana_Vliqfor = new java.math.BigDecimal(0) ;
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

   public String getSafra( )
   {
      return gxTv_SdtEnvio_cana_Safra ;
   }

   public void setSafra( String value )
   {
      gxTv_SdtEnvio_cana_Safra = value ;
   }

   public String getRef( )
   {
      return gxTv_SdtEnvio_cana_Ref ;
   }

   public void setRef( String value )
   {
      gxTv_SdtEnvio_cana_Ref = value ;
   }

   public java.math.BigDecimal getQtotmes( )
   {
      return gxTv_SdtEnvio_cana_Qtotmes ;
   }

   public void setQtotmes( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cana_Qtotmes = value ;
   }

   public java.math.BigDecimal getQtotant( )
   {
      return gxTv_SdtEnvio_cana_Qtotant ;
   }

   public void setQtotant( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cana_Qtotant = value ;
   }

   public java.math.BigDecimal getQtotger( )
   {
      return gxTv_SdtEnvio_cana_Qtotger ;
   }

   public void setQtotger( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cana_Qtotger = value ;
   }

   public java.math.BigDecimal getVfor( )
   {
      return gxTv_SdtEnvio_cana_Vfor ;
   }

   public void setVfor( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cana_Vfor = value ;
   }

   public java.math.BigDecimal getVtotded( )
   {
      return gxTv_SdtEnvio_cana_Vtotded ;
   }

   public void setVtotded( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cana_Vtotded = value ;
   }

   public java.math.BigDecimal getVliqfor( )
   {
      return gxTv_SdtEnvio_cana_Vliqfor ;
   }

   public void setVliqfor( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cana_Vliqfor = value ;
   }

   public java.util.Vector getCanadiario( )
   {
      return gxTv_SdtEnvio_cana_Canadiario ;
   }

   public void setCanadiario( java.util.Vector value )
   {
      gxTv_SdtEnvio_cana_Canadiario = value ;
   }

   public java.util.Vector getCanadeducoes( )
   {
      return gxTv_SdtEnvio_cana_Canadeducoes ;
   }

   public void setCanadeducoes( java.util.Vector value )
   {
      gxTv_SdtEnvio_cana_Canadeducoes = value ;
   }

   protected String gxTv_SdtEnvio_cana_Safra ;
   protected String gxTv_SdtEnvio_cana_Ref ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cana_Qtotmes ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cana_Qtotant ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cana_Qtotger ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cana_Vfor ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cana_Vtotded ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cana_Vliqfor ;
   protected java.util.Vector gxTv_SdtEnvio_cana_Canadiario=null ;
   protected java.util.Vector gxTv_SdtEnvio_cana_Canadeducoes=null ;
}

