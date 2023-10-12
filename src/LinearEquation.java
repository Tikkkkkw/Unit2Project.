public class LinearEquation {
        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public LinearEquation(int x, int y)
        {       x1 = x;
                y1 = y;}
        public LinearEquation(int xA, int yA, int xB, int yB)
        {       x1 = xA;
                x2 = xB;
                y1 = yA;
                y2 = yB;}
        public String getCoords()
        {       return "(" + x1 + ", " + y1 + ")";}
        public double slopeCalculate()
        {       float rise = y2 - y1;
                float run =  x2 - x1;
                return rise / run;}
        public double Y_intercept()
        {       return y1 - slopeCalculate() * x1;}
        public String slopeInterceptForm()
        {       int rise = y2 - y1;
                int run =  x2 - x1;
                return "y = " + rise + "/" + run + "x + " + Y_intercept();}
        public double distanceBetweenPoints()
        {      double x = Math.pow(( (double)x2-(double) x1 ), 2);
               double y = Math.pow(( (double)y2-(double) y1 ), 2);
               return Math.round(Math.sqrt(y+x) * 100.0) / 100.0;}
        public String solvingCoordPoint(double x_cords)
        {      double y = slopeCalculate() * x_cords + Y_intercept();
               return "(" + x_cords + "," + y + ")"; }
        public String toString_()
        { return "Slope of line : " + slopeCalculate() + "\nY-intercept: " + Y_intercept() + "\nSlope intercept form: " +slopeInterceptForm() + "\nDistance between points: " + distanceBetweenPoints();}
}

