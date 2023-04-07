package practice;
public class GeometryCalculator {
    static double circleSquare;
    static double triangleSquare;
    static double sphereVolume;
    static boolean trianglePossible;
    static  double p;

    //расчёта площади круга по его радиус
    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {

        if (radius >= 0.0) {
            circleSquare = (Math.PI) * (Math.pow(radius, 2));
        }
        if (radius < 0.0) {
            circleSquare = -1;
        }
        return circleSquare;
    }
    
    //расчёта площади треугольника по длинам его сторон;
    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {

        isTrianglePossible(a, b, c);
        p = (a + b + c)/2;
        if (trianglePossible == false) {
            triangleSquare = -1.0;
        }
        if (trianglePossible == true){
            triangleSquare = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return triangleSquare;
    }

    //расчёта объёма шара по его радиусу;
    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {

        if (radius >= 0.0) {
            sphereVolume = (4.00/3.00) * (Math.PI) * (Math.pow(radius, 3));
        }
        if (radius < 0.00) {
            sphereVolume = -1;
        }
        return sphereVolume;
    }

    //проверки возможности построения треугольника по длинам его сторон.
    //Условие возможности построения треугольника: у треугольника сумма любых двух сторон должна быть больше третьей.
    public static boolean isTrianglePossible(double a, double b, double c) {

        if ((((a + b) > c) && ((a + c) > b) && ((c + b) > a))) {
            trianglePossible = true;
        } else {
            trianglePossible = false;
        }
        return trianglePossible;
    }
}
