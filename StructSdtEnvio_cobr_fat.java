/*
               File: StructSdtEnvio_cobr_fat
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:12.46
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_cobr_fat implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_cobr_fat( )
   {
      gxTv_SdtEnvio_cobr_fat_Nfat = "" ;
      gxTv_SdtEnvio_cobr_fat_Vorig = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_cobr_fat_Vdesc_cob = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_cobr_fat_Vliq = new java.math.BigDecimal(0) ;
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

   public String getNfat( )
   {
      return gxTv_SdtEnvio_cobr_fat_Nfat ;
   }

   public void setNfat( String value )
   {
      gxTv_SdtEnvio_cobr_fat_Nfat = value ;
   }

   public java.math.BigDecimal getVorig( )
   {
      return gxTv_SdtEnvio_cobr_fat_Vorig ;
   }

   public void setVorig( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cobr_fat_Vorig = value ;
   }

   public java.math.BigDecimal getVdesc_cob( )
   {
      return gxTv_SdtEnvio_cobr_fat_Vdesc_cob ;
   }

   public void setVdesc_cob( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cobr_fat_Vdesc_cob = value ;
   }

   public java.math.BigDecimal getVliq( )
   {
      return gxTv_SdtEnvio_cobr_fat_Vliq ;
   }

   public void setVliq( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cobr_fat_Vliq = value ;
   }

   protected String gxTv_SdtEnvio_cobr_fat_Nfat ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cobr_fat_Vorig ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cobr_fat_Vdesc_cob ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cobr_fat_Vliq ;
}

