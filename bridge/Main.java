public class Main {
    public static void main(String[] args) {

        System.out.println("Task 4: The New Machine");
        Device light = new SmartLight();
        AdvancedRemote remote = new AdvancedRemote(light);
        remote.powerOn();
        remote.mute();

        System.out.println("\nTask 5: The New Button");
        Device radio = new Radio();
        PartyRemote partyRemote = new PartyRemote(radio);
        partyRemote.partyMode();

        System.out.println("\nTask 6: RPG Weapon System");
        Knight knight = new Knight(new Sword());
        knight.attack();
        Wizard wizard = new Wizard(new MagicWand());
        wizard.attack();
    }
}
