class TwelveDays {
    String verse(int verseNumber) {
        String text = "";
        switch(verseNumber) {
            case 1: text = "On the first day of Christmas my true love gave to me: " +
                            "a Partridge in a Pear Tree.\n";
                    break;
            case 2: text = "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                            "and a Partridge in a Pear Tree.\n";
                    break;
            case 3: text = "On the third day of Christmas my true love gave to me: three French Hens, " +
                           "two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;
            case 4: text = "On the fourth day of Christmas my true love gave to me: four Calling Birds, " +
                           "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;
            case 5: text = "On the fifth day of Christmas my true love gave to me: five Gold Rings, " +
                            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;
            case 6: text = "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, " +
                            "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                            "and a Partridge in a Pear Tree.\n";
                    break;
            case 7: text = "On the seventh day of Christmas my true love gave to me: " +
                            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +
                            "two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;
            case 8: text = "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," +
                            " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;
            case 9: text = "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " +
                            "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;
            case 10: text = "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " +
                            "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
                            "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
                             "and a Partridge in a Pear Tree.\n";
                    break;
            case 11: text = "On the eleventh day of Christmas my true love gave to me: " +
                            "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
                            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                    break;
            case 12: text = "On the twelfth day of Christmas my true love gave to me: " +
                            "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +
                            "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
                            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
                     break;
        }
        return text;
    }

    String verses(int startVerse, int endVerse) {
        String verseText = "";
        for (int verseIndex = startVerse; verseIndex <= endVerse; verseIndex++) {
            verseText = verseIndex == endVerse ?
                    verseText.concat(verse(verseIndex)):
                    verseText.concat(verse(verseIndex)).concat("\n");
        }
        return verseText;
    }
    
    String sing() {
        return verses(1,12);
    }
}
