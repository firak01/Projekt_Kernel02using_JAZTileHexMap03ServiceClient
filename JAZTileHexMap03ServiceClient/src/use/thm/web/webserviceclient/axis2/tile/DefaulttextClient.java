package use.thm.web.webserviceclient.axis2.tile;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import use.thm.web.webservice.axis2.tile.TileServiceStub;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTileDefaulttextByThiskey;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTileDefaulttextByThiskeyResponse;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTroopArmiesByHexCell;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTroopArmiesByHexCellResponse;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTroopArmyCount;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTroopArmyCountResponse;
import use.thm.web.webservice.axis2.tile.TileServiceStub.TileDefaulttextPojo;
import use.thm.web.webservice.axis2.tile.TileServiceStub.TroopArmyPojo;



public class DefaulttextClient {

	public static void main(String[] args) {
		
	//Merke: Wenn sich der WebService ändert einfach die Proxy - Klassen neu erzeugen lassen. In Eclipse ausführen: NEW WebServiceClient 
            
    //Create the stub object
	TileServiceStub stub;
	try {
		stub = new TileServiceStub();
				
       GetTileDefaulttextByThiskey getTileDefaulttextByThiskey = new GetTileDefaulttextByThiskey();
       
       Long lngThiskey = new Long(1);
       getTileDefaulttextByThiskey.setLngThiskey(lngThiskey);//setze den zu holenden "Thiskey"
       
       GetTileDefaulttextByThiskeyResponse objResponse = stub.getTileDefaulttextByThiskey(getTileDefaulttextByThiskey);
       TileDefaulttextPojo objPojo = objResponse.get_return();
       System.out.println("Der WebService sagt, DefaultTexte der TileObjekte für den Thiskey '" + lngThiskey.toString() + "': " + objPojo.getShorttext() + "|" + objPojo.getLongtext() + "|" + objPojo.getDescriptiontext() ); 
		  
	} catch (AxisFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	//Beispiel, wenn hier mit Proxy Klassend der WebServiceClient entwickelt wurde.
		 //2) 
//		HelloServiceProxy proxy = new HelloServiceProxy();
//		proxy.setEndpoint("http://localhost:8080/Tryout.Web.Webservice.Axis2.HelloAxis2.001/services/HelloService");
//		
//		HelloService service = proxy.getHelloService();
//		try {
//			String sReturn = service.sayHello("FRITZ");
//			System.out.println("Response : " + sReturn);
//			
//			sReturn = service.getNow();
//			System.out.println("getNow() liefert zurück: " + sReturn);
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
