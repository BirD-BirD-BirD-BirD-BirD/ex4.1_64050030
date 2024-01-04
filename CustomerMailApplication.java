//import java.util.Scanner;
//64050030 นาย กิติภูมิ หน่อเนื้อ
public class CustomerMailApplication {
    /**
     * @param args the command line arguments
     */
    private Customer customer;
    public CustomerMailApplication(Customer customer) {
        this.customer = customer;
    }
    
    public String generateMail() {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        //Customer customer  = CustomerMailFactory.createCustomer("Regular");
        //Customer customer  = CustomerMailFactory.createCustomer("Mountain");
        Customer customer  = CustomerMailFactory.createCustomer("Delinquent");
        
        CustomerMailApplication app = new CustomerMailApplication(customer);
        System.out.println(app.generateMail());       
    } 
}
