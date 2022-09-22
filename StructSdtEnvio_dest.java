/*
               File: StructSdtEnvio_dest
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:21.45
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_dest implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_dest( )
   {
      gxTv_SdtEnvio_dest_Cnpj_dest = "" ;
      gxTv_SdtEnvio_dest_Cpf_dest = "" ;
      gxTv_SdtEnvio_dest_Idestrangeiro = "" ;
      gxTv_SdtEnvio_dest_Xnome_dest = "" ;
      gxTv_SdtEnvio_dest_Ie_dest = "" ;
      gxTv_SdtEnvio_dest_Isuf = "" ;
      gxTv_SdtEnvio_dest_Im_dest = "" ;
      gxTv_SdtEnvio_dest_Email_dest = "" ;
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

   public String getCnpj_dest( )
   {
      return gxTv_SdtEnvio_dest_Cnpj_dest ;
   }

   public void setCnpj_dest( String value )
   {
      gxTv_SdtEnvio_dest_Cnpj_dest = value ;
   }

   public String getCpf_dest( )
   {
      return gxTv_SdtEnvio_dest_Cpf_dest ;
   }

   public void setCpf_dest( String value )
   {
      gxTv_SdtEnvio_dest_Cpf_dest = value ;
   }

   public String getIdestrangeiro( )
   {
      return gxTv_SdtEnvio_dest_Idestrangeiro ;
   }

   public void setIdestrangeiro( String value )
   {
      gxTv_SdtEnvio_dest_Idestrangeiro = value ;
   }

   public String getXnome_dest( )
   {
      return gxTv_SdtEnvio_dest_Xnome_dest ;
   }

   public void setXnome_dest( String value )
   {
      gxTv_SdtEnvio_dest_Xnome_dest = value ;
   }

   public String getIe_dest( )
   {
      return gxTv_SdtEnvio_dest_Ie_dest ;
   }

   public void setIe_dest( String value )
   {
      gxTv_SdtEnvio_dest_Ie_dest = value ;
   }

   public String getIsuf( )
   {
      return gxTv_SdtEnvio_dest_Isuf ;
   }

   public void setIsuf( String value )
   {
      gxTv_SdtEnvio_dest_Isuf = value ;
   }

   public byte getIndiedest( )
   {
      return gxTv_SdtEnvio_dest_Indiedest ;
   }

   public void setIndiedest( byte value )
   {
      gxTv_SdtEnvio_dest_Indiedest = value ;
   }

   public String getIm_dest( )
   {
      return gxTv_SdtEnvio_dest_Im_dest ;
   }

   public void setIm_dest( String value )
   {
      gxTv_SdtEnvio_dest_Im_dest = value ;
   }

   public String getEmail_dest( )
   {
      return gxTv_SdtEnvio_dest_Email_dest ;
   }

   public void setEmail_dest( String value )
   {
      gxTv_SdtEnvio_dest_Email_dest = value ;
   }

   public StructSdtEnvio_dest_enderDest getEnderdest( )
   {
      return gxTv_SdtEnvio_dest_Enderdest ;
   }

   public void setEnderdest( StructSdtEnvio_dest_enderDest value )
   {
      gxTv_SdtEnvio_dest_Enderdest = value;
   }

   protected byte gxTv_SdtEnvio_dest_Indiedest ;
   protected String gxTv_SdtEnvio_dest_Cnpj_dest ;
   protected String gxTv_SdtEnvio_dest_Cpf_dest ;
   protected String gxTv_SdtEnvio_dest_Idestrangeiro ;
   protected String gxTv_SdtEnvio_dest_Xnome_dest ;
   protected String gxTv_SdtEnvio_dest_Ie_dest ;
   protected String gxTv_SdtEnvio_dest_Isuf ;
   protected String gxTv_SdtEnvio_dest_Im_dest ;
   protected String gxTv_SdtEnvio_dest_Email_dest ;
   protected StructSdtEnvio_dest_enderDest gxTv_SdtEnvio_dest_Enderdest=null ;
}

