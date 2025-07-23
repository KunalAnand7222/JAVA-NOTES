public class bitwise {
    public static void main(String[] args) {
        // binary sysytem to decimal
        // set bits when first 1 encounter
        // / and & or | xor ^ left shift << right shift >> ones compliment ~
        // And : all true then true ( all 1 then 1 else 0)
        // Or: any true then true (any 1 then 1 )
        // xor: same 0 and different 1
        // one's compliment: ~  just convert all 1 to 0 and all 1 to 0
        //  100 1 is msb and last 0 is lsb
        // 2's compliment not then add 1
        // 1's compliment then again 1' compliment then add 1 with minus sign
        System.out.println(~19);   // always return -(num+1)
        // msb 1 negative number 
        // msb 0 positive number
        // Binary left shift << num multiply by 2
        // 10<<2  10*(2)^2
        System.out.println(2<<4); //2*2^4
        // Right shift >> divide by 2
        // System.out.println(4>>2); 4/(2^2)
        
    }
}
