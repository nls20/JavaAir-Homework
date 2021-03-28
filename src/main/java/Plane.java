public enum Plane {

    BOEING747(3, 6),
    AIRBUS320(50, 200),
    CONCORDE20(200, 400);

    private final int capacity;
    private final int totalWeight;

        Plane (int capacity, int totalWeight) {
            this.capacity = capacity;
            this.totalWeight = totalWeight;
        }

        public int getCapacity() {
            return this.capacity;
        }

        public int getTotalWeight() {
            return this.totalWeight;
        }

    }


