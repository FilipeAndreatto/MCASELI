/*
               File: SdtSDT_ConsultaClienteId_Dock_portador
        Description: SDT_ConsultaClienteId_Dock_portador
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:21:48.99
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_ConsultaClienteId_Dock_portador extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtSDT_ConsultaClienteId_Dock_portador( )
   {
      this(  new ModelContext(SdtSDT_ConsultaClienteId_Dock_portador.class));
   }

   public SdtSDT_ConsultaClienteId_Dock_portador( ModelContext context )
   {
      super( context, "SdtSDT_ConsultaClienteId_Dock_portador");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_ConsultaClienteId_Dock_portador");
   }

   public SdtSDT_ConsultaClienteId_Dock_portador( StructSdtSDT_ConsultaClienteId_Dock_portador struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "id") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cpf") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "cartao") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "nome") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "rg") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "clienteDataNascimento") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "rendas") )
            {
               if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas == null )
               {
                  gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas = new GxObjectCollection(SdtSDT_ConsultaClienteId_Dock_portador_rendasItem.class, "SDT_ConsultaClienteId_Dock_portador.rendasItem", "MCASELI4", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas.readxmlcollection(oReader, "rendas", "rendasItem") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "statusCliente") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "statusAnalise") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "contratoImpresso") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "estanoCobranca") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ultimoMotivoBloqueioCliente") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "extratoClienteResponse") )
            {
               if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse == null )
               {
                  gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse = new SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse.readxml(oReader, "extratoClienteResponse") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "pontuacaoFidelidadeResponse") )
            {
               if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse == null )
               {
                  gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse = new SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse.readxml(oReader, "pontuacaoFidelidadeResponse") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "boletos") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "faturaFechada") )
            {
               if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada == null )
               {
                  gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada = new SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada.readxml(oReader, "faturaFechada") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "faturaFutura") )
            {
               if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura == null )
               {
                  gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura = new SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura.readxml(oReader, "faturaFutura") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "melhorDiaCompra") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ciclo") )
            {
               if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo == null )
               {
                  gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo = new SdtSDT_ConsultaClienteId_Dock_portador_ciclo(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo.readxml(oReader, "ciclo") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "produto") )
            {
               if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto == null )
               {
                  gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto = new SdtSDT_ConsultaClienteId_Dock_portador_produto(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto.readxml(oReader, "produto") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "taxas") )
            {
               if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas == null )
               {
                  gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas = new GxObjectCollection(SdtSDT_ConsultaClienteId_Dock_portador_taxasItem.class, "SDT_ConsultaClienteId_Dock_portador.taxasItem", "MCASELI4", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas.readxmlcollection(oReader, "taxas", "taxasItem") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "estaEmPerda") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "idCartao") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "estaEmAtraso") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "dataEmissaoRG") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "orgaoEmissorRG") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "totalTentativasValidacaoCartao") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "email") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "numeroCartaoTruncado") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "valorLancamentosFuturos") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "dataCadastro") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "permiteAcessoApp") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "statusFaturaDigital") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "statusCartao") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "dataFechamentoProxFatura") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "numeroCartaoCriptografado") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "inibirEnvioFaturaGrafica") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "enderecoResidencial") )
            {
               if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial == null )
               {
                  gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial = new SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial.readxml(oReader, "enderecoResidencial") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "enderecoComercial") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "enderecoAlternativo") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "transicaoBandeira") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "utilizaOverLimitPersonalizado") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "diasAtrasoTotal") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "diasProvisionamento") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "produtoTransicaoBandeira") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "senhaExpirada") )
            {
               gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( readOk == 0 )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "SDT_ConsultaClienteId_Dock_portador" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "MCASELI4" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("id", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("cpf", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("cartao", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("nome", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("rg", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("clienteDataNascimento", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas.writexmlcollection(oWriter, "rendas", sNameSpace1, "rendasItem", sNameSpace1);
      }
      oWriter.writeElement("statusCliente", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("statusAnalise", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("contratoImpresso", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("estanoCobranca", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("ultimoMotivoBloqueioCliente", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse.writexml(oWriter, "extratoClienteResponse", sNameSpace1);
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse.writexml(oWriter, "pontuacaoFidelidadeResponse", sNameSpace1);
      }
      oWriter.writeElement("boletos", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada.writexml(oWriter, "faturaFechada", sNameSpace1);
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura.writexml(oWriter, "faturaFutura", sNameSpace1);
      }
      oWriter.writeElement("melhorDiaCompra", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo.writexml(oWriter, "ciclo", sNameSpace1);
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto.writexml(oWriter, "produto", sNameSpace1);
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas.writexmlcollection(oWriter, "taxas", sNameSpace1, "taxasItem", sNameSpace1);
      }
      oWriter.writeElement("estaEmPerda", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("idCartao", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("estaEmAtraso", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("dataEmissaoRG", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("orgaoEmissorRG", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("totalTentativasValidacaoCartao", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("email", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("numeroCartaoTruncado", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("valorLancamentosFuturos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("dataCadastro", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("permiteAcessoApp", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("statusFaturaDigital", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("statusCartao", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("dataFechamentoProxFatura", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("numeroCartaoCriptografado", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("inibirEnvioFaturaGrafica", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "MCASELI4") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "MCASELI4" ;
         }
         else
         {
            sNameSpace1 = "MCASELI4" ;
         }
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial.writexml(oWriter, "enderecoResidencial", sNameSpace1);
      }
      oWriter.writeElement("enderecoComercial", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("enderecoAlternativo", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("transicaoBandeira", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("utilizaOverLimitPersonalizado", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("diasAtrasoTotal", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("diasProvisionamento", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento, 10, 5)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("produtoTransicaoBandeira", GXutil.rtrim( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeElement("senhaExpirada", GXutil.rtrim( GXutil.booltostr( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada)));
      if ( GXutil.strcmp(sNameSpace, "MCASELI4") != 0 )
      {
         oWriter.writeAttribute("xmlns", "MCASELI4");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("id", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id, false);
      AddObjectProperty("cpf", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf, false);
      AddObjectProperty("cartao", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao, false);
      AddObjectProperty("nome", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome, false);
      AddObjectProperty("rg", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg, false);
      AddObjectProperty("clienteDataNascimento", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento, false);
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas != null )
      {
         AddObjectProperty("rendas", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas, false);
      }
      AddObjectProperty("statusCliente", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente, false);
      AddObjectProperty("statusAnalise", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise, false);
      AddObjectProperty("contratoImpresso", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso, false);
      AddObjectProperty("estanoCobranca", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca, false);
      AddObjectProperty("ultimoMotivoBloqueioCliente", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente, false);
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse != null )
      {
         AddObjectProperty("extratoClienteResponse", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse, false);
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse != null )
      {
         AddObjectProperty("pontuacaoFidelidadeResponse", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse, false);
      }
      AddObjectProperty("boletos", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos, false);
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada != null )
      {
         AddObjectProperty("faturaFechada", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada, false);
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura != null )
      {
         AddObjectProperty("faturaFutura", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura, false);
      }
      AddObjectProperty("melhorDiaCompra", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra, false);
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo != null )
      {
         AddObjectProperty("ciclo", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo, false);
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto != null )
      {
         AddObjectProperty("produto", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto, false);
      }
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas != null )
      {
         AddObjectProperty("taxas", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas, false);
      }
      AddObjectProperty("estaEmPerda", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda, false);
      AddObjectProperty("idCartao", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao, false);
      AddObjectProperty("estaEmAtraso", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso, false);
      AddObjectProperty("dataEmissaoRG", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg, false);
      AddObjectProperty("orgaoEmissorRG", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg, false);
      AddObjectProperty("totalTentativasValidacaoCartao", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao, false);
      AddObjectProperty("email", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email, false);
      AddObjectProperty("numeroCartaoTruncado", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado, false);
      AddObjectProperty("valorLancamentosFuturos", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos, false);
      AddObjectProperty("dataCadastro", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro, false);
      AddObjectProperty("permiteAcessoApp", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp, false);
      AddObjectProperty("statusFaturaDigital", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital, false);
      AddObjectProperty("statusCartao", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao, false);
      AddObjectProperty("dataFechamentoProxFatura", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura, false);
      AddObjectProperty("numeroCartaoCriptografado", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado, false);
      AddObjectProperty("inibirEnvioFaturaGrafica", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica, false);
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial != null )
      {
         AddObjectProperty("enderecoResidencial", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial, false);
      }
      AddObjectProperty("enderecoComercial", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial, false);
      AddObjectProperty("enderecoAlternativo", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo, false);
      AddObjectProperty("transicaoBandeira", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira, false);
      AddObjectProperty("utilizaOverLimitPersonalizado", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado, false);
      AddObjectProperty("diasAtrasoTotal", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal, false);
      AddObjectProperty("diasProvisionamento", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento, false);
      AddObjectProperty("produtoTransicaoBandeira", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira, false);
      AddObjectProperty("senhaExpirada", gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento = value ;
   }

   public GxObjectCollection getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas == null )
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas = new GxObjectCollection(SdtSDT_ConsultaClienteId_Dock_portador_rendasItem.class, "SDT_ConsultaClienteId_Dock_portador.rendasItem", "MCASELI4", remoteHandle);
      }
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas( GxObjectCollection value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas = value ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas_SetNull( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas = null ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas_IsNull( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente = value ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse == null )
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse = new SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse(remoteHandle, context);
      }
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse( SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse = value;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse_SetNull( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse = (SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse)null;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse_IsNull( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse == null )
      {
         return true ;
      }
      return false ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse == null )
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse = new SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse(remoteHandle, context);
      }
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse( SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse = value;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse_SetNull( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse = (SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse)null;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse_IsNull( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos = value ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada == null )
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada = new SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada(remoteHandle, context);
      }
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada( SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada = value;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada_SetNull( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada = (SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada)null;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada_IsNull( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada == null )
      {
         return true ;
      }
      return false ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura == null )
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura = new SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura(remoteHandle, context);
      }
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura( SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura = value;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura_SetNull( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura = (SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura)null;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura_IsNull( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura == null )
      {
         return true ;
      }
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra = value ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_ciclo getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo == null )
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo = new SdtSDT_ConsultaClienteId_Dock_portador_ciclo(remoteHandle, context);
      }
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo( SdtSDT_ConsultaClienteId_Dock_portador_ciclo value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo = value;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo_SetNull( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo = (SdtSDT_ConsultaClienteId_Dock_portador_ciclo)null;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo_IsNull( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo == null )
      {
         return true ;
      }
      return false ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_produto getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto == null )
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto = new SdtSDT_ConsultaClienteId_Dock_portador_produto(remoteHandle, context);
      }
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto( SdtSDT_ConsultaClienteId_Dock_portador_produto value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto = value;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto_SetNull( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto = (SdtSDT_ConsultaClienteId_Dock_portador_produto)null;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto_IsNull( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto == null )
      {
         return true ;
      }
      return false ;
   }

   public GxObjectCollection getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas == null )
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas = new GxObjectCollection(SdtSDT_ConsultaClienteId_Dock_portador_taxasItem.class, "SDT_ConsultaClienteId_Dock_portador.taxasItem", "MCASELI4", remoteHandle);
      }
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas( GxObjectCollection value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas = value ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas_SetNull( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas = null ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas_IsNull( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas == null )
      {
         return true ;
      }
      return false ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda( boolean value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso( boolean value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp( boolean value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica( boolean value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica = value ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial == null )
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial = new SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial(remoteHandle, context);
      }
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial( SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial = value;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial_SetNull( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial = (SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial)null;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial_IsNull( )
   {
      if ( gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado( boolean value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento = value ;
   }

   public String getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira( String value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira = value ;
   }

   public boolean getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada( )
   {
      return gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada ;
   }

   public void setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada( boolean value )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira = "" ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento = DecimalUtil.ZERO ;
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira = "" ;
      sTagName = "" ;
   }

   public SdtSDT_ConsultaClienteId_Dock_portador Clone( )
   {
      return (SdtSDT_ConsultaClienteId_Dock_portador)(clone()) ;
   }

   public void setStruct( StructSdtSDT_ConsultaClienteId_Dock_portador struct )
   {
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id(struct.getId());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf(struct.getCpf());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao(struct.getCartao());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome(struct.getNome());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg(struct.getRg());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento(struct.getClientedatanascimento());
      GxObjectCollection gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas_aux1 = new GxObjectCollection();
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas_aux1.setStruct(struct.getRendas());
      for (int i = 0; i < gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas_aux1.size(); i++)
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas_aux.add(new SdtSDT_ConsultaClienteId_Dock_portador_rendasItem((StructSdtSDT_ConsultaClienteId_Dock_portador_rendasItem)gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas_aux1.elementAt(i)));
      }
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas(gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas_aux);
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente(struct.getStatuscliente());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise(struct.getStatusanalise());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso(struct.getContratoimpresso());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca(struct.getEstanocobranca());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente(struct.getUltimomotivobloqueiocliente());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse(new SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse(struct.getExtratoclienteresponse()));
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse(new SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse(struct.getPontuacaofidelidaderesponse()));
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos(struct.getBoletos());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada(new SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada(struct.getFaturafechada()));
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura(new SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura(struct.getFaturafutura()));
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra(struct.getMelhordiacompra());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo(new SdtSDT_ConsultaClienteId_Dock_portador_ciclo(struct.getCiclo()));
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto(new SdtSDT_ConsultaClienteId_Dock_portador_produto(struct.getProduto()));
      GxObjectCollection gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas_aux1 = new GxObjectCollection();
      gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas_aux1.setStruct(struct.getTaxas());
      for (int i = 0; i < gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas_aux1.size(); i++)
      {
         gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas_aux.add(new SdtSDT_ConsultaClienteId_Dock_portador_taxasItem((StructSdtSDT_ConsultaClienteId_Dock_portador_taxasItem)gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas_aux1.elementAt(i)));
      }
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas(gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas_aux);
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda(struct.getEstaemperda());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao(struct.getIdcartao());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso(struct.getEstaematraso());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg(struct.getDataemissaorg());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg(struct.getOrgaoemissorrg());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao(struct.getTotaltentativasvalidacaocartao());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email(struct.getEmail());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado(struct.getNumerocartaotruncado());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos(struct.getValorlancamentosfuturos());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro(struct.getDatacadastro());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp(struct.getPermiteacessoapp());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital(struct.getStatusfaturadigital());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao(struct.getStatuscartao());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura(struct.getDatafechamentoproxfatura());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado(struct.getNumerocartaocriptografado());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica(struct.getInibirenviofaturagrafica());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial(new SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial(struct.getEnderecoresidencial()));
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial(struct.getEnderecocomercial());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo(struct.getEnderecoalternativo());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira(struct.getTransicaobandeira());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado(struct.getUtilizaoverlimitpersonalizado());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal(struct.getDiasatrasototal());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento(struct.getDiasprovisionamento());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira(struct.getProdutotransicaobandeira());
      setgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada(struct.getSenhaexpirada());
   }

   public StructSdtSDT_ConsultaClienteId_Dock_portador getStruct( )
   {
      StructSdtSDT_ConsultaClienteId_Dock_portador struct = new StructSdtSDT_ConsultaClienteId_Dock_portador ();
      struct.setId(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id());
      struct.setCpf(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf());
      struct.setCartao(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao());
      struct.setNome(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome());
      struct.setRg(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg());
      struct.setClientedatanascimento(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento());
      Vector aux_vectorgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas = getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas().getStruct();
      Vector aux_vector1gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas.size(); i++)
      {
         aux_vector1gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas.addElement(((SdtSDT_ConsultaClienteId_Dock_portador_rendasItem)aux_vectorgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas.elementAt(i)).getStruct());
      }
      struct.setRendas(aux_vector1gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas);
      struct.setStatuscliente(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente());
      struct.setStatusanalise(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise());
      struct.setContratoimpresso(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso());
      struct.setEstanocobranca(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca());
      struct.setUltimomotivobloqueiocliente(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente());
      struct.setExtratoclienteresponse(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse().getStruct());
      struct.setPontuacaofidelidaderesponse(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse().getStruct());
      struct.setBoletos(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos());
      struct.setFaturafechada(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada().getStruct());
      struct.setFaturafutura(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura().getStruct());
      struct.setMelhordiacompra(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra());
      struct.setCiclo(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo().getStruct());
      struct.setProduto(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto().getStruct());
      Vector aux_vectorgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas = getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas().getStruct();
      Vector aux_vector1gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas.size(); i++)
      {
         aux_vector1gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas.addElement(((SdtSDT_ConsultaClienteId_Dock_portador_taxasItem)aux_vectorgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas.elementAt(i)).getStruct());
      }
      struct.setTaxas(aux_vector1gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas);
      struct.setEstaemperda(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda());
      struct.setIdcartao(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao());
      struct.setEstaematraso(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso());
      struct.setDataemissaorg(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg());
      struct.setOrgaoemissorrg(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg());
      struct.setTotaltentativasvalidacaocartao(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao());
      struct.setEmail(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email());
      struct.setNumerocartaotruncado(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado());
      struct.setValorlancamentosfuturos(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos());
      struct.setDatacadastro(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro());
      struct.setPermiteacessoapp(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp());
      struct.setStatusfaturadigital(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital());
      struct.setStatuscartao(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao());
      struct.setDatafechamentoproxfatura(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura());
      struct.setNumerocartaocriptografado(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado());
      struct.setInibirenviofaturagrafica(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica());
      struct.setEnderecoresidencial(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial().getStruct());
      struct.setEnderecocomercial(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial());
      struct.setEnderecoalternativo(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo());
      struct.setTransicaobandeira(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira());
      struct.setUtilizaoverlimitpersonalizado(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado());
      struct.setDiasatrasototal(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal());
      struct.setDiasprovisionamento(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento());
      struct.setProdutotransicaobandeira(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira());
      struct.setSenhaexpirada(getgxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Id ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Melhordiacompra ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Idcartao ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Totaltentativasvalidacaocartao ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Valorlancamentosfuturos ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasatrasototal ;
   protected java.math.BigDecimal gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Diasprovisionamento ;
   protected String sTagName ;
   protected boolean gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaemperda ;
   protected boolean gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estaematraso ;
   protected boolean gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Permiteacessoapp ;
   protected boolean gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Inibirenviofaturagrafica ;
   protected boolean gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Utilizaoverlimitpersonalizado ;
   protected boolean gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Senhaexpirada ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cpf ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Cartao ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Nome ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rg ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Clientedatanascimento ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscliente ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusanalise ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Contratoimpresso ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Estanocobranca ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ultimomotivobloqueiocliente ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Boletos ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Dataemissaorg ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Orgaoemissorrg ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Email ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaotruncado ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datacadastro ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statusfaturadigital ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Statuscartao ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Datafechamentoproxfatura ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Numerocartaocriptografado ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecocomercial ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoalternativo ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Transicaobandeira ;
   protected String gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produtotransicaobandeira ;
   protected GxObjectCollection gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Rendas=null ;
   protected GxObjectCollection gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Taxas=null ;
   protected SdtSDT_ConsultaClienteId_Dock_portador_extratoClienteResponse gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Extratoclienteresponse=null ;
   protected SdtSDT_ConsultaClienteId_Dock_portador_pontuacaoFidelidadeResponse gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Pontuacaofidelidaderesponse=null ;
   protected SdtSDT_ConsultaClienteId_Dock_portador_faturaFechada gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafechada=null ;
   protected SdtSDT_ConsultaClienteId_Dock_portador_faturaFutura gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Faturafutura=null ;
   protected SdtSDT_ConsultaClienteId_Dock_portador_ciclo gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Ciclo=null ;
   protected SdtSDT_ConsultaClienteId_Dock_portador_produto gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Produto=null ;
   protected SdtSDT_ConsultaClienteId_Dock_portador_enderecoResidencial gxTv_SdtSDT_ConsultaClienteId_Dock_portador_Enderecoresidencial=null ;
}

