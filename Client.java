
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JFrame;


public class Client {
    String username;
    JFrame newcalender = new JFrame();
    JFrame Notification = new JFrame();
    
    public String getUserName()
    {
        return username;
    }
    
    public JFrame getCalender()
    {
        return newcalender;
    }
    
    public JFrame Notification()
    {
        return Notification;
    }
    
    public Client(String User)
    {
        username = User;
        
        newcalender.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newcalender.getContentPane().add(new Calender(User));
        newcalender.pack();
        newcalender.setVisible(true);
        newcalender.setTitle("User : "+User);
        
        Notification.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Notification.getContentPane().add(new Notification());
        Notification.pack();
        Notification.setTitle("Notifying the user :" + User);
    }
    
    public static void main(String[] args){
       Registry reg;
       String host = null;
       try{
           reg = LocateRegistry.getRegistry(host);
           Server O = (Server) reg.lookup("DynamicObject");
          
           DynamicRemoteObject dro = O.CreatingObj("User");
           String zz = dro.Notify_Print("A new user was logged");
           System.out.println(zz);
           
       }
       catch (RemoteException e){
       e.printStackTrace();
       } 
       catch (NotBoundException e){
         e.printStackTrace();
       }
       }
    
    }

