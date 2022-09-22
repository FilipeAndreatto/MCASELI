/*
               File: StructSdtEnvio_cobr_dupItem
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:13.12
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_cobr_dupItem implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_cobr_dupItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtEnvio_cobr_dupItem_Ndup = "" ;
      gxTv_SdtEnvio_cobr_dupItem_Dvenc = cal.getTime() ;
      gxTv_SdtEnvio_cobr_dupItem_Vdup = new java.math.BigDecimal(0) ;
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

   public String getNdup( )
   {
      return gxTv_SdtEnvio_cobr_dupItem_Ndup ;
   }

   public void setNdup( String value )
   {
      gxTv_SdtEnvio_cobr_dupItem_Ndup = value ;
   }

   public java.util.Date getDvenc( )
   {
      return gxTv_SdtEnvio_cobr_dupItem_Dvenc ;
   }

   public void setDvenc( java.util.Date value )
   {
      gxTv_SdtEnvio_cobr_dupItem_Dvenc = value ;
   }

   public java.math.BigDecimal getVdup( )
   {
      return gxTv_SdtEnvio_cobr_dupItem_Vdup ;
   }

   public void setVdup( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cobr_dupItem_Vdup = value ;
   }

   protected String gxTv_SdtEnvio_cobr_dupItem_Ndup ;
   protected java.util.Date gxTv_SdtEnvio_cobr_dupItem_Dvenc ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cobr_dupItem_Vdup ;
}

