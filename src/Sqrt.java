public class Sqrt {
    float threehalfs = 1.5f;

    private float rsqrt(float number) {
        int i;
        float x2, y;
        
        x2 = number * 0.5f;
        y = number;
        i = Float.floatToIntBits(y);
        i = 0x5f3759df - (i >> 1);
        y = Float.intBitsToFloat(i);
        y *= (threehalfs - (x2 * y * y));

        return y;
    }

    public float getInverseSqareRoot(float number) {
        return rsqrt(number);
    }
}
