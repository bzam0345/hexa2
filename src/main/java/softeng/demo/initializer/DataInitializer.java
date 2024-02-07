package softeng.demo.initializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import softeng.demo.model.MedicalDevice;
import softeng.demo.repository.MedicalDeviceRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final MedicalDeviceRepository medicalDeviceRepository;

    public DataInitializer(MedicalDeviceRepository medicalDeviceRepository) {
        this.medicalDeviceRepository = medicalDeviceRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Device 1
        MedicalDevice device1 = new MedicalDevice();
        device1.setName("EKG Monitor Pro");
        device1.setCharacteristics("Hordozható EKG Monitor, vezeték nélküli kapcsolat");
        device1.setStock(30);
        device1.setPrice(599.99);
        medicalDeviceRepository.save(device1);

        // Device 2
        MedicalDevice device2 = new MedicalDevice();
        device2.setName("Vérnyomás Őrző Plusz");
        device2.setCharacteristics("Digitális Vérnyomásmérő, nagy kijelzővel");
        device2.setStock(50);
        device2.setPrice(89.99);
        medicalDeviceRepository.save(device2);

        // Device 3
        MedicalDevice device3 = new MedicalDevice();
        device3.setName("InzulinCare Connect");
        device3.setCharacteristics("Okos Inzulinpumpa, Folyamatos Glükózmonitorozás");
        device3.setStock(15);
        device3.setPrice(799.99);
        medicalDeviceRepository.save(device3);

        // Device 4
        MedicalDevice device4 = new MedicalDevice();
        device4.setName("ThermoScan Elite");
        device4.setCharacteristics("Digitális Hőmérő, Gyors és Pontos");
        device4.setStock(100);
        device4.setPrice(29.99);
        medicalDeviceRepository.save(device4);

        // Device 5
        MedicalDevice device15 = new MedicalDevice();
        device15.setName("SleepTracker Pro");
        device15.setCharacteristics("Okos Alvásmonitor, Alvási Minta Elemzés");
        device15.setStock(22);
        device15.setPrice(149.99);
        medicalDeviceRepository.save(device15);
    }
}
