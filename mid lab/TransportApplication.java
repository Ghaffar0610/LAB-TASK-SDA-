
public class TransportApplication {
    public static void main(String[] args) {
     
        TransportSubject subject = new TransportSubject();
        NotificationLogger logger = new NotificationLogger();
        subject.attach(logger);

        
        TransportInput input = new TransportInput();
        TransportProcessor processor = new TransportProcessor();
        TransportStorage storage = new TransportStorage(subject);

   
        String choice = input.getTransportChoice();            
        String result = processor.processChoice(choice);      
        storage.saveRecord(result);
    }
}
