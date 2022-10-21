import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class DynamicRemoteObjectImpl extends UnicastRemoteObject implements DynamicRemoteObject {
    static ArrayList<Client> Users = new ArrayList<Client>();
    
    public DynamicRemoteObjectImpl() throws RemoteException{};
    public DynamicRemoteObjectImpl(String name) throws RemoteException {
    }
    
    public String Notify_Print(String message) throws RemoteException {

       String s = "User Number : " + message;
       System.out.println(s);
       
       ///Generator
       String Client_NUM_GEN = "0123456789";

		StringBuilder builder = new StringBuilder();
                int count = 3;
		while (count-- != 0) {
			int character = (int)(Math.random()*Client_NUM_GEN.length());
			builder.append(Client_NUM_GEN.charAt(character));
		}
		String output = builder.toString();
       
       Users.add(new Client(output));
       for(int y=0;y<Users.size();y++)
           System.out.print(Users.get(y).getUserName()+", ");
       System.out.println();

       return s;
    }
    
    static public void Callforward(String ClientName, String EventTitle, int Col, int Row)
    {        
        for(int i=0;i<Users.size();i++) {
            if(!Users.get(i).getUserName().equals(ClientName))
            {
                Users.get(i).Notification().show();
                
            }
        }
    }

}
