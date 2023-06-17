package examples;

public final class PrivateConfig {
    private PrivateConfig() {
    }
    public static final String BASE_URL = "https://testnet.binance.vision";

    public static final String API_KEY = "iOU2NCmIEc2R8aL2yGlNVMiwfiRCUtVwcewwjH5O2rBhfA7WKI9OpI5CoG3oQqT7";
    public static final String SECRET_KEY = "WqdvG1KiROAtWmapLV3iK7KX8XjncuSOoQvHKqUGcr49y2kb9jyzJISpVY71BtAW"; // Unnecessary if PRIVATE_KEY_PATH is used
    public static final String PRIVATE_KEY_PATH = ""; // Key must be PKCS#8 standard

    public static final String TESTNET_API_KEY = "iOU2NCmIEc2R8aL2yGlNVMiwfiRCUtVwcewwjH5O2rBhfA7WKI9OpI5CoG3oQqT7";
    public static final String TESTNET_SECRET_KEY = "WqdvG1KiROAtWmapLV3iK7KX8XjncuSOoQvHKqUGcr49y2kb9jyzJISpVY71BtAW"; // Unnecessary if TESTNET_PRIVATE_KEY_PATH is used
    public static final String TESTNET_PRIVATE_KEY_PATH = ""; //Key must be PKCS#8 standard
}
