package com.example.demo2;

import org.junit.Test;

/**
 *  关于包装类的面试题，详情如下:
 */
public class InterviewTest {

    //三元运算符 -- 使用详情见SanYuanTest.java
    // 三元运算符 中 表达式1 和表达式2要求是一致的。
    @Test
    public void test(){
        Object object = true ? new Integer(1) : new Double(2.0);
        System.out.println(object); //结果为: 1.0
    }

    // if - esle运算符
    @Test
    public void test2(){
        if (true){
            System.out.println(new Integer(1)); //结果为 1
        }else{
            System.out.println(new Double(2.0));
        }
    }

    //Integer 的内部结构探讨
    @Test
    public void test3(){

        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); //结果为：false new 出来的结构，其指向堆空间的地址不是同一个实体，所以地址不一样

        Integer num1 = 12;
        Integer num2 = 12;
        System.out.println(num1 == num2);// 结果为 true

        Integer num3 = 128;
        Integer num4 = 128;
        System.out.println(num3 == num4);// 结果为 false

        // 结合上面来看，结果应该是一样的，为什么会导致不同呢？ Integer的内部结构
        // 从源码中，我们看到，在Integer的内部结构定义个一个静态的IntegerCache 类，IntegerCache 类中定义了一个 cache[]
        // 这个数组保存的是 -128 到 127 的整数，如果，我们使用自动装箱的方式来给变量赋值。变量的范围是在-128 到 127 之间
        // 我们就可以直接是用缓存数组中的元素，就不用去new 了，这样做的目的是 提高效率，超出了 这个范围，就只能是new 结构了

//        private static class IntegerCache {
//            static final int low = -128;
//            static final int high;
//            static final Integer cache[];
//
//            static {
//                // high value may be configured by property
//                int h = 127;
//                String integerCacheHighPropValue =
//                        sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
//                if (integerCacheHighPropValue != null) {
//                    try {
//                        int i = parseInt(integerCacheHighPropValue);
//                        i = Math.max(i, 127);
//                        // Maximum array size is Integer.MAX_VALUE
//                        h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
//                    } catch( NumberFormatException nfe) {
//                        // If the property cannot be parsed into an int, ignore it.
//                    }
//                }
//                high = h;
//
//                cache = new Integer[(high - low) + 1];
//                int j = low;
//                for(int k = 0; k < cache.length; k++)
//                    cache[k] = new Integer(j++);
//
//                // range [-128, 127] must be interned (JLS7 5.1.7)
//                assert Integer.IntegerCache.high >= 127;
//            }
//            private IntegerCache() {}
//        }
    }


}
