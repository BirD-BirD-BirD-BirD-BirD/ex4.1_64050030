//64050030 นาย กิติภูมิ หน่อเนื้อ
public class CustomerMailFactory {
    public static Customer createCustomer(String customerType){
        if(customerType.equals("Regular")){
            return new RegularCustomer();
        }else if(customerType.equals("Mountain")){
            return new MountainCustomer();
        }else if(customerType.equals("Delinquent")){
            return new DelinquentCustomer();
        }
        return null;
    }
}
