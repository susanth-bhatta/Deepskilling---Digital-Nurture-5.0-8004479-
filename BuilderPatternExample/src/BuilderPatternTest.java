public class BuilderPatternTest {

    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM(16)
                .setStorage(512)
                .setOperatingSystem("Windows 10")
                .build();
        
        Computer developerPC = new Computer.Builder()
                .setCPU("Apple M3")
                .setRAM(24)
                .setStorage(1024)
                .setOperatingSystem("macOS")
                .build();

        gamingPC.showConfiguration();
        officePC.showConfiguration();
        developerPC.showConfiguration();
    }
}