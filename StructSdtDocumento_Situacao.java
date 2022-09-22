/*
               File: StructSdtDocumento_Situacao
        Description: Documento
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:13.2
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtDocumento_Situacao implements Cloneable, java.io.Serializable
{
   public StructSdtDocumento_Situacao( )
   {
      gxTv_SdtDocumento_Situacao_Sitdescricao = "" ;
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

   public long getSitcodigo( )
   {
      return gxTv_SdtDocumento_Situacao_Sitcodigo ;
   }

   public void setSitcodigo( long value )
   {
      gxTv_SdtDocumento_Situacao_Sitcodigo = value ;
   }

   public String getSitdescricao( )
   {
      return gxTv_SdtDocumento_Situacao_Sitdescricao ;
   }

   public void setSitdescricao( String value )
   {
      gxTv_SdtDocumento_Situacao_Sitdescricao = value ;
   }

   protected long gxTv_SdtDocumento_Situacao_Sitcodigo ;
   protected String gxTv_SdtDocumento_Situacao_Sitdescricao ;
}

