public class UnliCallTextPackage implements UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return "No free calls or texts, charged per use.";
        } else {
            if (telcoName.equalsIgnoreCase("Globe")) {
                return "Unlimited calls and texts to subscribers within their network.";
            } else if (telcoName.equalsIgnoreCase("Ditto")) {
                return "Unlimited calls and texts to all networks within the country.";
            }
        }
        return "No offer available.";
    }
}