public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        System.out.println(customer1 + pendingMessage);//Display "Cindhuri, your order will be ready shortly"

        System.out.println(displayTotalMessage + mochaPrice);//Display "Your total is $3.5"


        isReadyOrder1 = true;
        if (isReadyOrder1){
            System.out.println(customer1 + readyMessage);//Display "Cindhuri, your order is ready"
        }else{
            System.out.println(customer1 + pendingMessage);//Display "Cindhuri, you order will be ready shortly"
        }
    }
}
