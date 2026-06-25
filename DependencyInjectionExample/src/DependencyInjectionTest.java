public class DependencyInjectionTest {

    public static void main(String[] args) {

        // Inject dependency
        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        // Find customers
        service.getCustomer(11);
        service.getCustomer(12);
        service.getCustomer(13);
    }
}