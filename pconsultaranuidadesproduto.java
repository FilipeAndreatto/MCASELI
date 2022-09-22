/*
               File: PConsultarAnuidadesProduto
        Description: PConsultar Anuidades Produto
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:37.92
       Program type: Callable routine
          Main DBMS: oracle7
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class pconsultaranuidadesproduto extends GXProcedure
{
   public pconsultaranuidadesproduto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconsultaranuidadesproduto.class ), "" );
   }

   public pconsultaranuidadesproduto( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public com.genexus.internet.HttpClient executeUdp( SdtTbPierLabs_SDT aP0 ,
                                                      long aP1 ,
                                                      GxObjectCollection[] aP2 )
   {
      pconsultaranuidadesproduto.this.AV17TbPierLabs_SDT = aP0;
      pconsultaranuidadesproduto.this.AV13idConta = aP1;
      pconsultaranuidadesproduto.this.aP2 = aP2;
      pconsultaranuidadesproduto.this.aP3 = aP3;
      pconsultaranuidadesproduto.this.aP3 = new com.genexus.internet.HttpClient[] {new com.genexus.internet.HttpClient()};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( SdtTbPierLabs_SDT aP0 ,
                        long aP1 ,
                        GxObjectCollection[] aP2 ,
                        com.genexus.internet.HttpClient[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( SdtTbPierLabs_SDT aP0 ,
                             long aP1 ,
                             GxObjectCollection[] aP2 ,
                             com.genexus.internet.HttpClient[] aP3 )
   {
      pconsultaranuidadesproduto.this.AV17TbPierLabs_SDT = aP0;
      pconsultaranuidadesproduto.this.AV13idConta = aP1;
      pconsultaranuidadesproduto.this.aP2 = aP2;
      pconsultaranuidadesproduto.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_httpclient1[0] = AV11httpclient ;
      GXv_SdtTbPierLabs_SDT2[0] = AV17TbPierLabs_SDT;
      new pierlabs(remoteHandle, context).execute( GXv_httpclient1, GXv_SdtTbPierLabs_SDT2) ;
      AV11httpclient = GXv_httpclient1[0] ;
      AV17TbPierLabs_SDT = GXv_SdtTbPierLabs_SDT2[0] ;
      if ( AV17TbPierLabs_SDT.getgxTv_SdtTbPierLabs_SDT_Pierlabmarketpay() )
      {
         AV9URL = "anuidades/" + GXutil.trim( GXutil.str( AV13idConta, 18, 0)) ;
         AV11httpclient.execute("GET", GXutil.trim( AV9URL));
         AV8ErrCode = AV11httpclient.getErrCode() ;
         if ( AV11httpclient.getErrCode() == 0 )
         {
            AV19result = AV11httpclient.getString() ;
            AV21SDT_ConsultaAnuidadeDoProduto.fromJSonString(AV11httpclient.getString());
         }
         else
         {
            AV8ErrCode = AV11httpclient.getErrCode() ;
            AV18ErrDescription = AV11httpclient.getErrDescription() ;
            GXv_char3[0] = "Erro no endpoint: " + GXutil.trim( GXutil.str( AV8ErrCode, 18, 0)) + " " + GXutil.trim( AV18ErrDescription) ;
            new wsysmsg(remoteHandle, context).execute( GXv_char3) ;
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV8ErrCode = AV11httpclient.getErrCode() ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pconsultaranuidadesproduto.this.AV21SDT_ConsultaAnuidadeDoProduto;
      this.aP3[0] = pconsultaranuidadesproduto.this.AV11httpclient;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21SDT_ConsultaAnuidadeDoProduto = new GxObjectCollection(SdtSDT_ConsultaAnuidadeDoProduto_SDT_ConsultaAnuidadeDoProdutoItem.class, "SDT_ConsultaAnuidadeDoProduto.SDT_ConsultaAnuidadeDoProdutoItem", "MCASELI4", remoteHandle);
      AV11httpclient = new com.genexus.internet.HttpClient();
      GXv_httpclient1 = new com.genexus.internet.HttpClient [1] ;
      GXv_SdtTbPierLabs_SDT2 = new SdtTbPierLabs_SDT [1] ;
      AV9URL = "" ;
      AV19result = "" ;
      AV18ErrDescription = "" ;
      GXv_char3 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV13idConta ;
   private long AV8ErrCode ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private String AV9URL ;
   private String AV19result ;
   private String AV18ErrDescription ;
   private GxObjectCollection[] aP2 ;
   private com.genexus.internet.HttpClient[] aP3 ;
   private com.genexus.internet.HttpClient AV11httpclient ;
   private com.genexus.internet.HttpClient GXv_httpclient1[] ;
   private GxObjectCollection AV21SDT_ConsultaAnuidadeDoProduto ;
   private SdtTbPierLabs_SDT AV17TbPierLabs_SDT ;
   private SdtTbPierLabs_SDT GXv_SdtTbPierLabs_SDT2[] ;
}

