public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        // Simulating customer data
        if (id == 11) {
            return "Susanth Bhatta";
        } else if (id == 12) {
            return "Rahul Sharma";
        } else {
            return "Customer Not Found";
        }
    }
}