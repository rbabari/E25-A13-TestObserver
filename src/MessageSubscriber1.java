public class MessageSubscriber1 implements Observer {
    @Override
    public void update(Message m)
    {
        System.out.println("MessageSubscriber1: " + m.getMessageContent());
    }
}
