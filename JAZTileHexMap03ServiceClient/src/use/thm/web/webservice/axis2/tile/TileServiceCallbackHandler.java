
/**
 * TileServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.5  Built on : May 06, 2017 (03:45:26 BST)
 */

    package use.thm.web.webservice.axis2.tile;

    /**
     *  TileServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class TileServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public TileServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public TileServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getVersion method
            * override this method for handling normal response from getVersion operation
            */
           public void receiveResultgetVersion(
                    use.thm.web.webservice.axis2.tile.TileServiceStub.GetVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getVersion operation
           */
            public void receiveErrorgetVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getNow method
            * override this method for handling normal response from getNow operation
            */
           public void receiveResultgetNow(
                    use.thm.web.webservice.axis2.tile.TileServiceStub.GetNowResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getNow operation
           */
            public void receiveErrorgetNow(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getTroopArmyCount method
            * override this method for handling normal response from getTroopArmyCount operation
            */
           public void receiveResultgetTroopArmyCount(
                    use.thm.web.webservice.axis2.tile.TileServiceStub.GetTroopArmyCountResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getTroopArmyCount operation
           */
            public void receiveErrorgetTroopArmyCount(java.lang.Exception e) {
            }
                


    }
    