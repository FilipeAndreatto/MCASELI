/*
               File: StructSdtEnvio_detItem_imposto_COFINS
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:52.91
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem_imposto_COFINS implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem_imposto_COFINS( )
   {
      gxTv_SdtEnvio_detItem_imposto_COFINS_Cst_cofins = "" ;
      gxTv_SdtEnvio_detItem_imposto_COFINS_Vbc_cofins = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_COFINS_Pcofins = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_COFINS_Vcofins = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_COFINS_Qbcprod_cofins = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_COFINS_Valiqprod_cofins = new java.math.BigDecimal(0) ;
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

   public String getCst_cofins( )
   {
      return gxTv_SdtEnvio_detItem_imposto_COFINS_Cst_cofins ;
   }

   public void setCst_cofins( String value )
   {
      gxTv_SdtEnvio_detItem_imposto_COFINS_Cst_cofins = value ;
   }

   public java.math.BigDecimal getVbc_cofins( )
   {
      return gxTv_SdtEnvio_detItem_imposto_COFINS_Vbc_cofins ;
   }

   public void setVbc_cofins( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_COFINS_Vbc_cofins = value ;
   }

   public java.math.BigDecimal getPcofins( )
   {
      return gxTv_SdtEnvio_detItem_imposto_COFINS_Pcofins ;
   }

   public void setPcofins( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_COFINS_Pcofins = value ;
   }

   public java.math.BigDecimal getVcofins( )
   {
      return gxTv_SdtEnvio_detItem_imposto_COFINS_Vcofins ;
   }

   public void setVcofins( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_COFINS_Vcofins = value ;
   }

   public java.math.BigDecimal getQbcprod_cofins( )
   {
      return gxTv_SdtEnvio_detItem_imposto_COFINS_Qbcprod_cofins ;
   }

   public void setQbcprod_cofins( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_COFINS_Qbcprod_cofins = value ;
   }

   public java.math.BigDecimal getValiqprod_cofins( )
   {
      return gxTv_SdtEnvio_detItem_imposto_COFINS_Valiqprod_cofins ;
   }

   public void setValiqprod_cofins( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_COFINS_Valiqprod_cofins = value ;
   }

   protected String gxTv_SdtEnvio_detItem_imposto_COFINS_Cst_cofins ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_COFINS_Vbc_cofins ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_COFINS_Pcofins ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_COFINS_Vcofins ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_COFINS_Qbcprod_cofins ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_COFINS_Valiqprod_cofins ;
}

