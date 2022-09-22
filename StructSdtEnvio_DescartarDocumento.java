/*
               File: StructSdtEnvio_DescartarDocumento
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:36:22.43
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_DescartarDocumento implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_DescartarDocumento( )
   {
      gxTv_SdtEnvio_DescartarDocumento_Modelodocumento = "" ;
      gxTv_SdtEnvio_DescartarDocumento_Serie = "" ;
      gxTv_SdtEnvio_DescartarDocumento_Seriesubstituta = "" ;
      gxTv_SdtEnvio_DescartarDocumento_Cnpj_emit = "" ;
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

   public String getModelodocumento( )
   {
      return gxTv_SdtEnvio_DescartarDocumento_Modelodocumento ;
   }

   public void setModelodocumento( String value )
   {
      gxTv_SdtEnvio_DescartarDocumento_Modelodocumento = value ;
   }

   public short getTpamb( )
   {
      return gxTv_SdtEnvio_DescartarDocumento_Tpamb ;
   }

   public void setTpamb( short value )
   {
      gxTv_SdtEnvio_DescartarDocumento_Tpamb = value ;
   }

   public int getNumero( )
   {
      return gxTv_SdtEnvio_DescartarDocumento_Numero ;
   }

   public void setNumero( int value )
   {
      gxTv_SdtEnvio_DescartarDocumento_Numero = value ;
   }

   public String getSerie( )
   {
      return gxTv_SdtEnvio_DescartarDocumento_Serie ;
   }

   public void setSerie( String value )
   {
      gxTv_SdtEnvio_DescartarDocumento_Serie = value ;
   }

   public int getNumerosubstituta( )
   {
      return gxTv_SdtEnvio_DescartarDocumento_Numerosubstituta ;
   }

   public void setNumerosubstituta( int value )
   {
      gxTv_SdtEnvio_DescartarDocumento_Numerosubstituta = value ;
   }

   public String getSeriesubstituta( )
   {
      return gxTv_SdtEnvio_DescartarDocumento_Seriesubstituta ;
   }

   public void setSeriesubstituta( String value )
   {
      gxTv_SdtEnvio_DescartarDocumento_Seriesubstituta = value ;
   }

   public String getCnpj_emit( )
   {
      return gxTv_SdtEnvio_DescartarDocumento_Cnpj_emit ;
   }

   public void setCnpj_emit( String value )
   {
      gxTv_SdtEnvio_DescartarDocumento_Cnpj_emit = value ;
   }

   protected short gxTv_SdtEnvio_DescartarDocumento_Tpamb ;
   protected int gxTv_SdtEnvio_DescartarDocumento_Numero ;
   protected int gxTv_SdtEnvio_DescartarDocumento_Numerosubstituta ;
   protected String gxTv_SdtEnvio_DescartarDocumento_Modelodocumento ;
   protected String gxTv_SdtEnvio_DescartarDocumento_Serie ;
   protected String gxTv_SdtEnvio_DescartarDocumento_Seriesubstituta ;
   protected String gxTv_SdtEnvio_DescartarDocumento_Cnpj_emit ;
}

