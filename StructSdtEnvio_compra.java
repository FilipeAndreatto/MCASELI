/*
               File: StructSdtEnvio_compra
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:18.66
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_compra implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_compra( )
   {
      gxTv_SdtEnvio_compra_Xnemp = "" ;
      gxTv_SdtEnvio_compra_Xped = "" ;
      gxTv_SdtEnvio_compra_Xcont = "" ;
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

   public String getXnemp( )
   {
      return gxTv_SdtEnvio_compra_Xnemp ;
   }

   public void setXnemp( String value )
   {
      gxTv_SdtEnvio_compra_Xnemp = value ;
   }

   public String getXped( )
   {
      return gxTv_SdtEnvio_compra_Xped ;
   }

   public void setXped( String value )
   {
      gxTv_SdtEnvio_compra_Xped = value ;
   }

   public String getXcont( )
   {
      return gxTv_SdtEnvio_compra_Xcont ;
   }

   public void setXcont( String value )
   {
      gxTv_SdtEnvio_compra_Xcont = value ;
   }

   protected String gxTv_SdtEnvio_compra_Xnemp ;
   protected String gxTv_SdtEnvio_compra_Xped ;
   protected String gxTv_SdtEnvio_compra_Xcont ;
}

