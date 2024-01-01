import java.util.Scanner;

public class CustomerMailApplication {

    public static Customer getCustomerTypeFromUser() {
        Customer customer = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                customer = CustomerMailFactory.createCustomer("Regular");
                break;
            case 2:
                customer = CustomerMailFactory.createCustomer("Mountain");
                break;
            case 3:
                customer = CustomerMailFactory.createCustomer("Delinquent");
                break;
        }
        inp.close();
        return customer;
    }

    public static String generateMail(Customer customer) {
        return customer.createMail();
    }

    public static void main(String[] args) {
        Customer customer = getCustomerTypeFromUser();
        if (customer != null) {
            System.out.println(generateMail(customer));
        }
    }
}
