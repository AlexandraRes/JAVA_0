public class part_8_10 {
    enum TrafficLight {
        RED(30),
        GREEN(45),
        YELLOW(5);

        private final int duration;

        TrafficLight(int duration) {
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + ": " + light.getDuration() + " seconds");
        }
    }
}