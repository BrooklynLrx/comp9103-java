class InvalidRefreshRateException extends Exception {
    public InvalidRefreshRateException() {
        super("Unsupprted refresh rate");
    }
}

    public class Moniter{
        private double refreshRate;
        public final double MAX_REFRESH_RATE;
        
        public Moniter(double defaultRate,double max){
            MAX_REFRESH_RATE = max;
            refreshRate = defaultRate;
        }

        public double setRefreshRate(double hz) throws InvalidRefreshRateException {
            if(hz < 0 || hz > MAX_REFRESH_RATE) {
                throw new InvalidRefreshRateException();
            }
            else{
                refreshRate = hz;
                return refreshRate;
            }
        }
    }
}
