/*
               File: StructSdtEnvio_autXMLItem
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:24.34
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_autXMLItem implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_autXMLItem( )
   {
      gxTv_SdtEnvio_autXMLItem_Cnpj_aut = "" ;
      gxTv_SdtEnvio_autXMLItem_Cpf_aut = "" ;
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

   public String getCnpj_aut( )
   {
      return gxTv_SdtEnvio_autXMLItem_Cnpj_aut ;
   }

   public void setCnpj_aut( String value )
   {
      gxTv_SdtEnvio_autXMLItem_Cnpj_aut = value ;
   }

   public String getCpf_aut( )
   {
      return gxTv_SdtEnvio_autXMLItem_Cpf_aut ;
   }

   public void setCpf_aut( String value )
   {
      gxTv_SdtEnvio_autXMLItem_Cpf_aut = value ;
   }

   protected String gxTv_SdtEnvio_autXMLItem_Cnpj_aut ;
   protected String gxTv_SdtEnvio_autXMLItem_Cpf_aut ;
}

