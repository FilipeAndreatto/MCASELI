/*
               File: StructSdtEnvio_detItem_prod
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:30.73
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio_detItem_prod implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio_detItem_prod( )
   {
      gxTv_SdtEnvio_detItem_prod_Cprod = "" ;
      gxTv_SdtEnvio_detItem_prod_Cean = "" ;
      gxTv_SdtEnvio_detItem_prod_Xprod = "" ;
      gxTv_SdtEnvio_detItem_prod_Ncm = "" ;
      gxTv_SdtEnvio_detItem_prod_Extipi = "" ;
      gxTv_SdtEnvio_detItem_prod_Ucom = "" ;
      gxTv_SdtEnvio_detItem_prod_Qcom = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_Vuncom = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_Vprod = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_Ceantrib = "" ;
      gxTv_SdtEnvio_detItem_prod_Utrib = "" ;
      gxTv_SdtEnvio_detItem_prod_Qtrib = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_Vuntrib = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_Vfrete = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_Vseg = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_Vdesc = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_Voutro_item = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_detItem_prod_Xped_item = "" ;
      gxTv_SdtEnvio_detItem_prod_Nitemped = "" ;
      gxTv_SdtEnvio_detItem_prod_Nfci = "" ;
      gxTv_SdtEnvio_detItem_prod_Nrecopi = "" ;
      gxTv_SdtEnvio_detItem_prod_Cest = "" ;
      gxTv_SdtEnvio_detItem_prod_Cbenef = "" ;
      gxTv_SdtEnvio_detItem_prod_Indescala = "" ;
      gxTv_SdtEnvio_detItem_prod_Cnpjfab = "" ;
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

   public String getCprod( )
   {
      return gxTv_SdtEnvio_detItem_prod_Cprod ;
   }

   public void setCprod( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Cprod = value ;
   }

   public String getCean( )
   {
      return gxTv_SdtEnvio_detItem_prod_Cean ;
   }

   public void setCean( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Cean = value ;
   }

   public String getXprod( )
   {
      return gxTv_SdtEnvio_detItem_prod_Xprod ;
   }

   public void setXprod( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Xprod = value ;
   }

   public String getNcm( )
   {
      return gxTv_SdtEnvio_detItem_prod_Ncm ;
   }

   public void setNcm( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Ncm = value ;
   }

   public String getExtipi( )
   {
      return gxTv_SdtEnvio_detItem_prod_Extipi ;
   }

   public void setExtipi( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Extipi = value ;
   }

   public short getCfop( )
   {
      return gxTv_SdtEnvio_detItem_prod_Cfop ;
   }

   public void setCfop( short value )
   {
      gxTv_SdtEnvio_detItem_prod_Cfop = value ;
   }

   public String getUcom( )
   {
      return gxTv_SdtEnvio_detItem_prod_Ucom ;
   }

   public void setUcom( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Ucom = value ;
   }

   public java.math.BigDecimal getQcom( )
   {
      return gxTv_SdtEnvio_detItem_prod_Qcom ;
   }

   public void setQcom( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_Qcom = value ;
   }

   public java.math.BigDecimal getVuncom( )
   {
      return gxTv_SdtEnvio_detItem_prod_Vuncom ;
   }

   public void setVuncom( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_Vuncom = value ;
   }

   public java.math.BigDecimal getVprod( )
   {
      return gxTv_SdtEnvio_detItem_prod_Vprod ;
   }

   public void setVprod( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_Vprod = value ;
   }

   public String getCeantrib( )
   {
      return gxTv_SdtEnvio_detItem_prod_Ceantrib ;
   }

   public void setCeantrib( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Ceantrib = value ;
   }

   public String getUtrib( )
   {
      return gxTv_SdtEnvio_detItem_prod_Utrib ;
   }

   public void setUtrib( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Utrib = value ;
   }

   public java.math.BigDecimal getQtrib( )
   {
      return gxTv_SdtEnvio_detItem_prod_Qtrib ;
   }

   public void setQtrib( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_Qtrib = value ;
   }

   public java.math.BigDecimal getVuntrib( )
   {
      return gxTv_SdtEnvio_detItem_prod_Vuntrib ;
   }

   public void setVuntrib( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_Vuntrib = value ;
   }

   public java.math.BigDecimal getVfrete( )
   {
      return gxTv_SdtEnvio_detItem_prod_Vfrete ;
   }

   public void setVfrete( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_Vfrete = value ;
   }

   public java.math.BigDecimal getVseg( )
   {
      return gxTv_SdtEnvio_detItem_prod_Vseg ;
   }

   public void setVseg( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_Vseg = value ;
   }

   public java.math.BigDecimal getVdesc( )
   {
      return gxTv_SdtEnvio_detItem_prod_Vdesc ;
   }

   public void setVdesc( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_Vdesc = value ;
   }

   public java.math.BigDecimal getVoutro_item( )
   {
      return gxTv_SdtEnvio_detItem_prod_Voutro_item ;
   }

   public void setVoutro_item( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_detItem_prod_Voutro_item = value ;
   }

   public byte getIndtot( )
   {
      return gxTv_SdtEnvio_detItem_prod_Indtot ;
   }

   public void setIndtot( byte value )
   {
      gxTv_SdtEnvio_detItem_prod_Indtot = value ;
   }

   public byte getNtipoitem( )
   {
      return gxTv_SdtEnvio_detItem_prod_Ntipoitem ;
   }

   public void setNtipoitem( byte value )
   {
      gxTv_SdtEnvio_detItem_prod_Ntipoitem = value ;
   }

   public byte getDprod( )
   {
      return gxTv_SdtEnvio_detItem_prod_Dprod ;
   }

   public void setDprod( byte value )
   {
      gxTv_SdtEnvio_detItem_prod_Dprod = value ;
   }

   public String getXped_item( )
   {
      return gxTv_SdtEnvio_detItem_prod_Xped_item ;
   }

   public void setXped_item( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Xped_item = value ;
   }

   public String getNitemped( )
   {
      return gxTv_SdtEnvio_detItem_prod_Nitemped ;
   }

   public void setNitemped( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Nitemped = value ;
   }

   public String getNfci( )
   {
      return gxTv_SdtEnvio_detItem_prod_Nfci ;
   }

   public void setNfci( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Nfci = value ;
   }

   public String getNrecopi( )
   {
      return gxTv_SdtEnvio_detItem_prod_Nrecopi ;
   }

   public void setNrecopi( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Nrecopi = value ;
   }

   public String getCest( )
   {
      return gxTv_SdtEnvio_detItem_prod_Cest ;
   }

   public void setCest( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Cest = value ;
   }

   public String getCbenef( )
   {
      return gxTv_SdtEnvio_detItem_prod_Cbenef ;
   }

   public void setCbenef( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Cbenef = value ;
   }

   public String getIndescala( )
   {
      return gxTv_SdtEnvio_detItem_prod_Indescala ;
   }

   public void setIndescala( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Indescala = value ;
   }

   public String getCnpjfab( )
   {
      return gxTv_SdtEnvio_detItem_prod_Cnpjfab ;
   }

   public void setCnpjfab( String value )
   {
      gxTv_SdtEnvio_detItem_prod_Cnpjfab = value ;
   }

   public java.util.Vector getNves( )
   {
      return gxTv_SdtEnvio_detItem_prod_Nves ;
   }

   public void setNves( java.util.Vector value )
   {
      gxTv_SdtEnvio_detItem_prod_Nves = value ;
   }

   public java.util.Vector getDetdi( )
   {
      return gxTv_SdtEnvio_detItem_prod_Detdi ;
   }

   public void setDetdi( java.util.Vector value )
   {
      gxTv_SdtEnvio_detItem_prod_Detdi = value ;
   }

   public java.util.Vector getDetexport( )
   {
      return gxTv_SdtEnvio_detItem_prod_Detexport ;
   }

   public void setDetexport( java.util.Vector value )
   {
      gxTv_SdtEnvio_detItem_prod_Detexport = value ;
   }

   public StructSdtEnvio_detItem_prod_veicProd getVeicprod( )
   {
      return gxTv_SdtEnvio_detItem_prod_Veicprod ;
   }

   public void setVeicprod( StructSdtEnvio_detItem_prod_veicProd value )
   {
      gxTv_SdtEnvio_detItem_prod_Veicprod = value;
   }

   public java.util.Vector getMed( )
   {
      return gxTv_SdtEnvio_detItem_prod_Med ;
   }

   public void setMed( java.util.Vector value )
   {
      gxTv_SdtEnvio_detItem_prod_Med = value ;
   }

   public java.util.Vector getArma( )
   {
      return gxTv_SdtEnvio_detItem_prod_Arma ;
   }

   public void setArma( java.util.Vector value )
   {
      gxTv_SdtEnvio_detItem_prod_Arma = value ;
   }

   public StructSdtEnvio_detItem_prod_comb getComb( )
   {
      return gxTv_SdtEnvio_detItem_prod_Comb ;
   }

   public void setComb( StructSdtEnvio_detItem_prod_comb value )
   {
      gxTv_SdtEnvio_detItem_prod_Comb = value;
   }

   public java.util.Vector getRastro( )
   {
      return gxTv_SdtEnvio_detItem_prod_Rastro ;
   }

   public void setRastro( java.util.Vector value )
   {
      gxTv_SdtEnvio_detItem_prod_Rastro = value ;
   }

   protected byte gxTv_SdtEnvio_detItem_prod_Indtot ;
   protected byte gxTv_SdtEnvio_detItem_prod_Ntipoitem ;
   protected byte gxTv_SdtEnvio_detItem_prod_Dprod ;
   protected short gxTv_SdtEnvio_detItem_prod_Cfop ;
   protected String gxTv_SdtEnvio_detItem_prod_Nfci ;
   protected String gxTv_SdtEnvio_detItem_prod_Cprod ;
   protected String gxTv_SdtEnvio_detItem_prod_Cean ;
   protected String gxTv_SdtEnvio_detItem_prod_Xprod ;
   protected String gxTv_SdtEnvio_detItem_prod_Ncm ;
   protected String gxTv_SdtEnvio_detItem_prod_Extipi ;
   protected String gxTv_SdtEnvio_detItem_prod_Ucom ;
   protected String gxTv_SdtEnvio_detItem_prod_Ceantrib ;
   protected String gxTv_SdtEnvio_detItem_prod_Utrib ;
   protected String gxTv_SdtEnvio_detItem_prod_Xped_item ;
   protected String gxTv_SdtEnvio_detItem_prod_Nitemped ;
   protected String gxTv_SdtEnvio_detItem_prod_Nrecopi ;
   protected String gxTv_SdtEnvio_detItem_prod_Cest ;
   protected String gxTv_SdtEnvio_detItem_prod_Cbenef ;
   protected String gxTv_SdtEnvio_detItem_prod_Indescala ;
   protected String gxTv_SdtEnvio_detItem_prod_Cnpjfab ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_Qcom ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_Vuncom ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_Vprod ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_Qtrib ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_Vuntrib ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_Vfrete ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_Vseg ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_Vdesc ;
   protected java.math.BigDecimal gxTv_SdtEnvio_detItem_prod_Voutro_item ;
   protected StructSdtEnvio_detItem_prod_veicProd gxTv_SdtEnvio_detItem_prod_Veicprod=null ;
   protected StructSdtEnvio_detItem_prod_comb gxTv_SdtEnvio_detItem_prod_Comb=null ;
   protected java.util.Vector gxTv_SdtEnvio_detItem_prod_Nves=null ;
   protected java.util.Vector gxTv_SdtEnvio_detItem_prod_Detdi=null ;
   protected java.util.Vector gxTv_SdtEnvio_detItem_prod_Detexport=null ;
   protected java.util.Vector gxTv_SdtEnvio_detItem_prod_Med=null ;
   protected java.util.Vector gxTv_SdtEnvio_detItem_prod_Arma=null ;
   protected java.util.Vector gxTv_SdtEnvio_detItem_prod_Rastro=null ;
}

