package eu.singledev.patterns;

/**
 * Abstract class representing a generic Computer.
 * Defines methods to get the specifications of the computer.
 */
public abstract class Computer {
    /**
     * Gets the RAM size of the computer.
     *
     * @return a String representing the RAM size.
     */
    public abstract String getRam();

    /**
     * Gets the HDD size of the computer.
     *
     * @return a String representing the HDD size.
     */
    public abstract String getHDD();

    /**
     * Gets the CPU details of the computer.
     *
     * @return a String representing the CPU details.
     */
    public abstract String getCPU();

    /**
     * Returns a string representation of the computer's specifications.
     *
     * @return a formatted string containing RAM, HDD, and CPU details.
     */
    @Override
    public String toString() {
        return "Ram = " + this.getRam() + ", HDD = " + this.getHDD() + ", CPU = " + this.getCPU();
    }
}

/**
 * Concrete implementation of the Computer class representing a PC.
 */
class PC extends Computer {
    private final String ram;
    private final String hdd;
    private final String cpu;

    /**
     * Constructor to create a PC object with specified specifications.
     *
     * @param ram  The RAM size of the PC.
     * @param hdd  The HDD size of the PC.
     * @param cpu  The CPU details of the PC.
     */
    public PC(String ram, String hdd, String cpu) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRam() {
        return this.ram;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHDD() {
        return this.hdd;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCPU() {
        return this.cpu;
    }
}

/**
 * Concrete implementation of the Computer class representing a Server.
 */
class Server extends Computer {
    private final String ram;
    private final String hdd;
    private final String cpu;

    /**
     * Constructor to create a Server object with specified specifications.
     *
     * @param ram  The RAM size of the Server.
     * @param hdd  The HDD size of the Server.
     * @param cpu  The CPU details of the Server.
     */
    public Server(String ram, String hdd, String cpu) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRam() {
        return this.ram;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHDD() {
        return this.hdd;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCPU() {
        return this.cpu;
    }
}

/**
 * Factory class to create instances of different types of Computers (PC or Server).
 */
class ComputerFactory {

    /**
     * Factory method to create a Computer object based on type and specifications.
     *
     * @param type The type of computer to create (e.g., "PC", "Server").
     * @param ram  The RAM size for the computer.
     * @param hdd  The HDD size for the computer.
     * @param cpu  The CPU details for the computer.
     *
     * @return A Computer object (either PC or Server) with specified specifications,
     *         or null if an invalid type is provided.
     */
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu);
        return null;
    }
}


class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 G", "500 G", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("SerVeR", "12 G", "500 G", "2.4 GHz");

        System.out.println("PC: " + pc);
        System.out.println("Server: " + server);
    }
}