
package mattius;

import mattius.IStringFunction;

public class LambdaIntro {
    public static void printFormatted(String str, IStringFunction format) {
        String result = format.constructString(str);
        System.out.println(result);
    }
}
