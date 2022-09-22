/*
               File: StructSdtEnvio_cobr
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:11.70
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_cobr implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_cobr( )
   {
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

   public StructSdtEnvio_cobr_fat getFat( )
   {
      return gxTv_SdtEnvio_cobr_Fat ;
   }

   public void setFat( StructSdtEnvio_cobr_fat value )
   {
      gxTv_SdtEnvio_cobr_Fat = value;
   }

   public java.util.Vector getDup( )
   {
      return gxTv_SdtEnvio_cobr_Dup ;
   }

   public void setDup( java.util.Vector value )
   {
      gxTv_SdtEnvio_cobr_Dup = value ;
   }

   protected StructSdtEnvio_cobr_fat gxTv_SdtEnvio_cobr_Fat=null ;
   protected java.util.Vector gxTv_SdtEnvio_cobr_Dup=null ;
}

