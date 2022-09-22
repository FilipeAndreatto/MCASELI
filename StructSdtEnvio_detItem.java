/*
               File: StructSdtEnvio_detItem
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:25.45
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem( )
   {
      gxTv_SdtEnvio_detItem_Infadprod = "" ;
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

   public String getInfadprod( )
   {
      return gxTv_SdtEnvio_detItem_Infadprod ;
   }

   public void setInfadprod( String value )
   {
      gxTv_SdtEnvio_detItem_Infadprod = value ;
   }

   public StructSdtEnvio_detItem_prod getProd( )
   {
      return gxTv_SdtEnvio_detItem_Prod ;
   }

   public void setProd( StructSdtEnvio_detItem_prod value )
   {
      gxTv_SdtEnvio_detItem_Prod = value;
   }

   public StructSdtEnvio_detItem_imposto getImposto( )
   {
      return gxTv_SdtEnvio_detItem_Imposto ;
   }

   public void setImposto( StructSdtEnvio_detItem_imposto value )
   {
      gxTv_SdtEnvio_detItem_Imposto = value;
   }

   public StructSdtEnvio_detItem_impostoDevol getImpostodevol( )
   {
      return gxTv_SdtEnvio_detItem_Impostodevol ;
   }

   public void setImpostodevol( StructSdtEnvio_detItem_impostoDevol value )
   {
      gxTv_SdtEnvio_detItem_Impostodevol = value;
   }

   protected String gxTv_SdtEnvio_detItem_Infadprod ;
   protected StructSdtEnvio_detItem_prod gxTv_SdtEnvio_detItem_Prod=null ;
   protected StructSdtEnvio_detItem_imposto gxTv_SdtEnvio_detItem_Imposto=null ;
   protected StructSdtEnvio_detItem_impostoDevol gxTv_SdtEnvio_detItem_Impostodevol=null ;
}

