/*
               File: SdtIpMaquinaLocal
        Description: IpMaquinaLocal
             Author: GeneXus Java Generator version 10_3_15-115824
       Generated on: September 15, 2022 14:18:24.45
       Program type: Callable routine
          Main DBMS: oracle7
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtIpMaquinaLocal extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtIpMaquinaLocal( )
   {
      this(  new ModelContext(SdtIpMaquinaLocal.class));
   }

   public SdtIpMaquinaLocal( ModelContext context )
   {
      super( context, "SdtIpMaquinaLocal");
   }

   public SdtIpMaquinaLocal( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle, context, "SdtIpMaquinaLocal");
   }

   public SdtIpMaquinaLocal( StructSdtIpMaquinaLocal struct )
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

   public void main( String [] arr_gxTp_param0 )
   {
      IpMaquinaLocal.main(arr_gxTp_param0) ;
   }

   public String get( )
   {
      String returnget ;
      returnget = "";
      returnget = IpMaquinaLocal.get() ;
      return returnget ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
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
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
   }

   public IpMaquinaLocal getExternalInstance( )
   {
      return IpMaquinaLocal_externalReference ;
   }

   public void setExternalInstance( IpMaquinaLocal value )
   {
      IpMaquinaLocal_externalReference = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      arr_gxTp_param0 = "" ;
   }

   public SdtIpMaquinaLocal Clone( )
   {
      return (SdtIpMaquinaLocal)(clone()) ;
   }

   public void setStruct( StructSdtIpMaquinaLocal struct )
   {
   }

   public StructSdtIpMaquinaLocal getStruct( )
   {
      StructSdtIpMaquinaLocal struct = new StructSdtIpMaquinaLocal ();
      return struct ;
   }

   protected String arr_gxTp_param0 ;
   protected IpMaquinaLocal IpMaquinaLocal_externalReference=null ;
}

