/*
               File: StructSdtEnvio_detItem_impostoDevol
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:57.79
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem_impostoDevol implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem_impostoDevol( )
   {
      gxTv_SdtEnvio_detItem_impostoDevol_Pdevol = new java.math.BigDecimal(0) ;
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

   public java.math.BigDecimal getPdevol( )
   {
      return gxTv_SdtEnvio_detItem_impostoDevol_Pdevol ;
   }

   public void setPdevol( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_impostoDevol_Pdevol = value ;
   }

   public StructSdtEnvio_detItem_impostoDevol_IPIDevol getIpidevol( )
   {
      return gxTv_SdtEnvio_detItem_impostoDevol_Ipidevol ;
   }

   public void setIpidevol( StructSdtEnvio_detItem_impostoDevol_IPIDevol value )
   {
      gxTv_SdtEnvio_detItem_impostoDevol_Ipidevol = value;
   }

   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_impostoDevol_Pdevol ;
   protected StructSdtEnvio_detItem_impostoDevol_IPIDevol gxTv_SdtEnvio_detItem_impostoDevol_Ipidevol=null ;
}

