package bank.management.system;

/**
 * Runs the DB schema initialization once (used for local troubleshooting).
 */
public class SchemaInit {
    public static void main(String[] args) {
        new Connn(); // Connn constructor creates tables via initSchema().
        System.out.println("H2 schema initialized successfully.");
    }
}

