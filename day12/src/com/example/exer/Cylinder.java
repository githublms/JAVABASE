package com.example.exer;


/**
 * 运行结果是:
 圆柱的体积是:34.63605900582747
 圆柱的表面积：60.69557006735481
 ******************
 圆柱的体积为：0.0
 */
public class Cylinder extends  Circle{

    private double length;//高

    public Cylinder(){
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //返回圆柱的体积
    public double findVolume(){
//		return Math.PI * getRadius() * getRadius() * getLength();
        return super.findArea() * getLength();
    }

    @Override
    public double findArea() {//返回圆柱的表面积
        return Math.PI * getRadius() * getRadius() * 2 +
                2 * Math.PI * getRadius() * getLength();
    }
}
