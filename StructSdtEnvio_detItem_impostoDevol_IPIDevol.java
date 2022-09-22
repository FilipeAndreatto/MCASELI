/*
               File: StructSdtEnvio_detItem_impostoDevol_IPIDevol
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:58.13
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem_impostoDevol_IPIDevol implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem_impostoDevol_IPIDevol( )
   {
      gxTv_SdtEnvio_detItem_impostoDevol_IPIDevol_Vipidevol = new java.math.BigDecimal(0) ;
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

   public java.math.BigDecimal getVipidevol( )
   {
      return gxTv_SdtEnvio_detItem_impostoDevol_IPIDevol_Vipidevol ;
   }

   public void setVipidevol( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_impostoDevol_IPIDevol_Vipidevol = value ;
   }

   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_impostoDevol_IPIDevol_Vipidevol ;
}

