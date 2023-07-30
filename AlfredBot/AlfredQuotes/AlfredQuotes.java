package AlfredBot.AlfredQuotes;
import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello " + name+ "welcome to wayne manor!";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, 'the' d 'of' MMMM yyyy");
        Date date = new Date();
        return "Today's date is " + sdf.format(date) + ".";
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.contains("Alexis!")){
            return "I'm sorrry, but I think you might be confuseing me with your other digital assistant.";
        }else if(conversation.contains("Alfred")){
            return "At your service, what can I do for you?";
        }else{
            return "I'm not sure I understand what you mean, Sir.";
        }
        
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}
