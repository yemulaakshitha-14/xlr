class ltcode003 {
    public int myAtoi(String s) {
        // Step 1: Trim leading whitespace
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        // Step 2: Determine the sign
        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        // Step 3: Convert characters to integer
        int result = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            if (!Character.isDigit(c)) {
                break;
            }

            int digit = c - '0';

            // Step 4: Check for overflow or underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        // Apply the sign and return the result
        return result * sign;
    }

    public static void main(String[] args) {
        ltcode003 ltcode003 = new ltcode003();

        // Test cases
        System.out.println(ltcode003.myAtoi("42"));          // Output: 42
        System.out.println(ltcode003.myAtoi("   -042"));     // Output: -42
        System.out.println(ltcode003.myAtoi("1337c0d3"));    // Output: 1337
        System.out.println(ltcode003.myAtoi("0-1"));         // Output: 0
        System.out.println(ltcode003.myAtoi("words and 987"));// Output: 0
    }
}
