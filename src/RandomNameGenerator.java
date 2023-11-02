public class RandomNameGenerator {
    //this is an experiment and a work in progress
    public static void main(String[] args) {
        String[] CapitalConsonant = new String[21];
        String[] CapitalVowel = new String[5];
        String[] LowercaseVowel = new String[5];
        String[]LowercaseConsonant = new String[21];
        //These were originally chars but it wasn't working for some reason and worked when I switched to string.
        String[]LowercaseVowelCombo = new String[24];
        String[]CapitalVowelCombo = new String[24];
        String[] LowercaseConsonantCombo = {
                "bl", "br", "cl", "cr", "dr", "fl", "fr", "gl", "gr", "pl",
                "pr", "sl", "sm", "sn", "sp", "st", "str", "sw", "thr", "tr", "tw"
        };
        String[] CapitalConsonantCombo = {
                "Bl", "Br", "Cl", "Cr", "Dr", "Fl", "Fr", "Gl", "Gr", "Pl",
                "Pr", "Sl", "Sm", "Sn", "Sp", "St", "Str", "Sw", "Thr", "Tr", "Tw"
        };

        CapitalConsonant[0] = "B";
        CapitalConsonant[1] = "C";
        CapitalConsonant[2] = "D";
        CapitalConsonant[3] = "F";
        CapitalConsonant[4] = "G";
        CapitalConsonant[5] = "H";
        CapitalConsonant[6] = "J";
        CapitalConsonant[7] = "K";
        CapitalConsonant[8] = "L";
        CapitalConsonant[9] = "M";
        CapitalConsonant[10] = "N";
        CapitalConsonant[11] = "P";
        CapitalConsonant[12] = "Q";
        CapitalConsonant[13] = "R";
        CapitalConsonant[14] = "S";
        CapitalConsonant[15] = "T";
        CapitalConsonant[16] = "V";
        CapitalConsonant[17] = "W";
        CapitalConsonant[18] = "X";
        CapitalConsonant[19] = "Y";
        CapitalConsonant[20] = "Z";


        LowercaseConsonant[0] = "b";
        LowercaseConsonant[1] = "c";
        LowercaseConsonant[2] = "d";
        LowercaseConsonant[3] = "f";
        LowercaseConsonant[4] = "g";
        LowercaseConsonant[5] = "h";
        LowercaseConsonant[6] = "j";
        LowercaseConsonant[7] = "k";
        LowercaseConsonant[8] = "l";
        LowercaseConsonant[9] = "m";
        LowercaseConsonant[10] = "n";
        LowercaseConsonant[11] = "p";
        LowercaseConsonant[12] = "q";
        LowercaseConsonant[13] = "r";
        LowercaseConsonant[14] = "s";
        LowercaseConsonant[15] = "t";
        LowercaseConsonant[16] = "v";
        LowercaseConsonant[17] = "w";
        LowercaseConsonant[18] = "x";
        LowercaseConsonant[19] = "y";
        LowercaseConsonant[20] = "z";


        CapitalVowel[0] = "A";
        CapitalVowel[1] = "E";
        CapitalVowel[2] = "I";
        CapitalVowel[3] = "O";
        CapitalVowel[4] = "U";


        LowercaseVowel[0] = "a";
        LowercaseVowel[1] = "e";
        LowercaseVowel[2] = "i";
        LowercaseVowel[3] = "o";
        LowercaseVowel[4] = "u";


        LowercaseVowelCombo[0] = "ai";
        LowercaseVowelCombo[1] = "ay";
        LowercaseVowelCombo[2] = "ea";
        LowercaseVowelCombo[3] = "eigh";
        LowercaseVowelCombo[4] = "ey";
        LowercaseVowelCombo[5] = "ee";
        LowercaseVowelCombo[6] = "ea";
        LowercaseVowelCombo[7] = "ey";
        LowercaseVowelCombo[8] = "ei";
        LowercaseVowelCombo[9] = "ie";
        LowercaseVowelCombo[10] = "ie";
        LowercaseVowelCombo[11] = "igh";
        LowercaseVowelCombo[12] = "oa";
        LowercaseVowelCombo[13] = "oe";
        LowercaseVowelCombo[14] = "ew";
        LowercaseVowelCombo[15] = "ue";
        LowercaseVowelCombo[16] = "eu";
        LowercaseVowelCombo[17] = "oi";
        LowercaseVowelCombo[18] = "oy";
        LowercaseVowelCombo[19] = "ou";
        LowercaseVowelCombo[20] = "ow";
        LowercaseVowelCombo[21] = "au";
        LowercaseVowelCombo[22] = "aw";
        LowercaseVowelCombo[23] = "oo";

        CapitalVowelCombo[0] = "Ai";
        CapitalVowelCombo[1] = "Ay";
        CapitalVowelCombo[2] = "Ea";
        CapitalVowelCombo[3] = "Eigh";
        CapitalVowelCombo[4] = "Ey";
        CapitalVowelCombo[5] = "Ee";
        CapitalVowelCombo[6] = "Ea";
        CapitalVowelCombo[7] = "Ey";
        CapitalVowelCombo[8] = "Ei";
        CapitalVowelCombo[9] = "Ie";
        CapitalVowelCombo[10] = "Ie";
        CapitalVowelCombo[11] = "Igh";
        CapitalVowelCombo[12] = "Oa";
        CapitalVowelCombo[13] = "Oe";
        CapitalVowelCombo[14] = "Ew";
        CapitalVowelCombo[15] = "Ue";
        CapitalVowelCombo[16] = "Eu";
        CapitalVowelCombo[17] = "Oi";
        CapitalVowelCombo[18] = "Oy";
        CapitalVowelCombo[19] = "Ou";
        CapitalVowelCombo[20] = "Ow";
        CapitalVowelCombo[21] = "Au";
        CapitalVowelCombo[22] = "Aw";
        CapitalVowelCombo[23] = "Oo";


        String SelectCapitalConsonant = CapitalConsonant[Main.RandInt(0,20)];
        String SelectCapitalVowel = CapitalVowel[Main.RandInt(0,4)];
        String SelectLowercaseVowel = LowercaseVowel[Main.RandInt(0,4)];
        String SelectLowercaseConsonant = LowercaseConsonant[Main.RandInt(0,20)];
        String SelectLowercaseVowelCombo = LowercaseVowelCombo[Main.RandInt(0,23)];
        String SelectLowercaseConsonantCombo = LowercaseConsonantCombo[Main.RandInt(0,20)];
        String SelectCapitalConsonantCombo = CapitalConsonantCombo[Main.RandInt(0,20)];
        String SelectCapitalVowelCombo = CapitalVowelCombo[Main.RandInt(0,23)];

        System.out.println(SelectCapitalConsonant + SelectLowercaseVowelCombo);
    }
}

