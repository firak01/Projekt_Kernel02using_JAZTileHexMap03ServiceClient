package use.thm.web.webserviceclient.axis2.tile;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import use.thm.web.webservice.axis2.tile.TileServiceStub;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTroopArmiesByHexCell;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTroopArmiesByHexCellResponse;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTroopArmyCount;
import use.thm.web.webservice.axis2.tile.TileServiceStub.GetTroopArmyCountResponse;
import use.thm.web.webservice.axis2.tile.TileServiceStub.TroopArmyPojo;



public class ArmyByPositionClient {

	public static void main(String[] args) {
		
	//Merke: Wenn sich der WebService ändert einfach die Proxy - Klassen neu erzeugen lassen. In Eclipse ausführen: NEW WebServiceClient 
     
       
    //Create the stub object
	TileServiceStub stub;
	try {
		stub = new TileServiceStub();
				
       GetTroopArmyCount getTroopArmyCount4 = new GetTroopArmyCount();
       GetTroopArmyCountResponse objResponse = stub.getTroopArmyCount(getTroopArmyCount4);
       System.out.println("Der WebService sagt, es gibt '" + objResponse.get_return() + "' Truppen auf der Karte.");
		
      
       	String sX = "1";
       	String sY = "4";
	    GetTroopArmiesByHexCell getTroopArmiesByHexCell = new GetTroopArmiesByHexCell();
	    getTroopArmiesByHexCell.setSMap("EINS");
	    getTroopArmiesByHexCell.setSX(sX);
	    getTroopArmiesByHexCell.setSY(sY);
	    GetTroopArmiesByHexCellResponse objResponseArmies = stub.getTroopArmiesByHexCell(getTroopArmiesByHexCell);
	    TroopArmyPojo[] troopArmies = objResponseArmies.get_return();
	    for(TroopArmyPojo troopArmy : troopArmies){
	    	System.out.println("Der WebService sagt, auf Position X/Y (" + sX + "/" + sY + ") gibt es " + troopArmy.getUniquename());
	    }
	    
	} catch (AxisFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	//Beispiel, wenn hier mit Proxy Klassend er WebServiceClient entwickelt wurde.
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
