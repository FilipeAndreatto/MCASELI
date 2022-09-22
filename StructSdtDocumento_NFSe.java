/*
               File: StructSdtDocumento_NFSe
        Description: Documento
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:12.99
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtDocumento_NFSe implements Cloneable, java.io.Serializable
{
   public StructSdtDocumento_NFSe( )
   {
      gxTv_SdtDocumento_NFSe_Nfsenumero = "" ;
      gxTv_SdtDocumento_NFSe_Nfsecodverificacao = "" ;
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

   public String getNfsenumero( )
   {
      return gxTv_SdtDocumento_NFSe_Nfsenumero ;
   }

   public void setNfsenumero( String value )
   {
      gxTv_SdtDocumento_NFSe_Nfsenumero = value ;
   }

   public String getNfsecodverificacao( )
   {
      return gxTv_SdtDocumento_NFSe_Nfsecodverificacao ;
   }

   public void setNfsecodverificacao( String value )
   {
      gxTv_SdtDocumento_NFSe_Nfsecodverificacao = value ;
   }

   protected String gxTv_SdtDocumento_NFSe_Nfsenumero ;
   protected String gxTv_SdtDocumento_NFSe_Nfsecodverificacao ;
}

