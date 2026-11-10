public class Validator {
    /**
     * @param productId 
     * @param customerId 
     * @param address
     * @return 
     */
    public boolean isValid(String productId, String customerId, String address, double amount) {
        System.out.println("[OrderValidator] Step 1: Validating order data...");

        if (productId == null || productId.trim().isEmpty()) {
            System.out.println("[OrderValidator] Invalid: product ID is missing.");
            return false;
        }
        if (customerId == null || customerId.trim().isEmpty()) {
            System.out.println("[OrderValidator] Invalid: customer ID is missing.");
            return false;
        }
        if (address == null || address.trim().isEmpty()) {
            System.out.println("[OrderValidator] Invalid: delivery address is missing.");
            return false;
        }
        System.out.println("[OrderValidator] Step 2: Order data is valid.");
        return true;
    }
}