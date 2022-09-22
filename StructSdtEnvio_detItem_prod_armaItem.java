/*
               File: StructSdtEnvio_detItem_prod_armaItem
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:38.54
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem_prod_armaItem implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem_prod_armaItem( )
   {
      gxTv_SdtEnvio_detItem_prod_armaItem_Nserie_arma = "" ;
      gxTv_SdtEnvio_detItem_prod_armaItem_Ncano = "" ;
      gxTv_SdtEnvio_detItem_prod_armaItem_Descr = "" ;
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

   public byte getTparma( )
   {
      return gxTv_SdtEnvio_detItem_prod_armaItem_Tparma ;
   }

   public void setTparma( byte value )
   {
      gxTv_SdtEnvio_detItem_prod_armaItem_Tparma = value ;
   }

   public String getNserie_arma( )
   {
      return gxTv_SdtEnvio_detItem_prod_armaItem_Nserie_arma ;
   }

   public void setNserie_arma( String value )
   {
      gxTv_SdtEnvio_detItem_prod_armaItem_Nserie_arma = value ;
   }

   public String getNcano( )
   {
      return gxTv_SdtEnvio_detItem_prod_armaItem_Ncano ;
   }

   public void setNcano( String value )
   {
      gxTv_SdtEnvio_detItem_prod_armaItem_Ncano = value ;
   }

   public String getDescr( )
   {
      return gxTv_SdtEnvio_detItem_prod_armaItem_Descr ;
   }

   public void setDescr( String value )
   {
      gxTv_SdtEnvio_detItem_prod_armaItem_Descr = value ;
   }

   protected byte gxTv_SdtEnvio_detItem_prod_armaItem_Tparma ;
   protected String gxTv_SdtEnvio_detItem_prod_armaItem_Nserie_arma ;
   protected String gxTv_SdtEnvio_detItem_prod_armaItem_Ncano ;
   protected String gxTv_SdtEnvio_detItem_prod_armaItem_Descr ;
}

