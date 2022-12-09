class ParkingSystem {

    private int countBig;
    private int countMedium;
    private int countSmall;

    public ParkingSystem(int big, int medium, int small) {
        this.countBig = big;
        this.countMedium = medium;
        this.countSmall = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (countBig != 0 && (countBig - 1 != -1)) {
                countBig -= 1;
                return true;
            }
            return false;
        } else if (carType == 2) {
            if (countMedium != 0 && (countMedium - 1 != -1)) {
                countMedium -= 1;
                return true;
            }
            return false;
        } else if (carType == 3) {
            if (countSmall != 0 && (countSmall - 1 != -1)) {
                countSmall -= 1;
                return true;
            }
            return false;
        } else return false;
    }
}
