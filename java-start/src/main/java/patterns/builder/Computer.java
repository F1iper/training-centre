package patterns.builder;


public class Computer {
    private String cpu;
    private int ram;
    private String graphics;
    private String powerSupply;
    private String motherBoard;
    
    private Computer (String cpu, int ram, String graphics, String powerSupply, String motherBoard) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphics = graphics;
        this.powerSupply = powerSupply;
        this.motherBoard = motherBoard;
    }
    
    public static class ComputerBuilder {
        private String cpu;
        private int ram;
        private String graphics;
        private String powerSupply;
        private String motherBoard;
    }
    
    public String getCpu () {
        return cpu;
    }
    
    public void setCpu (String cpu) {
        this.cpu = cpu;
    }
    
    public int getRam () {
        return ram;
    }
    
    public void setRam (int ram) {
        this.ram = ram;
    }
    
    public String getGraphics () {
        return graphics;
    }
    
    public void setGraphics (String graphics) {
        this.graphics = graphics;
    }
    
    public String getPowerSupply () {
        return powerSupply;
    }
    
    public void setPowerSupply (String powerSupply) {
        this.powerSupply = powerSupply;
    }
    
    public String getMotherBoard () {
        return motherBoard;
    }
    
    public void setMotherBoard (String motherBoard) {
        this.motherBoard = motherBoard;
    }
    public Computer build() {
        return new Computer(cpu, ram, graphics, powerSupply, motherBoard);
    }
}
