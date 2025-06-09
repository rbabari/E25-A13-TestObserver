//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Le design pattern Observer : respecte le principe de Open Close principle
 * Open : ouvert à l'extension
 * Close : Fermé à la modification
 */

public class Main {
    public static void main(String[] args) {
        // MessageSubscribers (Observer)
        MessageSubscriber1 s1 = new MessageSubscriber1();
        MessageSubscriber2 s2 = new MessageSubscriber2();
        MessageSubscriber3 s3 = new MessageSubscriber3();
        MessageSubscriber4 s4 = new MessageSubscriber4();


        // Construire Publisher (Observable)
        MessagePublisher1 publisher1 = new MessagePublisher1();
        // add Observer
        publisher1.addObserver(s1);
        publisher1.addObserver(s2);
        // notifier
        publisher1.notifyObservers(new Message("message1 de p1"));

        // desabonner un souscripteur

        publisher1.removeObserver(s1);

        publisher1.addObserver(s4);
        publisher1.notifyObservers(new Message("message2 de p1"));



        }
    }
