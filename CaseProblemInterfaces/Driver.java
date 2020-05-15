import java.util.ArrayList;
import java.util.List;

class Driver {

    public static void main(String[] args) {

        List<PoliceCar> pcs = new ArrayList<PoliceCar>();

        System.out.println("Policecar:");
        for (int i = 0; i < 3; i++) {
            pcs.add(new PoliceCar(("RX-500-" + (i + 1)), 4, 140, 4, 80));
            pcs.get(i).useTurbo();
            System.out.println(pcs.get(i).getName() + " | with " + pcs.get(i).getNumWheels() + " wheels");
        }

        System.out.println("\nJeep:");
        Jeep jp = new Jeep("Defender", 8, 100, 5);
        jp.soundHorn();

        System.out.println("\nFrigate:");
        Frigate fg = new Frigate("Military's Ship", 40, 120, 3400);
        fg.fireGate();
        System.out.println("Ship has travelled for " + fg.getDisplacement() + " kms");

        System.out.println("\nHovercraft:");
        Hovercraft hc = new Hovercraft("8000TD HV", 3, 140, 6, 30);
        hc.enterSea();
        System.out.println("Current displacement: " + hc.getDisplacement());
        hc.setDisplacement(hc.getDisplacement() + 10);
        System.out.println("Current displacement: " + hc.getDisplacement());
        hc.enterLand();

    }

}
