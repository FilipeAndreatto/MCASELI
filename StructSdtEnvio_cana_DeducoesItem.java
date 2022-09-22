/*
               File: StructSdtEnvio_cana_DeducoesItem
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:21.32
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_cana_DeducoesItem implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_cana_DeducoesItem( )
   {
      gxTv_SdtEnvio_cana_DeducoesItem_Xded = "" ;
      gxTv_SdtEnvio_cana_DeducoesItem_Vded = new java.math.BigDecimal(0) ;
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

   public String getXded( )
   {
      return gxTv_SdtEnvio_cana_DeducoesItem_Xded ;
   }

   public void setXded( String value )
   {
      gxTv_SdtEnvio_cana_DeducoesItem_Xded = value ;
   }

   public java.math.BigDecimal getVded( )
   {
      return gxTv_SdtEnvio_cana_DeducoesItem_Vded ;
   }

   public void setVded( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cana_DeducoesItem_Vded = value ;
   }

   protected String gxTv_SdtEnvio_cana_DeducoesItem_Xded ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cana_DeducoesItem_Vded ;
}

