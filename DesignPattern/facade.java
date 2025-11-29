package DesignPattern;

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }
}

class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON");  
    }
    public void setVolume(int level) {
        System.out.println("Amplifier volume set to " + level);
    }

    public void off() {
        System.out.println("Amplifier is OFF");
    }
}

class projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void wideScreenMode() {
        System.out.println("Projector in widescreen mode");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}   

class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Amplifier amp;
    private projector proj;

    public HomeTheaterFacade(DVDPlayer dvd, Amplifier amp, projector proj) {
        this.dvd = dvd;
        this.amp = amp;
        this.proj = proj;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvd.on();
        dvd.play(movie);
        amp.on();
        amp.setVolume(5);
        proj.on();
        proj.wideScreenMode();
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        dvd.off();
        amp.off();
        proj.off();
    }
}   

public class facade {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Amplifier amp = new Amplifier();
        projector proj = new projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, amp, proj);

        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}