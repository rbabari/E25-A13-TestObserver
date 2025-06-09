public class MessageSubscriber2 implements Observer {
    @Override
    public void update(Message m)
    {
        System.out.println("MessageSubscriber2: " + m.getMessageContent());
    }
}
