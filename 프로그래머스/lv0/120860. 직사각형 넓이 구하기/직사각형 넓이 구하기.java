class Solution {
    public int solution(int[][] dots) {
        int maxX = -256, minX = 256, maxY = -256, minY = 256;
        for(int i = 0; i < dots.length-1; i++){
            maxX = maxX < dots[i][0] ? dots[i][0] : maxX;
            minX = minX > dots[i][0] ? dots[i][0] : minX;
            maxY = maxY < dots[i][1] ? dots[i][1] : maxY;
            minY = minY > dots[i][1] ? dots[i][1] : minY;
        }
        return Math.abs(maxX-minX)* Math.abs(maxY-minY);
    }
}