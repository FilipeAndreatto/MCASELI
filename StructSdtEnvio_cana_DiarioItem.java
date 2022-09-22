/*
               File: StructSdtEnvio_cana_DiarioItem
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:20.83
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_cana_DiarioItem implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_cana_DiarioItem( )
   {
      gxTv_SdtEnvio_cana_DiarioItem_Qtde = new java.math.BigDecimal(0) ;
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

   public byte getDia( )
   {
      return gxTv_SdtEnvio_cana_DiarioItem_Dia ;
   }

   public void setDia( byte value )
   {
      gxTv_SdtEnvio_cana_DiarioItem_Dia = value ;
   }

   public java.math.BigDecimal getQtde( )
   {
      return gxTv_SdtEnvio_cana_DiarioItem_Qtde ;
   }

   public void setQtde( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_cana_DiarioItem_Qtde = value ;
   }

   protected byte gxTv_SdtEnvio_cana_DiarioItem_Dia ;
   protected java.math.BigDecimal gxTv_SdtEnvio_cana_DiarioItem_Qtde ;
}

