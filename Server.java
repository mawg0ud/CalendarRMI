
import java.rmi.Remote;
import java.rmi.RemoteException;



public interface Server extends Remote{
    DynamicRemoteObject CreatingObj(String name) throws RemoteException; 
}
