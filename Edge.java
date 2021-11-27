public class Edge {
    private int begin, end, weight;

        Edge() {
            begin = 0;
            end = 0;
            weight = 0;
        }

        Edge(int newBegin, int newEnd, int newWeight) {
            begin = newBegin;
            end = newEnd;
            weight = newWeight;
        }

        void setBegin(int newBegin) {
            begin = newBegin;
        }

        void setEnd(int newEnd) {
            end = newEnd;
        }

        void setWeight(int newWeight) {
            weight = newWeight;
        }

        int getBegin() {
            return begin;
        }

        int getEnd() {
            return end;
        }

        int getWeight() {
            return weight;
        }
}
