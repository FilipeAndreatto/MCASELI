/*
               File: StructSdtEnvio_detItem_prod_comb
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:39.92
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem_prod_comb implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem_prod_comb( )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Codif = "" ;
      gxTv_SdtEnvio_detItem_prod_comb_Qtemp = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_comb_Ufcons = "" ;
      gxTv_SdtEnvio_detItem_prod_comb_Descanp = "" ;
      gxTv_SdtEnvio_detItem_prod_comb_Pglp = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_comb_Pgnn = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_comb_Pgni = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_comb_Vpart = new java.math.BigDecimal(0) ;
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

   public int getCprodanp( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Cprodanp ;
   }

   public void setCprodanp( int value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Cprodanp = value ;
   }

   public String getCodif( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Codif ;
   }

   public void setCodif( String value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Codif = value ;
   }

   public java.math.BigDecimal getQtemp( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Qtemp ;
   }

   public void setQtemp( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Qtemp = value ;
   }

   public String getUfcons( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Ufcons ;
   }

   public void setUfcons( String value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Ufcons = value ;
   }

   public String getDescanp( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Descanp ;
   }

   public void setDescanp( String value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Descanp = value ;
   }

   public java.math.BigDecimal getPglp( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Pglp ;
   }

   public void setPglp( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Pglp = value ;
   }

   public java.math.BigDecimal getPgnn( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Pgnn ;
   }

   public void setPgnn( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Pgnn = value ;
   }

   public java.math.BigDecimal getPgni( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Pgni ;
   }

   public void setPgni( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Pgni = value ;
   }

   public java.math.BigDecimal getVpart( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Vpart ;
   }

   public void setVpart( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Vpart = value ;
   }

   public StructSdtEnvio_detItem_prod_comb_CIDE getCide( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Cide ;
   }

   public void setCide( StructSdtEnvio_detItem_prod_comb_CIDE value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Cide = value;
   }

   public StructSdtEnvio_detItem_prod_comb_Encerrante getEncerrante( )
   {
      return gxTv_SdtEnvio_detItem_prod_comb_Encerrante ;
   }

   public void setEncerrante( StructSdtEnvio_detItem_prod_comb_Encerrante value )
   {
      gxTv_SdtEnvio_detItem_prod_comb_Encerrante = value;
   }

   protected int gxTv_SdtEnvio_detItem_prod_comb_Cprodanp ;
   protected String gxTv_SdtEnvio_detItem_prod_comb_Ufcons ;
   protected String gxTv_SdtEnvio_detItem_prod_comb_Codif ;
   protected String gxTv_SdtEnvio_detItem_prod_comb_Descanp ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_comb_Qtemp ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_comb_Pglp ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_comb_Pgnn ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_comb_Pgni ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_comb_Vpart ;
   protected StructSdtEnvio_detItem_prod_comb_CIDE gxTv_SdtEnvio_detItem_prod_comb_Cide=null ;
   protected StructSdtEnvio_detItem_prod_comb_Encerrante gxTv_SdtEnvio_detItem_prod_comb_Encerrante=null ;
}

