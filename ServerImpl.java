import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;




public class ServerImpl implements Server {

    public DynamicRemoteObject CreatingObj(String name)
        throws RemoteException {
            return new DynamicRemoteObjectImpl(name);
        }
    
     public ServerImpl(){};
     public static void main(String[] args){
     ServerImpl obj = new ServerImpl();
     try {
          Server stub = (Server) UnicastRemoteObject.exportObject(obj,0);
          Registry reg = LocateRegistry.getRegistry();
          reg.rebind("DynamicObject", stub);
          
    }
     catch (RemoteException e){
        e.printStackTrace();
    }

}
}