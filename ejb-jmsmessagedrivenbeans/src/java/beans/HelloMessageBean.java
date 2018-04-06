package beans;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.logging.Level;
import java.util.logging.Logger;

@MessageDriven(name = "HelloMessageEJB", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/dest"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class HelloMessageBean implements MessageListener {
    public HelloMessageBean() {
    }

    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage)message;
        try {
            System.err.println(textMessage.getText());
        } catch (JMSException ex) {
            Logger.getLogger(HelloMessageBean.class.getName()).log(Level.SEVERE, "Error coming fromm onMessage in HelloMessageBean", ex);
        }

    }
}
