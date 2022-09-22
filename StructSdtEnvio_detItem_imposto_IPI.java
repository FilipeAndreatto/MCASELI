/*
               File: StructSdtEnvio_detItem_imposto_IPI
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:48.68
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem_imposto_IPI implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem_imposto_IPI( )
   {
      gxTv_SdtEnvio_detItem_imposto_IPI_Cnpjprod = "" ;
      gxTv_SdtEnvio_detItem_imposto_IPI_Cselo = "" ;
      gxTv_SdtEnvio_detItem_imposto_IPI_Cenq = "" ;
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

   public String getCnpjprod( )
   {
      return gxTv_SdtEnvio_detItem_imposto_IPI_Cnpjprod ;
   }

   public void setCnpjprod( String value )
   {
      gxTv_SdtEnvio_detItem_imposto_IPI_Cnpjprod = value ;
   }

   public String getCselo( )
   {
      return gxTv_SdtEnvio_detItem_imposto_IPI_Cselo ;
   }

   public void setCselo( String value )
   {
      gxTv_SdtEnvio_detItem_imposto_IPI_Cselo = value ;
   }

   public long getQselo( )
   {
      return gxTv_SdtEnvio_detItem_imposto_IPI_Qselo ;
   }

   public void setQselo( long value )
   {
      gxTv_SdtEnvio_detItem_imposto_IPI_Qselo = value ;
   }

   public String getCenq( )
   {
      return gxTv_SdtEnvio_detItem_imposto_IPI_Cenq ;
   }

   public void setCenq( String value )
   {
      gxTv_SdtEnvio_detItem_imposto_IPI_Cenq = value ;
   }

   public StructSdtEnvio_detItem_imposto_IPI_CSTIPI getCstipi( )
   {
      return gxTv_SdtEnvio_detItem_imposto_IPI_Cstipi ;
   }

   public void setCstipi( StructSdtEnvio_detItem_imposto_IPI_CSTIPI value )
   {
      gxTv_SdtEnvio_detItem_imposto_IPI_Cstipi = value;
   }

   protected long gxTv_SdtEnvio_detItem_imposto_IPI_Qselo ;
   protected String gxTv_SdtEnvio_detItem_imposto_IPI_Cenq ;
   protected String gxTv_SdtEnvio_detItem_imposto_IPI_Cnpjprod ;
   protected String gxTv_SdtEnvio_detItem_imposto_IPI_Cselo ;
   protected StructSdtEnvio_detItem_imposto_IPI_CSTIPI gxTv_SdtEnvio_detItem_imposto_IPI_Cstipi=null ;
}

