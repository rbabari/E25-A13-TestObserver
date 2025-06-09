public class MessageSubscriber4 implements Observer {
    @Override
    public void update(Message m)
    {
        System.out.println("MessageSubscriber3: " + m.getMessageContent());
    }
}
