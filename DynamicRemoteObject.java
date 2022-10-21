
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface DynamicRemoteObject extends Remote {
    
    String Notify_Print(String message) throws RemoteException;
}
