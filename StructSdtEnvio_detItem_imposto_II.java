/*
               File: StructSdtEnvio_detItem_imposto_II
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:50.22
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem_imposto_II implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem_imposto_II( )
   {
      gxTv_SdtEnvio_detItem_imposto_II_Vbc_imp = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_II_Vdespadu = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_II_Vii = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_II_Viof = new java.math.BigDecimal(0) ;
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

   public java.math.BigDecimal getVbc_imp( )
   {
      return gxTv_SdtEnvio_detItem_imposto_II_Vbc_imp ;
   }

   public void setVbc_imp( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_II_Vbc_imp = value ;
   }

   public java.math.BigDecimal getVdespadu( )
   {
      return gxTv_SdtEnvio_detItem_imposto_II_Vdespadu ;
   }

   public void setVdespadu( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_II_Vdespadu = value ;
   }

   public java.math.BigDecimal getVii( )
   {
      return gxTv_SdtEnvio_detItem_imposto_II_Vii ;
   }

   public void setVii( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_II_Vii = value ;
   }

   public java.math.BigDecimal getViof( )
   {
      return gxTv_SdtEnvio_detItem_imposto_II_Viof ;
   }

   public void setViof( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_II_Viof = value ;
   }

   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_II_Vbc_imp ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_II_Vdespadu ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_II_Vii ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_II_Viof ;
}

