public class ShortestPath {
    public static void main(String[] args) {
        String dir = "nseewnnsseeennnnnnn";
        System.out.println(findShortestPath(dir));
    }
    public static float findShortestPath(String directions) {
        int x = 0, y = 0;
        directions = directions.toUpperCase();
        for (int i = 0; i < directions.length(); i++) {
            char dir = directions.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int finalx = x*x;
        int finaly = y*y;
        return (float) Math.sqrt(finalx + finaly);
    }
}
