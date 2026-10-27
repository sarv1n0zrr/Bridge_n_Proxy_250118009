public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1: The Bouncer");
        Image guestPhoto = new ProxyImage("salary_sheet.png", "GUEST");
        Image adminPhoto = new ProxyImage("salary_sheet.png", "ADMIN");
        guestPhoto.show();
        adminPhoto.show();

        System.out.println("\nTask 2: The View Counter");
        Video video = new ProxyVideo("Cat_Memes.mp4");
        video.play();
        video.play();
        video.play();

        System.out.println("\nTask 3: School Wi-Fi Firewall");
        Internet internet = new SchoolProxyInternet();
        internet.connectTo("wikipedia.org");
        internet.connectTo("gaming.com");
    }
}
