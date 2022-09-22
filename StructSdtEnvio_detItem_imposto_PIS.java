/*
               File: StructSdtEnvio_detItem_imposto_PIS
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:51.21
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem_imposto_PIS implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem_imposto_PIS( )
   {
      gxTv_SdtEnvio_detItem_imposto_PIS_Cst_pis = "" ;
      gxTv_SdtEnvio_detItem_imposto_PIS_Vbc_pis = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_PIS_Ppis = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_PIS_Vpis = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_PIS_Qbcprod_pis = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_imposto_PIS_Valiqprod_pis = new java.math.BigDecimal(0) ;
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

   public String getCst_pis( )
   {
      return gxTv_SdtEnvio_detItem_imposto_PIS_Cst_pis ;
   }

   public void setCst_pis( String value )
   {
      gxTv_SdtEnvio_detItem_imposto_PIS_Cst_pis = value ;
   }

   public java.math.BigDecimal getVbc_pis( )
   {
      return gxTv_SdtEnvio_detItem_imposto_PIS_Vbc_pis ;
   }

   public void setVbc_pis( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_PIS_Vbc_pis = value ;
   }

   public java.math.BigDecimal getPpis( )
   {
      return gxTv_SdtEnvio_detItem_imposto_PIS_Ppis ;
   }

   public void setPpis( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_PIS_Ppis = value ;
   }

   public java.math.BigDecimal getVpis( )
   {
      return gxTv_SdtEnvio_detItem_imposto_PIS_Vpis ;
   }

   public void setVpis( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_PIS_Vpis = value ;
   }

   public java.math.BigDecimal getQbcprod_pis( )
   {
      return gxTv_SdtEnvio_detItem_imposto_PIS_Qbcprod_pis ;
   }

   public void setQbcprod_pis( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_PIS_Qbcprod_pis = value ;
   }

   public java.math.BigDecimal getValiqprod_pis( )
   {
      return gxTv_SdtEnvio_detItem_imposto_PIS_Valiqprod_pis ;
   }

   public void setValiqprod_pis( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_imposto_PIS_Valiqprod_pis = value ;
   }

   protected String gxTv_SdtEnvio_detItem_imposto_PIS_Cst_pis ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_PIS_Vbc_pis ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_PIS_Ppis ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_PIS_Vpis ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_PIS_Qbcprod_pis ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_imposto_PIS_Valiqprod_pis ;
}

