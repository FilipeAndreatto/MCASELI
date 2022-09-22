/*
               File: StructSdtEnvio
        Description: Envio
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:35:16.7
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;

public final  class StructSdtEnvio implements Cloneable, java.io.Serializable
{
   public StructSdtEnvio( )
   {
      gxTv_SdtEnvio_Modelodocumento = "" ;
      gxTv_SdtEnvio_Versao = new java.math.BigDecimal(0) ;
      gxTv_SdtEnvio_Chaveparceiro = "" ;
      gxTv_SdtEnvio_Chaveacesso = "" ;
      gxTv_SdtEnvio_Imprimir = "" ;
      gxTv_SdtEnvio_Apelidoimpressora = "" ;
      gxTv_SdtEnvio_Vtroco = new java.math.BigDecimal(0) ;
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
      return gxTv_SdtEnvio_Modelodocumento ;
   }

   public void setModelodocumento( String value )
   {
      gxTv_SdtEnvio_Modelodocumento = value ;
   }

   public java.math.BigDecimal getVersao( )
   {
      return gxTv_SdtEnvio_Versao ;
   }

   public void setVersao( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_Versao = value ;
   }

   public String getChaveparceiro( )
   {
      return gxTv_SdtEnvio_Chaveparceiro ;
   }

   public void setChaveparceiro( String value )
   {
      gxTv_SdtEnvio_Chaveparceiro = value ;
   }

   public String getChaveacesso( )
   {
      return gxTv_SdtEnvio_Chaveacesso ;
   }

   public void setChaveacesso( String value )
   {
      gxTv_SdtEnvio_Chaveacesso = value ;
   }

   public String getImprimir( )
   {
      return gxTv_SdtEnvio_Imprimir ;
   }

   public void setImprimir( String value )
   {
      gxTv_SdtEnvio_Imprimir = value ;
   }

   public String getApelidoimpressora( )
   {
      return gxTv_SdtEnvio_Apelidoimpressora ;
   }

   public void setApelidoimpressora( String value )
   {
      gxTv_SdtEnvio_Apelidoimpressora = value ;
   }

   public java.math.BigDecimal getVtroco( )
   {
      return gxTv_SdtEnvio_Vtroco ;
   }

   public void setVtroco( java.math.BigDecimal value )
   {
      gxTv_SdtEnvio_Vtroco = value ;
   }

   public StructSdtEnvio_ide getIde( )
   {
      return gxTv_SdtEnvio_Ide ;
   }

   public void setIde( StructSdtEnvio_ide value )
   {
      gxTv_SdtEnvio_Ide = value;
   }

   public StructSdtEnvio_emit getEmit( )
   {
      return gxTv_SdtEnvio_Emit ;
   }

   public void setEmit( StructSdtEnvio_emit value )
   {
      gxTv_SdtEnvio_Emit = value;
   }

   public StructSdtEnvio_dest getDest( )
   {
      return gxTv_SdtEnvio_Dest ;
   }

   public void setDest( StructSdtEnvio_dest value )
   {
      gxTv_SdtEnvio_Dest = value;
   }

   public StructSdtEnvio_retirada getRetirada( )
   {
      return gxTv_SdtEnvio_Retirada ;
   }

   public void setRetirada( StructSdtEnvio_retirada value )
   {
      gxTv_SdtEnvio_Retirada = value;
   }

   public StructSdtEnvio_entrega getEntrega( )
   {
      return gxTv_SdtEnvio_Entrega ;
   }

   public void setEntrega( StructSdtEnvio_entrega value )
   {
      gxTv_SdtEnvio_Entrega = value;
   }

   public java.util.Vector getAutxml( )
   {
      return gxTv_SdtEnvio_Autxml ;
   }

   public void setAutxml( java.util.Vector value )
   {
      gxTv_SdtEnvio_Autxml = value ;
   }

   public java.util.Vector getDet( )
   {
      return gxTv_SdtEnvio_Det ;
   }

   public void setDet( java.util.Vector value )
   {
      gxTv_SdtEnvio_Det = value ;
   }

   public StructSdtEnvio_total getTotal( )
   {
      return gxTv_SdtEnvio_Total ;
   }

   public void setTotal( StructSdtEnvio_total value )
   {
      gxTv_SdtEnvio_Total = value;
   }

   public StructSdtEnvio_transp getTransp( )
   {
      return gxTv_SdtEnvio_Transp ;
   }

   public void setTransp( StructSdtEnvio_transp value )
   {
      gxTv_SdtEnvio_Transp = value;
   }

   public StructSdtEnvio_cobr getCobr( )
   {
      return gxTv_SdtEnvio_Cobr ;
   }

   public void setCobr( StructSdtEnvio_cobr value )
   {
      gxTv_SdtEnvio_Cobr = value;
   }

   public java.util.Vector getPag( )
   {
      return gxTv_SdtEnvio_Pag ;
   }

   public void setPag( java.util.Vector value )
   {
      gxTv_SdtEnvio_Pag = value ;
   }

   public StructSdtEnvio_infAdic getInfadic( )
   {
      return gxTv_SdtEnvio_Infadic ;
   }

   public void setInfadic( StructSdtEnvio_infAdic value )
   {
      gxTv_SdtEnvio_Infadic = value;
   }

   public StructSdtEnvio_infSuplem getInfsuplem( )
   {
      return gxTv_SdtEnvio_Infsuplem ;
   }

   public void setInfsuplem( StructSdtEnvio_infSuplem value )
   {
      gxTv_SdtEnvio_Infsuplem = value;
   }

   public StructSdtEnvio_exporta getExporta( )
   {
      return gxTv_SdtEnvio_Exporta ;
   }

   public void setExporta( StructSdtEnvio_exporta value )
   {
      gxTv_SdtEnvio_Exporta = value;
   }

   public StructSdtEnvio_compra getCompra( )
   {
      return gxTv_SdtEnvio_Compra ;
   }

   public void setCompra( StructSdtEnvio_compra value )
   {
      gxTv_SdtEnvio_Compra = value;
   }

   public StructSdtEnvio_cana getCana( )
   {
      return gxTv_SdtEnvio_Cana ;
   }

   public void setCana( StructSdtEnvio_cana value )
   {
      gxTv_SdtEnvio_Cana = value;
   }

   public StructSdtEnvio_DescartarDocumento getDescartardocumento( )
   {
      return gxTv_SdtEnvio_Descartardocumento ;
   }

   public void setDescartardocumento( StructSdtEnvio_DescartarDocumento value )
   {
      gxTv_SdtEnvio_Descartardocumento = value;
   }

   protected String gxTv_SdtEnvio_Chaveparceiro ;
   protected String gxTv_SdtEnvio_Chaveacesso ;
   protected String gxTv_SdtEnvio_Imprimir ;
   protected String gxTv_SdtEnvio_Apelidoimpressora ;
   protected String gxTv_SdtEnvio_Modelodocumento ;
   protected java.math.BigDecimal gxTv_SdtEnvio_Versao ;
   protected java.math.BigDecimal gxTv_SdtEnvio_Vtroco ;
   protected StructSdtEnvio_ide gxTv_SdtEnvio_Ide=null ;
   protected StructSdtEnvio_emit gxTv_SdtEnvio_Emit=null ;
   protected StructSdtEnvio_dest gxTv_SdtEnvio_Dest=null ;
   protected StructSdtEnvio_retirada gxTv_SdtEnvio_Retirada=null ;
   protected StructSdtEnvio_entrega gxTv_SdtEnvio_Entrega=null ;
   protected StructSdtEnvio_total gxTv_SdtEnvio_Total=null ;
   protected StructSdtEnvio_transp gxTv_SdtEnvio_Transp=null ;
   protected StructSdtEnvio_cobr gxTv_SdtEnvio_Cobr=null ;
   protected StructSdtEnvio_infAdic gxTv_SdtEnvio_Infadic=null ;
   protected StructSdtEnvio_infSuplem gxTv_SdtEnvio_Infsuplem=null ;
   protected StructSdtEnvio_exporta gxTv_SdtEnvio_Exporta=null ;
   protected StructSdtEnvio_compra gxTv_SdtEnvio_Compra=null ;
   protected StructSdtEnvio_cana gxTv_SdtEnvio_Cana=null ;
   protected StructSdtEnvio_DescartarDocumento gxTv_SdtEnvio_Descartardocumento=null ;
   protected java.util.Vector gxTv_SdtEnvio_Autxml=null ;
   protected java.util.Vector gxTv_SdtEnvio_Det=null ;
   protected java.util.Vector gxTv_SdtEnvio_Pag=null ;
}

